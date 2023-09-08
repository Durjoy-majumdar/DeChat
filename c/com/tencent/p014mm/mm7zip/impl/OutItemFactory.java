package com.tencent.p014mm.mm7zip.impl;

import com.tencent.p014mm.mm7zip.IInArchive;
import com.tencent.p014mm.mm7zip.IOutArchive;
import com.tencent.p014mm.mm7zip.IOutItem7z;
import com.tencent.p014mm.mm7zip.IOutItemBase;
import com.tencent.p014mm.mm7zip.IOutItemZip;
import com.tencent.p014mm.mm7zip.PropID;
import java.util.Date;

/* renamed from: com.tencent.mm.mm7zip.impl.OutItemFactory */
public class OutItemFactory<T extends IOutItemBase> {
    private static final Long ZERO = 0L;
    private int index;
    private IOutArchive<?> outArchive;

    /* renamed from: com.tencent.mm.mm7zip.impl.OutItemFactory$1 */
    public static /* synthetic */ class C177911 {
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$mm$mm7zip$ArchiveFormat;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tencent.mm.mm7zip.ArchiveFormat[] r0 = com.tencent.p014mm.mm7zip.ArchiveFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$tencent$mm$mm7zip$ArchiveFormat = r0
                com.tencent.mm.mm7zip.ArchiveFormat r1 = com.tencent.p014mm.mm7zip.ArchiveFormat.SEVEN_ZIP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$tencent$mm$mm7zip$ArchiveFormat     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.mm.mm7zip.ArchiveFormat r1 = com.tencent.p014mm.mm7zip.ArchiveFormat.ZIP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.mm7zip.impl.OutItemFactory.C177911.<clinit>():void");
        }
    }

    public OutItemFactory(IOutArchive<?> iOutArchive, int i) {
        this.outArchive = iOutArchive;
        this.index = i;
    }

    private OutItem createOutItemIntern() {
        OutItem outItem = new OutItem(this.outArchive, this.index);
        fillDefaultValues(outItem);
        return outItem;
    }

    private void fillDefaultValues(OutItem outItem) {
        if (this.outArchive.getConnectedInArchive() != null) {
            outItem.setUpdateOldArchiveItemIndex(-1);
            Boolean bool = Boolean.TRUE;
            outItem.setUpdateIsNewData(bool);
            outItem.setUpdateIsNewProperties(bool);
        }
        outItem.setDataSize(ZERO);
        outItem.setPropertyLastModificationTime(new Date());
        int i = C177911.$SwitchMap$com$tencent$mm$mm7zip$ArchiveFormat[outItem.getArchiveFormat().ordinal()];
        if (i == 1) {
            fillDefaultValues7z(outItem);
        } else if (i == 2) {
            fillDefaultValuesZip(outItem);
        } else {
            throw new RuntimeException("No default values strategy for the archive format '" + outItem.getArchiveFormat() + "'");
        }
    }

    private void fillDefaultValues7z(IOutItem7z iOutItem7z) {
        Boolean bool = Boolean.FALSE;
        iOutItem7z.setPropertyIsAnti(bool);
        iOutItem7z.setPropertyIsDir(bool);
        iOutItem7z.setPropertyAttributes(0);
    }

    private void fillDefaultValuesZip(IOutItemZip iOutItemZip) {
        iOutItemZip.setPropertyIsDir(Boolean.FALSE);
        iOutItemZip.setPropertyAttributes(0);
    }

    public T createOutItem() {
        return createOutItemIntern();
    }

    public T createOutItemAndCloneProperties(int i) {
        IInArchive connectedInArchive = this.outArchive.getConnectedInArchive();
        if (connectedInArchive != null) {
            T createOutItemIntern = createOutItemIntern();
            createOutItemIntern.setUpdateOldArchiveItemIndex(Integer.valueOf(i));
            createOutItemIntern.setUpdateIsNewData(Boolean.FALSE);
            createOutItemIntern.setUpdateIsNewProperties(Boolean.TRUE);
            createOutItemIntern.setPropertyPath((String) connectedInArchive.getProperty(i, PropID.PATH));
            createOutItemIntern.setPropertyAttributes((Integer) connectedInArchive.getProperty(i, PropID.ATTRIBUTES));
            createOutItemIntern.setPropertyPosixAttributes((Integer) connectedInArchive.getProperty(i, PropID.POSIX_ATTRIB));
            createOutItemIntern.setPropertyUser((String) connectedInArchive.getProperty(i, PropID.USER));
            createOutItemIntern.setPropertyGroup((String) connectedInArchive.getProperty(i, PropID.GROUP));
            createOutItemIntern.setPropertyCreationTime((Date) connectedInArchive.getProperty(i, PropID.CREATION_TIME));
            createOutItemIntern.setPropertyLastModificationTime((Date) connectedInArchive.getProperty(i, PropID.LAST_MODIFICATION_TIME));
            createOutItemIntern.setPropertyLastAccessTime((Date) connectedInArchive.getProperty(i, PropID.LAST_ACCESS_TIME));
            createOutItemIntern.setPropertyIsAnti((Boolean) connectedInArchive.getProperty(i, PropID.IS_ANTI));
            createOutItemIntern.setPropertyIsDir((Boolean) connectedInArchive.getProperty(i, PropID.IS_FOLDER));
            return createOutItemIntern;
        }
        throw new RuntimeException("Not an update operation");
    }

    public T createOutItem(int i) {
        if (this.outArchive.getConnectedInArchive() != null) {
            T createOutItemIntern = createOutItemIntern();
            createOutItemIntern.setUpdateOldArchiveItemIndex(Integer.valueOf(i));
            Boolean bool = Boolean.FALSE;
            createOutItemIntern.setUpdateIsNewData(bool);
            createOutItemIntern.setUpdateIsNewProperties(bool);
            return createOutItemIntern;
        }
        throw new RuntimeException("Not an update operation");
    }
}
