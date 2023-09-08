package p1062x3;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;

/* renamed from: x3.f$$a */
public final /* synthetic */ class f$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ProfileInstallerInitializer f335396d;

    /* renamed from: e */
    public final /* synthetic */ Context f335397e;

    public /* synthetic */ f$$a(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f335396d = profileInstallerInitializer;
        this.f335397e = context;
    }

    public final void run() {
        ProfileInstallerInitializer profileInstallerInitializer = this.f335396d;
        Context context = this.f335397e;
        profileInstallerInitializer.getClass();
        (Build.VERSION.SDK_INT >= 28 ? ProfileInstallerInitializer.C103773b.m138186a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new f$$b(context), (long) (new Random().nextInt(Math.max(1000, 1)) + 5000));
    }
}
