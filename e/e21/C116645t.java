package e21;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import di3.C86312j;
import eb0.C31519v2;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p196ln.C76705f;
import p629ny.C76979h;

/* renamed from: e21.t */
public class C116645t extends RecyclerView.C16613e<C116646a> {

    /* renamed from: d */
    public Context f349765d;

    /* renamed from: e */
    public List<C116647b> f349766e;

    /* renamed from: f */
    public int f349767f;

    /* renamed from: e21.t$a */
    public static class C116646a extends RecyclerView.C16631z {

        /* renamed from: A */
        public TextView f349768A;

        /* renamed from: B */
        public CdnImageView f349769B;

        /* renamed from: C */
        public WalletTextView f349770C;

        /* renamed from: z */
        public View f349771z;

        public C116646a(View view) {
            super(view);
            this.f349771z = view;
            this.f349768A = (TextView) view.findViewById(C0966R.C0970id.f7g);
            this.f349769B = (CdnImageView) view.findViewById(C0966R.C0970id.bi_);
            this.f349770C = (WalletTextView) view.findViewById(C0966R.C0970id.f7h);
        }
    }

    /* renamed from: e21.t$b */
    public static class C116647b extends C116644q0 {

        /* renamed from: s */
        public boolean f349772s = false;

        public C116647b(C116644q0 q0Var) {
            this.f349753d = q0Var.f349753d;
            this.f349754e = q0Var.f349754e;
            this.f349755f = q0Var.f349755f;
            this.f349757h = q0Var.f349757h;
            this.f349758i = q0Var.f349758i;
            this.f349759j = q0Var.f349759j;
            this.f349760n = q0Var.f349760n;
            this.f349764r = q0Var.f349764r;
        }
    }

    public C116645t(Context context, int i) {
        this.f349765d = context;
        this.f349767f = i;
    }

    public int getItemCount() {
        return this.f349766e.size();
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        int i2 = i;
        C116646a aVar = (C116646a) zVar;
        List<C116647b> list = this.f349766e;
        if (list != null && i2 >= 0 && i2 < list.size()) {
            C116647b bVar = this.f349766e.get(i2);
            int b = C76577a.m92151b(this.f349765d, 16);
            int b2 = C76577a.m92151b(this.f349765d, 18);
            if (i2 == this.f349766e.size() - 1) {
                aVar.f349771z.setPadding(b, b2, b, b2);
                aVar.f349771z.setBackgroundResource(C0966R.C0969drawable.a9x);
            } else {
                aVar.f349771z.setPadding(b, b2, b, 0);
                aVar.f349771z.setBackgroundResource(C0966R.color.f2975b6);
            }
            View view = aVar.f349771z;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/collect/model/CollectQrcodePayerMsgAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/collect/model/CollectQrcodePayerMsgAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/collect/model/CollectQrcodePayerMsgAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/collect/model/CollectQrcodePayerMsgAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            String str = "";
            if (this.f349767f == 2) {
                aVar.f349769B.setRoundCorner(true);
                aVar.f349769B.setRoundCornerRate(0.1f);
                aVar.f349769B.mo100288c(bVar.f349764r, 0, 0, C0966R.C0969drawable.bfa);
            } else if (!Util.isNullOrNil(bVar.f349753d)) {
                aVar.f349769B.setVisibility(0);
                C86709a0.m107528h();
                C72996z1 H3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69656H3(bVar.f349753d);
                if (H3 == null || ((int) H3.f108320R1) <= 0) {
                    Log.m105918d("MicroMsg.CollectPayerMsgAdapter", "Receiver in contactStg and try to get contact");
                    C31519v2.m39436a().mo55988e(bVar.f349753d, str, new C86419s(this, Util.nowMilliSecond(), aVar, bVar));
                } else {
                    ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(aVar.f349769B, bVar.f349753d);
                }
            } else {
                aVar.f349769B.setVisibility(8);
            }
            String str2 = bVar.f349760n;
            if (Util.isNullOrNil(str2) && !Util.isNullOrNil(bVar.f349753d)) {
                str2 = C75228t.m90268r(bVar.f349753d);
            }
            aVar.f349768A.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f349765d, str2, aVar.f349768A.getTextSize()));
            int i3 = bVar.f349759j;
            if (i3 == 0) {
                str = this.f349765d.getString(C0966R.string.bgt);
            } else if (i3 == 1) {
                str = bVar.f349772s ? C75228t.m90258m(bVar.f349755f, bVar.f349756g) : this.f349765d.getString(C0966R.string.bgs);
            } else if (i3 == 2) {
                str = this.f349765d.getString(C0966R.string.bgr);
            }
            aVar.f349770C.setText(str);
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C116646a(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.b0j, viewGroup, false));
    }
}
