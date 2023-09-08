package t72;

import a70.C112760b;
import android.os.StatFs;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.SdcardUtil;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86009m1;
import p206nj.C88956h;

/* renamed from: t72.h */
public class C90380h implements Runnable {
    public C90380h(C118391i iVar) {
    }

    public void run() {
        String str;
        long j;
        int i;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        boolean z;
        long j7;
        int i2;
        try {
            C86009m1 m1Var = new C86009m1(C72994y1.f212832a + "SdcardInfo.cfg");
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(340, m1Var.mo119967g() ? 10 : 11, 1, true);
            boolean hasUnRemovableStorage = SdcardUtil.hasUnRemovableStorage();
            String path = C88956h.m111060a().getPath();
            String path2 = C88956h.m111061b().getPath();
            StatFs statFs = new StatFs(path);
            long blockSize = (long) statFs.getBlockSize();
            long blockCount = (long) statFs.getBlockCount();
            long availableBlocks = (long) statFs.getAvailableBlocks();
            long j8 = blockSize * blockCount;
            long j9 = blockSize * availableBlocks;
            int round = blockCount > 0 ? Math.round((((float) availableBlocks) * 100.0f) / ((float) blockCount)) : -1;
            StatFs statFs2 = new StatFs(path2);
            boolean z2 = hasUnRemovableStorage;
            long blockSize2 = (long) statFs2.getBlockSize();
            C115669n nVar2 = nVar;
            C86009m1 m1Var2 = m1Var;
            str = "MicroMsg.SubCoreBaseMonitor";
            long blockCount2 = (long) statFs2.getBlockCount();
            try {
                long availableBlocks2 = (long) statFs2.getAvailableBlocks();
                long j15 = blockSize2 * blockCount2;
                long j16 = blockSize2 * availableBlocks2;
                if (blockCount2 > 0) {
                    j = blockSize2;
                    i = Math.round((((float) availableBlocks2) * 100.0f) / ((float) blockCount2));
                } else {
                    j = blockSize2;
                    i = -1;
                }
                boolean equals = C112760b.m154217Y().equals(path2);
                if (!equals) {
                    z = equals;
                    StatFs statFs3 = new StatFs(C112760b.m154217Y());
                    j6 = availableBlocks2;
                    long blockSize3 = (long) statFs3.getBlockSize();
                    j5 = blockCount2;
                    blockCount2 = (long) statFs3.getBlockCount();
                    long availableBlocks3 = (long) statFs3.getAvailableBlocks();
                    long j17 = blockSize3 * blockCount2;
                    long j18 = blockSize3 * availableBlocks3;
                    if (blockCount2 > 0) {
                        j7 = blockSize3;
                        i2 = Math.round((((float) availableBlocks3) * 100.0f) / ((float) blockCount2));
                    } else {
                        j7 = blockSize3;
                        i2 = i;
                    }
                    j2 = j18;
                    j3 = j17;
                    j4 = availableBlocks3;
                } else {
                    j5 = blockCount2;
                    j6 = availableBlocks2;
                    z = equals;
                    i2 = i;
                    j3 = j15;
                    j2 = j16;
                    j7 = j;
                    j4 = j6;
                }
                String fileSystem = SdcardUtil.getFileSystem(C112760b.m154217Y());
                String str2 = "summerStorage [%s, %s, %s] [%s] [%b] [%d,%d,%d,%d,%d,%d] [%d,%d,%d,%d,%d,%d] [%b] [%d,%d,%d,%d,%d,%d], [%d][%s]";
                String fileSystem2 = SdcardUtil.getFileSystem(path);
                Object[] objArr = new Object[26];
                objArr[0] = path;
                objArr[1] = path2;
                String str3 = path2;
                objArr[2] = C112760b.m154217Y();
                objArr[3] = fileSystem;
                objArr[4] = Boolean.valueOf(z2);
                objArr[5] = Long.valueOf(blockSize);
                objArr[6] = Long.valueOf(blockCount);
                objArr[7] = Long.valueOf(availableBlocks);
                objArr[8] = Long.valueOf(j8);
                objArr[9] = Long.valueOf(j9);
                objArr[10] = Integer.valueOf(round);
                objArr[11] = Long.valueOf(j);
                objArr[12] = Long.valueOf(j5);
                objArr[13] = Long.valueOf(j6);
                objArr[14] = Long.valueOf(j15);
                objArr[15] = Long.valueOf(j16);
                objArr[16] = Integer.valueOf(i);
                objArr[17] = Boolean.valueOf(z);
                objArr[18] = Long.valueOf(j7);
                objArr[19] = Long.valueOf(blockCount2);
                objArr[20] = Long.valueOf(j4);
                objArr[21] = Long.valueOf(j3);
                objArr[22] = Long.valueOf(j2);
                objArr[23] = Integer.valueOf(i2);
                objArr[24] = Integer.valueOf(m1Var2.mo119967g() ? 1 : 0);
                objArr[25] = fileSystem2;
                String str4 = str;
                try {
                    Log.m105925i(str4, str2, objArr);
                    long j19 = availableBlocks;
                    long j25 = blockCount;
                    long j26 = blockSize;
                    str = str4;
                    String str5 = fileSystem2;
                    nVar2.idkeyStat(340, 0, 1, true);
                    nVar2.idkeyStat(340, z2 ? 1 : 2, 1, true);
                    nVar2.idkeyStat(340, z ? 3 : 4, 1, true);
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = 5000;
                    Object[] objArr3 = new Object[26];
                    objArr3[0] = path;
                    objArr3[1] = str3;
                    objArr3[2] = C112760b.m154217Y();
                    objArr3[3] = fileSystem;
                    objArr3[4] = Integer.valueOf(z2 ? 1 : 0);
                    objArr3[5] = Long.valueOf(j26);
                    objArr3[6] = Long.valueOf(j25);
                    objArr3[7] = Long.valueOf(j19);
                    objArr3[8] = Long.valueOf(j8);
                    objArr3[9] = Long.valueOf(j9);
                    objArr3[10] = Integer.valueOf(round);
                    objArr3[11] = Long.valueOf(j);
                    objArr3[12] = Long.valueOf(j5);
                    objArr3[13] = Long.valueOf(j6);
                    objArr3[14] = Long.valueOf(j15);
                    objArr3[15] = Long.valueOf(j16);
                    objArr3[16] = Integer.valueOf(i);
                    objArr3[17] = Integer.valueOf(z ? 1 : 0);
                    objArr3[18] = Long.valueOf(j7);
                    objArr3[19] = Long.valueOf(blockCount2);
                    objArr3[20] = Long.valueOf(j4);
                    objArr3[21] = Long.valueOf(j3);
                    objArr3[22] = Long.valueOf(j2);
                    objArr3[23] = Integer.valueOf(i2);
                    objArr3[24] = Integer.valueOf(m1Var2.mo119967g() ? 1 : 0);
                    objArr3[25] = str5;
                    objArr2[1] = String.format("%s;%s;%s;%s;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%d;%s", objArr3);
                    C115669n nVar3 = nVar2;
                    nVar3.mo160131h(11098, objArr2);
                    nVar3.mo160131h(11098, 5001, path + ";" + str5);
                    nVar3.mo160131h(11098, 5002, C112760b.m154217Y() + ";" + fileSystem);
                    Object[] objArr4 = new Object[2];
                    objArr4[0] = 5003;
                    objArr4[1] = Integer.valueOf(m1Var2.mo119967g() ? 1 : 0);
                    nVar3.mo160131h(11098, objArr4);
                    Object[] objArr5 = new Object[2];
                    objArr5[0] = 5004;
                    objArr5[1] = Integer.valueOf(z2 ? 1 : 0);
                    nVar3.mo160131h(11098, objArr5);
                    nVar3.idkeyStat(340, 7, 1, true);
                } catch (Exception e) {
                    e = e;
                    str = str4;
                    Log.printErrStackTrace(str, e, "reportSDStatus err!", new Object[0]);
                    C115669n.INSTANCE.idkeyStat(340, 8, 1, true);
                }
            } catch (Exception e2) {
                e = e2;
                Log.printErrStackTrace(str, e, "reportSDStatus err!", new Object[0]);
                C115669n.INSTANCE.idkeyStat(340, 8, 1, true);
            }
        } catch (Exception e3) {
            e = e3;
            str = "MicroMsg.SubCoreBaseMonitor";
            Log.printErrStackTrace(str, e, "reportSDStatus err!", new Object[0]);
            C115669n.INSTANCE.idkeyStat(340, 8, 1, true);
        }
    }
}
