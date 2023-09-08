package com.tencent.tinker.loader.shareutil;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public class ShareElfFile implements Closeable {
    public static final int FILE_TYPE_ELF = 1;
    public static final int FILE_TYPE_ODEX = 0;
    public static final int FILE_TYPE_OTHERS = -1;
    public ElfHeader elfHeader = null;
    private final FileInputStream fis;
    public ProgramHeader[] programHeaders = null;
    public SectionHeader[] sectionHeaders = null;
    private final Map<String, SectionHeader> sectionNameToHeaderMap = new HashMap();

    public static class ElfHeader {
        public static final int EI_CLASS = 4;
        public static final int EI_DATA = 5;
        private static final int EI_NINDENT = 16;
        public static final int EI_VERSION = 6;
        public static final int ELFCLASS32 = 1;
        public static final int ELFCLASS64 = 2;
        public static final int ELFDATA2LSB = 1;
        public static final int ELFDATA2MSB = 2;
        public static final int ET_CORE = 4;
        public static final int ET_DYN = 3;
        public static final int ET_EXEC = 2;
        public static final int ET_HIPROC = 65535;
        public static final int ET_LOPROC = 65280;
        public static final int ET_NONE = 0;
        public static final int ET_REL = 1;
        public static final int EV_CURRENT = 1;
        public final short eEhSize;
        public final long eEntry;
        public final int eFlags;
        public final byte[] eIndent;
        public final short eMachine;
        public final short ePhEntSize;
        public final short ePhNum;
        public final long ePhOff;
        public final short eShEntSize;
        public final short eShNum;
        public final long eShOff;
        public final short eShStrNdx;
        public final short eType;
        public final int eVersion;

        private ElfHeader(FileChannel fileChannel) {
            byte[] bArr = new byte[16];
            this.eIndent = bArr;
            fileChannel.position(0);
            fileChannel.read(ByteBuffer.wrap(bArr));
            if (bArr[0] == Byte.MAX_VALUE && bArr[1] == 69 && bArr[2] == 76 && bArr[3] == 70) {
                byte b = bArr[4];
                ShareElfFile.assertInRange(b, 1, 2, "bad elf class: " + bArr[4]);
                byte b2 = bArr[5];
                ShareElfFile.assertInRange(b2, 1, 2, "bad elf data encoding: " + bArr[5]);
                ByteBuffer allocate = ByteBuffer.allocate(bArr[4] == 1 ? 36 : 48);
                allocate.order(bArr[5] == 1 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN);
                ShareElfFile.readUntilLimit(fileChannel, allocate, "failed to read rest part of ehdr.");
                this.eType = allocate.getShort();
                this.eMachine = allocate.getShort();
                int i = allocate.getInt();
                this.eVersion = i;
                ShareElfFile.assertInRange(i, 1, 1, "bad elf version: " + i);
                byte b3 = bArr[4];
                if (b3 == 1) {
                    this.eEntry = (long) allocate.getInt();
                    this.ePhOff = (long) allocate.getInt();
                    this.eShOff = (long) allocate.getInt();
                } else if (b3 == 2) {
                    this.eEntry = allocate.getLong();
                    this.ePhOff = allocate.getLong();
                    this.eShOff = allocate.getLong();
                } else {
                    throw new IOException("Unexpected elf class: " + bArr[4]);
                }
                this.eFlags = allocate.getInt();
                this.eEhSize = allocate.getShort();
                this.ePhEntSize = allocate.getShort();
                this.ePhNum = allocate.getShort();
                this.eShEntSize = allocate.getShort();
                this.eShNum = allocate.getShort();
                this.eShStrNdx = allocate.getShort();
                return;
            }
            throw new IOException(String.format("bad elf magic: %x %x %x %x.", new Object[]{Byte.valueOf(bArr[0]), Byte.valueOf(bArr[1]), Byte.valueOf(bArr[2]), Byte.valueOf(bArr[3])}));
        }
    }

    public static class ProgramHeader {
        public static final int PF_R = 4;
        public static final int PF_W = 2;
        public static final int PF_X = 1;
        public static final int PT_DYNAMIC = 2;
        public static final int PT_HIPROC = Integer.MAX_VALUE;
        public static final int PT_INTERP = 3;
        public static final int PT_LOAD = 1;
        public static final int PT_LOPROC = 1879048192;
        public static final int PT_NOTE = 4;
        public static final int PT_NULL = 0;
        public static final int PT_PHDR = 6;
        public static final int PT_SHLIB = 5;
        public final long pAlign;
        public final long pFileSize;
        public final int pFlags;
        public final long pMemSize;
        public final long pOffset;
        public final long pPddr;
        public final int pType;
        public final long pVddr;

        private ProgramHeader(ByteBuffer byteBuffer, int i) {
            if (i == 1) {
                this.pType = byteBuffer.getInt();
                this.pOffset = (long) byteBuffer.getInt();
                this.pVddr = (long) byteBuffer.getInt();
                this.pPddr = (long) byteBuffer.getInt();
                this.pFileSize = (long) byteBuffer.getInt();
                this.pMemSize = (long) byteBuffer.getInt();
                this.pFlags = byteBuffer.getInt();
                this.pAlign = (long) byteBuffer.getInt();
            } else if (i == 2) {
                this.pType = byteBuffer.getInt();
                this.pFlags = byteBuffer.getInt();
                this.pOffset = byteBuffer.getLong();
                this.pVddr = byteBuffer.getLong();
                this.pPddr = byteBuffer.getLong();
                this.pFileSize = byteBuffer.getLong();
                this.pMemSize = byteBuffer.getLong();
                this.pAlign = byteBuffer.getLong();
            } else {
                throw new IOException("Unexpected elf class: " + i);
            }
        }
    }

    public static class SectionHeader {
        public static final int SHF_ALLOC = 2;
        public static final int SHF_EXECINSTR = 4;
        public static final int SHF_MASKPROC = -268435456;
        public static final int SHF_WRITE = 1;
        public static final int SHN_ABS = 65521;
        public static final int SHN_COMMON = 65522;
        public static final int SHN_HIPROC = 65311;
        public static final int SHN_HIRESERVE = 65535;
        public static final int SHN_LOPROC = 65280;
        public static final int SHN_LORESERVE = 65280;
        public static final int SHN_UNDEF = 0;
        public static final int SHT_DYNAMIC = 6;
        public static final int SHT_DYNSYM = 11;
        public static final int SHT_HASH = 5;
        public static final int SHT_HIPROC = Integer.MAX_VALUE;
        public static final int SHT_HIUSER = -1;
        public static final int SHT_LOPROC = 1879048192;
        public static final int SHT_LOUSER = Integer.MIN_VALUE;
        public static final int SHT_NOBITS = 8;
        public static final int SHT_NOTE = 7;
        public static final int SHT_NULL = 0;
        public static final int SHT_PROGBITS = 1;
        public static final int SHT_REL = 9;
        public static final int SHT_RELA = 4;
        public static final int SHT_SHLIB = 10;
        public static final int SHT_STRTAB = 3;
        public static final int SHT_SYMTAB = 2;
        public final long shAddr;
        public final long shAddrAlign;
        public final long shEntSize;
        public final long shFlags;
        public final int shInfo;
        public final int shLink;
        public final int shName;
        public String shNameStr;
        public final long shOffset;
        public final long shSize;
        public final int shType;

        private SectionHeader(ByteBuffer byteBuffer, int i) {
            if (i == 1) {
                this.shName = byteBuffer.getInt();
                this.shType = byteBuffer.getInt();
                this.shFlags = (long) byteBuffer.getInt();
                this.shAddr = (long) byteBuffer.getInt();
                this.shOffset = (long) byteBuffer.getInt();
                this.shSize = (long) byteBuffer.getInt();
                this.shLink = byteBuffer.getInt();
                this.shInfo = byteBuffer.getInt();
                this.shAddrAlign = (long) byteBuffer.getInt();
                this.shEntSize = (long) byteBuffer.getInt();
            } else if (i == 2) {
                this.shName = byteBuffer.getInt();
                this.shType = byteBuffer.getInt();
                this.shFlags = byteBuffer.getLong();
                this.shAddr = byteBuffer.getLong();
                this.shOffset = byteBuffer.getLong();
                this.shSize = byteBuffer.getLong();
                this.shLink = byteBuffer.getInt();
                this.shInfo = byteBuffer.getInt();
                this.shAddrAlign = byteBuffer.getLong();
                this.shEntSize = byteBuffer.getLong();
            } else {
                throw new IOException("Unexpected elf class: " + i);
            }
            this.shNameStr = null;
        }
    }

    public ShareElfFile(File file) {
        SectionHeader[] sectionHeaderArr;
        FileInputStream fileInputStream = new FileInputStream(file);
        this.fis = fileInputStream;
        FileChannel channel = fileInputStream.getChannel();
        this.elfHeader = new ElfHeader(channel);
        ByteBuffer allocate = ByteBuffer.allocate(128);
        allocate.limit(this.elfHeader.ePhEntSize);
        allocate.order(this.elfHeader.eIndent[5] == 1 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN);
        channel.position(this.elfHeader.ePhOff);
        this.programHeaders = new ProgramHeader[this.elfHeader.ePhNum];
        for (int i = 0; i < this.programHeaders.length; i++) {
            readUntilLimit(channel, allocate, "failed to read phdr.");
            this.programHeaders[i] = new ProgramHeader(allocate, this.elfHeader.eIndent[4]);
        }
        channel.position(this.elfHeader.eShOff);
        allocate.limit(this.elfHeader.eShEntSize);
        this.sectionHeaders = new SectionHeader[this.elfHeader.eShNum];
        int i2 = 0;
        while (true) {
            sectionHeaderArr = this.sectionHeaders;
            if (i2 >= sectionHeaderArr.length) {
                break;
            }
            readUntilLimit(channel, allocate, "failed to read shdr.");
            this.sectionHeaders[i2] = new SectionHeader(allocate, this.elfHeader.eIndent[4]);
            i2++;
        }
        short s = this.elfHeader.eShStrNdx;
        if (s > 0) {
            ByteBuffer section = getSection(sectionHeaderArr[s]);
            for (SectionHeader sectionHeader : this.sectionHeaders) {
                section.position(sectionHeader.shName);
                String readCString = readCString(section);
                sectionHeader.shNameStr = readCString;
                this.sectionNameToHeaderMap.put(readCString, sectionHeader);
            }
        }
    }

    /* access modifiers changed from: private */
    public static void assertInRange(int i, int i2, int i3, String str) {
        if (i < i2 || i > i3) {
            throw new IOException(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0051 A[SYNTHETIC, Splitter:B:40:0x0051] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getFileTypeByMagic(java.io.File r8) {
        /*
            r0 = 4
            r1 = 0
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x004e }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x004e }
            r2.<init>(r8)     // Catch:{ all -> 0x004e }
            r2.read(r0)     // Catch:{ all -> 0x004b }
            r8 = 0
            byte r1 = r0[r8]     // Catch:{ all -> 0x004b }
            r3 = 100
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 != r3) goto L_0x002c
            byte r3 = r0[r6]     // Catch:{ all -> 0x004b }
            r7 = 101(0x65, float:1.42E-43)
            if (r3 != r7) goto L_0x002c
            byte r3 = r0[r5]     // Catch:{ all -> 0x004b }
            r7 = 121(0x79, float:1.7E-43)
            if (r3 != r7) goto L_0x002c
            byte r3 = r0[r4]     // Catch:{ all -> 0x004b }
            r7 = 10
            if (r3 != r7) goto L_0x002c
            r2.close()     // Catch:{ all -> 0x002b }
        L_0x002b:
            return r8
        L_0x002c:
            r8 = 127(0x7f, float:1.78E-43)
            if (r1 != r8) goto L_0x0046
            byte r8 = r0[r6]     // Catch:{ all -> 0x004b }
            r1 = 69
            if (r8 != r1) goto L_0x0046
            byte r8 = r0[r5]     // Catch:{ all -> 0x004b }
            r1 = 76
            if (r8 != r1) goto L_0x0046
            byte r8 = r0[r4]     // Catch:{ all -> 0x004b }
            r0 = 70
            if (r8 != r0) goto L_0x0046
            r2.close()     // Catch:{ all -> 0x0045 }
        L_0x0045:
            return r6
        L_0x0046:
            r8 = -1
            r2.close()     // Catch:{ all -> 0x004a }
        L_0x004a:
            return r8
        L_0x004b:
            r8 = move-exception
            r1 = r2
            goto L_0x004f
        L_0x004e:
            r8 = move-exception
        L_0x004f:
            if (r1 == 0) goto L_0x0054
            r1.close()     // Catch:{ all -> 0x0054 }
        L_0x0054:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.shareutil.ShareElfFile.getFileTypeByMagic(java.io.File):int");
    }

    public static String readCString(ByteBuffer byteBuffer) {
        byte[] array = byteBuffer.array();
        int position = byteBuffer.position();
        while (byteBuffer.hasRemaining() && array[byteBuffer.position()] != 0) {
            byteBuffer.position(byteBuffer.position() + 1);
        }
        byteBuffer.position(byteBuffer.position() + 1);
        return new String(array, position, (byteBuffer.position() - position) - 1, Charset.forName("ASCII"));
    }

    public static void readUntilLimit(FileChannel fileChannel, ByteBuffer byteBuffer, String str) {
        byteBuffer.rewind();
        int read = fileChannel.read(byteBuffer);
        if (read == byteBuffer.limit()) {
            byteBuffer.flip();
            return;
        }
        throw new IOException(str + " Rest bytes insufficient, expect to read " + byteBuffer.limit() + " bytes but only " + read + " bytes were read.");
    }

    public void close() {
        this.fis.close();
        this.sectionNameToHeaderMap.clear();
        this.programHeaders = null;
        this.sectionHeaders = null;
    }

    public FileChannel getChannel() {
        return this.fis.getChannel();
    }

    public ByteOrder getDataOrder() {
        return this.elfHeader.eIndent[5] == 1 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
    }

    public ByteBuffer getSection(SectionHeader sectionHeader) {
        ByteBuffer allocate = ByteBuffer.allocate((int) sectionHeader.shSize);
        this.fis.getChannel().position(sectionHeader.shOffset);
        FileChannel channel = this.fis.getChannel();
        readUntilLimit(channel, allocate, "failed to read section: " + sectionHeader.shNameStr);
        return allocate;
    }

    public SectionHeader getSectionHeaderByName(String str) {
        return this.sectionNameToHeaderMap.get(str);
    }

    public ByteBuffer getSegment(ProgramHeader programHeader) {
        ByteBuffer allocate = ByteBuffer.allocate((int) programHeader.pFileSize);
        this.fis.getChannel().position(programHeader.pOffset);
        FileChannel channel = this.fis.getChannel();
        readUntilLimit(channel, allocate, "failed to read segment (type: " + programHeader.pType + ").");
        return allocate;
    }

    public boolean is32BitElf() {
        return this.elfHeader.eIndent[4] == 1;
    }
}
