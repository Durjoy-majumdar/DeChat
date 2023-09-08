package ha2;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.IOException;
import java.io.RandomAccessFile;
import za2.C102984b;

/* renamed from: ha2.i */
public class C98330i {

    /* renamed from: a */
    public RandomAccessFile f288224a = null;

    /* renamed from: b */
    public String f288225b;

    /* renamed from: c */
    public String f288226c;

    public C98330i(String str) {
        this.f288225b = str;
        String e = C102984b.m136168e(str);
        this.f288226c = e;
        Log.m105925i("MicroMsg.Music.PieceFileCache", "PieceFileCache mUrl:%s, fileName:%s,", this.f288225b, e);
    }

    /* renamed from: a */
    public static void m127111a(String str) {
        Logger.m21791i("MicroMsg.Music.PieceFileCache", "deleteFile, fileName:" + str);
        C86009m1 m1Var = new C86009m1(str);
        if (m1Var.mo119967g()) {
            Logger.m21791i("MicroMsg.Music.PieceFileCache", "delete the piece File");
            m1Var.mo119966f();
            return;
        }
        Logger.m21787e("MicroMsg.Music.PieceFileCache", "file not exist, delete piece File fail");
    }

    /* renamed from: b */
    public static boolean m127112b(String str) {
        Logger.m21791i("MicroMsg.Music.PieceFileCache", "existFileByUrl");
        String e = C102984b.m136168e(str);
        Logger.m21791i("MicroMsg.Music.PieceFileCache", "existFile, fileName:" + e);
        Uri n = C116299g2.m163858n(e);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        boolean x = !l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b);
        Log.m105925i("MicroMsg.Music.PieceFileCache", "the piece File exist:%b", Boolean.valueOf(x));
        return x;
    }

    /* renamed from: c */
    public static long m127113c(String str) {
        C86009m1 m1Var = new C86009m1(C102984b.m136168e(str));
        if (m1Var.mo119967g()) {
            return m1Var.mo119980r();
        }
        return -1;
    }

    /* renamed from: d */
    public synchronized int mo137661d() {
        RandomAccessFile randomAccessFile = this.f288224a;
        if (randomAccessFile == null) {
            Logger.m21787e("MicroMsg.Music.PieceFileCache", "getLength error, randomAccessFile is null");
            return -1;
        }
        try {
            return (int) randomAccessFile.length();
        } catch (IOException e) {
            Logger.m21789e("MicroMsg.Music.PieceFileCache", "Error get length of file , err %s", "" + e.getMessage());
            return -1;
        }
    }

    /* renamed from: e */
    public synchronized boolean mo137662e(byte[] bArr, long j, int i) {
        if (i == 0) {
            Logger.m21787e("MicroMsg.Music.PieceFileCache", "write error, length == 0");
            return false;
        }
        RandomAccessFile randomAccessFile = this.f288224a;
        if (randomAccessFile == null) {
            Logger.m21787e("MicroMsg.Music.PieceFileCache", "write error, randomAccessFile is null");
            return false;
        }
        try {
            randomAccessFile.seek(j);
            this.f288224a.write(bArr, 0, i);
            return true;
        } catch (IOException unused) {
            Logger.m21787e("MicroMsg.Music.PieceFileCache", String.format("Error writing %d bytes to from buffer with size %d", new Object[]{Integer.valueOf(i), Integer.valueOf(bArr.length)}));
            return false;
        }
    }
}
