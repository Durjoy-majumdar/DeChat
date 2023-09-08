package com.tencent.p014mm.plugin.sns.p106ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.sns.cover.preview.SnsCoverContainerLayout;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.view.SnsStoryHeaderView;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.plugin.story.api.AbsStoryHeaderTipView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import fy3.C32227p;
import gv2.C98230e;
import gv2.C98244q;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import ms2.C99965e;
import nj3.C76879j;
import os2.C100398c0;
import os2.C100422y;
import p196ln.C76705f;
import p214om.C11502f;
import p629ny.C76979h;
import p773yy.C79168k;
import qe0.C47806g;
import qr2.C36069a;
import qy2.C63347a;
import qy2.C77448f0;
import rx3.C13598b0;
import vr2.C102236a0;
import xv2.C102775d;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsHeader */
public class SnsHeader extends LinearLayout {

    /* renamed from: A */
    public Boolean f278097A = Boolean.FALSE;

    /* renamed from: B */
    public View.OnClickListener f278098B = new C95537a();

    /* renamed from: d */
    public C95546j f278099d;

    /* renamed from: e */
    public C95544h f278100e;

    /* renamed from: f */
    public String f278101f;

    /* renamed from: g */
    public C100422y f278102g;

    /* renamed from: h */
    public long f278103h = 0;

    /* renamed from: i */
    public Context f278104i;

    /* renamed from: j */
    public int f278105j;

    /* renamed from: n */
    public boolean f278106n = false;

    /* renamed from: o */
    public boolean f278107o = false;

    /* renamed from: p */
    public boolean f278108p = false;

    /* renamed from: q */
    public boolean f278109q = true;

    /* renamed from: r */
    public Map<Integer, View> f278110r = new HashMap();

    /* renamed from: s */
    public String f278111s = "";

    /* renamed from: t */
    public String f278112t;

    /* renamed from: u */
    public String f278113u;

    /* renamed from: v */
    public Animation f278114v = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);

    /* renamed from: w */
    public boolean f278115w = false;

    /* renamed from: x */
    public C98244q f278116x;

    /* renamed from: y */
    public ListView f278117y;

    /* renamed from: z */
    public View f278118z;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsHeader$a */
    public class C95537a implements View.OnClickListener {
        public C95537a() {
        }

        public void onClick(View view) {
            Class cls = C11502f.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsHeader$1");
            C72996z1 z1Var = C94866e1.Jx0().get(SnsHeader.this.f278101f);
            if (z1Var == null || (!z1Var.mo62927s3() && !SnsHeader.this.f278106n)) {
                Intent intent = ((Activity) SnsHeader.m122095a(SnsHeader.this)).getIntent();
                intent.putExtra("Contact_User", SnsHeader.this.f278101f);
                ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93174g(intent, SnsHeader.m122095a(SnsHeader.this));
            } else {
                Intent intent2 = new Intent();
                intent2.putExtra("Contact_User", SnsHeader.this.f278101f);
                String str = SnsHeader.this.f278101f;
                if (str != null && str.length() > 0) {
                    SnsHeader snsHeader = SnsHeader.this;
                    SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                    int i = snsHeader.f278105j;
                    SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                    int i2 = 1;
                    if (i == 1) {
                        i2 = 6;
                    }
                    intent2.putExtra("CONTACT_INFO_UI_SOURCE", i2);
                    ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93174g(intent2, SnsHeader.m122095a(SnsHeader.this));
                }
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsHeader$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsHeader$b */
    public class C95538b implements View.OnClickListener {
        public C95538b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsHeader$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsHeader$4");
            SnsHeader.this.mo132740g();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsHeader$4");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsHeader$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsHeader$c */
    public class C95539c implements C32224a<C13598b0> {
        public C95539c() {
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeader$5");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeader$5");
            SnsHeader.m122098d(SnsHeader.this);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeader$5");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeader$5");
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsHeader$d */
    public class C95540d implements C32227p<Integer, Integer, C13598b0> {
        public C95540d() {
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeader$6");
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeader$6");
            int intValue = num2.intValue();
            C98244q c = SnsHeader.m122097c(SnsHeader.this);
            c.getClass();
            SnsMethodCalculate.markStartTimeMs("getOpenTarget", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            int i = c.f288038c;
            SnsMethodCalculate.markEndTimeMs("getOpenTarget", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            if (intValue != i) {
                C98244q c2 = SnsHeader.m122097c(SnsHeader.this);
                int intValue2 = num2.intValue();
                c2.getClass();
                SnsMethodCalculate.markStartTimeMs("setOpenTarget", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
                c2.f288038c = intValue2;
                C98230e eVar = c2.f288044i;
                eVar.getClass();
                SnsMethodCalculate.markStartTimeMs("setOpenTarget", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
                eVar.f288002b = intValue2;
                SnsMethodCalculate.markEndTimeMs("setOpenTarget", "com.tencent.mm.plugin.sns.ui.widget.OpenScroller");
                SnsMethodCalculate.markEndTimeMs("setOpenTarget", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
                SnsHeader.m122097c(SnsHeader.this).mo137546i(false);
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeader$6");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsHeader$6");
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsHeader$e */
    public class C95541e implements View.OnClickListener {
        public C95541e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsHeader$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsHeader$7");
            if (!(SnsHeader.m122099e(SnsHeader.this) == null || SnsHeader.m122100f(SnsHeader.this) == null)) {
                if (SnsHeader.m122099e(SnsHeader.this).field_isLike) {
                    SnsReportHelper.f275506m0.mo131376i(5);
                } else {
                    SnsReportHelper.f275506m0.mo131376i(3);
                }
                SnsHeader.m122099e(SnsHeader.this).field_isLike = !SnsHeader.m122099e(SnsHeader.this).field_isLike;
                C95544h f = SnsHeader.m122100f(SnsHeader.this);
                SnsHeader snsHeader = SnsHeader.this;
                SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                long j = snsHeader.f278103h;
                SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                ((SnsUIAction.C95663f) f).mo133052a(j, SnsHeader.m122099e(SnsHeader.this).field_isLike);
                SnsHeader snsHeader2 = SnsHeader.this;
                SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                snsHeader2.mo132750n();
                SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsHeader$7");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsHeader$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsHeader$f */
    public class C95542f implements Runnable {
        public C95542f() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsHeader$8");
            Log.m105924i("MicroMsg.SnsHeader", "needShowChangeAlbumDialog = true");
            if (SnsHeader.m122097c(SnsHeader.this) != null) {
                SnsHeader.m122098d(SnsHeader.this);
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsHeader$8");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsHeader$g */
    public class C95543g implements ViewTreeObserver.OnGlobalLayoutListener {
        public C95543g() {
        }

        public void onGlobalLayout() {
            SnsMethodCalculate.markStartTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.SnsHeader$9");
            SnsHeader.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (SnsHeader.this.f278099d.f278137l.getHeight() > SnsHeader.this.f278099d.f278137l.getWidth()) {
                ViewGroup.LayoutParams layoutParams = SnsHeader.this.f278099d.f278137l.getLayoutParams();
                layoutParams.height = SnsHeader.this.f278099d.f278137l.getWidth();
                SnsHeader.this.f278099d.f278137l.setLayoutParams(layoutParams);
            }
            SnsMethodCalculate.markEndTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.SnsHeader$9");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsHeader$h */
    public interface C95544h {
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsHeader$i */
    public interface C95545i {
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsHeader$j */
    public class C95546j {

        /* renamed from: a */
        public ImageView f278126a;

        /* renamed from: b */
        public TextView f278127b;

        /* renamed from: c */
        public TextView f278128c;

        /* renamed from: d */
        public TextView f278129d;

        /* renamed from: e */
        public LinearLayout f278130e;

        /* renamed from: f */
        public AbsStoryHeaderTipView f278131f;

        /* renamed from: g */
        public SnsStoryHeaderView f278132g;

        /* renamed from: h */
        public RelativeLayout f278133h;

        /* renamed from: i */
        public LinearLayout f278134i;

        /* renamed from: j */
        public ImageView f278135j;

        /* renamed from: k */
        public ViewGroup f278136k;

        /* renamed from: l */
        public SnsCoverContainerLayout f278137l;

        /* renamed from: m */
        public ViewGroup f278138m;

        /* renamed from: n */
        public ViewGroup f278139n;

        /* renamed from: o */
        public WeImageView f278140o;

        public C95546j(SnsHeader snsHeader) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsHeader$k */
    public static class C95547k implements Comparator<Object> {
        public int compare(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsHeader$comparatorSnsInfoByTime");
            int createTime = obj instanceof SnsInfo ? ((SnsInfo) obj).getCreateTime() : obj instanceof C99965e ? ((C99965e) obj).f292907e : 0;
            int createTime2 = obj2 instanceof SnsInfo ? ((SnsInfo) obj2).getCreateTime() : obj2 instanceof C99965e ? ((C99965e) obj2).f292907e : 0;
            if (createTime == createTime2) {
                SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsHeader$comparatorSnsInfoByTime");
                return 0;
            } else if (createTime > createTime2) {
                SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsHeader$comparatorSnsInfoByTime");
                return -1;
            } else {
                SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.SnsHeader$comparatorSnsInfoByTime");
                return 1;
            }
        }
    }

    public SnsHeader(Context context) {
        super(context);
        mo132744h(context);
    }

    /* renamed from: a */
    public static /* synthetic */ Context m122095a(SnsHeader snsHeader) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        Context context = snsHeader.f278104i;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        return context;
    }

    /* renamed from: b */
    public static void m122096b(SnsHeader snsHeader, float f) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        snsHeader.getClass();
        SnsMethodCalculate.markStartTimeMs("onCoverOpening", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        snsHeader.f278099d.f278128c.setVisibility(0);
        snsHeader.f278099d.f278126a.setVisibility(0);
        if (snsHeader.f278105j == 1) {
            snsHeader.f278099d.f278127b.setVisibility(8);
        } else {
            snsHeader.f278099d.f278127b.setVisibility(0);
        }
        if (snsHeader.f278108p) {
            snsHeader.f278099d.f278129d.setVisibility(0);
        }
        if (snsHeader.f278106n) {
            snsHeader.f278099d.f278138m.setVisibility(0);
        } else if (snsHeader.mo132745i()) {
            snsHeader.f278099d.f278139n.setVisibility(0);
        } else {
            snsHeader.f278099d.f278139n.setVisibility(8);
        }
        double d = (double) f;
        if (d <= 0.01d) {
            if (snsHeader.f278106n) {
                snsHeader.f278099d.f278138m.setVisibility(4);
            } else if (snsHeader.mo132745i()) {
                snsHeader.f278099d.f278139n.setVisibility(4);
            } else {
                snsHeader.f278099d.f278139n.setVisibility(8);
            }
        } else if (d >= 0.99d) {
            snsHeader.f278099d.f278128c.setVisibility(4);
            snsHeader.f278099d.f278126a.setVisibility(4);
            if (snsHeader.f278105j == 1) {
                snsHeader.f278099d.f278127b.setVisibility(8);
            } else {
                snsHeader.f278099d.f278127b.setVisibility(4);
            }
            if (snsHeader.f278108p) {
                snsHeader.f278099d.f278129d.setVisibility(4);
            }
        }
        float f2 = 1.0f - f;
        snsHeader.f278099d.f278128c.setAlpha(f2);
        snsHeader.f278099d.f278126a.setAlpha(f2);
        snsHeader.f278099d.f278127b.setAlpha(f2);
        snsHeader.f278099d.f278129d.setAlpha(f2);
        if (snsHeader.f278106n) {
            snsHeader.f278099d.f278138m.setAlpha(f);
        } else {
            snsHeader.f278099d.f278139n.setAlpha(f);
        }
        SnsMethodCalculate.markEndTimeMs("onCoverOpening", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    /* renamed from: c */
    public static /* synthetic */ C98244q m122097c(SnsHeader snsHeader) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        C98244q qVar = snsHeader.f278116x;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        return qVar;
    }

    /* renamed from: d */
    public static void m122098d(SnsHeader snsHeader) {
        int i;
        Context context;
        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        snsHeader.getClass();
        SnsMethodCalculate.markStartTimeMs("onCoverClick", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        int previewType = snsHeader.f278099d.f278137l.getPreviewType();
        if (!C36069a.f96150a.mo60517b()) {
            SnsMethodCalculate.markStartTimeMs("legacyClick", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            String[] strArr = snsHeader.f278106n ? new String[]{snsHeader.f278104i.getString(C0966R.string.jjm)} : snsHeader.f278102g.field_isLike ? new String[0] : new String[]{snsHeader.f278104i.getString(C0966R.string.jeg)};
            String string = (snsHeader.f278106n || !snsHeader.f278102g.field_isLike) ? "" : snsHeader.f278104i.getString(C0966R.string.jgz);
            if (snsHeader.f278106n || !snsHeader.f278102g.field_isLike) {
                context = snsHeader.f278104i;
                i = C0966R.string.f7926wf;
            } else {
                context = snsHeader.f278104i;
                i = C0966R.string.a18;
            }
            C76879j.m92734e(snsHeader.getContext(), string, strArr, (String) null, context.getString(i), new C96170q4(snsHeader));
            SnsMethodCalculate.markEndTimeMs("legacyClick", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        } else if (snsHeader.f278109q || previewType == 0) {
            snsHeader.mo132740g();
        } else {
            ListView listView = snsHeader.f278117y;
            if (listView != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                ListView listView2 = listView;
                C117292a.m165358d(listView2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsHeader", "onCoverClick", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                listView.smoothScrollToPosition(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(listView2, "com/tencent/mm/plugin/sns/ui/SnsHeader", "onCoverClick", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
            if (snsHeader.f278116x.mo137548k()) {
                snsHeader.f278116x.mo137545h();
            } else {
                C98244q qVar = snsHeader.f278116x;
                qVar.getClass();
                SnsMethodCalculate.markStartTimeMs(WeChatBrands.Business.GROUP_OPEN, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
                qVar.f288042g = false;
                qVar.f288036a.mo135689r0(-qVar.f288038c, -1);
                qVar.mo137544g(false);
                qVar.f288043h = true;
                SnsMethodCalculate.markEndTimeMs(WeChatBrands.Business.GROUP_OPEN, "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
                SnsReportHelper.f275506m0.mo131376i(2);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onCoverClick", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    /* renamed from: e */
    public static /* synthetic */ C100422y m122099e(SnsHeader snsHeader) {
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        C100422y yVar = snsHeader.f278102g;
        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        return yVar;
    }

    /* renamed from: f */
    public static /* synthetic */ C95544h m122100f(SnsHeader snsHeader) {
        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        C95544h hVar = snsHeader.f278100e;
        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        return hVar;
    }

    /* renamed from: g */
    public void mo132740g() {
        SnsMethodCalculate.markStartTimeMs("changeCover", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        if (!this.f278106n) {
            SnsMethodCalculate.markEndTimeMs("changeCover", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            return;
        }
        SnsMethodCalculate.markStartTimeMs("selectPhoto", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        C95544h hVar = this.f278100e;
        if (hVar != null) {
            SnsUIAction.C95663f fVar = (SnsUIAction.C95663f) hVar;
            SnsMethodCalculate.markStartTimeMs("onChangeCover", "com.tencent.mm.plugin.sns.ui.SnsUIAction$2");
            SnsUIAction snsUIAction = SnsUIAction.this;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            boolean z = snsUIAction.f278847W;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            if (z || SnsUIAction.m122374d(SnsUIAction.this).getType() == 1) {
                SnsUIAction.this.mo133026B(2, 4);
            }
            SnsMethodCalculate.markEndTimeMs("onChangeCover", "com.tencent.mm.plugin.sns.ui.SnsUIAction$2");
        }
        SnsMethodCalculate.markEndTimeMs("selectPhoto", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        SnsMethodCalculate.markEndTimeMs("changeCover", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public View getFinderSnsRecyclerView() {
        SnsMethodCalculate.markStartTimeMs("getFinderSnsRecyclerView", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        C95546j jVar = this.f278099d;
        if (jVar != null) {
            jVar.getClass();
        }
        SnsMethodCalculate.markEndTimeMs("getFinderSnsRecyclerView", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = r2.f278134i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getLoadingGroupHeight() {
        /*
            r5 = this;
            java.lang.String r0 = "getLoadingGroupHeight"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsHeader"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.ui.SnsHeader$j r2 = r5.f278099d
            if (r2 == 0) goto L_0x001f
            android.widget.LinearLayout r2 = r2.f278134i
            if (r2 == 0) goto L_0x001f
            int r2 = r2.getHeight()
            android.content.Context r3 = r5.getContext()
            r4 = 32
            int r3 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r3, r4)
            int r2 = r2 + r3
            goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsHeader.getLoadingGroupHeight():int");
    }

    public C95546j getViewHeader() {
        SnsMethodCalculate.markStartTimeMs("getViewHeader", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        C95546j jVar = this.f278099d;
        SnsMethodCalculate.markEndTimeMs("getViewHeader", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        return jVar;
    }

    /* renamed from: h */
    public final void mo132744h(Context context) {
        Class cls = C102775d.class;
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsHeader");
        this.f278104i = context;
        this.f278115w = ((C102775d) C86312j.m106911c(cls)).ik0().mo108963a();
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.c39, this, true);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C0966R.C0970id.jvy);
        C95546j jVar = new C95546j(this);
        this.f278099d = jVar;
        jVar.f278128c = (TextView) inflate.findViewById(C0966R.C0970id.hg4);
        this.f278099d.f278126a = (ImageView) inflate.findViewById(C0966R.C0970id.a27);
        this.f278099d.f278129d = (TextView) inflate.findViewById(C0966R.C0970id.f358886hn3);
        this.f278099d.f278127b = (TextView) inflate.findViewById(C0966R.C0970id.jld);
        C95546j jVar2 = this.f278099d;
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.jd4);
        jVar2.getClass();
        this.f278099d.f278130e = (LinearLayout) inflate.findViewById(C0966R.C0970id.jt4);
        this.f278099d.f278133h = (RelativeLayout) inflate.findViewById(C0966R.C0970id.jtj);
        this.f278099d.f278134i = (LinearLayout) inflate.findViewById(C0966R.C0970id.jtk);
        this.f278099d.f278135j = (ImageView) inflate.findViewById(C0966R.C0970id.jtl);
        this.f278099d.f278136k = (ViewGroup) inflate.findViewById(C0966R.C0970id.jtb);
        this.f278099d.f278137l = (SnsCoverContainerLayout) inflate.findViewById(C0966R.C0970id.jro);
        this.f278099d.f278138m = (ViewGroup) inflate.findViewById(C0966R.C0970id.jrv);
        inflate.findViewById(C0966R.C0970id.jrv).setContentDescription(context.getString(C0966R.string.jb8));
        inflate.findViewById(C0966R.C0970id.jrv).setOnClickListener(new C95538b());
        this.f278099d.f278137l.setCoverClickListener(new C95539c());
        this.f278099d.f278137l.setOnViewSizeChanged(new C95540d());
        this.f278099d.f278139n = (ViewGroup) inflate.findViewById(C0966R.C0970id.jso);
        this.f278099d.f278140o = (WeImageView) inflate.findViewById(C0966R.C0970id.jsn);
        this.f278099d.f278139n.setOnClickListener(new C95541e());
        this.f278114v.setDuration(1000);
        this.f278114v.setRepeatCount(-1);
        this.f278114v.setInterpolator(new LinearInterpolator());
        if (!C77448f0.m93394f()) {
            this.f278099d.f278131f = ((C102775d) C86312j.m106911c(cls)).Eg0().mo108970f(context);
            this.f278099d.f278132g = new SnsStoryHeaderView(context, (AttributeSet) null);
            if (this.f278115w) {
                AbsStoryHeaderTipView absStoryHeaderTipView = this.f278099d.f278131f;
                if (absStoryHeaderTipView != null) {
                    frameLayout.addView(absStoryHeaderTipView);
                    this.f278099d.f278131f.mo134175a();
                }
            } else {
                frameLayout.addView(this.f278099d.f278132g);
                this.f278099d.f278132g.setSessionId(this.f278112t);
                this.f278099d.f278132g.setEnterObjectId(this.f278113u);
            }
        }
        this.f278099d.f278128c.setOnClickListener(this.f278098B);
        this.f278099d.f278126a.setOnClickListener(this.f278098B);
        if (((Activity) context).getIntent().getBooleanExtra("sns_timeline_NeedShowChangeAlbumDialog", false)) {
            postDelayed(new C95542f(), 150);
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new C95543g());
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    /* renamed from: i */
    public final boolean mo132745i() {
        SnsMethodCalculate.markStartTimeMs("isCoverShowLike", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        boolean z = !this.f278107o && !this.f278109q && this.f278102g.getType() != 5 && C45628s0.m50740E(this.f278101f);
        SnsMethodCalculate.markEndTimeMs("isCoverShowLike", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        return z;
    }

    /* renamed from: j */
    public boolean mo132746j(View view) {
        SnsMethodCalculate.markStartTimeMs("isFinderSnsRecyclerViewVisible", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        View finderSnsRecyclerView = getFinderSnsRecyclerView();
        boolean z = false;
        if (finderSnsRecyclerView == null) {
            SnsMethodCalculate.markEndTimeMs("isFinderSnsRecyclerViewVisible", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            return false;
        }
        if (finderSnsRecyclerView.getVisibility() == 0) {
            Rect rect = new Rect();
            int i = view.getGlobalVisibleRect(rect) ? rect.bottom : 0;
            Rect rect2 = new Rect();
            boolean globalVisibleRect = finderSnsRecyclerView.getGlobalVisibleRect(rect2);
            int dimension = (int) (((float) rect2.bottom) - this.f278104i.getResources().getDimension(C0966R.dimen.f3736cp));
            if (globalVisibleRect && dimension > i) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isFinderSnsRecyclerViewVisible", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            return z;
        }
        SnsMethodCalculate.markEndTimeMs("isFinderSnsRecyclerViewVisible", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        return false;
    }

    /* renamed from: k */
    public void mo132747k() {
        SnsMethodCalculate.markStartTimeMs("refreshAvatar", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        C95546j jVar = this.f278099d;
        if (jVar == null || jVar.f278126a == null) {
            SnsMethodCalculate.markEndTimeMs("refreshAvatar", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            return;
        }
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106841jW(this.f278099d.f278126a, this.f278101f, true);
        SnsMethodCalculate.markEndTimeMs("refreshAvatar", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    /* JADX WARNING: type inference failed for: r4v12, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0181  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo132748l() {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r2 = "refreshError"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsHeader"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            com.tencent.mm.plugin.sns.ui.SnsHeader$j r0 = r1.f278099d
            android.widget.LinearLayout r0 = r0.f278130e
            r4 = 0
            if (r0 != 0) goto L_0x0015
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        L_0x0015:
            ms2.g r0 = ms2.C99966g.f292911a
            java.util.List r0 = r0.mo139307a()
            java.util.Iterator r5 = r0.iterator()
            java.lang.String r6 = ""
            r7 = r6
        L_0x0022:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0066
            java.lang.Object r8 = r5.next()
            boolean r9 = r8 instanceof com.tencent.p014mm.plugin.sns.storage.SnsInfo
            java.lang.String r10 = " "
            if (r9 == 0) goto L_0x004b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            com.tencent.mm.plugin.sns.storage.SnsInfo r8 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r8
            java.lang.String r7 = r8.getLocalid()
            r9.append(r7)
            r9.append(r10)
            java.lang.String r7 = r9.toString()
            goto L_0x0022
        L_0x004b:
            boolean r9 = r8 instanceof ms2.C99965e
            if (r9 == 0) goto L_0x0022
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            ms2.e r8 = (ms2.C99965e) r8
            long r7 = r8.f292906d
            r9.append(r7)
            r9.append(r10)
            java.lang.String r7 = r9.toString()
            goto L_0x0022
        L_0x0066:
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r8 = r0
            java.util.LinkedList r8 = (java.util.LinkedList) r8
            int r9 = r8.size()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r5[r4] = r9
            r9 = 1
            r5[r9] = r7
            java.lang.String r10 = r1.f278111s
            r11 = 2
            r5[r11] = r10
            java.lang.String r10 = "MicroMsg.SnsHeader"
            java.lang.String r12 = "refreshError %s %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r12, r5)
            java.lang.String r5 = r1.f278111s
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x0099
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x0095
            r4 = 1
        L_0x0095:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        L_0x0099:
            r1.f278111s = r7
            com.tencent.mm.plugin.sns.ui.SnsHeader$j r5 = r1.f278099d
            android.widget.LinearLayout r5 = r5.f278130e
            r5.removeAllViews()
            com.tencent.mm.plugin.sns.ui.SnsHeader$j r5 = r1.f278099d
            android.widget.LinearLayout r5 = r5.f278130e
            int r7 = r8.size()
            if (r7 <= 0) goto L_0x00ae
            r7 = 0
            goto L_0x00b0
        L_0x00ae:
            r7 = 8
        L_0x00b0:
            r5.setVisibility(r7)
            com.tencent.mm.plugin.sns.ui.SnsHeader$k r5 = new com.tencent.mm.plugin.sns.ui.SnsHeader$k
            r5.<init>()
            java.util.Collections.sort(r0, r5)
            r5 = 0
        L_0x00bc:
            int r0 = r8.size()
            if (r5 >= r0) goto L_0x01bb
            java.lang.Object r0 = r8.get(r5)
            boolean r7 = r0 instanceof com.tencent.p014mm.plugin.sns.storage.SnsInfo
            if (r7 == 0) goto L_0x00e5
            r12 = r0
            com.tencent.mm.plugin.sns.storage.SnsInfo r12 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r12
            int r13 = r12.localid
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "feed_"
            r14.append(r15)
            java.lang.String r12 = r12.getLocalid()
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            goto L_0x0102
        L_0x00e5:
            boolean r12 = r0 instanceof ms2.C99965e
            if (r12 == 0) goto L_0x0100
            r12 = r0
            ms2.e r12 = (ms2.C99965e) r12
            int r13 = r12.f292907e
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "comment_"
            r12.append(r14)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            goto L_0x0102
        L_0x0100:
            r12 = r6
            r13 = 0
        L_0x0102:
            int r14 = r8.size()
            java.lang.String r15 = "getNotifyView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r3)
            java.util.Map<java.lang.Integer, android.view.View> r9 = r1.f278110r
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            java.util.HashMap r9 = (java.util.HashMap) r9
            boolean r9 = r9.containsKey(r11)
            if (r9 == 0) goto L_0x0139
            java.util.Map<java.lang.Integer, android.view.View> r9 = r1.f278110r
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r9 = r9.get(r11)
            if (r9 == 0) goto L_0x0139
            java.util.Map<java.lang.Integer, android.view.View> r9 = r1.f278110r
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r9 = r9.get(r11)
            android.view.View r9 = (android.view.View) r9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r3)
            goto L_0x0165
        L_0x0139:
            android.content.Context r9 = r1.f278104i
            android.view.LayoutInflater r9 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r9)
            r11 = 2131495958(0x7f0c0c16, float:1.8615467E38)
            r4 = 0
            android.view.View r4 = r9.inflate(r11, r4)
            r9 = r4
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r4 = 0
            android.view.View r11 = r9.getChildAt(r4)
            com.tencent.mm.plugin.sns.ui.p4 r4 = new com.tencent.mm.plugin.sns.ui.p4
            r4.<init>(r1, r14, r5)
            r11.setOnClickListener(r4)
            java.util.Map<java.lang.Integer, android.view.View> r4 = r1.f278110r
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            java.util.HashMap r4 = (java.util.HashMap) r4
            r4.put(r11, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r3)
        L_0x0165:
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r4 = 0
            android.view.View r11 = r9.getChildAt(r4)
            r11.setTag(r12)
            r4 = 2131314065(0x7f094591, float:1.8246544E38)
            android.view.View r4 = r9.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r7 == 0) goto L_0x0181
            r0 = 2131837199(0x7f11410f, float:1.9307586E38)
            r4.setText(r0)
            goto L_0x019d
        L_0x0181:
            boolean r7 = r0 instanceof ms2.C99965e
            if (r7 == 0) goto L_0x019d
            ms2.e r0 = (ms2.C99965e) r0
            int r0 = r0.f292908f
            r7 = 2
            if (r0 != r7) goto L_0x0193
            r0 = 2131837119(0x7f1140bf, float:1.9307424E38)
            r4.setText(r0)
            goto L_0x019e
        L_0x0193:
            r11 = 1
            if (r0 != r11) goto L_0x019e
            r0 = 2131837121(0x7f1140c1, float:1.9307428E38)
            r4.setText(r0)
            goto L_0x019e
        L_0x019d:
            r7 = 2
        L_0x019e:
            com.tencent.mm.plugin.sns.ui.SnsHeader$j r0 = r1.f278099d     // Catch:{ Exception -> 0x01a8 }
            android.widget.LinearLayout r0 = r0.f278130e     // Catch:{ Exception -> 0x01a8 }
            r0.addView(r9)     // Catch:{ Exception -> 0x01a8 }
            r4 = 1
            r11 = 0
            goto L_0x01b4
        L_0x01a8:
            r0 = move-exception
            r4 = 1
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r11 = 0
            r9[r11] = r0
            java.lang.String r0 = "addView error:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r0, r9)
        L_0x01b4:
            int r5 = r5 + 1
            r4 = 0
            r9 = 1
            r11 = 2
            goto L_0x00bc
        L_0x01bb:
            r4 = 1
            r11 = 0
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x01c4
            goto L_0x01c5
        L_0x01c4:
            r4 = 0
        L_0x01c5:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsHeader.mo132748l():boolean");
    }

    /* renamed from: m */
    public void mo132749m(String str, String str2, String str3, String str4) {
        int i;
        boolean z;
        String str5 = str;
        String str6 = str2;
        Class cls = C76979h.class;
        SnsMethodCalculate.markStartTimeMs("setUserName", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        if (str5 == null || str6 == null) {
            Log.m105920e("MicroMsg.SnsHeader", "userName or selfName is null ");
            SnsMethodCalculate.markEndTimeMs("setUserName", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            return;
        }
        this.f278101f = str.trim();
        this.f278106n = str6.equals(str5);
        this.f278099d.f278137l.setPreview(this.f278097A.booleanValue());
        this.f278099d.f278137l.mo130665c(this.f278106n, str5);
        Log.m105918d("MicroMsg.SnsHeader", "userNamelen " + str.length() + "  " + str5);
        mo132747k();
        if (str.length() > 0) {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str5);
            SpannableString T1 = ((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f278104i, (z1Var == null || Util.isNullOrNil(z1Var.mo62898f())) ? C102236a0.m134771t0(str3) : z1Var.mo62898f());
            TextView textView = this.f278099d.f278128c;
            this.f278099d.f278128c.setText(((C79168k) C86312j.m106911c(C79168k.class)).mo74108Fe(textView, str, T1, C63347a.C47892c.SNS_TIMELINE_NICK, (float) ((int) (((double) textView.getTextSize()) * 1.15d))));
            this.f278099d.f278127b.setText(((C76979h) C86312j.m106911c(cls)).yp0(this.f278104i, str4, this.f278099d.f278127b.getTextSize()));
            boolean n5 = C72996z1.m85843n5(str);
            this.f278108p = n5;
            if (n5) {
                z = false;
                this.f278099d.f278129d.setVisibility(0);
                this.f278099d.f278129d.setText(C47806g.m53116a(z1Var));
            } else {
                z = false;
                this.f278099d.f278129d.setVisibility(8);
            }
            this.f278107o = z;
            C100398c0 Yt = C94866e1.Xx0().mo139782Yt(str5);
            if (this.f278108p && (Util.isNullOrNil(Yt.field_bgUrl) || Util.isNullOrNil(Yt.field_imBGmd5sum) || Util.isNullOrNil(Yt.field_imBGfileid))) {
                Log.m105920e("MicroMsg.SnsHeader", "openim bg error, do not show like btn");
                i = 1;
                this.f278107o = true;
                C95546j jVar = this.f278099d;
                ImageView imageView = jVar.f278126a;
                Context context = this.f278104i;
                Object[] objArr = new Object[i];
                objArr[0] = jVar.f278128c.getText();
                imageView.setContentDescription(context.getString(C0966R.string.f361369jb2, objArr));
                SnsMethodCalculate.markEndTimeMs("setUserName", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            }
        }
        i = 1;
        C95546j jVar2 = this.f278099d;
        ImageView imageView2 = jVar2.f278126a;
        Context context2 = this.f278104i;
        Object[] objArr2 = new Object[i];
        objArr2[0] = jVar2.f278128c.getText();
        imageView2.setContentDescription(context2.getString(C0966R.string.f361369jb2, objArr2));
        SnsMethodCalculate.markEndTimeMs("setUserName", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    /* renamed from: n */
    public final void mo132750n() {
        SnsMethodCalculate.markStartTimeMs("updateLikeInfo", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        Log.m105924i("MicroMsg.SnsHeader", "updateLikeInfo: ");
        C100422y yVar = this.f278102g;
        if (yVar == null || !yVar.field_isLike) {
            this.f278099d.f278140o.setImageResource(C0966R.raw.icons_outlined_like);
            this.f278099d.f278140o.setIconColor(this.f278104i.getResources().getColor(C0966R.color.f2975b6));
        } else {
            this.f278099d.f278140o.setImageResource(C0966R.raw.icons_filled_like);
            this.f278099d.f278140o.setIconColor(this.f278104i.getResources().getColor(C0966R.color.f2966ao));
        }
        SnsMethodCalculate.markEndTimeMs("updateLikeInfo", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        SnsMethodCalculate.markStartTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        if (!this.f278099d.f278137l.getStatus().f295360a) {
            this.f278099d.f278137l.mo130664b();
            SnsMethodCalculate.markStartTimeMs("onCoverPreClose", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            View view = this.f278118z;
            if (view != null) {
                view.animate().translationY(0.0f).start();
            }
            SnsMethodCalculate.markEndTimeMs("onCoverPreClose", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            this.f278099d.f278137l.mo130663a();
        }
        boolean onKeyDown = super.onKeyDown(i, keyEvent);
        SnsMethodCalculate.markEndTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        return onKeyDown;
    }

    public void setActionBarView(View view) {
        SnsMethodCalculate.markStartTimeMs("setActionBarView", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        this.f278118z = view;
        SnsMethodCalculate.markEndTimeMs("setActionBarView", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public void setAvatarOnClickListener(View.OnClickListener onClickListener) {
        ImageView imageView;
        SnsMethodCalculate.markStartTimeMs("setAvatarOnClickListener", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        C95546j jVar = this.f278099d;
        if (!(jVar == null || (imageView = jVar.f278126a) == null)) {
            imageView.setOnClickListener(onClickListener);
        }
        SnsMethodCalculate.markEndTimeMs("setAvatarOnClickListener", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public void setBackClickListener(C95544h hVar) {
        SnsMethodCalculate.markStartTimeMs("setBackClickListener", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        this.f278100e = hVar;
        SnsMethodCalculate.markEndTimeMs("setBackClickListener", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public void setEnterObjectId(String str) {
        SnsStoryHeaderView snsStoryHeaderView;
        SnsMethodCalculate.markStartTimeMs("setEnterObjectId", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        this.f278113u = str;
        C95546j jVar = this.f278099d;
        if (!(jVar == null || (snsStoryHeaderView = jVar.f278132g) == null || this.f278115w)) {
            snsStoryHeaderView.setEnterObjectId(str);
        }
        SnsMethodCalculate.markEndTimeMs("setEnterObjectId", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public void setHeadBgListener(C95545i iVar) {
        SnsMethodCalculate.markStartTimeMs("setHeadBgListener", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        SnsMethodCalculate.markEndTimeMs("setHeadBgListener", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public void setIsCoverPreview(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setIsCoverPreview", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        this.f278097A = Boolean.valueOf(z);
        this.f278099d.f278137l.setPreview(z);
        SnsMethodCalculate.markEndTimeMs("setIsCoverPreview", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public void setSessionId(String str) {
        SnsStoryHeaderView snsStoryHeaderView;
        SnsMethodCalculate.markStartTimeMs("setSessionId", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        this.f278112t = str;
        C95546j jVar = this.f278099d;
        if (!(jVar == null || (snsStoryHeaderView = jVar.f278132g) == null || this.f278115w)) {
            snsStoryHeaderView.setSessionId(str);
        }
        SnsMethodCalculate.markEndTimeMs("setSessionId", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public void setStoryAction(SnsStoryHeaderView.C96256a aVar) {
        SnsStoryHeaderView snsStoryHeaderView;
        SnsMethodCalculate.markStartTimeMs("setStoryAction", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        C95546j jVar = this.f278099d;
        if (!(jVar == null || (snsStoryHeaderView = jVar.f278132g) == null || this.f278115w)) {
            snsStoryHeaderView.setStoryAction(aVar);
        }
        SnsMethodCalculate.markEndTimeMs("setStoryAction", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public SnsHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo132744h(context);
    }
}
