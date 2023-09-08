package com.tencent.p014mm.plugin.label.p067ui.searchContact;

import a22.C0008d;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.UpdateFtsSearchDataEvent;
import com.tencent.p014mm.autogen.events.UpdateSearchIndexAtOnceEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import f22.C58909a;
import f22.C58913e;
import f22.C7974f;
import f22.C7975g;
import f22.C7977i;
import f22.C7978j;
import f22.C7979k;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kotlin.Metadata;
import kv1.C61173o;
import lc3.C10485b;
import lv1.C10656l;
import ob0.C11385n;
import ob0.C117747y;
import p910lj.C76701a;
import pc0.C11884l;
import qo3.C47883u;
import qo3.C77407n;
import qo3.C77426q;
import qo3.C89779i0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import zb2.C103009m;
import zb2.C53769h;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000b¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/plugin/label/ui/searchContact/ContactManagerUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lob0/n;", "Lcom/tencent/mm/sdk/storage/MStorageEx$IOnStorageChange;", "Lkv1/o;", "Landroid/view/View;", "e", "Landroid/view/View;", "getMMainView", "()Landroid/view/View;", "setMMainView", "(Landroid/view/View;)V", "mMainView", "f", "getMEditFooter", "setMEditFooter", "mEditFooter", "h", "getMEmptyView", "setMEmptyView", "mEmptyView", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI */
public final class ContactManagerUI extends MMActivity implements C11385n, MStorageEx.IOnStorageChange, C61173o {

    /* renamed from: z */
    public static final /* synthetic */ int f19780z = 0;

    /* renamed from: d */
    public final int f19781d = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("MMBatchModContactTypeMaxNumForServer", 50);

    /* renamed from: e */
    public View f19782e;

    /* renamed from: f */
    public View f19783f;

    /* renamed from: g */
    public Button f19784g;

    /* renamed from: h */
    public View f19785h;

    /* renamed from: i */
    public WxRecyclerView f19786i;

    /* renamed from: j */
    public TextView f19787j;

    /* renamed from: n */
    public String f19788n = "";

    /* renamed from: o */
    public final MMHandler f19789o = new MMHandler();

    /* renamed from: p */
    public C89779i0 f19790p;

    /* renamed from: q */
    public final HashSet<String> f19791q = new HashSet<>();

    /* renamed from: r */
    public boolean f19792r;

    /* renamed from: s */
    public final MMHandler f19793s = new C4763e(this);

    /* renamed from: t */
    public final C13601g f19794t = C36568h.m40985a(new C4759a(this));

    /* renamed from: u */
    public final C13601g f19795u = C36568h.m40985a(new C4761c(this));

    /* renamed from: v */
    public WxLinearLayoutManager f19796v;

    /* renamed from: w */
    public final C13601g f19797w = C36568h.m40985a(new C4762d(this));

    /* renamed from: x */
    public final C13601g f19798x = C36568h.m40985a(new C4765g(this));

    /* renamed from: y */
    public final MenuItem.OnMenuItemClickListener f19799y = new C4764f(this);

    /* renamed from: com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI$a */
    public static final class C4759a extends C87413o implements C32224a<C58913e> {

        /* renamed from: d */
        public final /* synthetic */ ContactManagerUI f19800d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4759a(ContactManagerUI contactManagerUI) {
            super(0);
            this.f19800d = contactManagerUI;
        }

        public Object invoke() {
            ContactManagerUI contactManagerUI = this.f19800d;
            String str = contactManagerUI.f19788n;
            if (str != null) {
                return new C58913e(str, contactManagerUI.f19789o);
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI$b */
    public static final class C4760b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ContactManagerUI f19801d;

        public C4760b(ContactManagerUI contactManagerUI) {
            this.f19801d = contactManagerUI;
        }

        public final void onClick(View view) {
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/label/ui/searchContact/ContactManagerUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ContactManagerUI contactManagerUI = this.f19801d;
            ContactDataItemList I7 = contactManagerUI.mo5663I7();
            C87412m.m108591d(I7);
            ArrayList<C58909a> arrayList2 = I7.f19779y;
            if (!(arrayList2 == null || arrayList2.size() == 0)) {
                C77407n nVar = new C77407n((Context) contactManagerUI, 1, true);
                nVar.f225771i = new C7974f(contactManagerUI);
                String str2 = "";
                int i = 0;
                for (C58909a next : arrayList2) {
                    String str3 = null;
                    if (TextUtils.isEmpty(next.f168569j)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        C72996z1 z1Var = next.f168570n;
                        if (z1Var != null) {
                            str3 = z1Var.getNickname();
                        }
                        sb.append(str3);
                        str2 = sb.toString();
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str2);
                        C72996z1 z1Var2 = next.f168570n;
                        if (z1Var2 != null) {
                            str3 = z1Var2.getNickname();
                        }
                        sb4.append(str3);
                        sb4.append('@');
                        sb4.append(next.f168569j);
                        str2 = sb4.toString();
                    }
                    i++;
                    if (i < arrayList2.size()) {
                        str2 = str2 + 12289;
                    }
                }
                if (arrayList2.size() > 1) {
                    str = contactManagerUI.getString(C0966R.string.bia, new Object[]{String.valueOf(arrayList2.size()), str2});
                    C87412m.m108593f(str, "getString(R.string.del_c…ls.size.toString(), user)");
                } else if (arrayList2.size() == 1) {
                    str = contactManagerUI.getString(C0966R.string.bi_, new Object[]{str2});
                    C87412m.m108593f(str, "getString(R.string.del_contact_dialog_title, user)");
                } else {
                    str = "";
                }
                ((C119157j) C119157j.f356862d).mo183875f(new C7977i(3, ""));
                nVar.mo107568m(str, 17, C76577a.m92151b(contactManagerUI, 14));
                nVar.f225782p = new C7975g(contactManagerUI);
                nVar.mo107573q();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/searchContact/ContactManagerUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI$c */
    public static final class C4761c extends C87413o implements C32224a<ContactDataItemList> {

        /* renamed from: d */
        public final /* synthetic */ ContactManagerUI f19802d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4761c(ContactManagerUI contactManagerUI) {
            super(0);
            this.f19802d = contactManagerUI;
        }

        public Object invoke() {
            C58913e H7 = this.f19802d.mo5662H7();
            if (H7 == null) {
                return null;
            }
            return new ContactDataItemList(H7, new C53769h(), this.f19802d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI$d */
    public static final class C4762d extends C87413o implements C32224a<C103009m<C58909a>> {

        /* renamed from: d */
        public final /* synthetic */ ContactManagerUI f19803d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4762d(ContactManagerUI contactManagerUI) {
            super(0);
            this.f19803d = contactManagerUI;
        }

        public Object invoke() {
            ContactDataItemList I7 = this.f19803d.mo5663I7();
            if (I7 == null) {
                return null;
            }
            ContactManagerUI contactManagerUI = this.f19803d;
            contactManagerUI.getClass();
            C103009m mVar = new C103009m(I7, new ContactManagerUI$buildItemConvertFactory$1(contactManagerUI), false);
            mVar.setHasStableIds(true);
            return mVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI$e */
    public static final class C4763e extends MMHandler {

        /* renamed from: a */
        public final /* synthetic */ ContactManagerUI f19804a;

        public C4763e(ContactManagerUI contactManagerUI) {
            this.f19804a = contactManagerUI;
        }

        public void handleMessage(Message message) {
            C87412m.m108594g(message, "msg");
            int i = message.what;
            Log.m105919d("MicroMsg.Label.ContactLabelManagerUI", "handleMessage:%d", Integer.valueOf(i));
            if (i == 5001) {
                ContactManagerUI contactManagerUI = this.f19804a;
                int i2 = ContactManagerUI.f19780z;
                synchronized (contactManagerUI) {
                    UpdateSearchIndexAtOnceEvent updateSearchIndexAtOnceEvent = new UpdateSearchIndexAtOnceEvent();
                    updateSearchIndexAtOnceEvent.f9570d.f9571a = 0;
                    updateSearchIndexAtOnceEvent.publish();
                    new UpdateFtsSearchDataEvent().publish();
                    if (contactManagerUI.f19792r) {
                        MMHandler mMHandler = contactManagerUI.f19793s;
                        if (mMHandler != null) {
                            mMHandler.postDelayed(new C7978j(contactManagerUI), 500);
                        }
                    } else {
                        MMHandler mMHandler2 = contactManagerUI.f19793s;
                        if (mMHandler2 != null) {
                            mMHandler2.postDelayed(new C7979k(contactManagerUI), 100);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI$f */
    public static final class C4764f implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ ContactManagerUI f19805d;

        public C4764f(ContactManagerUI contactManagerUI) {
            this.f19805d = contactManagerUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f19805d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI$g */
    public static final class C4765g extends C87413o implements C32224a<C4768a> {

        /* renamed from: d */
        public final /* synthetic */ ContactManagerUI f19806d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4765g(ContactManagerUI contactManagerUI) {
            super(0);
            this.f19806d = contactManagerUI;
        }

        public Object invoke() {
            return new C4768a(this.f19806d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI$h */
    public static final class C4766h implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ ContactManagerUI f19807a;

        public C4766h(ContactManagerUI contactManagerUI) {
            this.f19807a = contactManagerUI;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            this.f19807a.hideVKB();
            if (!z) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/cgi-bin/mmsupport-bin/newreadtemplate?t=contact/faq1&wechat_real_lang=" + LocaleUtil.getCurrentLanguage(this.f19807a.getContext()));
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                C88144b.m109791i(this.f19807a.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI$i */
    public static final class C4767i implements C47883u {

        /* renamed from: a */
        public static final C4767i f19808a = new C4767i();

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
        }
    }

    /* renamed from: H0 */
    public void mo293H0(C10656l lVar) {
        mo5664J7();
    }

    /* renamed from: H7 */
    public final C58913e mo5662H7() {
        return (C58913e) ((C36570n) this.f19794t).getValue();
    }

    /* renamed from: I7 */
    public final ContactDataItemList mo5663I7() {
        return (ContactDataItemList) ((C36570n) this.f19795u).getValue();
    }

    /* renamed from: J7 */
    public final void mo5664J7() {
        Button button = this.f19784g;
        C87412m.m108591d(button);
        ContactDataItemList I7 = mo5663I7();
        C87412m.m108591d(I7);
        button.setEnabled(I7.f19778x.size() > 0);
        ContactDataItemList I72 = mo5663I7();
        C87412m.m108591d(I72);
        if (I72.f19778x.size() > 0) {
            Button button2 = this.f19784g;
            C87412m.m108591d(button2);
            button2.setTextColor(getResources().getColor(C0966R.color.a0u));
        } else {
            Button button3 = this.f19784g;
            C87412m.m108591d(button3);
            button3.setTextColor(getResources().getColor(C0966R.color.f3140go));
        }
        ContactDataItemList I73 = mo5663I7();
        C87412m.m108591d(I73);
        if (I73.f19778x.size() > 0) {
            Button button4 = this.f19784g;
            C87412m.m108591d(button4);
            StringBuilder sb = new StringBuilder();
            sb.append(getResources().getString(C0966R.string.f360335by3));
            sb.append(" (");
            ContactDataItemList I74 = mo5663I7();
            C87412m.m108591d(I74);
            sb.append(I74.f19778x.size());
            sb.append(')');
            button4.setText(sb.toString());
        } else {
            Button button5 = this.f19784g;
            C87412m.m108591d(button5);
            button5.setText(getResources().getString(C0966R.string.f360335by3));
        }
        TextView textView = this.f19787j;
        if (textView != null) {
            C87412m.m108591d(textView);
            textView.setVisibility(0);
            C58913e H7 = mo5662H7();
            ArrayList<String> arrayList = null;
            ArrayList<String> arrayList2 = H7 != null ? H7.f168595p : null;
            C87412m.m108591d(arrayList2);
            int size = arrayList2.size();
            if (size > 1) {
                TextView textView2 = this.f19787j;
                if (textView2 != null) {
                    Resources resources = getResources();
                    Object[] objArr = new Object[1];
                    C58913e H72 = mo5662H7();
                    if (H72 != null) {
                        arrayList = H72.f168595p;
                    }
                    C87412m.m108591d(arrayList);
                    objArr[0] = arrayList.get(0);
                    textView2.setText(resources.getString(C0966R.string.m1b, objArr));
                }
            } else if (size == 1) {
                TextView textView3 = this.f19787j;
                if (textView3 != null) {
                    Resources resources2 = getResources();
                    Object[] objArr2 = new Object[1];
                    C58913e H73 = mo5662H7();
                    if (H73 != null) {
                        arrayList = H73.f168595p;
                    }
                    C87412m.m108591d(arrayList);
                    objArr2[0] = arrayList.get(0);
                    textView3.setText(resources2.getString(C0966R.string.m1d, objArr2));
                }
            } else {
                TextView textView4 = this.f19787j;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
            }
        }
    }

    public int getCustomBounceId() {
        return C0966R.C0970id.lxp;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ck7;
    }

    public void initView() {
        String str;
        hideActionbarLine();
        String stringExtra = getIntent().getStringExtra("contact_search_query");
        this.f19788n = stringExtra;
        C87412m.m108591d(stringExtra);
        if (stringExtra.length() > 10) {
            StringBuilder sb = new StringBuilder();
            String str2 = this.f19788n;
            C87412m.m108591d(str2);
            String substring = str2.substring(0, 11);
            C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append("...");
            str = getString(C0966R.string.bi7, new Object[]{sb.toString()});
            C87412m.m108593f(str, "{\n            getString(…0, 11) + \"...\")\n        }");
        } else {
            str = getString(C0966R.string.bi7, new Object[]{this.f19788n});
            C87412m.m108593f(str, "{\n            getString(…e_title, query)\n        }");
        }
        setMMTitle(str);
        setBackBtn(this.f19799y, C0966R.raw.actionbar_icon_dark_back);
        this.f19782e = findViewById(C0966R.C0970id.f358497fh1);
        this.f19785h = findViewById(C0966R.C0970id.fgt);
        this.f19786i = (WxRecyclerView) findViewById(C0966R.C0970id.lxp);
        this.f19787j = (TextView) findViewById(C0966R.C0970id.m9i);
        this.f19796v = new WxLinearLayoutManager(this);
        WxRecyclerView wxRecyclerView = this.f19786i;
        C87412m.m108591d(wxRecyclerView);
        wxRecyclerView.setLayoutManager(this.f19796v);
        WxRecyclerView wxRecyclerView2 = this.f19786i;
        C87412m.m108591d(wxRecyclerView2);
        wxRecyclerView2.setHasFixedSize(true);
        this.f19783f = findViewById(C0966R.C0970id.cau);
        Button button = (Button) findViewById(C0966R.C0970id.c1h);
        this.f19784g = button;
        if (button != null) {
            button.setOnClickListener(new C4760b(this));
        }
        WxRecyclerView wxRecyclerView3 = this.f19786i;
        C87412m.m108591d(wxRecyclerView3);
        wxRecyclerView3.setAdapter((C103009m) ((C36570n) this.f19797w).getValue());
        C58913e H7 = mo5662H7();
        if (H7 != null) {
            H7.f168589g = mo5663I7();
        }
        C58913e H72 = mo5662H7();
        if (H72 != null) {
            H72.f168590h = this;
        }
        C103009m mVar = (C103009m) ((C36570n) this.f19797w).getValue();
        if (mVar != null) {
            mVar.f165746y = (C4768a) ((C36570n) this.f19798x).getValue();
        }
        Button button2 = this.f19784g;
        if (button2 != null) {
            button2.setEnabled(false);
        }
        C0008d.m0a((long) getIntent().getIntExtra("key_label_click_source", 0), 1, 0, 0, 0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        removeAllOptionMenu();
        View view = this.f19783f;
        C87412m.m108591d(view);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/label/ui/searchContact/ContactManagerUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/label/ui/searchContact/ContactManagerUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        Button button = this.f19784g;
        C87412m.m108591d(button);
        button.setEnabled(false);
        Button button2 = this.f19784g;
        C87412m.m108591d(button2);
        button2.setTextColor(getResources().getColor(C0966R.color.f3140go));
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().add(this);
        C86709a0.m107529k().f251779b.mo123455a(3990, this);
    }

    public void onDestroy() {
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().remove(this);
        C86709a0.m107529k().f251779b.mo123470p(3990, this);
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        if (i != 4 || keyEvent.getAction() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        finish();
        return true;
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        C87412m.m108594g(mStorageEx, "stg");
        C87412m.m108594g(obj, "obj");
        Log.m105919d("MicroMsg.Label.ContactLabelManagerUI", "event:%d, obj:%s", Integer.valueOf(i), obj);
        MMHandler mMHandler = this.f19793s;
        if (mMHandler != null) {
            mMHandler.removeMessages(5001);
            this.f19793s.sendEmptyMessageDelayed(5001, 400);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        Log.m105925i("MicroMsg.Label.ContactLabelManagerUI", "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (yVar instanceof C11884l) {
            C89779i0 i0Var = this.f19790p;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f19790p = null;
            }
            if (i == 0 && i2 == 0) {
                C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.bi8), 0).show();
                C11884l lVar = (C11884l) yVar;
                this.f19791q.addAll(lVar.f34722e);
                C58913e H7 = mo5662H7();
                if (H7 != null) {
                    HashSet<String> hashSet = this.f19791q;
                    C87412m.m108594g(hashSet, "<set-?>");
                    H7.f168588f = hashSet;
                }
                List<String> list = lVar.f34722e;
                C87412m.m108593f(list, "scene.names");
                ContactDataItemList I7 = mo5663I7();
                C87412m.m108591d(I7);
                I7.f19778x.removeAll(list);
                mo5664J7();
                this.f19792r = true;
            } else if (i2 == -3503) {
                C77426q qVar = new C77426q(this);
                qVar.mo107595g(Util.nullAs(yVar.getReqResp().getRespObj().getErrMsg(), getString(C0966R.string.bi6)));
                qVar.mo107589a(true);
                qVar.mo107598j(getString(C0966R.string.hn8));
                qVar.mo107601m(C0966R.string.hn9);
                qVar.mo107590b(new C4766h(this));
                qVar.mo107603o();
            } else {
                C77426q qVar2 = new C77426q(this);
                if (i2 == -3500) {
                    C11884l lVar2 = (C11884l) yVar;
                    str2 = getString(C0966R.string.bi4, new Object[]{Integer.valueOf(lVar2.f34728n - ((LinkedList) lVar2.f34722e).size())});
                } else {
                    str2 = yVar.getReqResp().getRespObj().getErrMsg();
                    if (Util.isNullOrNil(str2)) {
                        str2 = ((C11884l) yVar).mo11760j1() == null ? getString(C0966R.string.bi5) : getString(C0966R.string.bi6);
                    }
                }
                qVar2.mo107595g(str2);
                qVar2.mo107601m(C0966R.string.a18);
                qVar2.mo107600l(C4767i.f19808a);
                qVar2.mo107603o();
            }
        }
    }

    public final void setMEditFooter(View view) {
        this.f19783f = view;
    }

    public final void setMEmptyView(View view) {
        this.f19785h = view;
    }

    public final void setMMainView(View view) {
        this.f19782e = view;
    }
}
