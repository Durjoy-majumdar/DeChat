package com.tencent.p014mm.feature.revoke;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.matrix.lifecycle.C80403e;
import com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner;
import com.tencent.p014mm.autogen.mmdata.rpt.ErrorMsgInfoStruct;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C97625j3;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.List;
import k20.C9556a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import yb2.C15946a;
import z04.C112551y;

/* renamed from: com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC */
public final class RevokeChattingLandingPageUIC extends C15946a {

    /* renamed from: o */
    public static final List<String> f195287o = C64197v.m75537f("img_gallery_msg_id", "Chat_Msg_Id", "app_msg_id");

    /* renamed from: p */
    public static final List<String> f195288p = C64197v.m75537f("img_gallery_msg_svr_id", "serverMsgID");

    /* renamed from: d */
    public final C13601g f195289d = C36568h.m40985a(new C68046d(this));

    /* renamed from: e */
    public final C13601g f195290e = C36568h.m40985a(new C68047e(this));

    /* renamed from: f */
    public final C13601g f195291f = C36568h.m40985a(new C68045c(this));

    /* renamed from: g */
    public final IListener<?> f195292g;

    /* renamed from: h */
    public final IListener<?> f195293h;

    /* renamed from: i */
    public final C13601g f195294i;

    /* renamed from: j */
    public boolean f195295j;

    /* renamed from: n */
    public final C68043a f195296n;

    /* renamed from: com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC$a */
    public static final class C68043a extends C80403e {

        /* renamed from: b */
        public final WeakReference<RevokeChattingLandingPageUIC> f195297b;

        public C68043a(WeakReference<RevokeChattingLandingPageUIC> weakReference) {
            C87412m.m108594g(weakReference, "weakUIC");
            this.f195297b = weakReference;
        }

        /* renamed from: a */
        public void mo56329a() {
            RevokeChattingLandingPageUIC revokeChattingLandingPageUIC = this.f195297b.get();
            if (revokeChattingLandingPageUIC != null) {
                Log.m105924i("MRevokeChat.LandingPageUIC", "onEnterForeground() called isNeedGoHome:" + revokeChattingLandingPageUIC + ".isNeedGoHomeAfterEnter [" + revokeChattingLandingPageUIC + ']');
                if (revokeChattingLandingPageUIC.f195295j) {
                    revokeChattingLandingPageUIC.mo93515j3();
                }
            }
        }

        /* renamed from: b */
        public void mo56330b() {
            RevokeChattingLandingPageUIC revokeChattingLandingPageUIC = this.f195297b.get();
            if (revokeChattingLandingPageUIC != null) {
                Log.m105924i("MRevokeChat.LandingPageUIC", "onExitForeground() called [" + revokeChattingLandingPageUIC + ']');
            }
        }
    }

    /* renamed from: com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC$b */
    public static final class C68044b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ RevokeChattingLandingPageUIC f195298d;

        /* renamed from: e */
        public final /* synthetic */ AppCompatActivity f195299e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68044b(RevokeChattingLandingPageUIC revokeChattingLandingPageUIC, AppCompatActivity appCompatActivity) {
            super(0);
            this.f195298d = revokeChattingLandingPageUIC;
            this.f195299e = appCompatActivity;
        }

        public Object invoke() {
            String str = (String) ((C36570n) this.f195298d.f195291f).getValue();
            if (!(str == null || C112551y.m153811k(str))) {
                Intent putExtra = new Intent().setClassName(this.f195299e, str).addFlags(67108864).addFlags(536870912).addFlags(268435456).putExtra("KEY_START_FROM_LANDING_UIC", true);
                C87412m.m108593f(putExtra, "Intent()\n            .se…T_FROM_LANDING_UIC, true)");
                AppCompatActivity appCompatActivity = this.f195299e;
                C9556a aVar = new C9556a();
                aVar.mo10233c(putExtra);
                AppCompatActivity appCompatActivity2 = appCompatActivity;
                C117292a.m165358d(appCompatActivity2, aVar.mo10232b(), "com/tencent/mm/feature/revoke/RevokeChattingLandingPageUIC$goToChattingHomePage$2", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                appCompatActivity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(appCompatActivity2, "com/tencent/mm/feature/revoke/RevokeChattingLandingPageUIC$goToChattingHomePage$2", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                this.f195299e.overridePendingTransition(0, 0);
                try {
                    long j = 0;
                    C72963f4 b002 = this.f195298d.mo93514i3() != 0 ? ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f195298d.mo93514i3()) : null;
                    if (b002 != null) {
                        C68070l.C68072b u = C68070l.C68072b.m80422u(b002.getContent(), b002.mo108775z2());
                        if (u != null) {
                            j = (long) u.f195582i;
                        }
                        int c = C72695v.m85061c(b002.getType());
                        ErrorMsgInfoStruct errorMsgInfoStruct = new ErrorMsgInfoStruct();
                        errorMsgInfoStruct.f194200e = 30;
                        errorMsgInfoStruct.f194199d = j;
                        errorMsgInfoStruct.f194202g = (long) c;
                        errorMsgInfoStruct.mo86054n();
                    }
                } catch (Throwable th) {
                    Log.printErrStackTrace("MRevokeChat.LandingPageUIC", th, "report err", new Object[0]);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC$c */
    public static final class C68045c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ RevokeChattingLandingPageUIC f195300d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68045c(RevokeChattingLandingPageUIC revokeChattingLandingPageUIC) {
            super(0);
            this.f195300d = revokeChattingLandingPageUIC;
        }

        public Object invoke() {
            try {
                return this.f195300d.getIntent().getStringExtra("KEY_HOME_PAGE_CLS");
            } catch (Throwable th) {
                Log.printErrStackTrace("MRevokeChat.LandingPageUIC", th, "parse homePageCls err", new Object[0]);
                return null;
            }
        }
    }

    /* renamed from: com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC$d */
    public static final class C68046d extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ RevokeChattingLandingPageUIC f195301d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68046d(RevokeChattingLandingPageUIC revokeChattingLandingPageUIC) {
            super(0);
            this.f195301d = revokeChattingLandingPageUIC;
        }

        public Object invoke() {
            return Long.valueOf(this.f195301d.mo93513g3("KEY_CLICK_MSG_ID", RevokeChattingLandingPageUIC.f195287o));
        }
    }

    /* renamed from: com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC$e */
    public static final class C68047e extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ RevokeChattingLandingPageUIC f195302d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68047e(RevokeChattingLandingPageUIC revokeChattingLandingPageUIC) {
            super(0);
            this.f195302d = revokeChattingLandingPageUIC;
        }

        public Object invoke() {
            return Long.valueOf(this.f195302d.mo93513g3("KEY_CLICK_MSG_SRV_ID", RevokeChattingLandingPageUIC.f195288p));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RevokeChattingLandingPageUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f195292g = new RevokeChattingLandingPageUIC$revokeReceiveMessageListener$1(appCompatActivity, this);
        this.f195293h = new RevokeChattingLandingPageUIC$mRevokeNativeMessageListener$1(appCompatActivity, this);
        this.f195294i = C36568h.m40985a(new C68044b(this, appCompatActivity));
        this.f195296n = new C68043a(new WeakReference(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo93513g3(java.lang.String r6, java.util.List<java.lang.String> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "preValueKey"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "keyList"
            gy3.C87412m.m108594g(r7, r0)
            android.content.Intent r0 = r5.getIntent()
            r1 = 0
            long r3 = r0.getLongExtra(r6, r1)
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 == 0) goto L_0x0019
            return r3
        L_0x0019:
            java.util.Iterator r6 = r7.iterator()
        L_0x001d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x005e
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            android.content.Intent r0 = r5.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x0038
            java.lang.Object r7 = r0.get(r7)
            goto L_0x0039
        L_0x0038:
            r7 = 0
        L_0x0039:
            boolean r0 = r7 instanceof java.lang.Long
            if (r0 == 0) goto L_0x0044
            java.lang.Number r7 = (java.lang.Number) r7
            long r3 = r7.longValue()
            goto L_0x0059
        L_0x0044:
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L_0x0058
            r0 = r7
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = z04.C112551y.m153811k(r0)
            if (r0 != 0) goto L_0x0058
            java.lang.String r7 = (java.lang.String) r7
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r7)
            goto L_0x0059
        L_0x0058:
            r3 = r1
        L_0x0059:
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 == 0) goto L_0x001d
            return r3
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.feature.revoke.RevokeChattingLandingPageUIC.mo93513g3(java.lang.String, java.util.List):long");
    }

    /* renamed from: i3 */
    public final long mo93514i3() {
        return ((Number) ((C36570n) this.f195289d).getValue()).longValue();
    }

    /* renamed from: j3 */
    public final void mo93515j3() {
        boolean isForeground = AppUIForegroundOwner.INSTANCE.isForeground();
        Log.m105918d("MRevokeChat.LandingPageUIC", "tryGoToHomePage() called isAppFore:" + isForeground);
        if (!isForeground) {
            this.f195295j = true;
            return;
        }
        ((C36570n) this.f195294i).getValue();
        C13598b0 b0Var = C13598b0.f38549a;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f195292g.alive();
        this.f195293h.alive();
        AppUIForegroundOwner.INSTANCE.addLifecycleCallback((C80403e) this.f195296n);
        Log.m105924i("MRevokeChat.LandingPageUIC", "onCreate() openMsgId:" + mo93514i3() + " openMsgSrvId:" + ((Number) ((C36570n) this.f195290e).getValue()).longValue() + " act:" + getActivity().getClass().getSimpleName());
    }

    public void onDestroy() {
        super.onDestroy();
        AppUIForegroundOwner.INSTANCE.removeLifecycleCallback((C80403e) this.f195296n);
        Log.m105924i("MRevokeChat.LandingPageUIC", "onDestroy()");
    }
}
