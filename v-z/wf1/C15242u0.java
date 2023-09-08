package wf1;

import a14.C53916l;
import a14.C53934p0;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C0317e;
import bl3.C39818r;
import cl1.C0690t1;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import kotlin.Result;
import mk1.C10906h;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C51946xa1;
import te3.C64848y91;
import wf1.C15221m0;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: wf1.u0 */
public final class C15242u0 extends UIComponent {

    /* renamed from: d */
    public C10906h f41465d;

    /* renamed from: e */
    public C64848y91 f41466e;

    /* renamed from: f */
    public String f41467f = "";

    /* renamed from: g */
    public final C0690t1 f41468g = new C0690t1(new C45795b((String) null, 1, (C8480h) null));

    /* renamed from: h */
    public C53916l<? super Boolean> f41469h;

    /* renamed from: i */
    public int f41470i;

    /* renamed from: j */
    public long f41471j;

    /* renamed from: n */
    public final C13601g f41472n;

    /* renamed from: wf1.u0$a */
    public static final class C15243a extends C87413o implements C32224a<C15221m0> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f41473d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15243a(AppCompatActivity appCompatActivity) {
            super(0);
            this.f41473d = appCompatActivity;
        }

        public Object invoke() {
            C39622i0 a = C39818r.f106831a.mo62444c(this.f41473d).mo75002a(C15221m0.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…ingCustomUIC::class.java)");
            return (C15221m0) a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15242u0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f41472n = C36568h.m40985a(new C15243a(appCompatActivity));
    }

    /* renamed from: c3 */
    public final C15221m0 mo14155c3() {
        return (C15221m0) ((C36570n) this.f41472n).getValue();
    }

    public int getLayoutId() {
        return -1;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        StringBuilder sb = new StringBuilder();
        sb.append("onActivityResult,requestCode:");
        sb.append(i);
        sb.append(",resultCode:");
        sb.append(i2);
        sb.append(",face verify result:");
        sb.append(intent != null ? Integer.valueOf(intent.getIntExtra("FACE_VERIFY_RESULT", 0)) : null);
        Log.m105924i("Finder.FinderLivePostPendingUIC", sb.toString());
        if (i != 10002) {
            return;
        }
        if (i2 == 1) {
            C53916l<? super Boolean> lVar = this.f41469h;
            if (lVar != null) {
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
            }
            C15221m0.C15222a aVar = mo14155c3().f41436g;
            if (aVar != null) {
                aVar.mo14125e(true);
                return;
            }
            return;
        }
        C53916l<? super Boolean> lVar2 = this.f41469h;
        if (lVar2 != null) {
            Result.Companion companion2 = Result.Companion;
            lVar2.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
        }
        C15221m0.C15222a aVar2 = mo14155c3().f41436g;
        if (aVar2 != null) {
            aVar2.mo14125e(false);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f41470i = getIntent().getIntExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", 0);
        this.f41471j = getIntent().getLongExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", 0);
        String stringExtra = getIntent().getStringExtra("KEY_LUCKY_MONEY_CHAT_ROOM_USERNAME");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f41467f = stringExtra;
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("KEY_TAG_INFO");
        if (byteArrayExtra != null) {
            C64848y91 y912 = new C64848y91();
            try {
                y912.parseFrom(byteArrayExtra);
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
                y912 = null;
            }
            this.f41466e = y912;
        }
        ArrayList<String> arrayList = this.f41468g.f1631n;
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("KEY_WHITE_ROOM_LIST");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new ArrayList<>();
        }
        arrayList.addAll(stringArrayListExtra);
        ArrayList<String> arrayList2 = this.f41468g.f1632o;
        ArrayList<String> stringArrayListExtra2 = getIntent().getStringArrayListExtra("KEY_WHITE_MEMBER_LIST");
        if (stringArrayListExtra2 == null) {
            stringArrayListExtra2 = new ArrayList<>();
        }
        arrayList2.addAll(stringArrayListExtra2);
        C0690t1 t1Var = this.f41468g;
        C51946xa1 xa12 = new C51946xa1();
        xa12.f144557d.addAll(this.f41468g.f1631n);
        xa12.f144558e.addAll(this.f41468g.f1632o);
        xa12.f144559f.addAll(this.f41468g.f1631n);
        xa12.f144559f.addAll(this.f41468g.f1632o);
        t1Var.mo657k3(xa12);
        this.f41468g.f1629i = getIntent().getIntExtra("KEY_WHITE_LIST_MODE", 0);
        StringBuilder sb = new StringBuilder();
        sb.append("initStartLiveOptions roomId:");
        sb.append(this.f41467f);
        sb.append(", visibilityMode:");
        sb.append(this.f41468g.f1629i);
        sb.append("visibilityRoomChooseList:");
        sb.append(C110818d0.m150921S(this.f41468g.f1631n, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
        sb.append(", visibilityUserChooseList:");
        sb.append(C110818d0.m150921S(this.f41468g.f1632o, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
        sb.append(",tagInfo:");
        C64848y91 y913 = this.f41466e;
        sb.append(y913 != null ? Integer.valueOf(y913.f186453d) : null);
        sb.append('#');
        C64848y91 y914 = this.f41466e;
        sb.append(y914 != null ? y914.f186454e : null);
        Log.m105924i("Finder.FinderLivePostPendingUIC", sb.toString());
        C0317e.launchUI$default(this, (C66212f) null, (C53934p0) null, new C15245v0(this, (C15601d<? super C15245v0>) null), 3, (Object) null);
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
