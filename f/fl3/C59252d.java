package fl3;

import android.content.Context;
import android.text.SpannableString;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import gy3.C87412m;
import he0.C76158j;
import java.util.ArrayList;
import java.util.Locale;
import kg3.C76577a;
import p629ny.C76979h;
import z04.C112551y;
import zb2.C66777a;

/* renamed from: fl3.d */
public final class C59252d extends C66777a<C59252d> {

    /* renamed from: d */
    public final C72996z1 f169416d;

    /* renamed from: e */
    public final int f169417e;

    /* renamed from: f */
    public final int f169418f;

    /* renamed from: g */
    public boolean f169419g;

    /* renamed from: h */
    public String f169420h;

    /* renamed from: i */
    public boolean f169421i = true;

    /* renamed from: j */
    public ArrayList<String> f169422j = new ArrayList<>(5);

    /* renamed from: n */
    public CharSequence f169423n;

    /* renamed from: o */
    public String f169424o;

    public C59252d(C72996z1 z1Var, int i, int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C87412m.m108594g(z1Var, "contact");
        this.f169416d = z1Var;
        this.f169417e = i;
        this.f169418f = i2;
        String str8 = "";
        this.f169420h = str8;
        boolean z = true;
        this.f169424o = str8;
        SpannableString Te0 = ((C76979h) C86312j.m106911c(C76979h.class)).Te0(MMApplicationContext.getContext(), ((C75339i) C86312j.m106911c(C75339i.class)).mo62520pi(z1Var), (float) C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3927j7));
        C87412m.m108593f(Te0, "getService(ISpannableSer…ormalTextSize).toFloat())");
        this.f169423n = Te0;
        String o2 = z1Var.mo73970o2();
        if (o2 != null && (C112551y.m153811k(o2) ^ true)) {
            str = z1Var.mo73970o2();
        } else {
            String z2 = z1Var.mo62945z2();
            str = z2 != null && (C112551y.m153811k(z2) ^ true) ? z1Var.mo62945z2() : str8;
        }
        ArrayList<String> arrayList = this.f169422j;
        String str9 = "";
        if (str != null) {
            Locale locale = Locale.getDefault();
            C87412m.m108593f(locale, "getDefault()");
            str2 = str.toUpperCase(locale);
            C87412m.m108593f(str2, "this as java.lang.String).toUpperCase(locale)");
        } else {
            str2 = str9;
        }
        arrayList.add(str2);
        String n2 = z1Var.mo73969n2();
        if (n2 != null && (C112551y.m153811k(n2) ^ true)) {
            str3 = z1Var.mo73969n2();
        } else {
            String z25 = z1Var.mo62945z2();
            str3 = (z25 == null || !(C112551y.m153811k(z25) ^ true)) ? false : z ? z1Var.mo62945z2() : str8;
        }
        ArrayList<String> arrayList2 = this.f169422j;
        if (str3 != null) {
            Locale locale2 = Locale.getDefault();
            C87412m.m108593f(locale2, "getDefault()");
            str4 = str3.toUpperCase(locale2);
            C87412m.m108593f(str4, "this as java.lang.String).toUpperCase(locale)");
        } else {
            str4 = str9;
        }
        arrayList2.add(str4);
        ArrayList<String> arrayList3 = this.f169422j;
        String z26 = z1Var.mo62945z2();
        if (z26 != null) {
            Locale locale3 = Locale.getDefault();
            C87412m.m108593f(locale3, "getDefault()");
            str5 = z26.toUpperCase(locale3);
            C87412m.m108593f(str5, "this as java.lang.String).toUpperCase(locale)");
        } else {
            str5 = str9;
        }
        arrayList3.add(str5);
        ArrayList<String> arrayList4 = this.f169422j;
        String nickname = z1Var.getNickname();
        if (nickname != null) {
            Locale locale4 = Locale.getDefault();
            C87412m.m108593f(locale4, "getDefault()");
            str6 = nickname.toUpperCase(locale4);
            C87412m.m108593f(str6, "this as java.lang.String).toUpperCase(locale)");
        } else {
            str6 = str9;
        }
        arrayList4.add(str6);
        ArrayList<String> arrayList5 = this.f169422j;
        String username = z1Var.getUsername();
        if (username != null) {
            Locale locale5 = Locale.getDefault();
            C87412m.m108593f(locale5, "getDefault()");
            str9 = username.toUpperCase(locale5);
            C87412m.m108593f(str9, "this as java.lang.String).toUpperCase(locale)");
        }
        arrayList5.add(str9);
        Context context = MMApplicationContext.getContext();
        if (i2 == 123) {
            str7 = "#";
        } else if (i2 == 32) {
            str7 = context.getString(C0966R.string.f7459gu);
            C87412m.m108593f(str7, "{\n                contex…talog_name)\n            }");
        } else {
            str7 = String.valueOf((char) i2);
        }
        this.f169420h = str7;
        if (C72996z1.m85843n5(z1Var.getUsername())) {
            C76158j jVar = (C76158j) C86312j.m106911c(C76158j.class);
            String wo = jVar != null ? jVar.mo106373wo(z1Var.mo73980x2(), z1Var.mo73976t2()) : null;
            str8 = wo != null ? wo : str8;
            this.f169424o = str8;
            if (!Util.isNullOrNil(str8) && C87412m.m108589b("3552365301", z1Var.mo73980x2())) {
                this.f169424o = '@' + this.f169424o;
            }
        }
    }

    /* renamed from: Oa */
    public String mo344Oa() {
        return this.f169416d.getUsername() + '-' + this.f169417e;
    }

    /* renamed from: c */
    public int mo75c() {
        return this.f169417e;
    }

    public Object clone() {
        return super.clone();
    }

    public int compareTo(Object obj) {
        C59252d dVar = (C59252d) obj;
        C87412m.m108594g(dVar, "other");
        int i = C87412m.m108596i(this.f169417e, dVar.f169417e);
        if (i == 0 && (i = C87412m.m108596i(this.f169416d.mo62845A2(), dVar.f169416d.mo62845A2())) == 0) {
            int i2 = 0;
            while (i2 < this.f169422j.size() && i2 < dVar.f169422j.size()) {
                String str = dVar.f169422j.get(i2);
                C87412m.m108593f(str, "other.compareContentList[index]");
                i = this.f169422j.get(i2).compareTo(str);
                if (i != 0) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    /* renamed from: g5 */
    public boolean mo347g5(Object obj) {
        C59252d dVar = (C59252d) obj;
        C87412m.m108594g(dVar, "other");
        return C87412m.m108589b(this.f169416d, dVar.f169416d) && this.f169419g == dVar.f169419g && C87412m.m108589b(this.f169420h, dVar.f169420h) && this.f169421i == dVar.f169421i && this.f169418f == dVar.f169418f;
    }
}
