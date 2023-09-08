package com.tencent.p014mm.plugin.brandservice.p028ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import kotlin.Metadata;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import nr3.C89059e;
import nr3.C89060f;
import org.json.JSONObject;
import p629ny.C76979h;
import qo3.C77407n;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/ShowAppMsgContentUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.ShowAppMsgContentUI */
public final class ShowAppMsgContentUI extends MMActivity {

    /* renamed from: d */
    public final String f50172d = "MicroMsg.ShowAppMsgContentUI";

    /* renamed from: e */
    public final int f50173e = 1;

    /* renamed from: f */
    public final C13601g f50174f = C36568h.m40985a(new C18168a(this));

    /* renamed from: g */
    public final C13601g f50175g = C36568h.m40985a(new C18169b(this));

    /* renamed from: h */
    public C72963f4 f50176h;

    /* renamed from: i */
    public C89779i0 f50177i;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.ShowAppMsgContentUI$a */
    public static final class C18168a extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ ShowAppMsgContentUI f50178d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18168a(ShowAppMsgContentUI showAppMsgContentUI) {
            super(0);
            this.f50178d = showAppMsgContentUI;
        }

        public Object invoke() {
            return (TextView) this.f50178d.findViewById(C0966R.C0970id.bsk);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.ShowAppMsgContentUI$b */
    public static final class C18169b extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ ShowAppMsgContentUI f50179d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18169b(ShowAppMsgContentUI showAppMsgContentUI) {
            super(0);
            this.f50179d = showAppMsgContentUI;
        }

        public Object invoke() {
            return Long.valueOf(this.f50179d.getIntent().getLongExtra("Chat_Msg_Id", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.ShowAppMsgContentUI$c */
    public static final class C18170c<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ ShowAppMsgContentUI f50180a;

        public C18170c(ShowAppMsgContentUI showAppMsgContentUI) {
            this.f50180a = showAppMsgContentUI;
        }

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            try {
                C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
                ShowAppMsgContentUI showAppMsgContentUI = this.f50180a;
                StringBuilder sb = new StringBuilder();
                sb.append(ShowAppMsgContentUI.m18781H7(this.f50180a));
                sb.append(10);
                C72963f4 f4Var = this.f50180a.f50176h;
                if (f4Var != null) {
                    sb.append(f4Var.getContent());
                    return hVar.mo107078or(showAppMsgContentUI, sb.toString(), (int) ((TextView) ((C36570n) this.f50180a.f50174f).getValue()).getTextSize(), 1, (Object) null, (String) null);
                }
                C87412m.m108603p("msgInfo");
                throw null;
            } catch (Exception e) {
                String str = this.f50180a.f50172d;
                Log.m105920e(str, "spanForTextViewWithExtra ex: " + e.getMessage());
                return "";
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.ShowAppMsgContentUI$d */
    public static final class C18171d<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ ShowAppMsgContentUI f50181a;

        public C18171d(ShowAppMsgContentUI showAppMsgContentUI) {
            this.f50181a = showAppMsgContentUI;
        }

        public Object call(Object obj) {
            CharSequence charSequence = (CharSequence) obj;
            TextView textView = (TextView) ((C36570n) this.f50181a.f50174f).getValue();
            if (textView != null) {
                textView.setText(charSequence);
            }
            C89779i0 i0Var = this.f50181a.f50177i;
            if (i0Var == null) {
                return null;
            }
            i0Var.dismiss();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.ShowAppMsgContentUI$e */
    public static final class C18172e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ ShowAppMsgContentUI f50182d;

        public C18172e(ShowAppMsgContentUI showAppMsgContentUI) {
            this.f50182d = showAppMsgContentUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f50182d.hideVKB();
            this.f50182d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.ShowAppMsgContentUI$f */
    public static final class C18173f implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ ShowAppMsgContentUI f50183d;

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.ShowAppMsgContentUI$f$a */
        public static final class C18174a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ ShowAppMsgContentUI f50184d;

            public C18174a(ShowAppMsgContentUI showAppMsgContentUI) {
                this.f50184d = showAppMsgContentUI;
            }

            public final void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.mo107125a(this.f50184d.f50173e, C0966R.string.f7936wt);
            }
        }

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.ShowAppMsgContentUI$f$b */
        public static final class C18175b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ ShowAppMsgContentUI f50185d;

            public C18175b(ShowAppMsgContentUI showAppMsgContentUI) {
                this.f50185d = showAppMsgContentUI;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                int itemId = menuItem.getItemId();
                ShowAppMsgContentUI showAppMsgContentUI = this.f50185d;
                if (itemId == showAppMsgContentUI.f50173e) {
                    Context context = MMApplicationContext.getContext();
                    C72963f4 f4Var = this.f50185d.f50176h;
                    if (f4Var != null) {
                        ClipboardHelper.setText(context, (CharSequence) null, f4Var.getContent());
                        C76879j.m92726T(this.f50185d.getContext(), this.f50185d.getContext().getString(C0966R.string.f7938wv));
                        return;
                    }
                    C87412m.m108603p("msgInfo");
                    throw null;
                }
                Log.m105928w(showAppMsgContentUI.f50172d, "default onMMMenuItemSelected err");
            }
        }

        public C18173f(ShowAppMsgContentUI showAppMsgContentUI) {
            this.f50183d = showAppMsgContentUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            C77407n nVar = new C77407n((Context) this.f50183d, 1, false);
            ShowAppMsgContentUI showAppMsgContentUI = this.f50183d;
            nVar.f225771i = new C18174a(showAppMsgContentUI);
            nVar.f225782p = new C18175b(showAppMsgContentUI);
            nVar.mo107573q();
            return true;
        }
    }

    /* renamed from: H7 */
    public static final String m18781H7(ShowAppMsgContentUI showAppMsgContentUI) {
        showAppMsgContentUI.getClass();
        JSONObject jSONObject = new JSONObject();
        C72963f4 f4Var = showAppMsgContentUI.f50176h;
        if (f4Var != null) {
            jSONObject.put("msgId", f4Var.getMsgId());
            C72963f4 f4Var2 = showAppMsgContentUI.f50176h;
            if (f4Var2 != null) {
                jSONObject.put("msgSvrId", f4Var2.mo108774y2());
                C72963f4 f4Var3 = showAppMsgContentUI.f50176h;
                if (f4Var3 != null) {
                    jSONObject.put("talker", f4Var3.mo108768t());
                    C72963f4 f4Var4 = showAppMsgContentUI.f50176h;
                    if (f4Var4 != null) {
                        jSONObject.put("isSend", f4Var4.mo108769t2());
                        C72963f4 f4Var5 = showAppMsgContentUI.f50176h;
                        if (f4Var5 != null) {
                            jSONObject.put("status", f4Var5.getStatus());
                            C72963f4 f4Var6 = showAppMsgContentUI.f50176h;
                            if (f4Var6 != null) {
                                jSONObject.put("type", f4Var6.getType());
                                C72963f4 f4Var7 = showAppMsgContentUI.f50176h;
                                if (f4Var7 != null) {
                                    jSONObject.put("createTime", f4Var7.getCreateTime());
                                    C72963f4 f4Var8 = showAppMsgContentUI.f50176h;
                                    if (f4Var8 != null) {
                                        if (!Util.isNullOrNil(f4Var8.mo108761n2())) {
                                            C72963f4 f4Var9 = showAppMsgContentUI.f50176h;
                                            if (f4Var9 != null) {
                                                jSONObject.put("bizClientMsgId", f4Var9.mo108761n2());
                                            } else {
                                                C87412m.m108603p("msgInfo");
                                                throw null;
                                            }
                                        }
                                        C72963f4 f4Var10 = showAppMsgContentUI.f50176h;
                                        if (f4Var10 != null) {
                                            if (!Util.isNullOrNil(f4Var10.f230724G)) {
                                                C72963f4 f4Var11 = showAppMsgContentUI.f50176h;
                                                if (f4Var11 != null) {
                                                    jSONObject.put("msgSource", f4Var11.f230724G);
                                                } else {
                                                    C87412m.m108603p("msgInfo");
                                                    throw null;
                                                }
                                            }
                                            String jSONObject2 = jSONObject.toString();
                                            C87412m.m108593f(jSONObject2, "json.toString()");
                                            return jSONObject2;
                                        }
                                        C87412m.m108603p("msgInfo");
                                        throw null;
                                    }
                                    C87412m.m108603p("msgInfo");
                                    throw null;
                                }
                                C87412m.m108603p("msgInfo");
                                throw null;
                            }
                            C87412m.m108603p("msgInfo");
                            throw null;
                        }
                        C87412m.m108603p("msgInfo");
                        throw null;
                    }
                    C87412m.m108603p("msgInfo");
                    throw null;
                }
                C87412m.m108603p("msgInfo");
                throw null;
            }
            C87412m.m108603p("msgInfo");
            throw null;
        }
        C87412m.m108603p("msgInfo");
        throw null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bz7;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(((Number) ((C36570n) this.f50175g).getValue()).longValue());
        this.f50176h = b002;
        if (b002.getMsgId() <= 0) {
            Log.m105929w(this.f50172d, "onCreate msg is invalid %d", Long.valueOf(((Number) ((C36570n) this.f50175g).getValue()).longValue()));
            finish();
            return;
        }
        this.f50177i = C76879j.m92723Q(getContext(), getContext().getString(C0966R.string.a3h), getContext().getString(C0966R.string.a4d), true, true, (DialogInterface.OnCancelListener) null);
        C89059e<Void> a = C89060f.m111322a();
        a.mo123419C(new C18170c(this));
        a.mo123062e(new C18171d(this));
        setBackBtn(new C18172e(this));
        setMMTitle((int) C0966R.string.gs6);
        addIconOptionMenu(0, getString(C0966R.string.a0h), (int) C0966R.raw.actionbar_icon_dark_more, (MenuItem.OnMenuItemClickListener) new C18173f(this));
    }

    public void onDestroy() {
        super.onDestroy();
        C89779i0 i0Var = this.f50177i;
        if (i0Var != null && i0Var.isShowing()) {
            i0Var.dismiss();
        }
    }
}
