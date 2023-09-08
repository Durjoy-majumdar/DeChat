package iq1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import o40.C61926c;
import pf1.C62273n;
import te3.C64650q60;

/* renamed from: iq1.a */
public final class C60577a extends UIComponent {

    /* renamed from: d */
    public final String f172656d = "Finder.ShareEcSourceUIC";

    /* renamed from: e */
    public C64650q60 f172657e;

    /* renamed from: iq1.a$a */
    public static final class C60578a extends C87413o implements C32224a<C64650q60> {

        /* renamed from: d */
        public final /* synthetic */ C60577a f172658d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60578a(C60577a aVar) {
            super(0);
            this.f172658d = aVar;
        }

        public Object invoke() {
            String str = this.f172658d.f172656d;
            StringBuilder sb = new StringBuilder();
            sb.append("invoke ecSourceReqStruct ");
            C64650q60 q602 = this.f172658d.f172657e;
            sb.append(q602 != null ? q602.hashCode() : 0);
            sb.append(' ');
            C64650q60 q603 = this.f172658d.f172657e;
            sb.append(C61926c.m72691p(q603 != null ? q603.f184972d : 0));
            sb.append(", ");
            C64650q60 q604 = this.f172658d.f172657e;
            sb.append(q604 != null ? q604.f184973e : null);
            Log.m105924i(str, sb.toString());
            return this.f172658d.f172657e;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60577a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo85535c3() {
        Log.m105924i(this.f172656d, "registerInterceptor");
        ((C62273n) C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C62273n.class)).f177023h = new C60578a(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        long j = 0;
        long longExtra = getIntent().getLongExtra("feed_object_id", 0);
        String stringExtra = getIntent().getStringExtra("key_ec_source");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (longExtra != 0) {
            if (!(stringExtra.length() == 0)) {
                C64650q60 q602 = new C64650q60();
                q602.f184972d = longExtra;
                q602.f184973e = stringExtra;
                this.f172657e = q602;
                mo85535c3();
                String str = this.f172656d;
                StringBuilder sb = new StringBuilder();
                sb.append("onCreate ecSourceReqStruct ");
                C64650q60 q603 = this.f172657e;
                if (q603 != null) {
                    j = q603.f184972d;
                }
                sb.append(C61926c.m72691p(j));
                sb.append(", ");
                C64650q60 q604 = this.f172657e;
                sb.append(q604 != null ? q604.f184973e : null);
                Log.m105924i(str, sb.toString());
            }
        }
    }

    public void onPause() {
        super.onPause();
        Log.m105924i(this.f172656d, "unregisterInterceptor");
        ((C62273n) C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C62273n.class)).f177023h = null;
    }

    public void onResume() {
        super.onResume();
        mo85535c3();
    }
}
