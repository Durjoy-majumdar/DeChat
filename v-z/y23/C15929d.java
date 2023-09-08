package y23;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderPageExposeStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.BasePluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import org.json.JSONObject;
import qh2.C101198e;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C112551y;

/* renamed from: y23.d */
public class C15929d extends C112388h<FinderShowInWXProfileStruct> {

    /* renamed from: e */
    public final C13601g f42797e = C36568h.m40985a(C15930a.f42804d);

    /* renamed from: f */
    public String f42798f = "";

    /* renamed from: g */
    public String f42799g = "";

    /* renamed from: h */
    public String f42800h = "";

    /* renamed from: i */
    public int f42801i = -1;

    /* renamed from: j */
    public long f42802j;

    /* renamed from: n */
    public String f42803n;

    /* renamed from: y23.d$a */
    public static final class C15930a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C15930a f42804d = new C15930a();

        public C15930a() {
            super(0);
        }

        public Object invoke() {
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            if (Wb == null) {
                Wb = "";
            }
            Log.m105924i("MicroMsg.TimelineEditorReport21874", "sessionId:" + Wb);
            return Wb;
        }
    }

    public C15929d(BasePluginLayout basePluginLayout) {
        C87412m.m108594g(basePluginLayout, "pluginLayout");
        new JSONObject();
        this.f42803n = "";
    }

    /* renamed from: a */
    public void mo14581a(Intent intent) {
        C87412m.m108594g(intent, "intent");
        String stringExtra = intent.getStringExtra("key_finder_context_id");
        String str = "";
        if (stringExtra == null && (stringExtra = intent.getStringExtra("key_context_id")) == null) {
            stringExtra = str;
        }
        this.f42798f = stringExtra;
        String stringExtra2 = intent.getStringExtra("key_jump_id");
        if (stringExtra2 == null) {
            stringExtra2 = str;
        }
        this.f42799g = stringExtra2;
        String stringExtra3 = intent.getStringExtra("key_click_tab_context_id");
        if (stringExtra3 != null) {
            str = stringExtra3;
        }
        this.f42800h = str;
        this.f42801i = intent.getIntExtra("key_from_comment_scene", 0);
    }

    /* renamed from: b */
    public void mo14582b() {
        if (this.f42802j > 0) {
            FinderPageExposeStruct finderPageExposeStruct = new FinderPageExposeStruct();
            finderPageExposeStruct.mo1036z((String) ((C36570n) this.f42797e).getValue());
            finderPageExposeStruct.mo1032v(this.f42798f);
            finderPageExposeStruct.mo1029s(this.f42800h);
            finderPageExposeStruct.mo1033w(C75592q0.m90778h());
            finderPageExposeStruct.mo1030t("101");
            finderPageExposeStruct.mo1035y(String.valueOf(this.f42801i));
            finderPageExposeStruct.f9879g = 1;
            finderPageExposeStruct.mo1031u(String.valueOf(C31543z5.m39453c()));
            finderPageExposeStruct.f9885m = C31543z5.m39453c() - this.f42802j;
            finderPageExposeStruct.mo1028A(this.f42803n);
            finderPageExposeStruct.mo1034x(C112551y.m153816p(this.f42799g, ",", ";", false, 4, (Object) null));
            finderPageExposeStruct.mo86054n();
        }
    }

    /* renamed from: c */
    public void mo14583c() {
        FinderPageExposeStruct finderPageExposeStruct = new FinderPageExposeStruct();
        finderPageExposeStruct.mo1036z((String) ((C36570n) this.f42797e).getValue());
        finderPageExposeStruct.mo1032v(this.f42798f);
        finderPageExposeStruct.mo1029s(this.f42800h);
        finderPageExposeStruct.mo1033w(C75592q0.m90778h());
        finderPageExposeStruct.mo1030t("101");
        finderPageExposeStruct.mo1035y(String.valueOf(this.f42801i));
        finderPageExposeStruct.f9879g = 0;
        finderPageExposeStruct.mo1031u(String.valueOf(C31543z5.m39453c()));
        finderPageExposeStruct.f9885m = 0;
        finderPageExposeStruct.mo1028A(this.f42803n);
        finderPageExposeStruct.mo1034x(C112551y.m153816p(this.f42799g, ",", ";", false, 4, (Object) null));
        finderPageExposeStruct.mo86054n();
        this.f42802j = C31543z5.m39453c();
        new JSONObject();
    }

    /* renamed from: g */
    public String mo14584g() {
        return "21874";
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
    }
}
