package kn0;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Map;
import ln0.C88593a;
import ln0.C88596c;
import ln0.C88600e;
import p300c8.C79946g;
import p396x6.C22998f;
import p396x6.C23002g;
import p953d8.C86199a;
import p953d8.C86207e;
import so0.a$$a;
import ym0.C91509g;
import ym0.C91512j;

/* renamed from: kn0.n */
public class C88236n extends C21365k {

    /* renamed from: b0 */
    public static int f255055b0;

    /* renamed from: X */
    public final int f255056X = f255055b0;

    /* renamed from: Y */
    public int f255057Y = 0;

    /* renamed from: Z */
    public volatile C88238b f255058Z = null;

    /* renamed from: a0 */
    public volatile C88239c f255059a0 = null;

    /* renamed from: kn0.n$a */
    public enum C88237a implements C22998f.C23000b {
        ;
        

        /* renamed from: d */
        public static final C22998f.C23001c f255060d = null;

        /* access modifiers changed from: public */
        static {
            C88237a aVar;
            f255060d = new C22998f.C23001c(aVar, 0, (Object) null);
        }

        /* renamed from: e */
        public void mo32384e(int i, Object obj) {
        }
    }

    /* renamed from: kn0.n$b */
    public static class C88238b {

        /* renamed from: c */
        public static final C88238b f255062c = new C88238b(-1, false, false, false);

        /* renamed from: a */
        public final int f255063a;

        /* renamed from: b */
        public final boolean f255064b;

        public C88238b(int i, boolean z, boolean z2, boolean z3) {
            this.f255063a = i;
            this.f255064b = z3;
        }

        public String toString() {
            return "ExtraInfo{fixNotifyErrorChannel=" + this.f255063a + ", lockCache=" + false + ", useCronet=" + false + ", interruptCache=" + this.f255064b + '}';
        }
    }

    /* renamed from: kn0.n$c */
    public interface C88239c {
    }

    public C88236n(Handler handler) {
        super(handler);
    }

    /* renamed from: I */
    public int mo33462I(Uri uri) {
        return C88233g.f255048a.mo122581a(C88593a.f255857e, uri);
    }

    /* renamed from: J */
    public C79946g.C79947a mo33463J(Map<String, String> map) {
        C79946g.C79947a aVar;
        C86207e eVar;
        Context context = this.f60460o;
        C88593a aVar2 = C88593a.f255857e;
        C87412m.m108594g(context, "context");
        if (map == null && !C91512j.m114810c().f262321e) {
            C79946g.C79947a aVar3 = null;
            if (aVar2 != null) {
                if (C88232e.f255047a) {
                    C88600e eVar2 = (C88600e) aVar2.f255858d;
                    synchronized (eVar2) {
                        if (!eVar2.f255875g) {
                            C86199a aVar4 = eVar2.f255872d;
                            if (!(aVar4 == null || (eVar = eVar2.f255873e) == null)) {
                                eVar2.f255874f = new C88596c(aVar4, eVar);
                            }
                            eVar2.f255875g = true;
                        }
                    }
                    C88596c cVar = eVar2.f255874f;
                    aVar = cVar != null ? cVar.f255866d : eVar2.f255873e;
                } else {
                    aVar = aVar2.mo123039pR();
                }
                aVar3 = aVar;
            }
            if (aVar3 != null) {
                Log.m105924i("MicroMsg.AppBrand.DataSourceFactoryCreator", "getDataSourceFactory, return customized data source factory");
                return aVar3;
            }
        }
        Log.m105924i("MicroMsg.AppBrand.DataSourceFactoryCreator", "getDataSourceFactory, return default data source factory");
        return C88235m.m109882a(context, map);
    }

    /* renamed from: L */
    public C91509g mo33465L() {
        return C88593a.f255857e;
    }

    /* renamed from: N */
    public void mo33467N() {
        Log.m105924i("MicroMsg.SameLayer.ExoMediaPlayer", "notifyErrorWorkaroundOnLoadError1IfNeed, channel: " + this.f255056X);
        int i = this.f255056X;
        if (i == 1) {
            int i2 = this.f255057Y + 1;
            this.f255057Y = i2;
            if (3 <= i2) {
                Log.m105924i("MicroMsg.SameLayer.ExoMediaPlayer", "notifyErrorWorkaround1OnLoadError1");
                mo32891z(-4006, -2);
            }
        } else if (i == 2) {
            C22998f fVar = this.f60461p;
            if (fVar != null) {
                Log.m105924i("MicroMsg.SameLayer.ExoMediaPlayer", "notifyErrorWorkaround2OnLoadError, send DUMMY message to do some work");
                ((C23002g) fVar).mo36260e(C88237a.f255060d);
            }
            int i3 = this.f255057Y + 1;
            this.f255057Y = i3;
            if (4 <= i3) {
                Log.m105928w("MicroMsg.SameLayer.ExoMediaPlayer", "notifyErrorWorkaround2OnLoadError1, loadErrorCount: " + this.f255057Y);
                C88239c cVar = this.f255059a0;
                if (cVar != null) {
                    ((a$$a) cVar).f259095a.f259094a.f259114s++;
                }
            }
        }
    }

    /* renamed from: O */
    public void mo33468O() {
        Log.m105924i("MicroMsg.SameLayer.ExoMediaPlayer", "notifyErrorWorkaroundOnLoadError2IfNeed, channel: " + this.f255056X);
        if (this.f255056X == 2) {
            this.f255057Y = 0;
        }
    }

    /* renamed from: z */
    public boolean mo32891z(int i, int i2) {
        boolean z = super.mo32891z(i, i2);
        Log.m105924i("MicroMsg.SameLayer.ExoMediaPlayer", "notifyErrorWorkaroundOnErrorIfNeed, channel: " + this.f255056X);
        int i3 = this.f255056X;
        if (i3 == 1) {
            this.f255057Y = 0;
        } else if (i3 == 2) {
            this.f255057Y = 0;
        }
        return z;
    }

    public C88236n(Handler handler, int i, int i2, int i3) {
        super(handler, 0, 0.75f, 10000, 25000, i, i2, i3, 5000);
    }
}
