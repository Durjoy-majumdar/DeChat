package p982if;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo;
import java.io.File;
import p425ze.C91669a;
import p723vf.C118672d;
import p937cf.C80018a;
import p955df.C86263c;
import p987jf.C87954a;

/* renamed from: if.j */
public class C87729j extends C87719c {

    /* renamed from: e */
    public final BroadcastReceiver f254015e;

    /* renamed from: f */
    public boolean f254016f;

    /* renamed from: g */
    public boolean f254017g;

    /* renamed from: if.j$a */
    public class C87730a extends BroadcastReceiver {
        public C87730a() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                C87729j.this.f254016f = true;
                C118672d.m167353c("Matrix.LeakProcessor.SilenceAnalyse", "[ACTION_SCREEN_OFF]", new Object[0]);
            } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                C87729j.this.f254016f = false;
                C118672d.m167353c("Matrix.LeakProcessor.SilenceAnalyse", "[ACTION_SCREEN_ON]", new Object[0]);
            }
        }
    }

    public C87729j(C87954a aVar) {
        super(aVar);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        C87730a aVar2 = new C87730a();
        this.f254015e = aVar2;
        try {
            aVar.f254526g.f261037e.registerReceiver(aVar2, intentFilter);
        } catch (Throwable th) {
            C118672d.m167354d("Matrix.LeakProcessor.SilenceAnalyse", th, "", new Object[0]);
        }
    }

    /* renamed from: b */
    public boolean mo112104b(DestroyedActivityInfo destroyedActivityInfo) {
        DestroyedActivityInfo destroyedActivityInfo2 = destroyedActivityInfo;
        C80018a.C80020b bVar = C80018a.C80020b.SILENCE_ANALYSE;
        mo122138c(0, C80018a.C80020b.NO_DUMP, destroyedActivityInfo2.mActivityName, destroyedActivityInfo2.mKey, "no dump", "0");
        String str = destroyedActivityInfo2.mActivityName;
        String str2 = destroyedActivityInfo2.mKey;
        C118672d.m167353c("Matrix.LeakProcessor.SilenceAnalyse", "[onLeak] activity=%s isScreenOff=%s isProcessing=%s", str, Boolean.valueOf(this.f254016f), Boolean.valueOf(this.f254017g));
        if (this.f253997a.mo125241a(str)) {
            C118672d.m167353c("Matrix.LeakProcessor.SilenceAnalyse", "this activity has been dumped! %s", str);
        } else if (this.f254017g || !this.f254016f) {
            return false;
        } else {
            this.f254017g = true;
            this.f253997a.mo122416c();
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f253998b == null) {
                this.f253998b = new C86263c(this.f253997a.f261442f);
            }
            File a = this.f253998b.mo120671a(false);
            if (a == null || a.length() <= 0) {
                mo122138c(2, bVar, str, str2, "file is null", "0");
                C118672d.m167352b("Matrix.LeakProcessor.SilenceAnalyse", "file is null!", new Object[0]);
            } else {
                C118672d.m167353c("Matrix.LeakProcessor.SilenceAnalyse", String.format("dump cost=%sms refString=%s path=%s", new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis), str2, a.getAbsolutePath()}), new Object[0]);
                long currentTimeMillis2 = System.currentTimeMillis();
                try {
                    C91669a a2 = mo122137a(a, str2);
                    C118672d.m167353c("Matrix.LeakProcessor.SilenceAnalyse", String.format("analyze cost=%sms refString=%s", new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis2), str2}), new Object[0]);
                    String aVar = a2.toString();
                    if (a2.f262647d) {
                        mo122138c(0, bVar, str, str2, aVar, String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        C118672d.m167353c("Matrix.LeakProcessor.SilenceAnalyse", aVar, new Object[0]);
                    } else {
                        C118672d.m167353c("Matrix.LeakProcessor.SilenceAnalyse", "leak not found", new Object[0]);
                    }
                } catch (OutOfMemoryError e) {
                    mo122138c(3, bVar, str, str2, "OutOfMemoryError", "0");
                    C118672d.m167354d("Matrix.LeakProcessor.SilenceAnalyse", e.getCause(), "", new Object[0]);
                } catch (Throwable th) {
                    a.delete();
                    throw th;
                }
                a.delete();
            }
            this.f253997a.mo125242b(str, false);
            this.f254017g = false;
        }
        return true;
    }
}
