package v82;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d62.C75339i;
import di3.C86312j;
import eb0.C75592q0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import p196ln.C76705f;

/* renamed from: v82.q1 */
public final class C52797q1 extends RecyclerView.C16613e<C52799r1> {

    /* renamed from: d */
    public Context f147501d;

    /* renamed from: e */
    public final ArrayList<String> f147502e = new ArrayList<>();

    /* renamed from: f */
    public View.OnClickListener f147503f;

    /* renamed from: g */
    public final int f147504g = 1;

    public C52797q1(Context context) {
        C87412m.m108594g(context, "context");
        this.f147501d = context;
    }

    /* renamed from: F4 */
    public final boolean mo73614F4(String str) {
        T t;
        Iterator<T> it = this.f147502e.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b((String) t, str)) {
                break;
            }
        }
        return t != null;
    }

    /* renamed from: G4 */
    public final StringBuffer mo73615G4() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(MMApplicationContext.getString(C0966R.string.gzy));
        Iterator<String> it = this.f147502e.iterator();
        while (it.hasNext()) {
            String next = it.next();
            StringBuilder sb = new StringBuilder();
            C75339i iVar = (C75339i) C86312j.m106911c(C75339i.class);
            sb.append(iVar != null ? iVar.getDisplayName(next) : null);
            sb.append(',');
            stringBuffer.append(sb.toString());
        }
        return stringBuffer;
    }

    /* renamed from: O4 */
    public final int mo73616O4() {
        int i = C85875k4.m106184h(this.f147501d).x;
        int i2 = C111418b0.f333552m;
        return ((i - ((this.f147502e.size() * i2) + (C111418b0.f333545f * (this.f147502e.size() - 1)))) / 2) - i2;
    }

    /* renamed from: g5 */
    public final void mo73617g5(ArrayList<String> arrayList, View.OnClickListener onClickListener) {
        C87412m.m108594g(arrayList, "userNameList");
        C87412m.m108594g(onClickListener, "onClickListener");
        this.f147502e.clear();
        this.f147502e.add(C75592q0.m90789s());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = arrayList.get(i);
            C87412m.m108593f(str, "userNameList[i]");
            if (!mo73614F4(str) && !C87412m.m108589b(arrayList.get(i), C75592q0.m90789s())) {
                this.f147502e.add(arrayList.get(i));
            }
        }
        this.f147503f = onClickListener;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f147502e.size() + this.f147504g;
    }

    public int getItemViewType(int i) {
        return i == 0 ? 2 : 1;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        int i2;
        C52799r1 r1Var = (C52799r1) zVar;
        C87412m.m108594g(r1Var, "holder");
        int i3 = 0;
        if ((i == 0 ? (char) 2 : 1) == 1) {
            int i4 = i - 1;
            String str = this.f147502e.get(i4);
            C87412m.m108593f(str, "contactList[position - 1]");
            String str2 = str;
            View view = r1Var.f147506A;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/SmallAvatarAdapterInContactUI", "onBindViewHolder", "(Lcom/tencent/mm/plugin/multitalk/ui/widget/SmallAvatarHolderInContactUI;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/SmallAvatarAdapterInContactUI", "onBindViewHolder", "(Lcom/tencent/mm/plugin/multitalk/ui/widget/SmallAvatarHolderInContactUI;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int i5 = C111418b0.f333552m;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i5, i5);
            layoutParams.addRule(1);
            layoutParams.topMargin = C111418b0.f333546g;
            if (i4 != 0) {
                i2 = C111418b0.f333545f;
            } else {
                if (mo73616O4() >= 0) {
                    i3 = mo73616O4();
                }
                i2 = i3;
            }
            layoutParams.setMarginStart(i2);
            r1Var.f44854d.setLayoutParams(layoutParams);
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(r1Var.f147507z, str2);
            r1Var.f44854d.setTag(C0966R.C0970id.kea, ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str2));
            r1Var.f147507z.setOnClickListener(this.f147503f);
            return;
        }
        if ((i == 0 ? (char) 2 : 1) == 2 && this.f147502e.size() >= 5) {
            int i6 = C111418b0.f333552m;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i6 / 2, i6);
            layoutParams2.topMargin = C111418b0.f333546g;
            layoutParams2.setMarginStart(0);
            r1Var.f44854d.setLayoutParams(layoutParams2);
            r1Var.f147507z.setVisibility(8);
            View view3 = r1Var.f147506A;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/SmallAvatarAdapterInContactUI", "onBindViewHolder", "(Lcom/tencent/mm/plugin/multitalk/ui/widget/SmallAvatarHolderInContactUI;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/multitalk/ui/widget/SmallAvatarAdapterInContactUI", "onBindViewHolder", "(Lcom/tencent/mm/plugin/multitalk/ui/widget/SmallAvatarHolderInContactUI;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f147501d).inflate(C0966R.C0971layout.c05, viewGroup, false);
        C87412m.m108593f(inflate, "from(context).inflate(R.…atar_list, parent, false)");
        return new C52799r1(inflate);
    }
}
