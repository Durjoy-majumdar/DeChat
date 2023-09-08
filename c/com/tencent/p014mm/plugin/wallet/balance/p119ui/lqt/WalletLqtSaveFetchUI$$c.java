package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import b63.C67183e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72478z;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import e63.C75556b;
import eb0.C75592q0;
import g63.C75886j;
import java.util.LinkedList;
import k53.C76492a;
import nj3.C11182m0;
import nj3.C76874e0;
import p755xs.C102720b;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$c */
public class WalletLqtSaveFetchUI$$c implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C76492a f208230d;

    /* renamed from: e */
    public final /* synthetic */ WalletLqtSaveFetchUI f208231e;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$c$a */
    public class C71767a implements C102720b.C78973a {

        /* renamed from: d */
        public final /* synthetic */ String f208232d;

        /* renamed from: e */
        public final /* synthetic */ C76874e0 f208233e;

        /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$c$a$a */
        public class C71768a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f208235d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f208236e;

            public C71768a(String str, Bitmap bitmap) {
                this.f208235d = str;
                this.f208236e = bitmap;
            }

            public void run() {
                int intValue;
                Log.m105925i("MicroMsg.WalletLqtSaveFetchUI", "dancy test get picture finish, notifyKey:%s, finalIconUrl:%s", this.f208235d, C71767a.this.f208232d);
                if (WalletLqtSaveFetchUI$$c.this.f208230d.mo106726a() && WalletLqtSaveFetchUI$$c.this.f208231e.f208194f1.containsKey(this.f208235d) && (intValue = WalletLqtSaveFetchUI$$c.this.f208231e.f208194f1.get(this.f208235d).intValue()) < C71767a.this.f208233e.size() && C71767a.this.f208233e.getItem(intValue) != null) {
                    C71767a.this.f208233e.getItem(intValue).setIcon(new BitmapDrawable(BitmapUtil.extractThumbNail(this.f208236e, WalletLqtSaveFetchUI$$c.this.f208231e.getResources().getDimensionPixelOffset(C0966R.dimen.atf), WalletLqtSaveFetchUI$$c.this.f208231e.getResources().getDimensionPixelOffset(C0966R.dimen.atf), true, false)));
                    WalletLqtSaveFetchUI$$c.this.f208230d.mo106727b();
                }
            }
        }

        public C71767a(String str, C76874e0 e0Var) {
            this.f208232d = str;
            this.f208233e = e0Var;
        }

        /* renamed from: j3 */
        public void mo24656j3(String str, Bitmap bitmap) {
            MMHandlerThread.postToMainThread(new C71768a(str, bitmap));
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$c$b */
    public class C71769b extends C72478z {

        /* renamed from: g */
        public final /* synthetic */ Bankcard f208238g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71769b(Context context, Bankcard bankcard) {
            super(context);
            this.f208238g = bankcard;
        }

        public void onClick(View view) {
            String str = this.f208238g.field_forbid_url;
            Intent intent = new Intent();
            Log.m105925i("MicroMsg.WalletLqtSaveFetchUI", "go to url %s", str);
            intent.putExtra("rawUrl", str);
            intent.putExtra("geta8key_username", C75592q0.m90789s());
            intent.putExtra("pay_channel", 1);
            C75228t.m90217J(WalletLqtSaveFetchUI$$c.this.f208231e.getContext(), intent);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$c$c */
    public class C71770c implements C72476y0.C72477a {

        /* renamed from: a */
        public final /* synthetic */ Bankcard f208240a;

        public C71770c(Bankcard bankcard) {
            this.f208240a = bankcard;
        }

        /* renamed from: a */
        public void mo66525a(View view) {
            C75228t.m90219L(WalletLqtSaveFetchUI$$c.this.f208231e.getContext(), this.f208240a.field_prompt_info_jump_url, true);
            C115669n.INSTANCE.mo160131h(20216, 2, this.f208240a.field_prompt_info_jump_url);
        }
    }

    public WalletLqtSaveFetchUI$$c(WalletLqtSaveFetchUI walletLqtSaveFetchUI, C76492a aVar) {
        this.f208231e = walletLqtSaveFetchUI;
        this.f208230d = aVar;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        SpannableStringBuilder spannableStringBuilder;
        int i;
        char c;
        char c2;
        Bitmap bitmap;
        char c3;
        Class cls = C102720b.class;
        int size = ((LinkedList) this.f208231e.f208219y0).size();
        int i2 = 0;
        while (i2 < size) {
            Bankcard bankcard = (Bankcard) ((LinkedList) this.f208231e.f208219y0).get(i2);
            C67183e c4 = C75556b.m90593c(this.f208231e, bankcard.field_bankcardType, bankcard.mo99394u2());
            String str = "";
            String str2 = c4 != null ? c4.f192875a : str;
            Bitmap N6 = ((C102720b) C86312j.m106911c(cls)).mo142104N6(new C75886j(str2));
            ((C102720b) C86312j.m106911c(cls)).Lu0(new C71767a(str2, e0Var));
            if (!Util.isNullOrNil(bankcard.field_forbidWord)) {
                str = bankcard.field_forbidWord;
            }
            if (Util.isNullOrNil(bankcard.field_forbid_title)) {
                spannableStringBuilder = new SpannableStringBuilder(str);
            } else {
                str = str + " ";
                spannableStringBuilder = new SpannableStringBuilder(str + bankcard.field_forbid_title);
                C71769b bVar = new C71769b(this.f208231e, bankcard);
                int length = str.length();
                int length2 = str.length() + bankcard.field_forbid_title.length();
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f208231e.getResources().getColor(C0966R.color.a1d)), length, length2, 33);
                spannableStringBuilder.setSpan(bVar, length, length2, 33);
            }
            if (Util.isNullOrNil((CharSequence) spannableStringBuilder) && !Util.isNullOrNil(bankcard.field_prompt_info_prompt_text)) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(bankcard.field_prompt_info_prompt_text);
                if (!Util.isNullOrNil(bankcard.field_prompt_info_jump_text) && !Util.isNullOrNil(bankcard.field_prompt_info_jump_url)) {
                    spannableStringBuilder2.append(bankcard.field_prompt_info_jump_text);
                    spannableStringBuilder2.setSpan(new C72476y0(2, (C72476y0.C72477a) new C71770c(bankcard)), bankcard.field_prompt_info_prompt_text.length(), spannableStringBuilder2.length(), 33);
                }
                spannableStringBuilder = spannableStringBuilder2;
            }
            String str3 = bankcard.field_desc;
            Bitmap bitmap2 = null;
            if (bankcard.mo99388n2()) {
                i = i2;
                if (bankcard.f209415j2 >= 0.0d) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    c3 = 0;
                    sb.append(this.f208231e.getString(C0966R.string.kld, new Object[]{C75228t.m90256l(bankcard.f209415j2)}));
                    str3 = sb.toString();
                } else {
                    c3 = 0;
                }
                Object[] objArr = new Object[3];
                objArr[c3] = Integer.valueOf(i);
                objArr[1] = str3;
                objArr[2] = spannableStringBuilder;
                Log.m105925i("MicroMsg.WalletLqtSaveFetchUI", "i %d fee %s %s", objArr);
                e0Var.mo107156p(i, str3, spannableStringBuilder, this.f208231e.getResources().getDrawable(C0966R.C0969drawable.cek), 0, !Util.isNullOrNil(str));
            } else {
                i = i2;
                if (N6 != null) {
                    c2 = 1;
                    c = 0;
                    bitmap = BitmapUtil.extractThumbNail(N6, this.f208231e.getResources().getDimensionPixelOffset(C0966R.dimen.atf), this.f208231e.getResources().getDimensionPixelOffset(C0966R.dimen.atf), true, false);
                } else {
                    c2 = 1;
                    c = 0;
                    bitmap = null;
                }
                Object[] objArr2 = new Object[3];
                objArr2[c] = Integer.valueOf(i);
                objArr2[c2] = str3;
                objArr2[2] = spannableStringBuilder;
                Log.m105925i("MicroMsg.WalletLqtSaveFetchUI", "i %d fee %s %s", objArr2);
                bitmap2 = bitmap;
                e0Var.mo107156p(i, str3, spannableStringBuilder, bitmap == null ? null : new BitmapDrawable(bitmap), 0, !Util.isNullOrNil(str));
            }
            if (bitmap2 == null) {
                this.f208231e.f208194f1.put(str2, Integer.valueOf(i));
            }
            i2 = i + 1;
        }
    }
}
