package ho2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: ho2.a */
public class C117101a implements C117108c {

    /* renamed from: b */
    public byte[] f350879b;

    /* renamed from: c */
    public int f350880c = 0;

    /* renamed from: d */
    public C117109d f350881d;

    /* renamed from: e */
    public byte[] f350882e;

    /* renamed from: ho2.a$a */
    public class C117102a implements C117109d {

        /* renamed from: a */
        public int f350883a = mo181046b();

        /* renamed from: b */
        public short f350884b;

        /* renamed from: c */
        public short f350885c;

        /* renamed from: d */
        public short f350886d;

        /* renamed from: e */
        public C117112g[] f350887e;

        /* renamed from: ho2.a$a$a */
        public class C117103a extends C117112g {

            /* renamed from: c */
            public final /* synthetic */ int f350889c;

            public C117103a(C117101a aVar, int i) {
                this.f350889c = i;
            }

            /* renamed from: a */
            public Object mo181050a() {
                SnsMethodCalculate.markStartTimeMs("computeValue", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl$1");
                C117104b bVar = new C117104b(this.f350889c);
                SnsMethodCalculate.markEndTimeMs("computeValue", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl$1");
                return bVar;
            }
        }

        /* renamed from: ho2.a$a$b */
        public class C117104b implements C117110e {

            /* renamed from: a */
            public int f350891a;

            /* renamed from: b */
            public int f350892b;

            /* renamed from: c */
            public int f350893c;

            /* renamed from: d */
            public int f350894d;

            /* renamed from: e */
            public int f350895e;

            /* renamed from: f */
            public C117112g f350896f;

            /* renamed from: ho2.a$a$b$a */
            public class C117105a extends C117112g {

                /* renamed from: c */
                public final /* synthetic */ int f350898c;

                /* renamed from: d */
                public final /* synthetic */ int f350899d;

                public C117105a(C117102a aVar, int i, int i2) {
                    this.f350898c = i;
                    this.f350899d = i2;
                }

                /* renamed from: a */
                public Object mo181050a() {
                    SnsMethodCalculate.markStartTimeMs("computeValue", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl$ELFSectionHeaderImpl$1");
                    C117106c cVar = new C117106c(C117102a.this, this.f350898c, this.f350899d);
                    SnsMethodCalculate.markEndTimeMs("computeValue", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl$ELFSectionHeaderImpl$1");
                    return cVar;
                }
            }

            public C117104b(int i) {
                C117102a.this.mo181049e(i);
                this.f350891a = C117102a.this.mo181046b();
                this.f350892b = C117102a.this.mo181046b();
                C117102a.this.mo181049e(C117102a.this.mo181048d() + 8);
                this.f350893c = C117102a.this.mo181046b();
                this.f350894d = C117102a.this.mo181046b();
                this.f350895e = C117102a.this.mo181046b();
                C117102a.this.mo181049e(C117102a.this.mo181048d() + 12);
                int i2 = this.f350892b;
                if (i2 != 2) {
                    if (i2 == 3) {
                        this.f350896f = new C117105a(C117102a.this, this.f350893c, this.f350894d);
                        return;
                    } else if (i2 != 11) {
                        return;
                    }
                }
                C117112g[] gVarArr = new C117112g[(this.f350894d / this.f350895e)];
            }

            /* renamed from: a */
            public C117111f mo181051a() {
                SnsMethodCalculate.markStartTimeMs("getStringTable", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl$ELFSectionHeaderImpl");
                C117112g gVar = this.f350896f;
                if (gVar != null) {
                    SnsMethodCalculate.markStartTimeMs("getValue", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.MemoizedObject");
                    if (!gVar.f350903a) {
                        gVar.f350904b = gVar.mo181050a();
                        gVar.f350903a = true;
                    }
                    Object obj = gVar.f350904b;
                    SnsMethodCalculate.markEndTimeMs("getValue", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.MemoizedObject");
                    C117111f fVar = (C117111f) obj;
                    SnsMethodCalculate.markEndTimeMs("getStringTable", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl$ELFSectionHeaderImpl");
                    return fVar;
                }
                SnsMethodCalculate.markEndTimeMs("getStringTable", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl$ELFSectionHeaderImpl");
                return null;
            }

            public String getName() {
                SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl$ELFSectionHeaderImpl");
                if (this.f350891a == 0) {
                    SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl$ELFSectionHeaderImpl");
                    return null;
                }
                C117101a aVar = C117101a.this;
                aVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getHeader", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl");
                C117109d dVar = aVar.f350881d;
                SnsMethodCalculate.markEndTimeMs("getHeader", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl");
                C117102a aVar2 = (C117102a) dVar;
                aVar2.getClass();
                SnsMethodCalculate.markStartTimeMs("getSectionHeaderStringTable", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
                short s = aVar2.f350886d;
                SnsMethodCalculate.markStartTimeMs("getSectionHeader", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
                C117112g gVar = aVar2.f350887e[s];
                gVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getValue", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.MemoizedObject");
                if (!gVar.f350903a) {
                    gVar.f350904b = gVar.mo181050a();
                    gVar.f350903a = true;
                }
                Object obj = gVar.f350904b;
                SnsMethodCalculate.markEndTimeMs("getValue", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.MemoizedObject");
                SnsMethodCalculate.markEndTimeMs("getSectionHeader", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
                C117111f a = ((C117110e) obj).mo181051a();
                SnsMethodCalculate.markEndTimeMs("getSectionHeaderStringTable", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
                String str = a.get(this.f350891a);
                SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl$ELFSectionHeaderImpl");
                return str;
            }

            public int getOffset() {
                SnsMethodCalculate.markStartTimeMs("getOffset", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl$ELFSectionHeaderImpl");
                int i = this.f350893c;
                SnsMethodCalculate.markEndTimeMs("getOffset", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl$ELFSectionHeaderImpl");
                return i;
            }

            public int getSize() {
                SnsMethodCalculate.markStartTimeMs("getSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl$ELFSectionHeaderImpl");
                int i = this.f350894d;
                SnsMethodCalculate.markEndTimeMs("getSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl$ELFSectionHeaderImpl");
                return i;
            }
        }

        /* renamed from: ho2.a$a$c */
        public class C117106c implements C117111f {

            /* renamed from: a */
            public byte[] f350901a;

            public C117106c(C117102a aVar, int i, int i2) {
                aVar.mo181049e(i);
                byte[] bArr = new byte[i2];
                this.f350901a = bArr;
                int a = aVar.mo181045a(bArr);
                if (a == i2) {
                    int i3 = 0;
                    while (true) {
                        byte[] bArr2 = this.f350901a;
                        if (i3 < bArr2.length) {
                            byte b = bArr2[i3];
                            i3++;
                        } else {
                            return;
                        }
                    }
                } else {
                    throw new C117107b("Error reading string table (read " + a + "bytes, expected to read " + this.f350901a.length + "bytes).");
                }
            }

            public String get(int i) {
                SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl$ELFStringTableImpl");
                int i2 = i;
                while (true) {
                    byte[] bArr = this.f350901a;
                    if (bArr[i2] != 0) {
                        i2++;
                    } else {
                        String str = new String(bArr, i, i2 - i);
                        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl$ELFStringTableImpl");
                        return str;
                    }
                }
            }
        }

        public C117102a() {
            mo181047c();
            mo181047c();
            mo181049e(mo181048d() + 12);
            mo181049e(mo181048d() + 4 + 6);
            this.f350884b = mo181047c();
            this.f350885c = mo181047c();
            this.f350886d = mo181047c();
            this.f350887e = new C117112g[this.f350885c];
            for (int i = 0; i < this.f350885c; i++) {
                Log.m105918d("ELFDataParser", "i: " + i + ", sh_offset:" + this.f350883a + ", sh_entry_size:" + this.f350884b);
                this.f350887e[i] = new C117103a(C117101a.this, this.f350883a + (this.f350884b * i));
            }
        }

        /* renamed from: a */
        public int mo181045a(byte[] bArr) {
            SnsMethodCalculate.markStartTimeMs("readBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
            int length = C117101a.m165130a(C117101a.this).length - C117101a.this.f350880c;
            if (length < 1) {
                SnsMethodCalculate.markEndTimeMs("readBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
                return length;
            }
            int min = Math.min(length, bArr.length);
            System.arraycopy(C117101a.m165130a(C117101a.this), C117101a.this.f350880c, bArr, 0, min);
            C117101a.this.f350880c += min;
            SnsMethodCalculate.markEndTimeMs("readBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
            return min;
        }

        /* renamed from: b */
        public int mo181046b() {
            SnsMethodCalculate.markStartTimeMs("readInt", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
            byte[] bArr = new byte[4];
            mo181045a(bArr);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            SnsMethodCalculate.markStartTimeMs("bytes2int", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.order(byteOrder);
            int i = wrap.getInt();
            SnsMethodCalculate.markEndTimeMs("bytes2int", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
            SnsMethodCalculate.markEndTimeMs("readInt", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
            return i;
        }

        /* renamed from: c */
        public short mo181047c() {
            SnsMethodCalculate.markStartTimeMs("readShort", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
            byte[] bArr = new byte[2];
            mo181045a(bArr);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            SnsMethodCalculate.markStartTimeMs("bytes2short", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.order(byteOrder);
            short s = wrap.getShort();
            SnsMethodCalculate.markEndTimeMs("bytes2short", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
            SnsMethodCalculate.markEndTimeMs("readShort", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
            return s;
        }

        /* renamed from: d */
        public int mo181048d() {
            SnsMethodCalculate.markStartTimeMs("seek", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
            int i = C117101a.this.f350880c;
            SnsMethodCalculate.markEndTimeMs("seek", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
            return i;
        }

        /* renamed from: e */
        public void mo181049e(int i) {
            SnsMethodCalculate.markStartTimeMs("seek", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
            int length = C117101a.m165130a(C117101a.this).length;
            C117101a.this.f350880c = i;
            SnsMethodCalculate.markEndTimeMs("seek", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
        }
    }

    public C117101a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        this.f350882e = bArr2;
        this.f350879b = bArr;
        SnsMethodCalculate.markStartTimeMs("readBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl");
        int min = Math.min(this.f350879b.length - this.f350880c, bArr2.length);
        System.arraycopy(this.f350879b, this.f350880c, bArr2, 0, min);
        this.f350880c += min;
        SnsMethodCalculate.markEndTimeMs("readBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl");
        if (min == this.f350882e.length) {
            SnsMethodCalculate.markStartTimeMs("getMagicNumber", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl");
            byte[] bArr3 = this.f350882e;
            byte[] bArr4 = {bArr3[0], bArr3[1], bArr3[2], bArr3[3]};
            SnsMethodCalculate.markEndTimeMs("getMagicNumber", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl");
            if (Arrays.equals(bArr4, C117108c.f350902a)) {
                this.f350881d = new C117102a();
                return;
            }
            throw new C117107b("Bad magic number for file.");
        }
        throw new C117107b("Error reading elf header (read " + min + "bytes, expected to read " + this.f350882e.length + "bytes).");
    }

    /* renamed from: a */
    public static /* synthetic */ byte[] m165130a(C117101a aVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl");
        byte[] bArr = aVar.f350879b;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl");
        return bArr;
    }
}
