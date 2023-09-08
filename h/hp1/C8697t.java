package hp1;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.search.FinderFeedSearchUI;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import l60.C99342a;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import pl1.C62345f;
import rx3.C13598b0;
import te3.C52123yj0;
import te3.C52271zj0;
import up1.C27696y;

/* renamed from: hp1.t */
public final class C8697t implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedSearchUI f27920d;

    /* renamed from: e */
    public final /* synthetic */ View f27921e;

    public C8697t(FinderFeedSearchUI finderFeedSearchUI, View view) {
        this.f27920d = finderFeedSearchUI;
        this.f27921e = view;
    }

    public final void onClick(View view) {
        C8657d0 d0Var;
        View view2;
        FinderJumpInfo finderJumpInfo;
        FinderContact finderContact;
        ImageView imageView;
        TextView textView;
        FinderContact finderContact2;
        Window window;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderFeedSearchUI$initHotSearchTitle$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderFeedSearchUI finderFeedSearchUI = this.f27920d;
        C52271zj0 zj02 = finderFeedSearchUI.f16495Z;
        C13598b0 b0Var = null;
        if (zj02 != null && (d0Var = finderFeedSearchUI.f16505p0) != null) {
            Log.m105924i("Finder.HotSearchInfoDialog", "showDialog");
            C104428a aVar = d0Var.f27815b;
            boolean z = true;
            if (aVar == null || !aVar.isShowing()) {
                z = false;
            }
            if (!z) {
                Class cls = C11990s0.class;
                Class<C60200t1> cls2 = C60200t1.class;
                View inflate = C85868k2.m106137b(d0Var.f27814a).inflate(C0966R.C0971layout.ad6, (ViewGroup) null);
                C104428a aVar2 = new C104428a(d0Var.f27814a, C0966R.style.f8363ft);
                d0Var.f27815b = aVar2;
                aVar2.setContentView(inflate);
                C104428a aVar3 = d0Var.f27815b;
                if (!(aVar3 == null || (window = aVar3.getWindow()) == null)) {
                    window.setDimAmount(0.5f);
                }
                C104428a aVar4 = d0Var.f27815b;
                if (aVar4 != null) {
                    aVar4.setOnDismissListener(new C8707z(d0Var));
                }
                TextView textView2 = inflate != null ? (TextView) inflate.findViewById(C0966R.C0970id.d_j) : null;
                TextView textView3 = inflate != null ? (TextView) inflate.findViewById(C0966R.C0970id.d_i) : null;
                String str = "";
                if (textView2 != null) {
                    C85875k4.m106189j0(textView2.getPaint(), 0.8f);
                    String str2 = zj02.f146007f;
                    if (str2 == null) {
                        str2 = str;
                    }
                    textView2.setText(str2);
                }
                if (textView3 != null) {
                    String str3 = zj02.f146008g;
                    if (str3 != null) {
                        str = str3;
                    }
                    textView3.setText(str);
                }
                View findViewById = inflate.findViewById(C0966R.C0970id.ex7);
                ImageView imageView2 = (ImageView) inflate.findViewById(C0966R.C0970id.ex8);
                TextView textView4 = (TextView) inflate.findViewById(C0966R.C0970id.ex_);
                View findViewById2 = inflate.findViewById(C0966R.C0970id.d_h);
                C52123yj0 yj02 = zj02.f145995A;
                if (yj02 == null || (finderContact = yj02.f145323d) == null) {
                    finderJumpInfo = null;
                    view2 = findViewById2;
                } else {
                    if (findViewById == null) {
                        finderContact2 = finderContact;
                        view2 = findViewById2;
                        textView = textView4;
                        imageView = imageView2;
                    } else {
                        C9556a aVar5 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar5.mo10233c(0);
                        Object[] b = aVar5.mo10232b();
                        C9556a aVar6 = aVar5;
                        View view3 = findViewById;
                        finderContact2 = finderContact;
                        view2 = findViewById2;
                        textView = textView4;
                        imageView = imageView2;
                        C117292a.m165358d(view3, b, "com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog", "initDialog", "(Lcom/tencent/mm/protocal/protobuf/FinderEventInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog", "initDialog", "(Lcom/tencent/mm/protocal/protobuf/FinderEventInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    FinderContact finderContact3 = finderContact2;
                    textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(d0Var.f27814a, finderContact3.nickname));
                    C39818r rVar = C39818r.f106831a;
                    C60979d<C100810g0> i2 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2();
                    finderJumpInfo = null;
                    C62345f fVar = new C62345f(finderContact3.headUrl, (C27696y) null, 2, (C8480h) null);
                    ImageView imageView3 = imageView;
                    C87412m.m108593f(imageView3, "dialogNoteAvatar");
                    i2.mo85957c(fVar, imageView3, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
                    imageView3.setOnClickListener(new C8650a0(d0Var, finderContact3));
                }
                d0Var.f27818e = (WeImageView) inflate.findViewById(C0966R.C0970id.exd);
                d0Var.f27816c = inflate.findViewById(C0966R.C0970id.f358404ex3);
                d0Var.f27819f = (ImageView) inflate.findViewById(C0966R.C0970id.exb);
                d0Var.f27817d = (TextView) inflate.findViewById(C0966R.C0970id.ex4);
                View view4 = d0Var.f27816c;
                if (view4 != null) {
                    view4.setBackground(d0Var.f27814a.getResources().getDrawable(C0966R.C0969drawable.a4a));
                }
                FinderJumpInfo finderJumpInfo2 = zj02.f146020v;
                if (finderJumpInfo2 != null) {
                    Log.m105924i("Finder.HotSearchInfoDialog", "showJumpView by jumpInfo");
                    if (!Util.isNullOrNil(finderJumpInfo2.wording)) {
                        View view5 = d0Var.f27816c;
                        if (view5 != null) {
                            C9556a aVar7 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar7.mo10233c(0);
                            View view6 = view5;
                            C117292a.m165358d(view6, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog", "showJumpView", "(Lcom/tencent/mm/protocal/protobuf/FinderEventInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view5.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog", "showJumpView", "(Lcom/tencent/mm/protocal/protobuf/FinderEventInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        TextView textView5 = d0Var.f27817d;
                        if (textView5 != null) {
                            textView5.setText(finderJumpInfo2.wording);
                        }
                        WeImageView weImageView = d0Var.f27818e;
                        if (weImageView != null) {
                            weImageView.setVisibility(8);
                        }
                        ImageView imageView4 = d0Var.f27819f;
                        if (imageView4 != null) {
                            imageView4.setVisibility(0);
                        }
                        ImageView imageView5 = d0Var.f27819f;
                        if (imageView5 != null) {
                            imageView5.setVisibility(0);
                            C39818r rVar2 = C39818r.f106831a;
                            ((C99342a) ((C11990s0) rVar2.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(finderJumpInfo2.icon_url, C27696y.THUMB_IMAGE), ((C11990s0) rVar2.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.LINK_THUMB))).mo85954d(imageView5);
                        }
                    } else {
                        View view7 = d0Var.f27816c;
                        if (view7 != null) {
                            C9556a aVar8 = new C9556a();
                            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                            aVar8.mo10233c(8);
                            View view8 = view7;
                            C117292a.m165358d(view8, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog", "showJumpView", "(Lcom/tencent/mm/protocal/protobuf/FinderEventInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view7.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                            C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog", "showJumpView", "(Lcom/tencent/mm/protocal/protobuf/FinderEventInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                } else {
                    finderJumpInfo2 = finderJumpInfo;
                }
                if (finderJumpInfo2 == null) {
                    Log.m105924i("Finder.HotSearchInfoDialog", "showJumpView by MiniProgram");
                    if (!Util.isNullOrNil(zj02.f146014p)) {
                        View view9 = d0Var.f27816c;
                        if (view9 != null) {
                            C9556a aVar9 = new C9556a();
                            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                            aVar9.mo10233c(0);
                            View view10 = view9;
                            C117292a.m165358d(view10, aVar9.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog", "showMiniProgram", "(Lcom/tencent/mm/protocal/protobuf/FinderEventInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view9.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                            C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog", "showMiniProgram", "(Lcom/tencent/mm/protocal/protobuf/FinderEventInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        TextView textView6 = d0Var.f27817d;
                        if (textView6 != null) {
                            textView6.setText(zj02.f146016r);
                        }
                        WeImageView weImageView2 = d0Var.f27818e;
                        if (weImageView2 != null) {
                            weImageView2.setVisibility(0);
                        }
                        ImageView imageView6 = d0Var.f27819f;
                        if (imageView6 != null) {
                            imageView6.setVisibility(8);
                        }
                    } else {
                        View view11 = d0Var.f27816c;
                        if (view11 != null) {
                            C9556a aVar10 = new C9556a();
                            ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                            aVar10.mo10233c(8);
                            C117292a.m165358d(view11, aVar10.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog", "showMiniProgram", "(Lcom/tencent/mm/protocal/protobuf/FinderEventInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view11.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                            C117292a.m165359e(view11, "com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog", "showMiniProgram", "(Lcom/tencent/mm/protocal/protobuf/FinderEventInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                }
                View view12 = d0Var.f27816c;
                if (view12 != null) {
                    view12.setOnClickListener(new C8653b0(d0Var, zj02));
                }
                View view13 = view2;
                if (view13 != null) {
                    view13.setOnClickListener(new C8655c0(d0Var));
                }
                C104428a aVar11 = d0Var.f27815b;
                if (aVar11 != null) {
                    aVar11.show();
                }
            }
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            Log.m105924i("Finder.FinderFeedSearchUI", "info empty onClick!");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/search/FinderFeedSearchUI$initHotSearchTitle$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
