package com.tencent.p014mm.p136ui.bizchat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.contact.C44880n1;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.p136ui.contact.C74526m1;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C75339i;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ke3.C88144b;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import p910lj.C76701a;
import qo3.C89779i0;
import rb0.C47964c0;
import rb0.C48009v0;
import sb0.C48334c;
import sb0.C48353j;
import sb0.C48359n;
import sj3.C13689q;
import sj3.C13690r;
import sj3.C13691s;
import sj3.C48399b0;
import sj3.C48409u;
import sj3.C77716a;
import wd3.C78575u;

@C88989a(19)
/* renamed from: com.tencent.mm.ui.bizchat.BizChatSelectConversationUI */
public class BizChatSelectConversationUI extends MMBaseSelectContactUI implements C47964c0 {

    /* renamed from: H */
    public static final /* synthetic */ int f121434H = 0;

    /* renamed from: C */
    public String f121435C = null;

    /* renamed from: D */
    public int f121436D = 0;

    /* renamed from: E */
    public TextView f121437E;

    /* renamed from: F */
    public C48353j f121438F;

    /* renamed from: G */
    public C89779i0 f121439G = null;

    /* renamed from: com.tencent.mm.ui.bizchat.BizChatSelectConversationUI$a */
    public class C44745a implements View.OnClickListener {
        public C44745a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/bizchat/BizChatSelectConversationUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BizChatSelectConversationUI bizChatSelectConversationUI = BizChatSelectConversationUI.this;
            int i = BizChatSelectConversationUI.f121434H;
            bizChatSelectConversationUI.getClass();
            C48353j jVar = C48009v0.Bx0().get(C48009v0.Bx0().mo73076Pk(bizChatSelectConversationUI.f121435C));
            bizChatSelectConversationUI.f121438F = jVar;
            if (jVar == null || Util.isNullOrNil(jVar.field_addMemberUrl)) {
                Object[] objArr = new Object[1];
                C48353j jVar2 = bizChatSelectConversationUI.f121438F;
                objArr[0] = jVar2 != null ? jVar2.field_addMemberUrl : null;
                Log.m105925i("MicroMsg.BizChatSelectConversationUI", "field_addMemberUrl:%s", objArr);
                C76701a.makeText((Context) bizChatSelectConversationUI, (CharSequence) bizChatSelectConversationUI.getString(C0966R.string.ark), 0).show();
            } else {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", bizChatSelectConversationUI.f121438F.field_addMemberUrl);
                Log.m105925i("MicroMsg.BizChatSelectConversationUI", "KRawUrl :%s", bizChatSelectConversationUI.f121438F.field_addMemberUrl);
                intent.putExtra("useJs", true);
                C88144b.m109795m(bizChatSelectConversationUI.getContext(), "webview", ".ui.tools.WebViewUI", intent, 1);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/bizchat/BizChatSelectConversationUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: L7 */
    public C74526m1 mo64513L7() {
        mo69999i8();
        return new C48399b0(this, (List<String>) null, false, this.f121435C);
    }

    /* renamed from: M7 */
    public C74498h1 mo64514M7() {
        mo69999i8();
        return new C44880n1(this, (List<String>) null, false, this.f121435C);
    }

    /* renamed from: Q7 */
    public String mo64516Q7() {
        return ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(this.f121435C);
    }

    /* renamed from: R7 */
    public void mo64517R7(AdapterView<?> adapterView, View view, int i, long j) {
        if (i < this.f218605d.getHeaderViewsCount()) {
            Log.m105925i("MicroMsg.BizChatSelectConversationUI", "Click HeaderView position=%d", Integer.valueOf(i));
        } else if (!(this.f218605d.getAdapter().getItem(i) instanceof C77716a)) {
            Log.m105928w("MicroMsg.BizChatSelectConversationUI", "Click HeaderView not BizChatConvDataItem");
        } else {
            C77716a aVar = (C77716a) this.f218605d.getAdapter().getItem(i);
            if (aVar != null) {
                String str = aVar.f222602y;
                long j2 = aVar.f226506C;
                if (str == null || j2 == -1) {
                    Log.m105925i("MicroMsg.BizChatSelectConversationUI", "onclick err userName:%s,bizChatId:%s", str, Long.valueOf(j2));
                    return;
                }
                mo69998g8(str, j2, aVar.f222601x);
            }
        }
    }

    /* renamed from: V7 */
    public boolean mo64519V7() {
        return false;
    }

    /* renamed from: W7 */
    public boolean mo64520W7() {
        return false;
    }

    /* renamed from: Z7 */
    public void mo66629Z7() {
        super.mo66629Z7();
    }

    /* renamed from: b8 */
    public void mo64526b8(ListView listView, int i) {
        if (this.f121437E == null) {
            C44745a aVar = new C44745a();
            String string = getString(C0966R.string.ij8);
            View inflate = C85868k2.m106137b(this).inflate(C0966R.C0971layout.ayl, (ViewGroup) null);
            inflate.setOnClickListener(aVar);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.bsk);
            textView.setText(string);
            listView.addHeaderView(inflate);
            this.f121437E = textView;
        }
        this.f121437E.setVisibility(i);
    }

    /* renamed from: c7 */
    public void mo7311c7(int i, C117747y yVar) {
        C89779i0 i0Var = this.f121439G;
        if (i0Var != null && i0Var.isShowing()) {
            this.f121439G.dismiss();
            this.f121439G = null;
        }
        if (yVar.getType() == 1355) {
            C48334c Lo = C48009v0.Ax0().mo73039Lo(((C48359n) yVar).mo73080j1().f144378e.f143623d.f144611d);
            if (Lo == null) {
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) getString(C0966R.string.i5q), 0).show();
            } else {
                mo69998g8(this.f121435C, Lo.field_bizChatLocalId, Lo.field_chatName);
            }
        }
    }

    /* renamed from: g8 */
    public final void mo69998g8(String str, long j, CharSequence charSequence) {
        String str2 = str;
        long j2 = j;
        CharSequence charSequence2 = charSequence;
        Log.m105925i("MicroMsg.BizChatSelectConversationUI", "doClickUser=%s", str2);
        int i = this.f121436D;
        if (i == 2) {
            if (getIntent().getBooleanExtra("enterprise_extra_params", true)) {
                C78575u.m94955x(this.mController, j, getString(C0966R.string.i4d), charSequence2 + "", (String) null, getString(C0966R.string.a2s), new C13689q(this, str2, j2));
                return;
            }
            C78575u.m94955x(this.mController, j, getString(C0966R.string.i4d), charSequence2 + "", (String) null, getString(C0966R.string.a2s), new C13690r(this, str2, j2));
        } else if (i == 1) {
            HashMap hashMap = (HashMap) getIntent().getSerializableExtra("enterprise_extra_params");
            C78575u.m94943l(getController(), (String) hashMap.get(FFmpegMetadataRetriever.METADATA_KEY_TITLE), (String) hashMap.get("img_url"), (String) hashMap.get("desc"), (String) null, true, getResources().getString(C0966R.string.a2s), new C13691s(this, str2, j2));
        }
    }

    /* renamed from: i8 */
    public final void mo69999i8() {
        if (Util.isNullOrNil(this.f121435C)) {
            String stringExtra = getIntent().getStringExtra("enterprise_biz_name");
            this.f121435C = stringExtra;
            if (Util.isNullOrNil(stringExtra)) {
                Log.m105920e("MicroMsg.BizChatSelectConversationUI", "brandUserName is null");
                finish();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            super.onActivityResult(r8, r9, r10)
            r0 = -1
            if (r9 == r0) goto L_0x0007
            return
        L_0x0007:
            r9 = 1
            if (r8 == r9) goto L_0x000b
            return
        L_0x000b:
            java.lang.String r8 = "result_data"
            android.os.Bundle r8 = r10.getBundleExtra(r8)
            r10 = 0
            if (r8 == 0) goto L_0x0077
            java.lang.String r0 = "MicroMsg.BizChatSelectConversationUI"
            java.lang.String r1 = "bundle != null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.lang.String r0 = "enterprise_members"
            java.lang.String r8 = r8.getString(r0)
            te3.vq1 r0 = new te3.vq1
            r0.<init>()
            sb0.c r1 = new sb0.c
            r1.<init>()
            sb0.j r2 = r7.f121438F
            r3 = 0
            if (r2 == 0) goto L_0x0033
            java.lang.String r2 = r2.field_addMemberUrl
            goto L_0x0034
        L_0x0033:
            r2 = r3
        L_0x0034:
            r1.field_addMemberUrl = r2
            java.lang.String r2 = r7.f121435C
            r1.field_brandUserName = r2
            boolean r8 = sb0.C48340e.m53660a(r1, r8, r3, r0)
            if (r8 == 0) goto L_0x0077
            long r2 = r1.field_bizChatLocalId
            r4 = -1
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x0050
            java.lang.String r8 = r7.f121435C
            java.lang.String r0 = r1.field_chatName
            r7.mo69998g8(r8, r2, r0)
            goto L_0x0078
        L_0x0050:
            sb0.h r8 = rb0.C48009v0.yx0()
            java.lang.String r1 = r7.f121435C
            sb0.n r8 = r8.mo73058e(r1, r0, r7)
            r0 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r2 = r7.getString(r0)
            r0 = 2131820761(0x7f1100d9, float:1.9274246E38)
            java.lang.String r3 = r7.getString(r0)
            r4 = 1
            r5 = 1
            sj3.t r6 = new sj3.t
            r6.<init>(r7, r8)
            r1 = r7
            qo3.i0 r8 = nj3.C76879j.m92723Q(r1, r2, r3, r4, r5, r6)
            r7.f121439G = r8
            goto L_0x0078
        L_0x0077:
            r9 = 0
        L_0x0078:
            if (r9 != 0) goto L_0x0088
            r8 = 2131834918(0x7f113826, float:1.930296E38)
            java.lang.String r8 = r7.getString(r8)
            android.widget.Toast r8 = p910lj.C76701a.makeText((android.content.Context) r7, (java.lang.CharSequence) r8, (int) r10)
            r8.show()
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.bizchat.BizChatSelectConversationUI.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        C48353j jVar;
        super.onCreate(bundle);
        boolean z = true;
        this.f121436D = getIntent().getIntExtra("biz_chat_scene", 1);
        mo69999i8();
        String Pk = C48009v0.Bx0().mo73076Pk(this.f121435C);
        C48353j jVar2 = C48009v0.Bx0().get(Pk);
        this.f121438F = jVar2;
        Object[] objArr = new Object[3];
        objArr[0] = this.f121435C;
        objArr[1] = Pk;
        if (jVar2 != null) {
            z = false;
        }
        objArr[2] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.BizChatSelectConversationUI", "updateBizChatMyUserInfo: %s:%s,myBizChatUserInfo is null:%s", objArr);
        if (Util.isNullOrNil(Pk) || (jVar = this.f121438F) == null || jVar.mo73074m2() || Util.isNullOrNil(this.f121438F.field_addMemberUrl)) {
            C48009v0.yx0().mo73062h(this.f121435C, this);
            this.f121439G = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new C48409u(this));
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
