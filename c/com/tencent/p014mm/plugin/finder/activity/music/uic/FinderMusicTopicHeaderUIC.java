package com.tencent.p014mm.plugin.finder.activity.music.uic;

import a14.C53895h;
import a14.C53934p0;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.LeadingMarginSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import bl3.C39818r;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dp1.C7435f2;
import er1.C58784w3;
import fe1.C58960c;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import java.util.LinkedList;
import k60.C60979d;
import kg3.C76577a;
import l60.C99342a;
import l60.C99344b;
import od1.C11405h;
import od1.C11407i;
import org.json.JSONObject;
import p192l4.C10462b;
import p272xq.C102712e;
import p749xh.C102666r2;
import pe3.C47465a;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import rx3.C90109v;
import te3.C49018cl1;
import te3.C49712hj1;
import te3.C51270sn1;
import te3.C51959xd1;
import te3.C64726td1;
import ud1.C14158d;
import ud1.C14159e;
import ud1.C14162h;
import ud1.C14163i;
import ud1.C14164j;
import ud1.C14165k;
import ud1.C14170p;
import up1.C27696y;
import vd1.C14429a;
import vd1.C65584b;
import wx3.C15601d;
import wx3.C66212f;
import ye1.C15981v;

/* renamed from: com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC */
public final class FinderMusicTopicHeaderUIC extends C11407i<C51270sn1> {

    /* renamed from: g */
    public C104428a f12472g;

    /* renamed from: h */
    public boolean f12473h;

    /* renamed from: i */
    public int f12474i;

    /* renamed from: j */
    public C102666r2 f12475j;

    /* renamed from: n */
    public int f12476n = C0966R.color.FG_0;

    /* renamed from: o */
    public final C13601g f12477o = C36568h.m40985a(new C2303a(this));

    /* renamed from: p */
    public final FinderMusicTopicHeaderUIC$musicPlayEventListener$1 f12478p;

    /* renamed from: q */
    public final IListener<?> f12479q;

    /* renamed from: r */
    public final FinderMusicTopicHeaderUIC$finderTopicInfoListener$1 f12480r;

    /* renamed from: com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC$a */
    public static final class C2303a extends C87413o implements C32224a<C15981v> {

        /* renamed from: d */
        public final /* synthetic */ FinderMusicTopicHeaderUIC f12481d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2303a(FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC) {
            super(0);
            this.f12481d = finderMusicTopicHeaderUIC;
        }

        public Object invoke() {
            View findViewById = this.f12481d.findViewById(C0966R.C0970id.f357785br0);
            int i = C0966R.C0970id.aq_;
            WeImageView weImageView = (WeImageView) C10462b.m10395a(findViewById, C0966R.C0970id.aq_);
            if (weImageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
                i = C0966R.C0970id.e4o;
                FrameLayout frameLayout = (FrameLayout) C10462b.m10395a(findViewById, C0966R.C0970id.e4o);
                if (frameLayout != null) {
                    i = C0966R.C0970id.kcd;
                    ImageView imageView = (ImageView) C10462b.m10395a(findViewById, C0966R.C0970id.kcd);
                    if (imageView != null) {
                        i = C0966R.C0970id.kcf;
                        RelativeLayout relativeLayout = (RelativeLayout) C10462b.m10395a(findViewById, C0966R.C0970id.kcf);
                        if (relativeLayout != null) {
                            i = C0966R.C0970id.mu4;
                            LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.mu4);
                            if (linearLayout != null) {
                                i = C0966R.C0970id.mu6;
                                TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.mu6);
                                if (textView != null) {
                                    i = C0966R.C0970id.mu7;
                                    LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.mu7);
                                    if (linearLayout2 != null) {
                                        i = C0966R.C0970id.mu9;
                                        TextView textView2 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.mu9);
                                        if (textView2 != null) {
                                            i = C0966R.C0970id.f358814ng2;
                                            LinearLayout linearLayout3 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.f358814ng2);
                                            if (linearLayout3 != null) {
                                                i = C0966R.C0970id.f358815ng3;
                                                TextView textView3 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.f358815ng3);
                                                if (textView3 != null) {
                                                    i = C0966R.C0970id.kcg;
                                                    WeImageView weImageView2 = (WeImageView) C10462b.m10395a(findViewById, C0966R.C0970id.kcg);
                                                    if (weImageView2 != null) {
                                                        i = C0966R.C0970id.kch;
                                                        ImageView imageView2 = (ImageView) C10462b.m10395a(findViewById, C0966R.C0970id.kch);
                                                        if (imageView2 != null) {
                                                            i = C0966R.C0970id.kjz;
                                                            TextView textView4 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.kjz);
                                                            if (textView4 != null) {
                                                                i = C0966R.C0970id.kye;
                                                                RelativeLayout relativeLayout2 = (RelativeLayout) C10462b.m10395a(findViewById, C0966R.C0970id.kye);
                                                                if (relativeLayout2 != null) {
                                                                    i = C0966R.C0970id.kzl;
                                                                    LinearLayout linearLayout4 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.kzl);
                                                                    if (linearLayout4 != null) {
                                                                        i = C0966R.C0970id.kzm;
                                                                        ImageView imageView3 = (ImageView) C10462b.m10395a(findViewById, C0966R.C0970id.kzm);
                                                                        if (imageView3 != null) {
                                                                            i = C0966R.C0970id.l0o;
                                                                            RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) C10462b.m10395a(findViewById, C0966R.C0970id.l0o);
                                                                            if (roundedCornerFrameLayout != null) {
                                                                                i = C0966R.C0970id.l0p;
                                                                                TextView textView5 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.l0p);
                                                                                if (textView5 != null) {
                                                                                    i = C0966R.C0970id.l19;
                                                                                    ImageView imageView4 = (ImageView) C10462b.m10395a(findViewById, C0966R.C0970id.l19);
                                                                                    if (imageView4 != null) {
                                                                                        i = C0966R.C0970id.l1_;
                                                                                        LinearLayout linearLayout5 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.l1_);
                                                                                        if (linearLayout5 != null) {
                                                                                            i = C0966R.C0970id.l1a;
                                                                                            TextView textView6 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.l1a);
                                                                                            if (textView6 != null) {
                                                                                                i = C0966R.C0970id.l1b;
                                                                                                WeImageView weImageView3 = (WeImageView) C10462b.m10395a(findViewById, C0966R.C0970id.l1b);
                                                                                                if (weImageView3 != null) {
                                                                                                    i = C0966R.C0970id.l1c;
                                                                                                    TextView textView7 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.l1c);
                                                                                                    if (textView7 != null) {
                                                                                                        return new C15981v(constraintLayout, weImageView, constraintLayout, frameLayout, imageView, relativeLayout, linearLayout, textView, linearLayout2, textView2, linearLayout3, textView3, weImageView2, imageView2, textView4, relativeLayout2, linearLayout4, imageView3, roundedCornerFrameLayout, textView5, imageView4, linearLayout5, textView6, weImageView3, textView7);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderMusicTopicHeaderUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C40008f fVar = C40008f.f107254d;
        this.f12478p = new FinderMusicTopicHeaderUIC$musicPlayEventListener$1(this, fVar);
        this.f12479q = new FinderMusicTopicHeaderUIC$musicCheckErrorListener$1(this, fVar);
        this.f12480r = new FinderMusicTopicHeaderUIC$finderTopicInfoListener$1(this, fVar);
    }

    /* renamed from: F3 */
    public final void mo2208F3(int i) {
        C14429a aVar = C14429a.f40033a;
        Activity context = getContext();
        C51270sn1 sn12 = (C51270sn1) this.f33564d;
        C51959xd1 xd12 = sn12 != null ? sn12.f141636z : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fav_action", this.f12473h ? 1 : 2);
        C13598b0 b0Var = C13598b0.f38549a;
        C14429a.m13715a(aVar, context, "music_fav", i, 0, xd12, jSONObject, 8, (Object) null);
    }

    /* renamed from: G3 */
    public final void mo2209G3(int i) {
        String str;
        C51959xd1 xd12;
        C64726td1 td12;
        C7435f2 f2Var = C7435f2.f25626a;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(getContext());
        C49712hj1 q3 = f != null ? f.mo12861q3() : null;
        JSONObject jSONObject = new JSONObject();
        C51270sn1 sn12 = (C51270sn1) this.f33564d;
        if (sn12 == null || (xd12 = sn12.f141636z) == null || (td12 = xd12.f144603g) == null || (str = td12.f185546s) == null) {
            str = "";
        }
        jSONObject.put("songid", str);
        C13598b0 b0Var = C13598b0.f38549a;
        f2Var.mo8577a(q3, "song_start_publish", i, jSONObject);
    }

    /* renamed from: I3 */
    public final void mo2210I3() {
        Activity context = getContext();
        WeImageView weImageView = mo2214n3().f42997o;
        boolean z = this.f12473h;
        int i = this.f12476n;
        C87412m.m108594g(context, "context");
        if (z) {
            if (weImageView != null) {
                weImageView.setImageResource(C0966R.raw.finder_icons_filled_star);
            }
            if (weImageView != null) {
                weImageView.setIconColor(context.getResources().getColor(C0966R.color.a7u));
            }
        } else {
            if (weImageView != null) {
                weImageView.setImageResource(C0966R.raw.finder_icons_outlined_star2);
            }
            if (weImageView != null) {
                weImageView.setIconColor(context.getResources().getColor(i));
            }
        }
        if (this.f12473h) {
            mo2214n3().f42986d.setText(getActivity().getResources().getString(C0966R.string.dcm));
        } else {
            mo2214n3().f42986d.setText(getActivity().getResources().getString(C0966R.string.mcf));
        }
    }

    /* renamed from: c2 */
    public void mo513c2() {
        mo2214n3().f42994l.setTextColor(getResources().getColor(C0966R.color.BW_100));
        mo2214n3().f42983a.setIconColor(getResources().getColor(C0966R.color.BW_100));
        this.f12476n = C0966R.color.al9;
        mo2214n3().f42992j.setTextColor(getResources().getColor(C0966R.color.Link_170));
        mo2214n3().f42998p.setTextColor(getResources().getColor(C0966R.color.BW_50));
        mo2214n3().f42996n.setTextColor(getResources().getColor(C0966R.color.BW_50));
    }

    /* renamed from: i3 */
    public void mo515i3(C47465a aVar) {
        C51959xd1 xd12;
        C51959xd1 xd13;
        C64726td1 td12;
        String str;
        C51959xd1 xd14;
        C64726td1 td13;
        String str2;
        C51959xd1 xd15;
        C64726td1 td14;
        String str3;
        C51270sn1 sn12 = (C51270sn1) aVar;
        super.mo515i3(sn12);
        if (sn12 != null && (xd12 = sn12.f141636z) != null) {
            boolean z = false;
            this.f12473h = xd12.f144609p == 1;
            C51270sn1 sn13 = (C51270sn1) this.f33564d;
            String str4 = (sn13 == null || (xd15 = sn13.f141636z) == null || (td14 = xd15.f144603g) == null || (str3 = td14.f185537g) == null) ? "" : str3;
            String str5 = (sn13 == null || (xd14 = sn13.f141636z) == null || (td13 = xd14.f144603g) == null || (str2 = td13.f185538h) == null) ? "" : str2;
            String str6 = (sn13 == null || (xd13 = sn13.f141636z) == null || (td12 = xd13.f144603g) == null || (str = td12.f185534d) == null) ? "" : str;
            if (str4.length() == 0) {
                if (str5.length() == 0) {
                    return;
                }
            }
            if (str6.length() == 0) {
                z = true;
            }
            if (!z) {
                C53895h.m60466d(getLifecycleScope(), (C66212f) null, (C53934p0) null, new C14170p(str4, str5, str6, this, (C15601d<? super C14170p>) null), 3, (Object) null);
            }
        }
    }

    /* renamed from: j3 */
    public void mo315j3() {
        C51959xd1 xd12;
        T t;
        T t2;
        T t3;
        FinderContact finderContact;
        T t4;
        C11405h.C11406a.m11254b(this);
        C51270sn1 sn12 = (C51270sn1) this.f33564d;
        if (sn12 != null && (xd12 = sn12.f141636z) != null) {
            mo2214n3().f42984b.setVisibility(0);
            C64726td1 td12 = xd12.f144603g;
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            ImageView imageView = mo2214n3().f42993k;
            C39818r rVar = C39818r.f106831a;
            C60979d<C100810g0> f2 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2();
            T t5 = "";
            if (td12 == null || (t = td12.f185535e) == null) {
                t = t5;
            }
            C99344b<C100810g0, Bitmap> b = f2.mo85956b(new C11984n0(t, C27696y.THUMB_IMAGE), ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.DEFAULT));
            C14162h hVar = new C14162h(this);
            b.getClass();
            b.f291320d = hVar;
            b.f291324h = new C14163i(this);
            b.f291323g = new C14164j(this);
            C87412m.m108593f(imageView, "this");
            ((C99342a) b).mo85954d(imageView);
            float p = C76577a.m92165p(getContext());
            int dimensionPixelSize = (int) (((float) getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3743cv)) * p);
            ViewGroup.LayoutParams layoutParams = mo2214n3().f42983a.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = dimensionPixelSize;
            }
            if (layoutParams != null) {
                layoutParams.height = dimensionPixelSize;
            }
            mo2214n3().f42983a.setLayoutParams(layoutParams);
            Log.m105924i("FinderMusicTopicHeaderUIC", "scaleSize:" + p + " textSize:" + mo2214n3().f42994l.getTextSize());
            TextView textView = mo2214n3().f42994l;
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            LeadingMarginSpan.Standard standard = new LeadingMarginSpan.Standard(dimensionPixelSize, 0);
            if (td12 == null || (t2 = td12.f185536f) == null) {
                t2 = t5;
            }
            SpannableString spannableString = new SpannableString(t2);
            spannableString.setSpan(standard, 0, t2.length(), 18);
            textView.setText(spannableString);
            View findViewById = mo2214n3().f42984b.findViewById(C0966R.C0970id.l0o);
            int i = 3;
            if (findViewById != null) {
                int dimensionPixelSize2 = (C74783i3.m89537a(findViewById.getContext()).f24704a - findViewById.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3755d6)) / 3;
                ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                layoutParams2.width = dimensionPixelSize2;
                layoutParams2.height = dimensionPixelSize2;
                findViewById.setLayoutParams(layoutParams2);
                findViewById.setOnClickListener(new C14165k(td12, this, findViewById));
            }
            mo2215o3();
            LinkedList<C49018cl1> linkedList = xd12.f144602f;
            C87412m.m108593f(linkedList, "singers");
            if (!linkedList.isEmpty()) {
                C85875k4.m106189j0(mo2214n3().f42992j.getPaint(), 0.8f);
                View findViewById2 = mo2214n3().f42984b.findViewById(C0966R.C0970id.kye);
                ImageView imageView2 = (ImageView) mo2214n3().f42984b.findViewById(C0966R.C0970id.kcd);
                FinderContact finderContact2 = linkedList.get(0).f131807d;
                if (finderContact2 == null || (t3 = finderContact2.nickname) == null) {
                    t3 = t5;
                }
                if (linkedList.size() == 1) {
                    if (linkedList.get(0).f131808e == 1) {
                        FinderContact finderContact3 = linkedList.get(0).f131807d;
                        if (finderContact3 == null || (t4 = finderContact3.username) == null) {
                            t4 = t5;
                        }
                        i = t4.length() > 0 ? 1 : 2;
                    } else {
                        i = 0;
                    }
                }
                C8479f0 f0Var = new C8479f0();
                f0Var.f27484d = t3;
                if (linkedList.size() == 1) {
                    mo2214n3().f42992j.setText(t3);
                    if (!(imageView2 == null || (finderContact = linkedList.get(0).f131807d) == null)) {
                        C58784w3.m68429F1(C58784w3.f168295a, imageView2, finderContact.authInfo, 0, C58960c.m68829a(finderContact, false), 4, (Object) null);
                    }
                    if (findViewById2 != null) {
                        findViewById2.setOnClickListener(new C14158d(linkedList, this, i, f0Var));
                    }
                } else {
                    if (imageView2 != null) {
                        imageView2.setVisibility(8);
                    }
                    mo2214n3().f42991i.setVisibility(0);
                    Resources resources = getContext().getResources();
                    T string = resources != null ? resources.getString(C0966R.string.fzh, new Object[]{t3, Integer.valueOf(linkedList.size())}) : null;
                    if (string != null) {
                        t5 = string;
                    }
                    f0Var.f27484d = t5;
                    mo2214n3().f42992j.setText((CharSequence) f0Var.f27484d);
                    if (findViewById2 != null) {
                        findViewById2.setOnClickListener(new C14159e(this, linkedList, i, f0Var));
                    }
                }
                C14429a aVar = C14429a.f40033a;
                Activity context = getContext();
                C51270sn1 sn13 = (C51270sn1) this.f33564d;
                aVar.mo13714b(context, 0, sn13 != null ? sn13.f141636z : null, i, (String) f0Var.f27484d);
            }
            int i2 = xd12.f144604h;
            int i3 = xd12.f144605i;
            C65584b bVar = C65584b.f188718a;
            C65584b.m77268f(bVar, mo2214n3().f42984b, C0966R.C0970id.l1c, C0966R.string.hdv, i2, 0, 16, (Object) null);
            bVar.mo89661e(mo2214n3().f42984b, C0966R.C0970id.l1a, C0966R.string.fzg, i3, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* renamed from: k3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2211k3() {
        /*
            r5 = this;
            T r0 = r5.f33564d
            te3.sn1 r0 = (te3.C51270sn1) r0
            r1 = 0
            if (r0 == 0) goto L_0x005c
            te3.xd1 r0 = r0.f141636z
            if (r0 == 0) goto L_0x005c
            te3.td1 r0 = r0.f144603g
            if (r0 == 0) goto L_0x005c
            up1.f r2 = up1.C37521f.f99374d
            r2.getClass()
            pe1.c<java.lang.Integer> r2 = up1.C37521f.f99390e7
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = 1
            if (r2 == 0) goto L_0x0037
            java.lang.String r2 = r5.mo2212l3()
            if (r2 == 0) goto L_0x0032
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r2 = 0
            goto L_0x0033
        L_0x0032:
            r2 = 1
        L_0x0033:
            if (r2 != 0) goto L_0x0037
            r2 = 1
            goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            java.lang.String r4 = r0.f185539i
            if (r4 == 0) goto L_0x0045
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r4 = 0
            goto L_0x0046
        L_0x0045:
            r4 = 1
        L_0x0046:
            if (r4 != 0) goto L_0x004c
            int r0 = r0.f185547t
            if (r0 != r3) goto L_0x004f
        L_0x004c:
            if (r2 != 0) goto L_0x004f
            return r1
        L_0x004f:
            java.lang.Class<da0.e> r0 = da0.C58247e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            da0.e r0 = (da0.C58247e) r0
            boolean r0 = r0.mo82985Ze()
            return r0
        L_0x005c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC.mo2211k3():boolean");
    }

    /* renamed from: l3 */
    public final String mo2212l3() {
        C51959xd1 xd12;
        String str;
        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) mo2213m3().f38556e;
        if (baseFinderFeed == null) {
            return null;
        }
        C51270sn1 sn12 = (C51270sn1) this.f33564d;
        if (sn12 == null || (xd12 = sn12.f141636z) == null || (str = xd12.f144610q) == null) {
            Log.m105920e("FinderMusicTopicHeaderUIC", "checkFeedMusicKeu: prefix is null");
            return null;
        }
        String str2 = str + C90109v.m112738b(baseFinderFeed.mo3513o().getFeedObject().f164794id);
        Log.m105924i("FinderMusicTopicHeaderUIC", "checkFeedMusicKey: " + str2);
        return str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009e  */
    /* renamed from: m3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final rx3.C13604l<java.lang.Integer, com.tencent.p014mm.plugin.finder.model.BaseFinderFeed> mo2213m3() {
        /*
            r5 = this;
            android.app.Activity r0 = r5.getContext()
            android.content.Intent r0 = r0.getIntent()
            r1 = 0
            if (r0 == 0) goto L_0x0012
            java.lang.String r3 = "key_feed_id"
            long r1 = r0.getLongExtra(r3, r1)
        L_0x0012:
            vp1.e r0 = vp1.C65834e.f189316a
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo89871e(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0022
            wp1.f$a r2 = wp1.C15585f.f42211a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r2.mo14348k(r0)
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            r2 = 0
            if (r0 == 0) goto L_0x0043
            er1.w3 r1 = er1.C58784w3.f168295a
            boolean r1 = r1.mo83933h(r0)
            if (r1 == 0) goto L_0x0039
            rx3.l r1 = new rx3.l
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.<init>(r2, r0)
            goto L_0x0042
        L_0x0039:
            rx3.l r1 = new rx3.l
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.<init>(r2, r0)
        L_0x0042:
            return r1
        L_0x0043:
            bl3.r r0 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r3 = r5.getActivity()
            bl3.r$a r3 = r0.mo62444c(r3)
            java.lang.Class<ud1.t> r4 = ud1.C14175t.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r4)
            ud1.t r3 = (ud1.C14175t) r3
            com.tencent.mm.plugin.finder.activity.music.fragment.FinderMusicTopicFragment r3 = r3.f39620B
            if (r3 == 0) goto L_0x007e
            bl3.r$a r0 = r0.mo62445d(r3)
            java.lang.Class<ud1.s> r3 = ud1.C14174s.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r3)
            ud1.s r0 = (ud1.C14174s) r0
            com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader r0 = r0.f12526r
            if (r0 == 0) goto L_0x0078
            java.lang.Class<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r3 = com.tencent.p014mm.plugin.finder.model.BaseFinderFeed.class
            java.util.List r0 = r0.getListOfType(r3)
            if (r0 == 0) goto L_0x007e
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            goto L_0x007f
        L_0x0078:
            java.lang.String r0 = "feedLoader"
            gy3.C87412m.m108603p(r0)
            throw r1
        L_0x007e:
            r0 = r1
        L_0x007f:
            if (r0 == 0) goto L_0x009e
            er1.w3 r1 = er1.C58784w3.f168295a
            boolean r1 = r1.mo83933h(r0)
            if (r1 == 0) goto L_0x0094
            rx3.l r1 = new rx3.l
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.<init>(r2, r0)
            goto L_0x009d
        L_0x0094:
            rx3.l r1 = new rx3.l
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.<init>(r2, r0)
        L_0x009d:
            return r1
        L_0x009e:
            rx3.l r0 = new rx3.l
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC.mo2213m3():rx3.l");
    }

    /* renamed from: n3 */
    public final C15981v mo2214n3() {
        return (C15981v) ((C36570n) this.f12477o).getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01d7  */
    /* renamed from: o3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2215o3() {
        /*
            r10 = this;
            ye1.v r0 = r10.mo2214n3()
            android.widget.LinearLayout r0 = r0.f42987e
            java.lang.String r1 = "uiBinding.musicTopicHeaderPost"
            gy3.C87412m.m108593f(r0, r1)
            ud1.l r1 = new ud1.l
            r1.<init>(r10)
            zp3.C23564m.m28138h(r0, r1)
            boolean r0 = r10.mo2211k3()
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            r2 = 8
            r3 = 0
            if (r0 == 0) goto L_0x0060
            ye1.v r0 = r10.mo2214n3()
            android.widget.LinearLayout r0 = r0.f42987e
            r0.setVisibility(r3)
            ye1.v r0 = r10.mo2214n3()
            android.widget.LinearLayout r0 = r0.f42985c
            r0.setVisibility(r3)
            ye1.v r0 = r10.mo2214n3()
            android.widget.LinearLayout r0 = r0.f42987e
            ud1.m r4 = new ud1.m
            r4.<init>(r10)
            r0.setOnClickListener(r4)
            ye1.v r0 = r10.mo2214n3()
            android.widget.TextView r0 = r0.f42988f
            android.text.TextPaint r4 = r0.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r4, r1)
            androidx.appcompat.app.AppCompatActivity r4 = r10.getActivity()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131829458(0x7f1122d2, float:1.9291886E38)
            java.lang.String r4 = r4.getString(r5)
            r0.setText(r4)
            goto L_0x0069
        L_0x0060:
            ye1.v r0 = r10.mo2214n3()
            android.widget.LinearLayout r0 = r0.f42987e
            r0.setVisibility(r2)
        L_0x0069:
            ye1.v r0 = r10.mo2214n3()
            android.widget.LinearLayout r0 = r0.f42985c
            java.lang.String r4 = "uiBinding.musicTopicHeaderFav"
            gy3.C87412m.m108593f(r0, r4)
            ud1.f r4 = new ud1.f
            r4.<init>(r10)
            zp3.C23564m.m28138h(r0, r4)
            boolean r0 = r10.mo2211k3()
            r4 = 1
            if (r0 != 0) goto L_0x00a2
            rx3.l r0 = r10.mo2213m3()
            A r0 = r0.f38555d
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0094
            r0 = 1
            goto L_0x0095
        L_0x0094:
            r0 = 0
        L_0x0095:
            if (r0 == 0) goto L_0x0098
            goto L_0x00a2
        L_0x0098:
            ye1.v r0 = r10.mo2214n3()
            android.widget.LinearLayout r0 = r0.f42985c
            r0.setVisibility(r2)
            goto L_0x00ab
        L_0x00a2:
            ye1.v r0 = r10.mo2214n3()
            android.widget.LinearLayout r0 = r0.f42985c
            r0.setVisibility(r3)
        L_0x00ab:
            ye1.v r0 = r10.mo2214n3()
            android.widget.TextView r0 = r0.f42986d
            android.text.TextPaint r0 = r0.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r0, r1)
            ye1.v r0 = r10.mo2214n3()
            android.widget.LinearLayout r0 = r0.f42985c
            ud1.g r5 = new ud1.g
            r5.<init>(r10)
            r0.setOnClickListener(r5)
            rx3.l r0 = r10.mo2213m3()
            A r5 = r0.f38555d
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 == 0) goto L_0x01d7
            r2 = 2
            if (r5 == r4) goto L_0x00fa
            if (r5 == r2) goto L_0x00dc
            java.lang.String r5 = ""
            goto L_0x0117
        L_0x00dc:
            androidx.appcompat.app.AppCompatActivity r5 = r10.getActivity()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131829252(0x7f112204, float:1.9291468E38)
            java.lang.String r5 = r5.getString(r6)
            java.lang.String r6 = "activity.resources.getSt…opic_go_and_set_ringtone)"
            gy3.C87412m.m108593f(r5, r6)
            ye1.v r6 = r10.mo2214n3()
            android.widget.LinearLayout r6 = r6.f42989g
            r6.setVisibility(r3)
            goto L_0x0117
        L_0x00fa:
            androidx.appcompat.app.AppCompatActivity r5 = r10.getActivity()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131829255(0x7f112207, float:1.9291474E38)
            java.lang.String r5 = r5.getString(r6)
            java.lang.String r6 = "activity.resources.getSt…music_topic_set_ringtone)"
            gy3.C87412m.m108593f(r5, r6)
            ye1.v r6 = r10.mo2214n3()
            android.widget.LinearLayout r6 = r6.f42989g
            r6.setVisibility(r3)
        L_0x0117:
            ye1.v r6 = r10.mo2214n3()
            android.widget.TextView r6 = r6.f42990h
            android.text.TextPaint r7 = r6.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r7, r1)
            r6.setText(r5)
            ye1.v r1 = r10.mo2214n3()
            android.widget.LinearLayout r1 = r1.f42989g
            ud1.n r5 = new ud1.n
            r5.<init>(r10, r0)
            r1.setOnClickListener(r5)
            B r0 = r0.f38556e
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            java.lang.Class<l31.e> r1 = l31.C61212e.class
            di3.d r5 = di3.C86312j.m106911c(r1)
            l31.e r5 = (l31.C61212e) r5
            ye1.v r6 = r10.mo2214n3()
            android.widget.LinearLayout r6 = r6.f42989g
            java.lang.String r7 = "music_topic_page_set_ringtone"
            r5.o30(r6, r7)
            di3.d r5 = di3.C86312j.m106911c(r1)
            l31.e r5 = (l31.C61212e) r5
            ye1.v r6 = r10.mo2214n3()
            android.widget.LinearLayout r6 = r6.f42989g
            r7 = 40
            r8 = 25496(0x6398, float:3.5728E-41)
            r5.mo86175pO(r6, r7, r8)
            di3.d r5 = di3.C86312j.m106911c(r1)
            l31.e r5 = (l31.C61212e) r5
            ye1.v r6 = r10.mo2214n3()
            android.widget.LinearLayout r6 = r6.f42989g
            r7 = 3
            rx3.l[] r7 = new rx3.C13604l[r7]
            if (r0 == 0) goto L_0x0175
            long r8 = r0.getItemId()
            goto L_0x0177
        L_0x0175:
            r8 = 0
        L_0x0177:
            java.lang.String r0 = o40.C61926c.m72691p(r8)
            rx3.l r8 = new rx3.l
            java.lang.String r9 = "feed_id"
            r8.<init>(r9, r0)
            r7[r3] = r8
            T r0 = r10.f33564d
            te3.sn1 r0 = (te3.C51270sn1) r0
            r3 = 0
            if (r0 == 0) goto L_0x0196
            te3.xd1 r0 = r0.f141636z
            if (r0 == 0) goto L_0x0196
            long r8 = r0.f144600d
            java.lang.String r0 = o40.C61926c.m72691p(r8)
            goto L_0x0197
        L_0x0196:
            r0 = r3
        L_0x0197:
            rx3.l r8 = new rx3.l
            java.lang.String r9 = "topicid"
            r8.<init>(r9, r0)
            r7[r4] = r8
            T r0 = r10.f33564d
            te3.sn1 r0 = (te3.C51270sn1) r0
            if (r0 == 0) goto L_0x01b1
            te3.xd1 r0 = r0.f141636z
            if (r0 == 0) goto L_0x01b1
            te3.td1 r0 = r0.f144603g
            if (r0 == 0) goto L_0x01b1
            java.lang.String r3 = r0.f185546s
        L_0x01b1:
            rx3.l r0 = new rx3.l
            java.lang.String r4 = "songid"
            r0.<init>(r4, r3)
            r7[r2] = r0
            java.util.Map r0 = sx3.C90364q0.m113147f(r7)
            r5.mo86149PM(r6, r0)
            di3.d r0 = di3.C86312j.m106911c(r1)
            l31.e r0 = (l31.C61212e) r0
            ye1.v r1 = r10.mo2214n3()
            android.widget.LinearLayout r1 = r1.f42989g
            ud1.o r2 = new ud1.o
            r2.<init>(r10)
            r0.E60(r1, r2)
            goto L_0x01e0
        L_0x01d7:
            ye1.v r0 = r10.mo2214n3()
            android.widget.LinearLayout r0 = r0.f42989g
            r0.setVisibility(r2)
        L_0x01e0:
            r10.mo2210I3()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC.mo2215o3():void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12478p.alive();
        this.f12479q.alive();
        this.f12480r.alive();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f12478p.dead();
        this.f12479q.dead();
        this.f12480r.dead();
    }

    public void onPause() {
        C51959xd1 xd12;
        super.onPause();
        if (this.f12474i % 2 == 1) {
            C64726td1 td12 = null;
            if (this.f12473h) {
                C65584b bVar = C65584b.f188718a;
                AppCompatActivity activity = getActivity();
                C51270sn1 sn12 = (C51270sn1) this.f33564d;
                if (!(sn12 == null || (xd12 = sn12.f141636z) == null)) {
                    td12 = xd12.f144603g;
                }
                bVar.mo89658a(activity, td12);
                return;
            }
            ((C102712e) C86312j.m106911c(C102712e.class)).hx0(this.f12475j, (Runnable) null, 13);
        }
    }

    public void setNormalStyle() {
        C51959xd1 xd12;
        LinkedList<C49018cl1> linkedList;
        mo2214n3().f42994l.setTextColor(getResources().getColor(C0966R.color.FG_0));
        mo2214n3().f42983a.setIconColor(getResources().getColor(C0966R.color.FG_0));
        this.f12476n = C0966R.color.FG_0;
        C51270sn1 sn12 = (C51270sn1) this.f33564d;
        boolean z = false;
        if (!(sn12 == null || (xd12 = sn12.f141636z) == null || (linkedList = xd12.f144602f) == null || linkedList.size() <= 0 || linkedList.get(0).f131808e != 1)) {
            z = true;
        }
        int i = z ? C0966R.color.f2958ae : C0966R.color.BW_0_Alpha_0_5;
        mo2214n3().f42992j.setTextColor(getResources().getColor(i));
        mo2214n3().f42991i.setIconColor(getResources().getColor(i));
        mo2214n3().f42998p.setTextColor(getResources().getColor(C0966R.color.FG_1));
        mo2214n3().f42996n.setTextColor(getResources().getColor(C0966R.color.FG_1));
    }
}
