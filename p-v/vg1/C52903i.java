package vg1;

import ak1.C54116w;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import bl1.C39775b;
import cl1.C39975j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86312j;
import er1.C58739j4;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: vg1.i */
public final class C52903i {

    /* renamed from: a */
    public final FinderLiveBoxCommentPlugin f147735a;

    /* renamed from: b */
    public final String f147736b = "BoxCommentViewCallback";

    /* renamed from: c */
    public final C13601g f147737c;

    /* renamed from: d */
    public final C13601g f147738d;

    /* renamed from: vg1.i$a */
    public static final class C52904a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C52903i f147739d;

        public C52904a(C52903i iVar) {
            this.f147739d = iVar;
        }

        public final void onClick(View view) {
            List<C39775b> list;
            Class cls = C39975j.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/comment/BoxCommentViewCallback$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Object value = ((C36570n) this.f147739d.f147737c).getValue();
            C87412m.m108593f(value, "<get-newTipGroup>(...)");
            ((ViewGroup) value).setVisibility(8);
            try {
                if (((C39975j) this.f147739d.mo73686a(cls)).f107175r > 0) {
                    int i = ((C39975j) this.f147739d.mo73686a(cls)).f107172o;
                    int b1 = this.f147739d.f147735a.mo64544b1() - 1;
                    int i2 = i + 1;
                    int i3 = ((C39975j) this.f147739d.mo73686a(cls)).f107175r;
                    if (i2 <= i3 && i3 <= b1) {
                        this.f147739d.f147735a.mo64545c1().mo73680g(((C39975j) this.f147739d.mo73686a(cls)).f107175r, Boolean.TRUE);
                        WxRecyclerAdapter<C39775b> wxRecyclerAdapter = this.f147739d.f147735a.f111638w;
                        if (wxRecyclerAdapter == null || (list = wxRecyclerAdapter.getData()) == null) {
                            list = new ArrayList<>();
                        }
                        C39775b bVar = list.get(((C39975j) this.f147739d.mo73686a(cls)).f107175r);
                        ((C54116w) C86312j.m106911c(C54116w.class)).zy0(bVar.mo62408b(), 1, bVar.mo62407a());
                    } else {
                        this.f147739d.f147735a.mo64545c1().mo73679f(Boolean.FALSE);
                    }
                    ((C39975j) this.f147739d.mo73686a(cls)).mo62585m3(0);
                } else {
                    this.f147739d.f147735a.mo64545c1().mo73679f(Boolean.FALSE);
                }
            } catch (Exception e) {
                C58739j4 j4Var = C58739j4.f168176a;
                j4Var.mo83712h0(e, this.f147739d.f147736b + "-newTipGroupClick");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/comment/BoxCommentViewCallback$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: vg1.i$b */
    public static final class C52905b extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C52903i f147740d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52905b(C52903i iVar) {
            super(0);
            this.f147740d = iVar;
        }

        public Object invoke() {
            return (ViewGroup) this.f147740d.f147735a.f166287d.findViewById(C0966R.C0970id.maq);
        }
    }

    /* renamed from: vg1.i$c */
    public static final class C52906c extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C52903i f147741d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52906c(C52903i iVar) {
            super(0);
            this.f147741d = iVar;
        }

        public Object invoke() {
            return (TextView) this.f147741d.f147735a.f166287d.findViewById(C0966R.C0970id.mar);
        }
    }

    public C52903i(FinderLiveBoxCommentPlugin finderLiveBoxCommentPlugin) {
        C87412m.m108594g(finderLiveBoxCommentPlugin, "plugin");
        this.f147735a = finderLiveBoxCommentPlugin;
        C13601g a = C36568h.m40985a(new C52905b(this));
        this.f147737c = a;
        this.f147738d = C36568h.m40985a(new C52906c(this));
        Object value = ((C36570n) a).getValue();
        C87412m.m108593f(value, "<get-newTipGroup>(...)");
        ((ViewGroup) value).setOnClickListener(new C52904a(this));
    }

    /* renamed from: a */
    public final <T extends C39622i0> T mo73686a(Class<T> cls) {
        C87412m.m108594g(cls, "bu");
        return this.f147735a.mo87684A0().mo71262a(cls);
    }

    /* renamed from: b */
    public final void mo73687b(long j) {
        String str;
        if (j > 0) {
            Object value = ((C36570n) this.f147737c).getValue();
            C87412m.m108593f(value, "<get-newTipGroup>(...)");
            ((ViewGroup) value).setVisibility(0);
            if (((C39975j) mo73686a(C39975j.class)).f107175r > 0) {
                Object value2 = ((C36570n) this.f147738d).getValue();
                C87412m.m108593f(value2, "<get-newTipTv>(...)");
                String string = this.f147735a.f166287d.getContext().getResources().getString(C0966R.string.djg);
                C87412m.m108593f(string, "plugin.root.context.reso…_live_comment_at_me_tips)");
                String format = String.format(string, Arrays.copyOf(new Object[0], 0));
                C87412m.m108593f(format, "format(format, *args)");
                ((TextView) value2).setText(format);
                return;
            }
            if (j <= 99) {
                str = String.valueOf(j);
            } else {
                str = this.f147735a.f166287d.getContext().getResources().getString(C0966R.string.f360643m41);
                C87412m.m108593f(str, "{\n                    pl…nt_tip)\n                }");
            }
            Object value3 = ((C36570n) this.f147738d).getValue();
            C87412m.m108593f(value3, "<get-newTipTv>(...)");
            String string2 = this.f147735a.f166287d.getContext().getResources().getString(C0966R.string.f360644dz0);
            C87412m.m108593f(string2, "plugin.root.context.reso…der_live_new_comment_tip)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{str}, 1));
            C87412m.m108593f(format2, "format(format, *args)");
            ((TextView) value3).setText(format2);
            return;
        }
        Object value4 = ((C36570n) this.f147737c).getValue();
        C87412m.m108593f(value4, "<get-newTipGroup>(...)");
        ((ViewGroup) value4).setVisibility(8);
    }
}
