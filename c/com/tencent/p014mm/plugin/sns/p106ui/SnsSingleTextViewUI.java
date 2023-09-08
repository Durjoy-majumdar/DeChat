package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import c00.C92330r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.SnsTranslateFinishEvent;
import com.tencent.p014mm.autogen.events.SnsTranslateStartEvent;
import com.tencent.p014mm.autogen.events.SnsUnTranslateEvent;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94965w1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import de3.C75355a0;
import di3.C86312j;
import dm2.C45420d;
import dm2.C45424g;
import et2.C97707a;
import gy3.C87412m;
import java.io.IOException;
import java.util.HashMap;
import jm2.C46562a;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C11184p0;
import nj3.C76879j;
import p255vr.C65873e;
import p629ny.C76979h;
import p640ox.C77049b;
import te3.w64;
import te3.ze4;
import u73.C101982p;
import u73.C14134p0;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI */
public class SnsSingleTextViewUI extends MMSecDataActivity {

    /* renamed from: d */
    public TextView f278495d;

    /* renamed from: e */
    public String f278496e;

    /* renamed from: f */
    public String f278497f;

    /* renamed from: g */
    public String f278498g = null;

    /* renamed from: h */
    public String f278499h = null;

    /* renamed from: i */
    public int f278500i;

    /* renamed from: j */
    public byte[] f278501j = null;

    /* renamed from: n */
    public int f278502n;

    /* renamed from: o */
    public w64 f278503o = null;

    /* renamed from: p */
    public SnsInfo f278504p;

    /* renamed from: q */
    public boolean f278505q = false;

    /* renamed from: r */
    public SnsTranslateResultView f278506r;

    /* renamed from: s */
    public IListener f278507s;

    /* renamed from: t */
    public IListener f278508t;

    /* renamed from: u */
    public IListener f278509u;

    /* renamed from: v */
    public C11184p0 f278510v;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$a */
    public class C95614a implements MenuItem.OnMenuItemClickListener {
        public C95614a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$4");
            SnsSingleTextViewUI.this.finish();
            SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$4");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$b */
    public class C95615b implements C11184p0 {
        public C95615b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int i2;
            SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$5");
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                if (!(SnsSingleTextViewUI.m122237K7(SnsSingleTextViewUI.this) == null || SnsSingleTextViewUI.m122237K7(SnsSingleTextViewUI.this).getText() == null)) {
                    if (ClipboardHelper.setTextSwallowException(SnsSingleTextViewUI.m122237K7(SnsSingleTextViewUI.this).getText())) {
                        C76879j.m92726T(SnsSingleTextViewUI.this.getContext(), SnsSingleTextViewUI.this.getContext().getString(C0966R.string.f7938wv));
                        if (SnsSingleTextViewUI.m122234H7(SnsSingleTextViewUI.this) != null) {
                            C46562a.INSTANCE.F80(2, Util.getUnsignedLongString(SnsSingleTextViewUI.m122234H7(SnsSingleTextViewUI.this).field_snsId), Util.getUTF8ByteLength(SnsSingleTextViewUI.m122237K7(SnsSingleTextViewUI.this).getText().toString()));
                        }
                    } else {
                        C76879j.m92726T(SnsSingleTextViewUI.this.getContext(), SnsSingleTextViewUI.this.getContext().getString(C0966R.string.f7937wu));
                    }
                }
                SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$5");
            } else if (itemId != 1) {
                String str = null;
                if (itemId == 6) {
                    if (!(SnsSingleTextViewUI.m122237K7(SnsSingleTextViewUI.this) == null || SnsSingleTextViewUI.m122237K7(SnsSingleTextViewUI.this).getText() == null)) {
                        Intent intent = new Intent();
                        SnsInfo DN = C94866e1.Yx0().mo139798DN(SnsSingleTextViewUI.m122238L7(SnsSingleTextViewUI.this));
                        intent.putExtra("k_username", DN == null ? "" : DN.field_userName);
                        intent.putExtra("k_expose_msg_id", DN == null ? 0 : DN.getSnsId());
                        intent.putExtra("showShare", false);
                        intent.putExtra("rawUrl", String.format(C74928u.C45092d.f122306a, new Object[]{33}));
                        C88144b.m109791i(SnsSingleTextViewUI.this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                    }
                    SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$5");
                } else if (itemId != 12) {
                    switch (itemId) {
                        case 14:
                            if (!(SnsSingleTextViewUI.m122237K7(SnsSingleTextViewUI.this) == null || SnsSingleTextViewUI.m122237K7(SnsSingleTextViewUI.this).getText() == null)) {
                                if (!WeChatBrands.Business.Entries.ContextTranslate.checkAvailable(SnsSingleTextViewUI.m122237K7(SnsSingleTextViewUI.this).getContext())) {
                                    SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$5");
                                    return;
                                }
                                C94965w1.m120631l(C94866e1.Yx0().mo139798DN(SnsSingleTextViewUI.m122238L7(SnsSingleTextViewUI.this)));
                            }
                            SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$5");
                            return;
                        case 15:
                            if (!(SnsSingleTextViewUI.m122237K7(SnsSingleTextViewUI.this) == null || SnsSingleTextViewUI.m122237K7(SnsSingleTextViewUI.this).getText() == null)) {
                                if (!WeChatBrands.Business.Entries.ContextTranslate.checkAvailable(SnsSingleTextViewUI.m122237K7(SnsSingleTextViewUI.this).getContext())) {
                                    SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$5");
                                    return;
                                }
                                String snsId = SnsSingleTextViewUI.m122234H7(SnsSingleTextViewUI.this).getSnsId();
                                w64 M7 = SnsSingleTextViewUI.m122239M7(SnsSingleTextViewUI.this);
                                String str2 = SnsSingleTextViewUI.m122239M7(SnsSingleTextViewUI.this).f299707h;
                                String str3 = SnsSingleTextViewUI.m122234H7(SnsSingleTextViewUI.this).field_userName;
                                if (SnsSingleTextViewUI.m122234H7(SnsSingleTextViewUI.this).getTimeLine() != null) {
                                    str = SnsSingleTextViewUI.m122234H7(SnsSingleTextViewUI.this).getTimeLine().f283893Id;
                                }
                                C94965w1.m120630k(new C96230u((String) null, snsId, M7, (String) null, str2, (View) null, 1, str3, str));
                            }
                            SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$5");
                            return;
                        case 16:
                            if (!(SnsSingleTextViewUI.m122237K7(SnsSingleTextViewUI.this) == null || SnsSingleTextViewUI.m122237K7(SnsSingleTextViewUI.this).getText() == null)) {
                                C94965w1.m120633n(C94866e1.Yx0().mo139798DN(SnsSingleTextViewUI.m122238L7(SnsSingleTextViewUI.this)));
                            }
                            SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$5");
                            return;
                        case 17:
                            if (!(SnsSingleTextViewUI.m122237K7(SnsSingleTextViewUI.this) == null || SnsSingleTextViewUI.m122237K7(SnsSingleTextViewUI.this).getText() == null)) {
                                String snsId2 = SnsSingleTextViewUI.m122234H7(SnsSingleTextViewUI.this).getSnsId();
                                w64 M72 = SnsSingleTextViewUI.m122239M7(SnsSingleTextViewUI.this);
                                String str4 = SnsSingleTextViewUI.m122239M7(SnsSingleTextViewUI.this).f299707h;
                                String str5 = SnsSingleTextViewUI.m122234H7(SnsSingleTextViewUI.this).field_userName;
                                if (SnsSingleTextViewUI.m122234H7(SnsSingleTextViewUI.this).getTimeLine() != null) {
                                    str = SnsSingleTextViewUI.m122234H7(SnsSingleTextViewUI.this).getTimeLine().f283893Id;
                                }
                                C94965w1.m120632m(new C96230u((String) null, snsId2, M72, (String) null, str4, (View) null, 1, str5, str));
                            }
                            SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$5");
                            return;
                        default:
                            SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$5");
                            return;
                    }
                } else {
                    if (!(SnsSingleTextViewUI.m122237K7(SnsSingleTextViewUI.this) == null || SnsSingleTextViewUI.m122237K7(SnsSingleTextViewUI.this).getText() == null || Util.isNullOrNil(SnsSingleTextViewUI.m122237K7(SnsSingleTextViewUI.this).getText().toString()))) {
                        String charSequence = SnsSingleTextViewUI.m122237K7(SnsSingleTextViewUI.this).getText().toString();
                        String ep02 = ((C65873e) C86312j.m106911c(C65873e.class)).ep0(77);
                        C14134p0 p0Var = new C14134p0();
                        p0Var.f39548e = ep02;
                        p0Var.f39544a = SnsSingleTextViewUI.this.getContext();
                        p0Var.f39547d = charSequence;
                        p0Var.f39545b = 77;
                        p0Var.f39549f = true;
                        p0Var.f39551h = true;
                        p0Var.f39552i = false;
                        p0Var.f39560q = true;
                        p0Var.f39554k = C76577a.m92153d(SnsSingleTextViewUI.this.getContext(), C0966R.color.al6);
                        p0Var.f39555l = false;
                        ((HashMap) p0Var.f39550g).put("chatSearch", "1");
                        ((C101982p) C86312j.m106911c(C101982p.class)).mo6877X6(p0Var);
                        long j = 0;
                        if (SnsSingleTextViewUI.m122234H7(SnsSingleTextViewUI.this) != null) {
                            j = SnsSingleTextViewUI.m122234H7(SnsSingleTextViewUI.this).field_snsId;
                        }
                        long j2 = j;
                        SnsSingleTextViewUI snsSingleTextViewUI = SnsSingleTextViewUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                        int i3 = snsSingleTextViewUI.f278502n;
                        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                        if (i3 == 2) {
                            i2 = 7;
                        } else {
                            SnsSingleTextViewUI snsSingleTextViewUI2 = SnsSingleTextViewUI.this;
                            SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                            int i4 = snsSingleTextViewUI2.f278502n;
                            SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                            i2 = i4 == 1 ? 6 : 0;
                        }
                        ((C92330r) C86312j.m106911c(C92330r.class)).Hh0(2, ep02, 77, 0, "", "", C102236a0.m134765q0(j2), "", 3, "", 0, (long) charSequence.length(), i2, "", "", -1);
                    }
                    SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$5");
                }
            } else {
                if (!(SnsSingleTextViewUI.m122237K7(SnsSingleTextViewUI.this) == null || SnsSingleTextViewUI.m122237K7(SnsSingleTextViewUI.this).getText() == null)) {
                    DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                    C97707a.m126007e(doFavoriteEvent, SnsSingleTextViewUI.m122238L7(SnsSingleTextViewUI.this), SnsSingleTextViewUI.m122237K7(SnsSingleTextViewUI.this).getText());
                    DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
                    aVar.f264684i = SnsSingleTextViewUI.this;
                    aVar.f264688m = 18;
                    doFavoriteEvent.publish();
                }
                SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$5");
            }
        }
    }

    public SnsSingleTextViewUI() {
        C40008f fVar = C40008f.f107254d;
        this.f278507s = new IListener<SnsTranslateStartEvent>(fVar) {
            {
                this.__eventId = 1200144606;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$1");
                SnsTranslateStartEvent snsTranslateStartEvent = (SnsTranslateStartEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$1");
                if ((snsTranslateStartEvent instanceof SnsTranslateStartEvent) && SnsSingleTextViewUI.m122234H7(SnsSingleTextViewUI.this) != null && Util.isEqual(SnsSingleTextViewUI.m122235I7(SnsSingleTextViewUI.this), snsTranslateStartEvent.f265208d.f265210b)) {
                    C94965w1.m120620a(SnsSingleTextViewUI.m122235I7(SnsSingleTextViewUI.this), 8);
                    SnsSingleTextViewUI.m122236J7(SnsSingleTextViewUI.this).setVisibility(0);
                    SnsTranslateResultView J7 = SnsSingleTextViewUI.m122236J7(SnsSingleTextViewUI.this);
                    SnsSingleTextViewUI snsSingleTextViewUI = SnsSingleTextViewUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                    int i = snsSingleTextViewUI.f278500i;
                    SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                    J7.mo133019j(i);
                    SnsSingleTextViewUI snsSingleTextViewUI2 = SnsSingleTextViewUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                    snsSingleTextViewUI2.f278505q = false;
                    SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$1");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$1");
                return false;
            }
        };
        this.f278508t = new IListener<SnsTranslateFinishEvent>(fVar) {
            {
                this.__eventId = 2139223297;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$2");
                SnsTranslateFinishEvent snsTranslateFinishEvent = (SnsTranslateFinishEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$2");
                if ((snsTranslateFinishEvent instanceof SnsTranslateFinishEvent) && SnsSingleTextViewUI.m122234H7(SnsSingleTextViewUI.this) != null && Util.isEqual(SnsSingleTextViewUI.m122235I7(SnsSingleTextViewUI.this), snsTranslateFinishEvent.f265201d.f265203b)) {
                    C94965w1.m120620a(SnsSingleTextViewUI.m122235I7(SnsSingleTextViewUI.this), 8);
                    SnsTranslateFinishEvent.C92595a aVar = snsTranslateFinishEvent.f265201d;
                    String str = aVar.f265204c;
                    String str2 = aVar.f265205d;
                    if (Util.isNullOrNil(str)) {
                        SnsSingleTextViewUI.m122236J7(SnsSingleTextViewUI.this).setVisibility(8);
                        C94965w1.m120629j(SnsSingleTextViewUI.m122235I7(SnsSingleTextViewUI.this), 8);
                    } else {
                        SnsSingleTextViewUI.m122236J7(SnsSingleTextViewUI.this).setVisibility(0);
                        SnsTranslateResultView J7 = SnsSingleTextViewUI.m122236J7(SnsSingleTextViewUI.this);
                        SnsSingleTextViewUI snsSingleTextViewUI = SnsSingleTextViewUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                        int i = snsSingleTextViewUI.f278500i;
                        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                        J7.mo133013a((C94965w1.C94967b) null, i, str, str2, true);
                        SnsSingleTextViewUI snsSingleTextViewUI2 = SnsSingleTextViewUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                        snsSingleTextViewUI2.f278505q = true;
                        SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                    }
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$2");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$2");
                return false;
            }
        };
        this.f278509u = new IListener<SnsUnTranslateEvent>(fVar) {
            {
                this.__eventId = -868441523;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$3");
                SnsUnTranslateEvent snsUnTranslateEvent = (SnsUnTranslateEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$3");
                if ((snsUnTranslateEvent instanceof SnsUnTranslateEvent) && Util.isEqual(SnsSingleTextViewUI.m122235I7(SnsSingleTextViewUI.this), snsUnTranslateEvent.f265211d.f265213b)) {
                    C94965w1.m120629j(snsUnTranslateEvent.f265211d.f265213b, 8);
                    SnsSingleTextViewUI.m122236J7(SnsSingleTextViewUI.this).setVisibility(8);
                    SnsSingleTextViewUI snsSingleTextViewUI = SnsSingleTextViewUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                    snsSingleTextViewUI.f278505q = false;
                    SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$3");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$3");
                return false;
            }
        };
        this.f278510v = new C95615b();
    }

    /* renamed from: H7 */
    public static /* synthetic */ SnsInfo m122234H7(SnsSingleTextViewUI snsSingleTextViewUI) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        SnsInfo snsInfo = snsSingleTextViewUI.f278504p;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        return snsInfo;
    }

    /* renamed from: I7 */
    public static /* synthetic */ String m122235I7(SnsSingleTextViewUI snsSingleTextViewUI) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        String str = snsSingleTextViewUI.f278499h;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        return str;
    }

    /* renamed from: J7 */
    public static /* synthetic */ SnsTranslateResultView m122236J7(SnsSingleTextViewUI snsSingleTextViewUI) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        SnsTranslateResultView snsTranslateResultView = snsSingleTextViewUI.f278506r;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        return snsTranslateResultView;
    }

    /* renamed from: K7 */
    public static /* synthetic */ TextView m122237K7(SnsSingleTextViewUI snsSingleTextViewUI) {
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        TextView textView = snsSingleTextViewUI.f278495d;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        return textView;
    }

    /* renamed from: L7 */
    public static /* synthetic */ String m122238L7(SnsSingleTextViewUI snsSingleTextViewUI) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        String str = snsSingleTextViewUI.f278497f;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        return str;
    }

    /* renamed from: M7 */
    public static /* synthetic */ w64 m122239M7(SnsSingleTextViewUI snsSingleTextViewUI) {
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        w64 w64 = snsSingleTextViewUI.f278503o;
        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        return w64;
    }

    /* renamed from: N7 */
    public final boolean mo132902N7() {
        SnsMethodCalculate.markStartTimeMs("isValidComment", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        w64 w64 = this.f278503o;
        boolean z = false;
        if (w64 != null && (!(w64.f299709j == 0 && w64.f299714r == 0) && !Util.isNullOrNil(w64.f299707h))) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("isValidComment", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        return z;
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        return C0966R.C0971layout.c4b;
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        C94965w1.C94967b e;
        int i;
        Class cls = C77049b.class;
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.jaz);
        setBackBtn(new C95614a());
        SnsMethodCalculate.markStartTimeMs("registerReporterData", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        ((C77049b) C86312j.m106911c(cls)).Kn0(this, new C45420d(1));
        SnsMethodCalculate.markEndTimeMs("registerReporterData", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        this.f278496e = getIntent().getStringExtra("sns_text_show");
        this.f278497f = Util.nullAs(getIntent().getStringExtra("sns_local_id"), "");
        SnsMethodCalculate.markStartTimeMs("initCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        this.f278501j = getIntent().getByteArrayExtra("sns_comment_buf");
        this.f278502n = getIntent().getIntExtra("sns_content_source", 0);
        byte[] bArr = this.f278501j;
        if (bArr != null && bArr.length > 0) {
            w64 w64 = new w64();
            this.f278503o = w64;
            try {
                w64.parseFrom(this.f278501j);
                StringBuilder sb = new StringBuilder();
                w64 w642 = this.f278503o;
                int i2 = w642.f299709j;
                sb.append(i2 != 0 ? (long) i2 : w642.f299714r);
                sb.append("");
                this.f278498g = sb.toString();
            } catch (IOException e2) {
                Log.printErrStackTrace("MicroMsg.SnsSingleTextViewUI", e2, "initCommentInfo error.", new Object[0]);
            }
        }
        SnsMethodCalculate.markEndTimeMs("initCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        Log.m105925i("MicroMsg.SnsSingleTextViewUI", "oncreate localId:%s", this.f278497f);
        this.f278504p = C94866e1.Yx0().mo139798DN(this.f278497f);
        if (Util.isNullOrNil(this.f278496e)) {
            this.f278496e = "";
        }
        TextView textView = (TextView) findViewById(C0966R.C0970id.jwm);
        this.f278495d = textView;
        textView.setText(this.f278496e, TextView.BufferType.SPANNABLE);
        C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
        TextView textView2 = this.f278495d;
        SnsMethodCalculate.markStartTimeMs("getSpanExtra", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        int i3 = 4;
        if (this.f278504p == null) {
            bundle2 = null;
            SnsMethodCalculate.markEndTimeMs("getSpanExtra", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        } else {
            bundle2 = new Bundle();
            String str = this.f278504p.getUserName() + "#" + C102236a0.m134765q0(this.f278504p.field_snsId);
            w64 w643 = this.f278503o;
            if (w643 != null) {
                i = C102236a0.m134753k0(w643) ? 5 : 4;
                str = str + "#" + this.f278503o.f299703d + "#" + this.f278503o.f299709j;
            } else {
                i = 3;
            }
            bundle2.putInt("ShareScene", i);
            bundle2.putString("ShareSceneId", str);
            w64 w644 = this.f278503o;
            bundle2.putLong("CreateTime", (long) (w644 != null ? w644.f299708i : this.f278504p.getCreateTime()));
            bundle2.putInt("TimelineEnterSource", 1);
            bundle2.putInt("SnsContentType", this.f278504p.field_type);
            SnsMethodCalculate.markEndTimeMs("getSpanExtra", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        }
        hVar.Fv0(textView2, 2, 2, bundle2);
        SnsInfo snsInfo = this.f278504p;
        w64 w645 = this.f278503o;
        TextView textView3 = this.f278495d;
        SnsMethodCalculate.markStartTimeMs("onSnsSingleTextViewBindView", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        C87412m.m108594g(snsInfo, "snsInfo");
        C87412m.m108594g(textView3, "view");
        ze4 ze4 = new ze4();
        if (w645 != null) {
            if (C102236a0.m134753k0(w645)) {
                i3 = 5;
            }
            ze4.f228685e = i3;
            ze4.f228686f = snsInfo.getUserName() + '#' + C102236a0.m134765q0(snsInfo.field_snsId) + '#' + w645.f299703d + '#' + w645.f299709j;
            ze4.f228687g = (long) w645.f299708i;
        } else {
            ze4.f228685e = 3;
            ze4.f228686f = snsInfo.getUserName() + '#' + C102236a0.m134765q0(snsInfo.field_snsId);
            ze4.f228687g = (long) snsInfo.getCreateTime();
        }
        ze4.f228688h = 1;
        ze4.f228689i = snsInfo.field_type;
        Context context = textView3.getContext();
        C87412m.m108593f(context, "view.context");
        C45424g Lq0 = ((C77049b) C86312j.m106911c(cls)).Lq0(context, 1);
        if (Lq0 != null) {
            Lq0.mo70916a(String.valueOf(textView3.hashCode()), ze4);
        }
        SnsMethodCalculate.markEndTimeMs("onSnsSingleTextViewBindView", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        this.f278495d.setOnTouchListener(new C75355a0());
        new C45082x0(this).mo70438d(this.f278495d, this, this.f278510v);
        SnsTranslateResultView snsTranslateResultView = (SnsTranslateResultView) findViewById(C0966R.C0970id.jwu);
        this.f278506r = snsTranslateResultView;
        snsTranslateResultView.setResultTextSize(this.f278495d.getTextSize());
        if (this.f278504p != null) {
            if (!mo132902N7()) {
                this.f278499h = this.f278504p.getSnsId();
                this.f278500i = 1;
            } else {
                this.f278499h = C94965w1.m120623d(this.f278504p.getSnsId(), this.f278498g);
                this.f278500i = 2;
            }
            if (C94965w1.m120626g(this.f278499h, 8) && (e = C94965w1.m120624e(this.f278499h)) != null && e.f275306d) {
                this.f278506r.setVisibility(0);
                this.f278506r.mo133013a((C94965w1.C94967b) null, this.f278500i, e.f275304b, e.f275305c, false);
                this.f278505q = true;
            }
        }
        this.f278507s.alive();
        this.f278508t.alive();
        this.f278509u.alive();
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        ContextMenu contextMenu2 = contextMenu;
        SnsMethodCalculate.markStartTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        if (view instanceof TextView) {
            SnsInfo snsInfo = this.f278504p;
            if (snsInfo != null && !snsInfo.isNoCopy()) {
                contextMenu2.add(0, 0, 0, getString(C0966R.string.f7936wt));
            }
            C88144b.m109788f("favorite");
            if (!mo132902N7()) {
                contextMenu2.add(0, 1, 0, getString(C0966R.string.cmx));
            }
            contextMenu2.add(0, 6, 1, getString(C0966R.string.f7968xs));
            if (!this.f278505q) {
                C94965w1.m120621b(contextMenu2, !mo132902N7());
            } else {
                C94965w1.m120622c(contextMenu2, !mo132902N7());
            }
            contextMenu2.add(0, 12, 0, getContext().getString(C0966R.string.cwg));
            String charSequence = this.f278495d.getText().toString();
            long j = 0;
            SnsInfo snsInfo2 = this.f278504p;
            if (snsInfo2 != null) {
                j = snsInfo2.field_snsId;
            }
            long j2 = j;
            int i = this.f278502n;
            ((C92330r) C86312j.m106911c(C92330r.class)).Hh0(1, ((C65873e) C86312j.m106911c(C65873e.class)).ep0(77), 77, 0, "", "", C102236a0.m134765q0(j2), "", 3, "", 0, (long) charSequence.length(), i == 2 ? 7 : i == 1 ? 6 : 0, "", "", -1);
        }
        SnsMethodCalculate.markEndTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        super.onDestroy();
        this.f278507s.dead();
        this.f278508t.dead();
        this.f278509u.dead();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
    }
}
