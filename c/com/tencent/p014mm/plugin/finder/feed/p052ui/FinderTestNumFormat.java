package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C76912y0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import vf1.C14757e5;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderTestNumFormat;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTestNumFormat */
public final class FinderTestNumFormat extends MMFinderUI {

    /* renamed from: x */
    public static final /* synthetic */ int f14837x = 0;

    /* renamed from: o */
    public final C13601g f14838o = C36568h.m40985a(new C3068j(this));

    /* renamed from: p */
    public final C13601g f14839p = C36568h.m40985a(new C3061c(this));

    /* renamed from: q */
    public final C13601g f14840q = C36568h.m40985a(new C3064f(this));

    /* renamed from: r */
    public final C13601g f14841r = C36568h.m40985a(new C3066h(this));

    /* renamed from: s */
    public final C13601g f14842s = C36568h.m40985a(new C3067i(this));

    /* renamed from: t */
    public final C13601g f14843t = C36568h.m40985a(new C3063e(this));

    /* renamed from: u */
    public final C13601g f14844u = C36568h.m40985a(new C3060b(this));

    /* renamed from: v */
    public final C13601g f14845v = C36568h.m40985a(new C3065g(this));

    /* renamed from: w */
    public final C13601g f14846w = C36568h.m40985a(new C3059a(this));

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTestNumFormat$a */
    public static final class C3059a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ FinderTestNumFormat f14847d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3059a(FinderTestNumFormat finderTestNumFormat) {
            super(0);
            this.f14847d = finderTestNumFormat;
        }

        public Object invoke() {
            return this.f14847d.getContext().findViewById(C0966R.C0970id.iyn);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTestNumFormat$b */
    public static final class C3060b extends C87413o implements C32224a<MMEditText> {

        /* renamed from: d */
        public final /* synthetic */ FinderTestNumFormat f14848d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3060b(FinderTestNumFormat finderTestNumFormat) {
            super(0);
            this.f14848d = finderTestNumFormat;
        }

        public Object invoke() {
            return (MMEditText) this.f14848d.getContext().findViewById(C0966R.C0970id.iyp);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTestNumFormat$c */
    public static final class C3061c extends C87413o implements C32224a<MMEditText> {

        /* renamed from: d */
        public final /* synthetic */ FinderTestNumFormat f14849d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3061c(FinderTestNumFormat finderTestNumFormat) {
            super(0);
            this.f14849d = finderTestNumFormat;
        }

        public Object invoke() {
            return (MMEditText) this.f14849d.getContext().findViewById(C0966R.C0970id.e09);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTestNumFormat$d */
    public static final class C3062d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderTestNumFormat f14850d;

        /* renamed from: e */
        public final /* synthetic */ C8478d0 f14851e;

        /* renamed from: f */
        public final /* synthetic */ C8478d0 f14852f;

        /* renamed from: g */
        public final /* synthetic */ C8478d0 f14853g;

        public C3062d(FinderTestNumFormat finderTestNumFormat, C8478d0 d0Var, C8478d0 d0Var2, C8478d0 d0Var3) {
            this.f14850d = finderTestNumFormat;
            this.f14851e = d0Var;
            this.f14852f = d0Var2;
            this.f14853g = d0Var3;
        }

        public final void onClick(View view) {
            String obj;
            String obj2;
            String obj3;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderTestNumFormat$initCommentConfig$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderTestNumFormat finderTestNumFormat = this.f14850d;
            int i = FinderTestNumFormat.f14837x;
            Editable text = ((MMEditText) ((C36570n) finderTestNumFormat.f14843t).getValue()).getText();
            Editable editable = null;
            boolean z = true;
            if (text != null) {
                if (!(text.length() > 0)) {
                    text = null;
                }
                if (!(text == null || (obj3 = text.toString()) == null)) {
                    this.f14851e.f27483d = Integer.parseInt(obj3);
                }
            }
            Editable text2 = ((MMEditText) ((C36570n) this.f14850d.f14844u).getValue()).getText();
            if (text2 != null) {
                if (!(text2.length() > 0)) {
                    text2 = null;
                }
                if (!(text2 == null || (obj2 = text2.toString()) == null)) {
                    this.f14852f.f27483d = Integer.parseInt(obj2);
                }
            }
            Editable text3 = ((MMEditText) ((C36570n) this.f14850d.f14845v).getValue()).getText();
            if (text3 != null) {
                if (text3.length() <= 0) {
                    z = false;
                }
                if (z) {
                    editable = text3;
                }
                if (!(editable == null || (obj = editable.toString()) == null)) {
                    this.f14853g.f27483d = Integer.parseInt(obj);
                }
            }
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_INT_SYNC, Integer.valueOf(this.f14851e.f27483d));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_COUNT_INT_SYNC, Integer.valueOf(this.f14852f.f27483d));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_SPEED_INT_SYNC, Integer.valueOf(this.f14853g.f27483d));
            C76912y0.makeText((Context) this.f14850d, (CharSequence) "设置成功", 0).show();
            this.f14850d.mo3116N7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTestNumFormat$initCommentConfig$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTestNumFormat$e */
    public static final class C3063e extends C87413o implements C32224a<MMEditText> {

        /* renamed from: d */
        public final /* synthetic */ FinderTestNumFormat f14854d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3063e(FinderTestNumFormat finderTestNumFormat) {
            super(0);
            this.f14854d = finderTestNumFormat;
        }

        public Object invoke() {
            return (MMEditText) this.f14854d.getContext().findViewById(C0966R.C0970id.iyo);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTestNumFormat$f */
    public static final class C3064f extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ FinderTestNumFormat f14855d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3064f(FinderTestNumFormat finderTestNumFormat) {
            super(0);
            this.f14855d = finderTestNumFormat;
        }

        public Object invoke() {
            return (TextView) this.f14855d.getContext().findViewById(C0966R.C0970id.e0_);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTestNumFormat$g */
    public static final class C3065g extends C87413o implements C32224a<MMEditText> {

        /* renamed from: d */
        public final /* synthetic */ FinderTestNumFormat f14856d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3065g(FinderTestNumFormat finderTestNumFormat) {
            super(0);
            this.f14856d = finderTestNumFormat;
        }

        public Object invoke() {
            return (MMEditText) this.f14856d.getContext().findViewById(C0966R.C0970id.iyq);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTestNumFormat$h */
    public static final class C3066h extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ FinderTestNumFormat f14857d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3066h(FinderTestNumFormat finderTestNumFormat) {
            super(0);
            this.f14857d = finderTestNumFormat;
        }

        public Object invoke() {
            return (TextView) this.f14857d.getContext().findViewById(C0966R.C0970id.izc);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTestNumFormat$i */
    public static final class C3067i extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ FinderTestNumFormat f14858d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3067i(FinderTestNumFormat finderTestNumFormat) {
            super(0);
            this.f14858d = finderTestNumFormat;
        }

        public Object invoke() {
            return this.f14858d.getContext().findViewById(C0966R.C0970id.hwl);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTestNumFormat$j */
    public static final class C3068j extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ FinderTestNumFormat f14859d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3068j(FinderTestNumFormat finderTestNumFormat) {
            super(0);
            this.f14859d = finderTestNumFormat;
        }

        public Object invoke() {
            return this.f14859d.getContext().findViewById(C0966R.C0970id.mmg);
        }
    }

    /* renamed from: N7 */
    public final void mo3116N7() {
        View view = (View) ((C36570n) this.f14842s).getValue();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderTestNumFormat", "initCommentConfig", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderTestNumFormat", "initCommentConfig", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C8478d0 d0Var = new C8478d0();
        d0Var.f27483d = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_INT_SYNC, 100);
        C8478d0 d0Var2 = new C8478d0();
        d0Var2.f27483d = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_COUNT_INT_SYNC, 2);
        C8478d0 d0Var3 = new C8478d0();
        d0Var3.f27483d = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_SPEED_INT_SYNC, 200);
        ((MMEditText) ((C36570n) this.f14843t).getValue()).setHint("间隔多少毫秒取评论（当前:" + d0Var.f27483d + 65289);
        ((MMEditText) ((C36570n) this.f14844u).getValue()).setHint("每次取多少条（当前:" + d0Var2.f27483d + 65289);
        ((MMEditText) ((C36570n) this.f14845v).getValue()).setHint("评论滑动速度,越大越慢（当前:" + d0Var3.f27483d + 65289);
        ((MMEditText) ((C36570n) this.f14843t).getValue()).setText("");
        ((MMEditText) ((C36570n) this.f14844u).getValue()).setText("");
        ((MMEditText) ((C36570n) this.f14845v).getValue()).setText("");
        ((View) ((C36570n) this.f14846w).getValue()).setOnClickListener(new C3062d(this, d0Var, d0Var2, d0Var3));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aip;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("SCENE_TEST_PAGE", 1);
        if (intExtra == 1) {
            View view = (View) ((C36570n) this.f14838o).getValue();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderTestNumFormat", "initTestNum", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderTestNumFormat", "initTestNum", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((MMEditText) ((C36570n) this.f14839p).getValue()).addTextChangedListener(new C14757e5(this));
        } else if (intExtra == 2) {
            mo3116N7();
        }
    }
}
