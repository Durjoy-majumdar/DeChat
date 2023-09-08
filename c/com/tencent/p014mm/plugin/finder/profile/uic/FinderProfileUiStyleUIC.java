package com.tencent.p014mm.plugin.finder.profile.uic;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bl3.C39818r;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import er1.C58784w3;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import ht1.C8808v4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jo1.C9484a;
import k20.C60958c;
import k20.C9556a;
import l60.C99342a;
import l60.C99344b;
import lo1.C10586a;
import mo1.C10943a;
import mo1.C11021n2;
import mo1.C11059w;
import mo1.C61526s1;
import no1.C11236a;
import no1.C11238c;
import no1.C11239d;
import no1.C11241f;
import no1.C11242g;
import no1.C11243h;
import o40.C61926c;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C11991t;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110826x0;
import up1.C37521f;

/* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC */
public final class FinderProfileUiStyleUIC extends C11059w {

    /* renamed from: e */
    public int f16361e;

    /* renamed from: f */
    public int f16362f = -1;

    /* renamed from: g */
    public final C9484a f16363g = new C9484a(getActivity(), getFragment());

    /* renamed from: h */
    public C58969q f16364h;

    /* renamed from: i */
    public View f16365i;

    /* renamed from: j */
    public View f16366j;

    /* renamed from: n */
    public View f16367n;

    /* renamed from: o */
    public View f16368o;

    /* renamed from: p */
    public ImageView f16369p;

    /* renamed from: q */
    public View f16370q;

    /* renamed from: r */
    public View f16371r;

    /* renamed from: s */
    public View f16372s;

    /* renamed from: t */
    public boolean f16373t;

    /* renamed from: u */
    public final FinderProfileUiStyleUIC$coverSetEvent$1 f16374u;

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC$a */
    public static final class C3527a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f16375d;

        /* renamed from: e */
        public final /* synthetic */ FinderProfileUiStyleUIC f16376e;

        /* renamed from: f */
        public final /* synthetic */ String f16377f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3527a(boolean z, FinderProfileUiStyleUIC finderProfileUiStyleUIC, String str) {
            super(0);
            this.f16375d = z;
            this.f16376e = finderProfileUiStyleUIC;
            this.f16377f = str;
        }

        public Object invoke() {
            String queryParameter;
            if (this.f16375d) {
                this.f16376e.f16361e = -1;
            }
            this.f16376e.f16364h = C58961d.f168673a.mo84155b(this.f16377f);
            FinderProfileUiStyleUIC finderProfileUiStyleUIC = this.f16376e;
            C58969q qVar = finderProfileUiStyleUIC.f16364h;
            C13604l lVar = null;
            FinderAuthInfo finderAuthInfo = qVar != null ? qVar.field_authInfo : null;
            boolean z = true;
            if (finderAuthInfo == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("refresh  profileContact=");
                if (finderProfileUiStyleUIC.f16364h == null) {
                    z = false;
                }
                sb.append(z);
                Log.m105928w("Finder.ProfileUiStyleUIC", sb.toString());
            } else {
                boolean d6 = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83785d6();
                C37521f.f99374d.getClass();
                boolean z2 = C37521f.f99335Y2.mo60266n().intValue() == 1;
                Log.m105924i("Finder.ProfileUiStyleUIC", "isGlobalSetCoverOpen :" + d6 + " isForceUpdateCover:" + z2 + " isHard=" + this.f16375d);
                FinderProfileUiStyleUIC finderProfileUiStyleUIC2 = this.f16376e;
                C58969q qVar2 = finderProfileUiStyleUIC2.f16364h;
                if (qVar2 != null) {
                    if (!(d6 && finderAuthInfo.authIconType == 2 && qVar2.field_coverEntranceFlag == 1) && !z2) {
                        finderProfileUiStyleUIC2.setNormalStyle();
                    } else {
                        Log.m105924i("Finder.ProfileUiStyleUIC", "refresh getCoverInfo");
                        String str = qVar2.field_coverUrl;
                        if (str == null) {
                            str = "";
                        }
                        if (!Util.isNullOrNil(str) && finderProfileUiStyleUIC2.f16373t) {
                            int length = str.length() - 1;
                            if (length >= 0) {
                                while (true) {
                                    int i = length - 1;
                                    if (str.charAt(length) == '&') {
                                        break;
                                    } else if (i < 0) {
                                        break;
                                    } else {
                                        length = i;
                                    }
                                }
                            }
                            length = -1;
                            if (length != -1) {
                                try {
                                    Uri parse = Uri.parse(str);
                                    int parseInt = (parse == null || (queryParameter = parse.getQueryParameter("bgColor")) == null) ? 0 : Integer.parseInt(queryParameter, 16);
                                    String obj = str.subSequence(0, length).toString();
                                    Log.m105924i("Finder.ProfileUiStyleUIC", "getCoverInfo bgColor:" + parseInt + "  coverPath :" + obj);
                                    lVar = new C13604l(obj, Integer.valueOf(parseInt));
                                } catch (NumberFormatException e) {
                                    Log.printErrStackTrace("Finder.ProfileUiStyleUIC", e, "", new Object[0]);
                                } catch (NullPointerException e2) {
                                    Log.printErrStackTrace("Finder.ProfileUiStyleUIC", e2, "", new Object[0]);
                                } catch (Exception e3) {
                                    Log.printErrStackTrace("Finder.ProfileUiStyleUIC", e3, "", new Object[0]);
                                }
                            }
                        }
                        if (lVar != null) {
                            Log.m105924i("Finder.ProfileUiStyleUIC", "refresh " + ((String) lVar.f38555d) + "  " + ((Number) lVar.f38556e).intValue());
                            FinderProfileUiStyleUIC.m3623c3(finderProfileUiStyleUIC2, (String) lVar.f38555d, ((Number) lVar.f38556e).intValue());
                        } else {
                            finderProfileUiStyleUIC2.setNormalStyle();
                            C13598b0 b0Var = C13598b0.f38549a;
                        }
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfileUiStyleUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C37521f.f99374d.getClass();
        boolean z = true;
        this.f16373t = (C37521f.f99136B7.mo60266n().intValue() != 1 || getFragmentMode()) ? false : z;
        this.f16374u = new FinderProfileUiStyleUIC$coverSetEvent$1(this, C40008f.f107254d);
    }

    /* renamed from: c3 */
    public static final void m3623c3(FinderProfileUiStyleUIC finderProfileUiStyleUIC, String str, int i) {
        FinderProfileUiStyleUIC finderProfileUiStyleUIC2 = finderProfileUiStyleUIC;
        String str2 = str;
        int i2 = i;
        if (finderProfileUiStyleUIC2.f16373t) {
            C39818r rVar = C39818r.f106831a;
            if (((FinderProfileHeaderUIC) rVar.mo62444c(finderProfileUiStyleUIC.getActivity()).mo75002a(FinderProfileHeaderUIC.class)).mo3807I3().f42863a.getVisibility() == 0) {
                Log.m105924i("Finder.ProfileUiStyleUIC", "setCoveredStyle return for LogOutVisible");
            } else if (((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
                Log.m105924i("Finder.ProfileUiStyleUIC", "setCoveredStyle return for isTeenMode");
                finderProfileUiStyleUIC.setNormalStyle();
            } else {
                Log.m105924i("Finder.ProfileUiStyleUIC", "setCoveredStyle curStyle:" + finderProfileUiStyleUIC2.f16361e + " coverPath:" + str2 + ", coverColor:" + i2);
                C58784w3 w3Var = C58784w3.f168295a;
                int N = w3Var.mo83888N(0.4f, i2);
                int N2 = w3Var.mo83888N(1.0f, i2);
                C9484a aVar = finderProfileUiStyleUIC2.f16363g;
                C11239d dVar = aVar.f29650z;
                if (dVar != null) {
                    dVar.f33137f = N;
                    C11242g gVar = aVar.f29586A;
                    if (gVar != null) {
                        gVar.f33144f = Integer.valueOf(N);
                        ((C10943a) rVar.mo62444c(finderProfileUiStyleUIC.getActivity()).mo75002a(C10943a.class)).mo11152k3(true, N2);
                        C61526s1 s1Var = (C61526s1) rVar.mo62444c(finderProfileUiStyleUIC.getActivity()).mo75002a(C61526s1.class);
                        s1Var.f174899n = true;
                        WxRecyclerAdapter<C10586a> wxRecyclerAdapter = s1Var.f174897i;
                        if (wxRecyclerAdapter != null) {
                            wxRecyclerAdapter.notifyDataSetChanged();
                        }
                        ((FinderProfileTabUIC) rVar.mo62444c(finderProfileUiStyleUIC.getActivity()).mo75002a(FinderProfileTabUIC.class)).mo78524k4(true);
                        finderProfileUiStyleUIC2.f16363g.mo10171a(200);
                        finderProfileUiStyleUIC2.f16361e = 200;
                        if (finderProfileUiStyleUIC2.f16373t) {
                            View view = finderProfileUiStyleUIC2.f16365i;
                            if (view != null) {
                                view.setBackground((Drawable) null);
                                View view2 = finderProfileUiStyleUIC2.f16367n;
                                if (view2 != null) {
                                    view2.setBackground((Drawable) null);
                                    View view3 = finderProfileUiStyleUIC2.f16366j;
                                    if (view3 != null) {
                                        C9556a aVar2 = new C9556a();
                                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                        aVar2.mo10233c(0);
                                        View view4 = view3;
                                        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUiStyleUIC", "setCoveredBg", "(Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUiStyleUIC", "setCoveredBg", "(Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        View view5 = finderProfileUiStyleUIC2.f16368o;
                                        if (view5 != null) {
                                            view5.setBackgroundColor(N2);
                                            ImageView imageView = finderProfileUiStyleUIC2.f16369p;
                                            if (imageView != null) {
                                                Class cls = C11990s0.class;
                                                Class<C60200t1> cls2 = C60200t1.class;
                                                if (finderProfileUiStyleUIC2.f16373t) {
                                                    C99344b<C100810g0, Bitmap> a = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85955a(new C11991t(str2 == null ? "" : str2));
                                                    a.mo138758f(((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.PROFILE_COVER));
                                                    a.f291320d = new C11021n2(str2, imageView);
                                                    ((C99342a) a).mo85954d(imageView);
                                                }
                                                View view6 = finderProfileUiStyleUIC2.f16370q;
                                                if (view6 != null) {
                                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                                    gradientDrawable.setShape(0);
                                                    gradientDrawable.setGradientType(0);
                                                    gradientDrawable.setColors(new int[]{w3Var.mo83888N(0.0f, N2), N2});
                                                    view6.setBackground(gradientDrawable);
                                                    View view7 = finderProfileUiStyleUIC2.f16372s;
                                                    if (view7 != null) {
                                                        view7.setBackground((Drawable) null);
                                                        View view8 = finderProfileUiStyleUIC2.f16371r;
                                                        if (view8 != null) {
                                                            C9556a aVar3 = new C9556a();
                                                            aVar3.mo10233c(8);
                                                            View view9 = view8;
                                                            C117292a.m165358d(view9, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUiStyleUIC", "setCoveredBg", "(Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                                            view8.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                                            C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUiStyleUIC", "setCoveredBg", "(Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                                            return;
                                                        }
                                                        C87412m.m108603p("friendFollowArrow");
                                                        throw null;
                                                    }
                                                    C87412m.m108603p("tabLayoutContainer");
                                                    throw null;
                                                }
                                                C87412m.m108603p("bgLevel3");
                                                throw null;
                                            }
                                            C87412m.m108603p("bgLevel2");
                                            throw null;
                                        }
                                        C87412m.m108603p("bgLevel1");
                                        throw null;
                                    }
                                    C87412m.m108603p("bgContainer");
                                    throw null;
                                }
                                C87412m.m108603p("descHeaderContainer");
                                throw null;
                            }
                            C87412m.m108603p("appBarLayout");
                            throw null;
                        }
                        return;
                    }
                    C87412m.m108603p("extractColorIconStyle");
                    throw null;
                }
                C87412m.m108603p("extractColorTextStyle");
                throw null;
            }
        }
    }

    /* renamed from: d3 */
    public final void mo3860d3(String str, boolean z) {
        C87412m.m108594g(str, "username");
        if (this.f16373t) {
            C61926c.m72668M(new C3527a(z, this, str));
        }
    }

    /* renamed from: i0 */
    public final boolean mo3861i0() {
        return this.f16373t && this.f16361e == 200;
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        boolean z = this.f16373t;
        if (z) {
            if (z) {
                View findViewById = findViewById(C0966R.C0970id.f6070wg);
                C87412m.m108593f(findViewById, "findViewById(R.id.appbarLayout)");
                this.f16365i = findViewById;
                View findViewById2 = findViewById(C0966R.C0970id.f358265e51);
                C87412m.m108593f(findViewById2, "findViewById(R.id.finder_profile_bg_container)");
                this.f16366j = findViewById2;
                View findViewById3 = findViewById(C0966R.C0970id.f358266e52);
                C87412m.m108593f(findViewById3, "findViewById(R.id.finder_profile_bg_level1)");
                this.f16368o = findViewById3;
                View findViewById4 = findViewById(C0966R.C0970id.f358267e53);
                C87412m.m108593f(findViewById4, "findViewById(R.id.finder_profile_bg_level2)");
                this.f16369p = (ImageView) findViewById4;
                View findViewById5 = findViewById(C0966R.C0970id.e54);
                C87412m.m108593f(findViewById5, "findViewById(R.id.finder_profile_bg_level3)");
                this.f16370q = findViewById5;
                View findViewById6 = findViewById(C0966R.C0970id.izr);
                C87412m.m108593f(findViewById6, "findViewById(R.id.finder…file_friend_follow_arrow)");
                this.f16371r = findViewById6;
                View findViewById7 = findViewById(C0966R.C0970id.euo);
                C87412m.m108593f(findViewById7, "findViewById(R.id.header_desc_layout)");
                this.f16367n = findViewById7;
                View findViewById8 = findViewById(C0966R.C0970id.kcj);
                C87412m.m108593f(findViewById8, "findViewById(R.id.tabLayoutContainer)");
                this.f16372s = findViewById8;
                View findViewById9 = findViewById(C0966R.C0970id.kci);
                C87412m.m108593f(findViewById9, "findViewById(R.id.tabLayout)");
                TabLayout tabLayout = (TabLayout) findViewById9;
            }
            this.f16374u.alive();
            C9484a aVar = this.f16363g;
            ArrayList<Integer> arrayList = aVar.f29629i0;
            arrayList.add(Integer.valueOf(C0966R.C0970id.mud));
            arrayList.add(Integer.valueOf(C0966R.C0970id.mub));
            arrayList.add(Integer.valueOf(C0966R.C0970id.mua));
            aVar.f29631j0.add(Integer.valueOf(C0966R.C0970id.i4d));
            aVar.f29623f0.add(Integer.valueOf(C0966R.C0970id.fo5));
            aVar.f29625g0.add(Integer.valueOf(C0966R.C0970id.f358271e63));
            ArrayList<Integer> arrayList2 = aVar.f29605T;
            arrayList2.add(Integer.valueOf(C0966R.C0970id.e4q));
            arrayList2.add(Integer.valueOf(C0966R.C0970id.cdf));
            arrayList2.add(Integer.valueOf(C0966R.C0970id.e4t));
            arrayList2.add(Integer.valueOf(C0966R.C0970id.e4v));
            arrayList2.add(Integer.valueOf(C0966R.C0970id.e59));
            arrayList2.add(Integer.valueOf(C0966R.C0970id.f358209dv2));
            arrayList2.add(Integer.valueOf(C0966R.C0970id.duf));
            arrayList2.add(Integer.valueOf(C0966R.C0970id.mrm));
            arrayList2.add(Integer.valueOf(C0966R.C0970id.i4c));
            arrayList2.add(Integer.valueOf(C0966R.C0970id.i4_));
            ArrayList<Integer> arrayList3 = aVar.f29604S;
            arrayList3.add(Integer.valueOf(C0966R.C0970id.e5h));
            arrayList3.add(Integer.valueOf(C0966R.C0970id.l2k));
            arrayList3.add(Integer.valueOf(C0966R.C0970id.n9y));
            ArrayList<Integer> arrayList4 = aVar.f29606U;
            Integer valueOf = Integer.valueOf(C0966R.C0970id.e64);
            arrayList4.add(valueOf);
            ArrayList<Integer> arrayList5 = aVar.f29603R;
            arrayList5.add(Integer.valueOf(C0966R.C0970id.e5z));
            arrayList5.add(Integer.valueOf(C0966R.C0970id.f5456fm));
            ArrayList<Integer> arrayList6 = aVar.f29607V;
            arrayList6.add(Integer.valueOf(C0966R.C0970id.e5x));
            arrayList6.add(Integer.valueOf(C0966R.C0970id.bg_));
            arrayList6.add(valueOf);
            arrayList6.add(Integer.valueOf(C0966R.C0970id.gq6));
            ArrayList<Integer> arrayList7 = aVar.f29609X;
            Integer valueOf2 = Integer.valueOf(C0966R.C0970id.gu5);
            arrayList7.add(valueOf2);
            ArrayList<Integer> arrayList8 = aVar.f29617c0;
            arrayList8.add(Integer.valueOf(C0966R.C0970id.e5l));
            arrayList8.add(Integer.valueOf(C0966R.C0970id.f5451fh));
            ArrayList<Integer> arrayList9 = aVar.f29608W;
            Integer valueOf3 = Integer.valueOf(C0966R.C0970id.f358268e60);
            arrayList9.add(valueOf3);
            Integer valueOf4 = Integer.valueOf(C0966R.C0970id.f358270e62);
            arrayList9.add(valueOf4);
            Integer valueOf5 = Integer.valueOf(C0966R.C0970id.gq5);
            arrayList9.add(valueOf5);
            arrayList9.add(valueOf4);
            aVar.f29610Y.add(Integer.valueOf(C0966R.C0970id.dup));
            ArrayList<Integer> arrayList10 = aVar.f29613a0;
            arrayList10.add(Integer.valueOf(C0966R.C0970id.e5_));
            arrayList10.add(Integer.valueOf(C0966R.C0970id.gyy));
            arrayList10.add(Integer.valueOf(C0966R.C0970id.hzi));
            arrayList10.add(Integer.valueOf(C0966R.C0970id.a2z));
            arrayList10.add(Integer.valueOf(C0966R.C0970id.mcy));
            arrayList10.add(Integer.valueOf(C0966R.C0970id.hlw));
            ArrayList<Integer> arrayList11 = aVar.f29621e0;
            arrayList11.add(Integer.valueOf(C0966R.C0970id.e4n));
            arrayList11.add(Integer.valueOf(C0966R.C0970id.e57));
            arrayList11.add(Integer.valueOf(C0966R.C0970id.dva));
            aVar.f29627h0.add(Integer.valueOf(C0966R.C0970id.e4p));
            ArrayList<C13604l<Integer, Integer>> arrayList12 = aVar.f29635l0;
            arrayList12.add(new C13604l(Integer.valueOf(C0966R.C0970id.e5f), Integer.valueOf(C0966R.raw.icons_outlined_followed)));
            arrayList12.add(new C13604l(valueOf2, Integer.valueOf(C0966R.raw.icons_outlined_mini_program2)));
            arrayList12.add(new C13604l(valueOf3, Integer.valueOf(C0966R.raw.icons_outlined_location)));
            arrayList12.add(new C13604l(valueOf5, Integer.valueOf(C0966R.raw.icons_outlined_official_accounts)));
            ArrayList<Integer> arrayList13 = aVar.f29598M;
            arrayList13.add(Integer.valueOf(C0966R.C0970id.mud));
            arrayList13.add(Integer.valueOf(C0966R.C0970id.muc));
            arrayList13.add(Integer.valueOf(C0966R.C0970id.mub));
            arrayList13.add(Integer.valueOf(C0966R.C0970id.mua));
            arrayList13.add(Integer.valueOf(C0966R.C0970id.i4d));
            ArrayList<Integer> arrayList14 = aVar.f29599N;
            arrayList14.add(Integer.valueOf(C0966R.C0970id.fo5));
            arrayList14.add(Integer.valueOf(C0966R.C0970id.f358271e63));
            aVar.f29593H.add(Integer.valueOf(C0966R.C0970id.f5456fm));
            ArrayList<Integer> arrayList15 = aVar.f29607V;
            arrayList15.add(Integer.valueOf(C0966R.C0970id.e5x));
            arrayList15.add(Integer.valueOf(C0966R.C0970id.bg_));
            arrayList15.add(Integer.valueOf(C0966R.C0970id.e64));
            arrayList15.add(Integer.valueOf(C0966R.C0970id.gq6));
            ArrayList<Integer> arrayList16 = aVar.f29594I;
            arrayList16.add(Integer.valueOf(C0966R.C0970id.e4t));
            arrayList16.add(Integer.valueOf(C0966R.C0970id.e4v));
            arrayList16.add(Integer.valueOf(C0966R.C0970id.e59));
            arrayList16.add(Integer.valueOf(C0966R.C0970id.cdf));
            arrayList16.add(Integer.valueOf(C0966R.C0970id.e4q));
            arrayList16.add(Integer.valueOf(C0966R.C0970id.f358209dv2));
            arrayList16.add(Integer.valueOf(C0966R.C0970id.mul));
            arrayList16.add(Integer.valueOf(C0966R.C0970id.mrm));
            arrayList16.add(Integer.valueOf(C0966R.C0970id.duf));
            arrayList16.add(Integer.valueOf(C0966R.C0970id.i4c));
            arrayList16.add(Integer.valueOf(C0966R.C0970id.i4_));
            ArrayList<Integer> arrayList17 = aVar.f29595J;
            arrayList17.add(Integer.valueOf(C0966R.C0970id.l2k));
            arrayList17.add(Integer.valueOf(C0966R.C0970id.e5h));
            arrayList17.add(Integer.valueOf(C0966R.C0970id.n9y));
            ArrayList<Integer> arrayList18 = aVar.f29587B;
            Integer valueOf6 = Integer.valueOf(C0966R.C0970id.e56);
            arrayList18.add(valueOf6);
            Integer valueOf7 = Integer.valueOf(C0966R.C0970id.e5f);
            arrayList18.add(valueOf7);
            Integer valueOf8 = Integer.valueOf(C0966R.C0970id.f358268e60);
            arrayList18.add(valueOf8);
            Integer valueOf9 = Integer.valueOf(C0966R.C0970id.gq5);
            arrayList18.add(valueOf9);
            Integer valueOf10 = Integer.valueOf(C0966R.C0970id.f358270e62);
            arrayList18.add(valueOf10);
            Integer valueOf11 = Integer.valueOf(C0966R.C0970id.gu5);
            arrayList18.add(valueOf11);
            arrayList18.add(valueOf6);
            arrayList18.add(Integer.valueOf(C0966R.C0970id.dup));
            arrayList18.add(Integer.valueOf(C0966R.C0970id.dva));
            arrayList18.add(Integer.valueOf(C0966R.C0970id.e4p));
            arrayList18.add(valueOf10);
            aVar.f29588C.add(Integer.valueOf(C0966R.C0970id.e57));
            ArrayList<Integer> arrayList19 = aVar.f29589D;
            arrayList19.add(Integer.valueOf(C0966R.C0970id.e4n));
            arrayList19.add(Integer.valueOf(C0966R.C0970id.lzy));
            ArrayList<Integer> arrayList20 = aVar.f29590E;
            arrayList20.add(Integer.valueOf(C0966R.C0970id.a2z));
            arrayList20.add(Integer.valueOf(C0966R.C0970id.hzi));
            arrayList20.add(Integer.valueOf(C0966R.C0970id.gyy));
            arrayList20.add(Integer.valueOf(C0966R.C0970id.e5_));
            arrayList20.add(Integer.valueOf(C0966R.C0970id.mcy));
            arrayList20.add(Integer.valueOf(C0966R.C0970id.hlw));
            arrayList20.add(Integer.valueOf(C0966R.C0970id.e5l));
            arrayList20.add(Integer.valueOf(C0966R.C0970id.f5451fh));
            aVar.f29592G.add(Integer.valueOf(C0966R.C0970id.e5z));
            ArrayList<C13604l<Integer, Integer>> arrayList21 = aVar.f29637m0;
            arrayList21.add(new C13604l(valueOf7, Integer.valueOf(C0966R.raw.icons_filled_follow)));
            arrayList21.add(new C13604l(valueOf11, Integer.valueOf(C0966R.raw.icons_filled_mini_program2)));
            arrayList21.add(new C13604l(valueOf8, Integer.valueOf(C0966R.raw.icons_filled_location)));
            arrayList21.add(new C13604l(valueOf9, Integer.valueOf(C0966R.raw.icons_filled_official_accounts)));
            C11236a<Integer, View> aVar2 = aVar.f29649y;
            AppCompatActivity appCompatActivity = aVar.f29612a;
            aVar2.mo11312a(100, C110826x0.m151014b(new C11243h(aVar.f29612a, aVar.f29614b, aVar.f29635l0, (String) null, 8, (C8480h) null), new C11241f(aVar.f29612a, aVar.f29614b, aVar.f29647w, aVar.f29629i0), new C11241f(aVar.f29612a, aVar.f29614b, aVar.f29641q, aVar.f29631j0), new C11241f(aVar.f29612a, aVar.f29614b, aVar.f29640p, aVar.f29623f0), new C11241f(aVar.f29612a, aVar.f29614b, aVar.f29648x, aVar.f29625g0), new C11239d(aVar.f29612a, aVar.f29614b, aVar.f29618d, aVar.f29633k0), new C11239d(aVar.f29612a, aVar.f29614b, aVar.f29632k, aVar.f29602Q), new C11239d(aVar.f29612a, aVar.f29614b, aVar.f29638n, aVar.f29605T), new C11239d(aVar.f29612a, aVar.f29614b, aVar.f29640p, aVar.f29604S), new C11239d(aVar.f29612a, aVar.f29614b, aVar.f29636m, aVar.f29606U), new C11239d(aVar.f29612a, aVar.f29614b, aVar.f29634l, aVar.f29603R), new C11239d(aVar.f29612a, aVar.f29614b, aVar.f29642r, aVar.f29607V), new C11242g(aVar.f29612a, aVar.f29614b, Integer.valueOf(aVar.f29645u), aVar.f29609X, (String) null, 16, (C8480h) null), new C11242g(aVar.f29612a, aVar.f29614b, Integer.valueOf(aVar.f29642r), aVar.f29608W, (String) null, 16, (C8480h) null), new C11242g(aVar.f29612a, aVar.f29614b, Integer.valueOf(aVar.f29644t), aVar.f29610Y, (String) null, 16, (C8480h) null), new C11242g(aVar.f29612a, aVar.f29614b, Integer.valueOf(aVar.f29638n), aVar.f29613a0, (String) null, 16, (C8480h) null), new C11242g(aVar.f29612a, aVar.f29614b, Integer.valueOf(aVar.f29639o), aVar.f29615b0, (String) null, 16, (C8480h) null), new C11242g(aVar.f29612a, aVar.f29614b, Integer.valueOf(aVar.f29640p), aVar.f29619d0, (String) null, 16, (C8480h) null), new C11242g(aVar.f29612a, aVar.f29614b, Integer.valueOf(aVar.f29641q), aVar.f29621e0, (String) null, 16, (C8480h) null), new C11242g(appCompatActivity, aVar.f29614b, Integer.valueOf(aVar.f29646v), aVar.f29627h0, (String) null, 16, (C8480h) null), new C11242g(aVar.f29612a, aVar.f29614b, (Integer) null, aVar.f29611Z, (String) null, 16, (C8480h) null), new C11238c(aVar.f29612a, aVar.f29614b, false, "ProfileStyle", (List) null, 16, (C8480h) null)));
            aVar.f29650z = new C11239d(aVar.f29612a, aVar.f29614b, 0, aVar.f29600O);
            aVar.f29586A = new C11242g(aVar.f29612a, aVar.f29614b, (Integer) null, aVar.f29601P, "extractColorIcon", 4, (C8480h) null);
            String stringExtra = getActivity().getIntent().getStringExtra("finder_username");
            if (stringExtra == null) {
                stringExtra = "";
            }
            mo3860d3(stringExtra, false);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f16373t) {
            this.f16374u.dead();
        }
    }

    public final void setNormalStyle() {
        if (this.f16373t) {
            Log.m105924i("Finder.ProfileUiStyleUIC", "setCoveredStyle curStyle:" + this.f16361e + ' ');
            if (this.f16361e != 100) {
                this.f16362f = -1;
                C39818r rVar = C39818r.f106831a;
                ((C10943a) rVar.mo62444c(getActivity()).mo75002a(C10943a.class)).mo11152k3(false, this.f16362f);
                C61526s1 s1Var = (C61526s1) rVar.mo62444c(getActivity()).mo75002a(C61526s1.class);
                s1Var.f174899n = false;
                WxRecyclerAdapter<C10586a> wxRecyclerAdapter = s1Var.f174897i;
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyDataSetChanged();
                }
                ((FinderProfileTabUIC) rVar.mo62444c(getActivity()).mo75002a(FinderProfileTabUIC.class)).mo78524k4(false);
                this.f16361e = 100;
                this.f16363g.mo10171a(100);
                if (this.f16373t) {
                    View view = this.f16366j;
                    if (view != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUiStyleUIC", "setNormalBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUiStyleUIC", "setNormalBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view3 = this.f16368o;
                        if (view3 != null) {
                            view3.setBackgroundResource(C0966R.color.f2932f);
                            ImageView imageView = this.f16369p;
                            if (imageView != null) {
                                imageView.setImageDrawable((Drawable) null);
                                ImageView imageView2 = this.f16369p;
                                if (imageView2 != null) {
                                    imageView2.setVisibility(4);
                                    View view4 = this.f16371r;
                                    if (view4 != null) {
                                        C9556a aVar2 = new C9556a();
                                        aVar2.mo10233c(8);
                                        View view5 = view4;
                                        C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUiStyleUIC", "setNormalBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                        C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUiStyleUIC", "setNormalBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        View view6 = this.f16370q;
                                        if (view6 != null) {
                                            view6.setBackground((Drawable) null);
                                            View view7 = this.f16365i;
                                            if (view7 != null) {
                                                view7.setBackgroundColor(getActivity().getResources().getColor(C0966R.color.f2932f));
                                            } else {
                                                C87412m.m108603p("appBarLayout");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("bgLevel3");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("friendFollowArrow");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("bgLevel2");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("bgLevel2");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("bgLevel1");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("bgContainer");
                        throw null;
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfileUiStyleUIC(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        C37521f.f99374d.getClass();
        boolean z = true;
        this.f16373t = (C37521f.f99136B7.mo60266n().intValue() != 1 || getFragmentMode()) ? false : z;
        this.f16374u = new FinderProfileUiStyleUIC$coverSetEvent$1(this, C40008f.f107254d);
    }
}
