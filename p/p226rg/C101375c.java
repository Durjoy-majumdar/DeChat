package p226rg;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.album.p836ui.preview.uic.AlbumPreviewUIC;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C24565l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p434ig.C98672d;
import p434ig.C98674g;
import p434ig.C98680m;
import p861pg.C62279a;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100755z;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import sx3.C64197v;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101849uc0;
import xb1.C102614d;

/* renamed from: rg.c */
public final class C101375c extends UIComponent {

    /* renamed from: d */
    public final C13601g f296956d;

    /* renamed from: rg.c$a */
    public /* synthetic */ class C63410a extends C24565l implements C32226l<C63426k, C13598b0> {
        public C63410a(Object obj) {
            super(1, obj, C101375c.class, "processState", "processState(Lcom/tencent/mm/album/ui/preview/uic/AlbumPreviewState;)V", 0);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C63426k) obj, "p0");
            ((C101375c) this.receiver).getClass();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rg.c$b */
    public /* synthetic */ class C63411b extends C24565l implements C32226l<C63426k, C13598b0> {
        public C63411b(Object obj) {
            super(1, obj, C101375c.class, "observeState", "observeState(Lcom/tencent/mm/album/ui/preview/uic/AlbumPreviewState;)V", 0);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C63426k) obj, "p0");
            ((C101375c) this.receiver).getClass();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rg.c$c */
    public static final class C63412c extends C87413o implements C32224a<UIStateCenter<C63426k>> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f179893d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63412c(AppCompatActivity appCompatActivity) {
            super(0);
            this.f179893d = appCompatActivity;
        }

        public Object invoke() {
            return new UIStateCenter(new C63426k(), this.f179893d, (String) null, (LifecycleScope) null, 12, (C8480h) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101375c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f296956d = C36568h.m40985a(new C63412c(appCompatActivity));
    }

    public void onCreate(Bundle bundle) {
        ((UIStateCenter) ((C36570n) this.f296956d).getValue()).process((C0125s) getActivity(), new C63410a(this));
        ((UIStateCenter) ((C36570n) this.f296956d).getValue()).observe((C0125s) getActivity(), new C63411b(this));
    }

    public void onCreateAfter(Bundle bundle) {
        String str;
        Class cls = AlbumPreviewUIC.class;
        Intent intent = getActivity().getIntent();
        if (intent.getIntExtra("album_enter_from_scene", -1) == 5) {
            C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(intent.getLongExtra("key_detail_info_id", -1));
            if (Yt != null) {
                C101801kd0 kd02 = Yt.field_favProto;
                C98674g gVar = new C98674g();
                if ((kd02 != null ? kd02.f298618f : null) != null && kd02.f298618f.size() > 0) {
                    String str2 = kd02.f298628s;
                    if (str2 == null) {
                        str2 = "";
                    }
                    gVar.f289363g = str2;
                    String str3 = kd02.f298626q;
                    if (str3 == null) {
                        str3 = "";
                    }
                    gVar.f289362f = str3;
                    LinkedList<C101834rc0> linkedList = kd02.f298618f;
                    if (linkedList != null) {
                        for (C101834rc0 rc02 : linkedList) {
                            C98672d dVar = new C98672d();
                            dVar.f289341f = rc02.f299258I;
                            String str4 = rc02.f299280T;
                            if (str4 == null) {
                                str4 = "";
                            }
                            dVar.f289343h = str4;
                            String str5 = rc02.f299308i1;
                            if (str5 == null) {
                                str5 = "";
                            }
                            dVar.f289344i = str5;
                            dVar.f289345j = rc02.f299322q1;
                            dVar.f289346k = rc02.f299274Q0;
                            String str6 = rc02.f299262K;
                            if (str6 == null) {
                                str6 = "";
                            }
                            dVar.f289347l = str6;
                            String str7 = rc02.f299297d;
                            if (str7 == null) {
                                str7 = "";
                            }
                            dVar.f289348m = str7;
                            String str8 = rc02.f299301f;
                            if (str8 == null) {
                                str8 = "";
                            }
                            dVar.f289349n = str8;
                            String str9 = rc02.f299305h;
                            if (str9 == null) {
                                str9 = "";
                            }
                            dVar.f289350o = str9;
                            dVar.f289351p = rc02.f299316o;
                            dVar.f289352q = rc02.f299321q;
                            String str10 = rc02.f299309j;
                            if (str10 == null) {
                                str10 = "";
                            }
                            dVar.f289353r = str10;
                            dVar.f289354s = rc02.f299333w;
                            dVar.f289355t = (long) rc02.f299338y;
                            long j = rc02.f299276R;
                            dVar.f289334Y = j;
                            String str11 = rc02.f299242A;
                            if (str11 == null) {
                                str11 = "";
                            }
                            dVar.f289356u = str11;
                            String str12 = rc02.f299246C;
                            if (str12 == null) {
                                str12 = "";
                            }
                            dVar.f289357v = str12;
                            String str13 = rc02.f299250E;
                            if (str13 == null) {
                                str13 = "";
                            }
                            dVar.f289358w = str13;
                            String str14 = rc02.f299271P;
                            if (str14 == null) {
                                str14 = "";
                            }
                            dVar.f289360y = str14;
                            String str15 = rc02.f299288X;
                            if (str15 == null) {
                                str15 = "";
                            }
                            dVar.f289361z = str15;
                            String str16 = rc02.f299292Z;
                            if (str16 == null) {
                                str16 = "";
                            }
                            dVar.f289310A = str16;
                            dVar.f289311B = rc02.f299336x0;
                            C101849uc0 uc02 = rc02.f299306h1;
                            if (uc02 == null || (str = uc02.f299617n) == null) {
                                str = "";
                            }
                            dVar.f289312C = str;
                            String str17 = rc02.f299294a1;
                            if (str17 == null) {
                                str17 = "";
                            }
                            dVar.f289313D = str17;
                            String str18 = rc02.f299298d1;
                            if (str18 == null) {
                                str18 = "";
                            }
                            dVar.f289314E = str18;
                            String str19 = rc02.f299245B1;
                            if (str19 == null) {
                                str19 = "";
                            }
                            dVar.f289315F = str19;
                            String str20 = rc02.f299247C1;
                            if (str20 == null) {
                                str20 = "";
                            }
                            dVar.f289316G = str20;
                            String str21 = rc02.f299302f1;
                            if (str21 == null) {
                                str21 = "";
                            }
                            dVar.f289317H = str21;
                            String str22 = rc02.f299311k1;
                            if (str22 == null) {
                                str22 = "";
                            }
                            dVar.f289319J = str22;
                            String str23 = rc02.f299251E1;
                            if (str23 == null) {
                                str23 = "";
                            }
                            dVar.f289320K = str23;
                            String str24 = rc02.f299255G1;
                            if (str24 == null) {
                                str24 = "";
                            }
                            dVar.f289321L = str24;
                            String str25 = rc02.f299259I1;
                            if (str25 == null) {
                                str25 = "";
                            }
                            dVar.f289322M = str25;
                            String str26 = rc02.f299325s;
                            if (str26 == null) {
                                str26 = "";
                            }
                            dVar.f289331V = str26;
                            String str27 = rc02.f299329u;
                            if (str27 == null) {
                                str27 = "";
                            }
                            dVar.f289332W = str27;
                            String str28 = rc02.f299266M;
                            if (str28 == null) {
                                str28 = "";
                            }
                            dVar.f289333X = str28;
                            dVar.f289334Y = j;
                            dVar.f289335Z = rc02.f299267M1;
                            dVar.f289337b0 = rc02.f299270O1;
                            dVar.f289338c0 = C100734q.m131880w(rc02);
                            dVar.f289340e0 = C100734q.m131826Q(rc02);
                            gVar.f289364h.add(dVar);
                        }
                    }
                }
                AppCompatActivity activity = getActivity();
                C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                C39622i0 a = C39818r.f106831a.mo62444c(activity).mo75002a(cls);
                C87412m.m108593f(a, "UICProvider.of(activity)…umPreviewUIC::class.java)");
                UIStateCenter<C63426k> k3 = ((AlbumPreviewUIC) a).mo76239k3();
                List<C98672d> list = gVar.f289364h;
                ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
                int i = 0;
                for (T next : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        C98672d dVar2 = (C98672d) next;
                        arrayList.add(new C62279a(dVar2.mo55264K(), i, dVar2, (C72963f4) null, 5, gVar.f289364h));
                        i = i2;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                k3.dispatch(new C63413d((C72963f4) null, arrayList));
                return;
            }
            String stringExtra = intent.getStringExtra("record_xml");
            String stringExtra2 = intent.getStringExtra("message_user_name");
            long longExtra = intent.getLongExtra("message_id", 0);
            if (stringExtra != null) {
                C72963f4 f4Var = new C72963f4();
                f4Var.setMsgId(longExtra);
                f4Var.mo108749c3(stringExtra2);
                C98680m mVar = new C98680m();
                mVar.mo141099d(stringExtra);
                AppCompatActivity activity2 = getActivity();
                C87412m.m108594g(activity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                C39622i0 a2 = C39818r.f106831a.mo62444c(activity2).mo75002a(cls);
                C87412m.m108593f(a2, "UICProvider.of(activity)…umPreviewUIC::class.java)");
                UIStateCenter<C63426k> k35 = ((AlbumPreviewUIC) a2).mo76239k3();
                List<C98672d> list2 = mVar.f289375f;
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list2, 10));
                int i3 = 0;
                for (T next2 : list2) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        C98672d dVar3 = (C98672d) next2;
                        arrayList2.add(new C62279a(dVar3.mo55264K(), i3, dVar3, f4Var, 5, mVar.f289375f));
                        i3 = i4;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                k35.dispatch(new C63413d(f4Var, arrayList2));
            }
        }
    }
}
