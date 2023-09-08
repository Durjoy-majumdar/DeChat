package dr1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import bl3.C39818r;
import bt1.C0378f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.view.C4216y1;
import com.tencent.p014mm.plugin.finder.view.FinderExtendReadingView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fe1.C58960c;
import fe1.C58961d;
import fe1.C58965i;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32229r;
import fy3.C32232u;
import gs1.C8437d;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.LinkedHashMap;
import java.util.Map;
import je1.C9324j2;
import je1.C9329k2;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kq1.C10389f;
import o40.C61926c;
import qo3.C77407n;
import rx3.C13598b0;
import te3.C64284cg;
import te3.C64472jk0;
import te3.t54;
import up1.C37521f;
import z04.C112550d0;
import zc1.C66785b;
import zt3.C119157j;

/* renamed from: dr1.o */
public final class C7493o implements C58965i {

    /* renamed from: a */
    public final MMActivity f25729a;

    /* renamed from: b */
    public final FinderExtendReadingView f25730b;

    /* renamed from: c */
    public final C32226l<Boolean, C13598b0> f25731c;

    /* renamed from: d */
    public final String f25732d = "Finder.FinderExtendReadingWidget";

    /* renamed from: e */
    public C8437d f25733e;

    /* renamed from: f */
    public Bundle f25734f;

    /* renamed from: g */
    public Intent f25735g;

    /* renamed from: h */
    public int f25736h;

    /* renamed from: dr1.o$a */
    public static final class C7494a extends C87413o implements C32227p<String, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C7493o f25737d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7494a(C7493o oVar) {
            super(2);
            this.f25737d = oVar;
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C87412m.m108594g(str, "link");
            this.f25737d.mo8631i(str, booleanValue);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dr1.o$b */
    public static final class C7495b extends C87413o implements C32229r<String, String, Integer, FinderJumpInfo, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C7493o f25738d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7495b(C7493o oVar) {
            super(4);
            this.f25738d = oVar;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            String str = (String) obj;
            String str2 = (String) obj2;
            int intValue = ((Number) obj3).intValue();
            C87412m.m108594g(str, "link");
            C87412m.m108594g(str2, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            String str3 = str;
            String str4 = str2;
            int i = intValue;
            C7493o.m7633j(this.f25738d, str3, str4, i, false, 8, (Object) null);
            C7493o.m7634p(this.f25738d, str3, str4, i, 0, (FinderJumpInfo) obj4, 8, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dr1.o$c */
    public static final class C7496c extends C87413o implements C32232u<Integer, String, String, String, Integer, Integer, FinderJumpInfo, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C7493o f25739d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7496c(C7493o oVar) {
            super(7);
            this.f25739d = oVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            String str = (String) obj3;
            String str2 = (String) obj4;
            C87412m.m108594g(str, "rLink");
            C87412m.m108594g(str2, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C7493o oVar = this.f25739d;
            C61926c.m72668M(new C7501p(((Number) obj).intValue(), oVar, str, str2, ((Number) obj5).intValue(), ((Number) obj6).intValue(), (FinderJumpInfo) obj7, (String) obj2));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dr1.o$d */
    public static final class C7497d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C7493o f25740d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7497d(C7493o oVar) {
            super(0);
            this.f25740d = oVar;
        }

        public Object invoke() {
            C8437d dVar = this.f25740d.f25733e;
            dVar.f27435f.invoke(Boolean.TRUE);
            dVar.f27441o = true;
            dVar.f27438i.setVisibility(0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dr1.o$e */
    public static final class C7498e extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C7493o f25741d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7498e(C7493o oVar) {
            super(1);
            this.f25741d = oVar;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "link");
            C7493o oVar = this.f25741d;
            MMActivity mMActivity = oVar.f25729a;
            C7503r rVar = new C7503r(str, oVar);
            C7504s sVar = new C7504s(oVar);
            C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C0378f.C0379a aVar = new C0378f.C0379a(mMActivity);
            C0378f.C0380b bVar = new C0378f.C0380b(rVar, sVar, (C32224a<C13598b0>) null);
            C77407n nVar = new C77407n((Context) mMActivity, 1, true);
            nVar.f225771i = aVar;
            nVar.f225782p = bVar;
            nVar.f225795v = null;
            nVar.mo107573q();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dr1.o$f */
    public static final class C7499f extends C87413o implements C32229r<String, String, Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C7493o f25742d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7499f(C7493o oVar) {
            super(4);
            this.f25742d = oVar;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            String str = (String) obj;
            String str2 = (String) obj2;
            int intValue = ((Number) obj3).intValue();
            int intValue2 = ((Number) obj4).intValue();
            C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108594g(str2, "link");
            C7493o.m7634p(this.f25742d, str2, str, intValue, intValue2, (FinderJumpInfo) null, 16, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dr1.o$g */
    public static final class C7500g extends C87413o implements C32226l<t54, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C7493o f25743d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7500g(C7493o oVar) {
            super(1);
            this.f25743d = oVar;
        }

        public Object invoke(Object obj) {
            t54 t54 = (t54) obj;
            C87412m.m108594g(t54, "cover");
            this.f25743d.mo8632n(t54, false);
            return C13598b0.f38549a;
        }
    }

    public C7493o(MMActivity mMActivity, C58969q qVar, FinderExtendReadingView finderExtendReadingView, C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(finderExtendReadingView, "extendReadingView");
        C87412m.m108594g(lVar, "changeEditViewCallback");
        this.f25729a = mMActivity;
        this.f25730b = finderExtendReadingView;
        this.f25731c = lVar;
        this.f25733e = new C8437d(mMActivity, qVar, lVar, new C7494a(this), new C7495b(this));
    }

    /* renamed from: j */
    public static void m7633j(C7493o oVar, String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        oVar.getClass();
        C87412m.m108594g(str, "link");
        C87412m.m108594g(str2, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (!z) {
            C64472jk0 jk02 = new C64472jk0();
            jk02.f183802d = str;
            jk02.f183803e = str2;
            jk02.f183805g = i;
            Bundle bundle = oVar.f25734f;
            if (bundle != null) {
                bundle.putByteArray("post_extend_reading", jk02.toByteArray());
            }
        }
        Intent intent = oVar.f25735g;
        if (intent != null) {
            intent.putExtra("saveExtendReadingLink", str);
        }
        Intent intent2 = oVar.f25735g;
        if (intent2 != null) {
            intent2.putExtra("saveExtendReadingTitle", str2);
        }
        Intent intent3 = oVar.f25735g;
        if (intent3 != null) {
            intent3.putExtra("saveExtendReadingStyle", i);
        }
    }

    /* renamed from: p */
    public static /* synthetic */ void m7634p(C7493o oVar, String str, String str2, int i, int i2, FinderJumpInfo finderJumpInfo, int i3, Object obj) {
        int i4 = (i3 & 8) != 0 ? 0 : i2;
        if ((i3 & 16) != 0) {
            finderJumpInfo = null;
        }
        oVar.mo8633o(str, str2, i, i4, finderJumpInfo);
    }

    /* renamed from: b */
    public void mo8612b(Intent intent, Bundle bundle) {
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(bundle, "postData");
        this.f25735g = intent;
        this.f25734f = bundle;
        this.f25736h = intent.getIntExtra("saveExtendReadingStyle", 0);
        C37521f.f99374d.getClass();
        String str = "";
        if (C37521f.f99517t1.mo60266n().intValue() == 0 && this.f25736h == 0) {
            intent.putExtra("saveExtendReadingLink", str);
            intent.putExtra("saveExtendReadingTitle", str);
        }
        String stringExtra = intent.getStringExtra("saveExtendReadingLink");
        String stringExtra2 = intent.getStringExtra("saveExtendReadingTitle");
        if (stringExtra == null || stringExtra2 == null) {
            String stringExtra3 = intent.getStringExtra("KEY_POST_EXTEND_URL");
            if (stringExtra3 != null) {
                str = stringExtra3;
            }
            String str2 = this.f25732d;
            Log.m105924i(str2, "setUrl " + str);
            if (str.length() == 0) {
                this.f25733e.f27440n = true;
            } else {
                this.f25733e.f27440n = false;
                this.f25730b.postDelayed(new C7502q(this, str), 500);
            }
        } else {
            m7634p(this, stringExtra, stringExtra2, this.f25736h, 0, (FinderJumpInfo) null, 24, (Object) null);
        }
        FinderExtendReadingView finderExtendReadingView = this.f25730b;
        C7497d dVar = new C7497d(this);
        C7498e eVar = new C7498e(this);
        C7499f fVar = new C7499f(this);
        C7500g gVar = new C7500g(this);
        finderExtendReadingView.getClass();
        finderExtendReadingView.f17706d = dVar;
        finderExtendReadingView.f17707e = eVar;
        finderExtendReadingView.f17708f = fVar;
        finderExtendReadingView.f17709g = gVar;
    }

    /* renamed from: i */
    public final void mo8631i(String str, boolean z) {
        C87412m.m108594g(str, "link");
        if (!z) {
            this.f25730b.setVerifyingState(str);
            Map<String, String> map = C9329k2.f29148a;
            C7496c cVar = new C7496c(this);
            String obj = C112550d0.m153799i0(str).toString();
            Map<String, String> map2 = C9329k2.f29148a;
            if (map2.containsKey(obj)) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) map2;
                if (!Util.isNullOrNil((String) linkedHashMap.get(obj))) {
                    Object obj2 = linkedHashMap.get(obj);
                    C87412m.m108591d(obj2);
                    cVar.invoke(null, "", obj, obj2, 0, 2, null);
                    StringBuilder sb = new StringBuilder();
                    sb.append("verify in cache ");
                    sb.append(obj);
                    sb.append(", ");
                    Object obj3 = linkedHashMap.get(obj);
                    C87412m.m108591d(obj3);
                    sb.append((String) obj3);
                    Log.m105924i("Finder.FinderExtendReadingVerifier", sb.toString());
                    return;
                }
            }
            ((C119157j) C119157j.f356862d).mo183875f(new C9324j2(obj, cVar));
        }
    }

    /* renamed from: n */
    public final void mo8632n(t54 t54, boolean z) {
        T t;
        C87412m.m108594g(t54, "cover");
        if (z) {
            this.f25733e.mo9366a();
        }
        FinderJumpInfo finderJumpInfo = t54.f141977g;
        String str = finderJumpInfo != null ? finderJumpInfo.wording : null;
        if (str == null || str.length() == 0) {
            String O5 = C66785b.f191882e.mo90662O5();
            C8479f0 f0Var = new C8479f0();
            f0Var.f27484d = "";
            C58969q b = C58961d.f168673a.mo84155b(O5);
            if (b != null) {
                C64284cg b2 = C58960c.m68830b(b, true);
                if (b2 == null || (t = b2.f182469e) == null) {
                    t = b.getNickname();
                }
                f0Var.f27484d = t;
            }
            str = this.f25729a.getResources().getString(C0966R.string.nc_, new Object[]{f0Var.f27484d});
        }
        String str2 = t54.f141975e;
        if (str2 == null) {
            str2 = "";
        }
        FinderJumpInfo finderJumpInfo2 = t54.f141977g;
        String str3 = str2;
        String str4 = str;
        m7633j(this, str3, str4, 1, false, 8, (Object) null);
        m7634p(this, str3, str4, 1, 0, finderJumpInfo2, 8, (Object) null);
    }

    /* renamed from: o */
    public final void mo8633o(String str, String str2, int i, int i2, FinderJumpInfo finderJumpInfo) {
        String str3 = str;
        String str4 = str2;
        int i3 = i;
        C87412m.m108594g(str3, "link");
        C87412m.m108594g(str4, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (!Util.isNullOrNil(str) && !Util.isNullOrNil(str2)) {
            this.f25736h = i3;
            if (i3 != 2) {
                m7633j(this, str, str2, i, false, 8, (Object) null);
                FinderExtendReadingView finderExtendReadingView = this.f25730b;
                finderExtendReadingView.getClass();
                finderExtendReadingView.f17724y = false;
                finderExtendReadingView.f17725z = true;
                View view = finderExtendReadingView.f17715p;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = finderExtendReadingView.f17716q;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view5 = finderExtendReadingView.f17717r;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view7 = finderExtendReadingView.f17718s;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(0);
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view9 = finderExtendReadingView.f17719t;
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(8);
                View view10 = view9;
                C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "setSuccState", "(Ljava/lang/String;Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view11 = finderExtendReadingView.f17723x;
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(8);
                View view12 = view11;
                C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "hideRedPacketCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view12, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView", "hideRedPacketCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                finderExtendReadingView.setTitle(str4);
                finderExtendReadingView.setLink(str3);
                finderExtendReadingView.setStyle(Integer.valueOf(i));
                finderExtendReadingView.f17721v.setText(str4);
                if (i3 == 0) {
                    finderExtendReadingView.f17722w.setImageResource(C0966R.raw.icons_outlined_link);
                    finderExtendReadingView.f17722w.setIconColor(C76577a.m92153d(finderExtendReadingView.getContext(), C0966R.color.f2939n));
                } else if (i3 == 1) {
                    finderExtendReadingView.f17722w.setImageResource(C0966R.raw.icons_filled_finder_red_envelope);
                    finderExtendReadingView.f17722w.setIconColor(C76577a.m92153d(finderExtendReadingView.getContext(), C0966R.color.ams));
                }
                finderExtendReadingView.f17718s.setOnClickListener(new C4216y1(finderExtendReadingView, str3));
                if (i3 == 1) {
                    ((C10389f) C39818r.f106831a.mo62444c(this.f25729a).mo75002a(C10389f.class)).f31602f = finderJumpInfo;
                }
            }
        }
    }
}
