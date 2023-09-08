package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.C113021b;
import java.io.File;
import java.util.concurrent.Executor;
import p1062x3.C118819b;
import p1062x3.C118822i;
import p1062x3.a$$a;

/* renamed from: androidx.profileinstaller.a */
public class C113020a {

    /* renamed from: a */
    public final AssetManager f338299a;

    /* renamed from: b */
    public final Executor f338300b;

    /* renamed from: c */
    public final C113021b.C113023b f338301c;

    /* renamed from: d */
    public final byte[] f338302d;

    /* renamed from: e */
    public final File f338303e;

    /* renamed from: f */
    public boolean f338304f = false;

    /* renamed from: g */
    public C118819b[] f338305g;

    /* renamed from: h */
    public byte[] f338306h;

    public C113020a(AssetManager assetManager, Executor executor, C113021b.C113023b bVar, String str, String str2, String str3, File file) {
        byte[] bArr;
        this.f338299a = assetManager;
        this.f338300b = executor;
        this.f338301c = bVar;
        this.f338303e = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            switch (i) {
                case 24:
                case 25:
                    bArr = C118822i.f355515e;
                    break;
                case 26:
                    bArr = C118822i.f355514d;
                    break;
                case 27:
                    bArr = C118822i.f355513c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = C118822i.f355512b;
                    break;
                case 31:
                    bArr = C118822i.f355511a;
                    break;
            }
        }
        bArr = null;
        this.f338302d = bArr;
    }

    /* renamed from: a */
    public final void mo165383a(int i, Object obj) {
        this.f338300b.execute(new a$$a(this, i, obj));
    }
}
