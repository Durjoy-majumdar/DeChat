package cb2;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import hb2.C32799i;
import hb2.C8503a;
import java.util.ArrayList;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C36907w;

@C86522b
/* renamed from: cb2.g */
public final class C0443g extends C86301e {

    /* renamed from: d */
    public final String f1067d = "MicroMsg.Mv.PluginMv";

    /* renamed from: cb2.g$a */
    public static final class C0444a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f1068d;

        /* renamed from: e */
        public final /* synthetic */ C0443g f1069e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0444a(String str, C0443g gVar) {
            super(0);
            this.f1068d = str;
            this.f1069e = gVar;
        }

        public Object invoke() {
            ArrayList arrayList;
            StringBuilder sb = new StringBuilder();
            sb.append(C86709a0.m107535s().f251806d + "music/cover/");
            sb.append("mv_app_icon/");
            String sb4 = sb.toString();
            C86013q1.m106445f(sb4);
            int R = C86013q1.m106436R(this.f1068d, C86709a0.m107535s().f251806d + "music/cover/");
            String str = this.f1069e.f1067d;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("handleAppIconZip ");
            sb5.append(R);
            sb5.append(' ');
            sb5.append(C86013q1.m106450k(sb4));
            sb5.append(' ');
            Iterable<C86001b0> t = C86013q1.m106459t(sb4, false);
            if (t != null) {
                arrayList = new ArrayList(C36907w.m41090l(t, 10));
                for (C86001b0 b0Var : t) {
                    arrayList.add(b0Var.f250471a);
                }
            } else {
                arrayList = null;
            }
            sb5.append(arrayList);
            Log.m105924i(str, sb5.toString());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cb2.g$b */
    public static final class C0445b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f1070d;

        /* renamed from: e */
        public final /* synthetic */ C0443g f1071e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0445b(String str, C0443g gVar) {
            super(0);
            this.f1070d = str;
            this.f1071e = gVar;
        }

        public Object invoke() {
            ArrayList arrayList;
            StringBuilder sb = new StringBuilder();
            sb.append(C86709a0.m107535s().f251806d + "music/cover/");
            sb.append("mv_default_video/");
            String sb4 = sb.toString();
            C86013q1.m106445f(sb4);
            int R = C86013q1.m106436R(this.f1070d, C86709a0.m107535s().f251806d + "music/cover/");
            String str = this.f1071e.f1067d;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("handleDefaultVideoZip ");
            sb5.append(R);
            sb5.append(' ');
            sb5.append(C86013q1.m106450k(sb4));
            sb5.append(' ');
            Iterable<C86001b0> t = C86013q1.m106459t(sb4, false);
            if (t != null) {
                arrayList = new ArrayList(C36907w.m41090l(t, 10));
                for (C86001b0 b0Var : t) {
                    arrayList.add(b0Var.f250471a);
                }
            } else {
                arrayList = null;
            }
            sb5.append(arrayList);
            Log.m105924i(str, sb5.toString());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cb2.g$c */
    public static final class C0446c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f1072d;

        /* renamed from: e */
        public final /* synthetic */ C0443g f1073e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0446c(String str, C0443g gVar) {
            super(0);
            this.f1072d = str;
            this.f1073e = gVar;
        }

        public Object invoke() {
            ArrayList arrayList;
            StringBuilder sb = new StringBuilder();
            sb.append(C86709a0.m107535s().f251806d + "music/cover/");
            sb.append("mv_transition/");
            String sb4 = sb.toString();
            C86013q1.m106445f(sb4);
            int R = C86013q1.m106436R(this.f1072d, C86709a0.m107535s().f251806d + "music/cover/");
            String str = this.f1073e.f1067d;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("handlePagZip ");
            sb5.append(R);
            sb5.append(' ');
            sb5.append(C86013q1.m106450k(sb4));
            sb5.append(' ');
            Iterable<C86001b0> t = C86013q1.m106459t(sb4, false);
            if (t != null) {
                arrayList = new ArrayList(C36907w.m41090l(t, 10));
                for (C86001b0 b0Var : t) {
                    arrayList.add(b0Var.f250471a);
                }
            } else {
                arrayList = null;
            }
            sb5.append(arrayList);
            Log.m105924i(str, sb5.toString());
            C8503a.f27529e.mo9421a(sb4);
            return C13598b0.f38549a;
        }
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        super.onAccountReleased(context);
        C32799i.f89226a.getClass();
        C32799i.f89228c.clear();
        C32799i.f89229d.clear();
    }

    public final void vx0(String str) {
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        String str2 = this.f1067d;
        Log.m105924i(str2, "start to handle app icon " + str + ' ' + C86013q1.m106451l(str));
        C61926c.m72661F("Thread.Music", new C0444a(str, this));
    }

    public final void wx0(String str) {
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        String str2 = this.f1067d;
        Log.m105924i(str2, "start to handle default video " + str + ' ' + C86013q1.m106451l(str));
        C61926c.m72661F("Thread.Music", new C0445b(str, this));
    }

    public final void xx0(String str) {
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        String str2 = this.f1067d;
        Log.m105924i(str2, "start to handle pag " + str + ' ' + C86013q1.m106451l(str));
        C61926c.m72661F("Thread.Music", new C0446c(str, this));
    }
}
