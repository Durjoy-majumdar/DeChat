package ig0;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.account.friend.p022ui.FindMContactInviteUI;
import com.tencent.wxmm.v2helper;
import f40.C86709a0;
import f40.C86718e;
import hg0.C76176q;
import hg0.C8525u0;
import java.util.ArrayList;
import java.util.LinkedList;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import wg0.C78595a;

/* renamed from: ig0.f */
public class C76340f implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FindMContactInviteUI f223593d;

    /* renamed from: ig0.f$a */
    public class C76341a implements C11385n {
        public C76341a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            ProgressDialog progressDialog = C76340f.this.f223593d.f196570g;
            if (progressDialog != null) {
                progressDialog.dismiss();
                C76340f.this.f223593d.f196570g = null;
            }
            if (C76340f.this.f223593d.f196578r != null) {
                C86709a0.m107524d().mo123470p(v2helper.EMethodSetSendToNetworkOn, C76340f.this.f223593d.f196578r);
                C76340f.this.f223593d.f196578r = null;
            }
            FindMContactInviteUI findMContactInviteUI = C76340f.this.f223593d;
            C78595a.m94985e(findMContactInviteUI.f196582v);
            findMContactInviteUI.hideVKB();
            findMContactInviteUI.mo7681K7(1);
        }
    }

    /* renamed from: ig0.f$b */
    public class C76342b implements DialogInterface.OnCancelListener {
        public C76342b(C76340f fVar) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    public C76340f(FindMContactInviteUI findMContactInviteUI) {
        this.f223593d = findMContactInviteUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f223593d.f196580t == 1) {
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(C76340f.class.getName());
            sb.append(",");
            sb.append("R300_500_QQ");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("R300_500_QQ"));
            sb.append(",");
            sb.append(3);
            C78595a.m94982b(10645, sb.toString());
        } else {
            StringBuilder sb4 = new StringBuilder();
            C86709a0.m107523b();
            sb4.append(C86718e.m107547e());
            sb4.append(",");
            sb4.append(C76340f.class.getName());
            sb4.append(",");
            sb4.append("R300_500_phone");
            sb4.append(",");
            C86709a0.m107523b();
            sb4.append(C86718e.m107548f("R300_500_phone"));
            sb4.append(",");
            sb4.append(3);
            C78595a.m94982b(10645, sb4.toString());
        }
        C89137b0 d = C86709a0.m107524d();
        FindMContactInviteUI findMContactInviteUI = this.f223593d;
        C76341a aVar = new C76341a();
        findMContactInviteUI.f196578r = aVar;
        d.mo123455a(v2helper.EMethodSetSendToNetworkOn, aVar);
        FindMContactInviteUI findMContactInviteUI2 = this.f223593d;
        findMContactInviteUI2.f196570g = C76879j.m92723Q(findMContactInviteUI2.getContext(), this.f223593d.getString(C0966R.string.a3h), this.f223593d.getString(C0966R.string.cww), true, true, new C76342b(this));
        FindMContactInviteUI findMContactInviteUI3 = this.f223593d;
        C76176q qVar = findMContactInviteUI3.f196569f;
        String str = findMContactInviteUI3.f196577q;
        qVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < ((LinkedList) qVar.f223193h).size(); i2++) {
            if (qVar.f223194i[i2] == 2) {
                arrayList.add(((String[]) ((LinkedList) qVar.f223193h).get(i2))[0]);
            }
        }
        C86709a0.m107524d().mo123460f(new C8525u0(str, arrayList));
    }
}
