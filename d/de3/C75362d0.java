package de3;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import de3.C31171e;
import di3.C86312j;
import go3.C76003c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kg3.C76577a;
import o90.C100308d;
import org.json.JSONException;
import org.json.JSONObject;
import p156gj.C107835h0;
import p629ny.C76977f;
import p823sg.C101611g;
import pl3.C100822b;
import q90.C101062d;
import sf0.C90188n0;
import wd3.C53155r0;
import wd3.C78589z0;

/* renamed from: de3.d0 */
public class C75362d0 implements C76977f {

    /* renamed from: E */
    public static final C101611g<String, SpannableString> f221541E = new C100308d(500);

    /* renamed from: F */
    public static Class<?>[] f221542F = {C76003c.class, C75359b0.class, ForegroundColorSpan.class, C100822b.class};

    /* renamed from: A */
    public int f221543A;

    /* renamed from: B */
    public C75354a f221544B;

    /* renamed from: C */
    public int f221545C;

    /* renamed from: D */
    public Object f221546D;

    /* renamed from: a */
    public ArrayList<C53155r0> f221547a;

    /* renamed from: b */
    public ArrayList<C75363a> f221548b;

    /* renamed from: c */
    public ArrayList<C78589z0> f221549c;

    /* renamed from: d */
    public TextView f221550d;

    /* renamed from: e */
    public boolean f221551e;

    /* renamed from: f */
    public boolean f221552f;

    /* renamed from: g */
    public boolean f221553g;

    /* renamed from: h */
    public boolean f221554h;

    /* renamed from: i */
    public boolean f221555i;

    /* renamed from: j */
    public boolean f221556j;

    /* renamed from: k */
    public boolean f221557k;

    /* renamed from: l */
    public boolean f221558l;

    /* renamed from: m */
    public boolean f221559m;

    /* renamed from: n */
    public boolean f221560n;

    /* renamed from: o */
    public boolean f221561o;

    /* renamed from: p */
    public boolean f221562p;

    /* renamed from: q */
    public boolean f221563q;

    /* renamed from: r */
    public boolean f221564r;

    /* renamed from: s */
    public boolean f221565s;

    /* renamed from: t */
    public boolean f221566t;

    /* renamed from: u */
    public boolean f221567u;

    /* renamed from: v */
    public int f221568v;

    /* renamed from: w */
    public int f221569w;

    /* renamed from: x */
    public Context f221570x;

    /* renamed from: y */
    public boolean f221571y;

    /* renamed from: z */
    public String f221572z;

    /* renamed from: de3.d0$a */
    public class C75363a {

        /* renamed from: a */
        public int f221573a;

        /* renamed from: b */
        public int f221574b;

        public C75363a(C75362d0 d0Var, int i, int i2) {
            this.f221573a = i;
            this.f221574b = i2;
        }
    }

    public C75362d0(Context context) {
        this.f221547a = new ArrayList<>();
        this.f221548b = new ArrayList<>();
        this.f221549c = new ArrayList<>();
        this.f221550d = null;
        this.f221551e = false;
        this.f221552f = false;
        this.f221553g = true;
        this.f221554h = false;
        this.f221555i = false;
        this.f221556j = true;
        this.f221557k = true;
        this.f221558l = false;
        this.f221559m = false;
        this.f221560n = false;
        this.f221561o = false;
        this.f221562p = false;
        this.f221563q = false;
        this.f221564r = false;
        this.f221565s = true;
        this.f221566t = false;
        this.f221567u = false;
        this.f221568v = 0;
        this.f221569w = 0;
        this.f221570x = null;
        this.f221571y = false;
        this.f221543A = 0;
        this.f221547a = new ArrayList<>();
        this.f221548b = new ArrayList<>();
        this.f221549c = new ArrayList<>();
        this.f221570x = context;
    }

    /* renamed from: a */
    public final boolean mo105693a(String str, int i, int i2) {
        C53155r0 a = C45330b.m50240a(this.f221570x, str, i, i2, 0, 0);
        if (a == null) {
            return false;
        }
        Object obj = this.f221546D;
        if (obj != null) {
            a.f148314e = obj;
        }
        this.f221547a.add(a);
        this.f221548b.add(new C75363a(this, i, i2));
        return true;
    }

    /* renamed from: b */
    public final boolean mo105694b(ArrayList<C75363a> arrayList, C75363a aVar) {
        boolean z;
        Iterator<C75363a> it = arrayList.iterator();
        do {
            z = false;
            if (!it.hasNext()) {
                return false;
            }
            C75363a next = it.next();
            if (next.f221574b > aVar.f221573a && aVar.f221574b > next.f221573a) {
                z = true;
                continue;
            }
        } while (!z);
        return true;
    }

    /* renamed from: c */
    public final void mo105695c(SpannableString spannableString) {
        if (this.f221550d != null) {
            C75355a0 a0Var = new C75355a0();
            a0Var.f221525i = this.f221572z;
            a0Var.f221527n = this.f221544B;
            a0Var.f221528o = 0;
            a0Var.f221529p = this.f221545C;
            this.f221550d.setOnTouchListener(a0Var);
        } else if (spannableString != null) {
            C75359b0[] b0VarArr = (C75359b0[]) spannableString.getSpans(0, spannableString.length(), C75359b0.class);
            if (!(b0VarArr == null || b0VarArr.length <= 0 || this.f221572z == null)) {
                for (C75359b0 sessionId : b0VarArr) {
                    sessionId.setSessionId(this.f221572z);
                }
            }
            if (b0VarArr != null && b0VarArr.length > 0) {
                for (C75359b0 b0Var : b0VarArr) {
                    b0Var.setAdTagClickCallback(this.f221544B, 0);
                    b0Var.setAdTagClickScene(this.f221545C);
                }
            }
        }
    }

    /* renamed from: d */
    public SpannableString mo105696d(CharSequence charSequence, int i, boolean z) {
        SpannableString spannableString;
        int i2;
        Object obj;
        boolean z2;
        if (charSequence == null) {
            return new SpannableString("");
        }
        this.f221569w = i;
        String str = charSequence + "@" + this.f221569w + "@" + this.f221551e + "@" + this.f221552f + "@" + this.f221555i + "@" + this.f221556j + "@" + this.f221557k + "@" + this.f221568v + "@" + this.f221571y + "@" + this.f221562p + "@" + this.f221563q + "@" + this.f221564r + "@" + this.f221561o + "@" + this.f221543A;
        if (!z || (spannableString = (SpannableString) ((C101062d) f221541E).get(str)) == null) {
            SpannableString e = mo105697e(charSequence, z, this.f221567u);
            if (this.f221571y) {
                Iterator<C53155r0> it = this.f221547a.iterator();
                while (it.hasNext()) {
                    C53155r0 next = it.next();
                    next.f148322m = this.f221572z;
                    next.f148323n = this.f221543A;
                    if (Util.isNullOrNil(next.f148312c)) {
                        e.setSpan(new ForegroundColorSpan(next.f148320k), next.f148310a, next.f148311b, 33);
                    } else if (next.f148310a <= e.length() && next.f148311b <= e.length()) {
                        e.setSpan(new C75359b0(this.f221568v, next), next.f148310a, next.f148311b, 33);
                    }
                }
            }
            Iterator<C78589z0> it4 = this.f221549c.iterator();
            while (it4.hasNext()) {
                C78589z0 next2 = it4.next();
                if (next2.f230213a <= e.length() && next2.f230214b <= e.length()) {
                    Drawable drawable = this.f221570x.getResources().getDrawable(next2.f230215c);
                    int i3 = next2.f230216d;
                    if (i3 <= 0 || next2.f230217e <= 0) {
                        TextView textView = this.f221550d;
                        int textSize = (int) ((textView == null ? (float) this.f221569w : textView.getTextSize()) * 1.3f);
                        drawable.setBounds(0, 0, textSize, textSize);
                    } else {
                        drawable.setBounds(0, 0, C76577a.m92151b(this.f221570x, i3), C76577a.m92151b(this.f221570x, next2.f230217e));
                    }
                    C76003c cVar = new C76003c(drawable, 1);
                    C76577a.m92151b(this.f221570x, 2);
                    int i4 = next2.f230213a;
                    e.setSpan(cVar, i4, i4 + 1, 18);
                }
            }
            if (this.f221550d != null && !Util.isNullOrNil(e.toString())) {
                boolean z3 = C90188n0.f258933a;
                this.f221550d.setText(e, TextView.BufferType.SPANNABLE);
            }
            mo105695c(e);
            if (z) {
                ((C101062d) f221541E).mo139557c(str, new SpannableString(e));
            }
            return e;
        }
        for (Object obj2 : spannableString.getSpans(0, spannableString.length(), Object.class)) {
            int i5 = 0;
            while (true) {
                Class<?>[] clsArr = f221542F;
                if (i5 >= clsArr.length) {
                    z2 = false;
                    break;
                } else if (clsArr[i5].isInstance(obj2)) {
                    z2 = true;
                    break;
                } else {
                    i5++;
                }
            }
            if (!z2) {
                spannableString.removeSpan(obj2);
            }
        }
        if (this.f221550d != null && !Util.isNullOrNil(spannableString.toString())) {
            boolean z4 = C90188n0.f258933a;
            this.f221550d.setText(spannableString, TextView.BufferType.SPANNABLE);
        }
        mo105695c(spannableString);
        for (C75359b0 hrefInfo : (C75359b0[]) spannableString.getSpans(0, spannableString.length(), C75359b0.class)) {
            C53155r0 hrefInfo2 = hrefInfo.getHrefInfo();
            if (hrefInfo2 != null && (((i2 = hrefInfo2.f148313d) == 60 || i2 == 58 || i2 == 1) && (obj = this.f221546D) != null)) {
                hrefInfo2.f148314e = obj;
            }
        }
        return spannableString;
    }

    /* renamed from: e */
    public final SpannableString mo105697e(CharSequence charSequence, boolean z, boolean z2) {
        CharSequence charSequence2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        C31171e.C31173b[] bVarArr;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        char charAt;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        int i;
        String str;
        String str2 = charSequence;
        Class cls = C58258h.class;
        this.f221547a = new ArrayList<>();
        if (this.f221569w <= 0) {
            TextView textView = this.f221550d;
            if (textView != null) {
                this.f221569w = (int) textView.getTextSize();
            } else {
                this.f221569w = C76577a.m92157h(this.f221570x, C0966R.dimen.f3927j7);
            }
        }
        if (this.f221547a == null) {
            this.f221547a = new ArrayList<>();
        }
        if (this.f221548b == null) {
            this.f221548b = new ArrayList<>();
        }
        this.f221547a.clear();
        this.f221548b.clear();
        int i2 = 1;
        int i3 = 0;
        if ((str2 != null && C107835h0.f322856m.f322907n == 1) && this.f221565s) {
            C58258h hVar = (C58258h) C86312j.m106911c(cls);
            if (hVar.mo83005R2(str2) || hVar.mo83003L3(str2)) {
                str2 = charSequence.toString().replace("\n", "                                                                                                                                                                                                                                                                                                                        ");
            }
        }
        String str3 = null;
        int i4 = 2;
        if (this.f221551e) {
            if (str2.toString().contains("data-miniprogram-appid")) {
                String charSequence3 = str2.toString();
                Matcher matcher = charSequence3.length() < 1500 ? C75369r.f221588d.matcher(charSequence3) : C75369r.f221587c.matcher(charSequence3);
                while (matcher.find()) {
                    String group = matcher.group(i3);
                    String group2 = matcher.group(i2);
                    String group3 = matcher.group(i4);
                    Map<String, String> parseXml = XmlParser.parseXml(group.replace(group2, " ").replace(group3, " "), "a", str3);
                    if (parseXml == null) {
                        Log.m105920e("MicroMsg.SpanProcessor", "XmlParser parse return null, so continue");
                    } else {
                        String str4 = parseXml.get(".a.$data-miniprogram-appid");
                        String str5 = parseXml.get(".a.$data-miniprogram-path");
                        boolean isNullOrNil = Util.isNullOrNil(group2) ^ i2;
                        boolean z34 = !Util.isNullOrNil(str4);
                        if (!isNullOrNil || z34) {
                            if (!z34) {
                                Log.m105920e("MicroMsg.SpanProcessor", "url && appId is null, continue");
                            } else if (this.f221563q) {
                                charSequence3 = charSequence3.toString().replace(group, group3);
                                int start = matcher.start(i3);
                                C53155r0 r0Var = new C53155r0(group2, 45, (Object) null);
                                r0Var.f148310a = start;
                                r0Var.f148311b = group3.length() + start;
                                this.f221547a.add(r0Var);
                            } else {
                                String str6 = "    " + group3;
                                charSequence3 = charSequence3.toString().replace(group, str6);
                                int start2 = matcher.start(i3);
                                int length = str6.length() + start2;
                                this.f221549c.add(C85875k4.m106211z() ? new C78589z0(start2 + 1, start2 + 3, C0966R.raw.spannable_app_brand_link_logo_dark) : new C78589z0(start2 + 1, start2 + 3, C0966R.raw.spannable_app_brand_link_logo));
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("fullText", charSequence3);
                                    jSONObject.put("linkText", group3);
                                    jSONObject.put("path", str5);
                                } catch (JSONException unused) {
                                }
                                C53155r0 r0Var2 = new C53155r0(str4, 45, jSONObject.toString());
                                r0Var2.f148310a = start2 + 4;
                                r0Var2.f148311b = length;
                                this.f221547a.add(r0Var2);
                            }
                        } else if (group2.length() >= i4) {
                            charSequence3 = charSequence3.toString().replace(group, group3);
                            int start3 = matcher.start(i3);
                            int length2 = group3.length() + start3;
                            if (start3 < 0 || length2 > str2.length()) {
                                Object[] objArr = new Object[3];
                                objArr[i3] = Integer.valueOf(start3);
                                objArr[i2] = Integer.valueOf(length2);
                                objArr[i4] = Integer.valueOf(str2.length());
                                Log.m105921e("MicroMsg.SpanProcessor", "parseHref error, start:%d, end:%d, source.length:%d", objArr);
                                str3 = null;
                            } else {
                                mo105693a(group2, start3, length2);
                            }
                        }
                        matcher = charSequence3.length() < 1500 ? C75369r.f221588d.matcher(charSequence3) : C75369r.f221587c.matcher(charSequence3);
                    }
                    i2 = 1;
                    i3 = 0;
                    str3 = null;
                    i4 = 2;
                }
                str2 = charSequence3;
            } else {
                if (str2.toString().contains("weixin://kefumenu")) {
                    str = str2.toString();
                    Matcher matcher2 = str.length() < 1500 ? C75369r.f221590f.matcher(str) : C75369r.f221589e.matcher(str);
                    while (matcher2.find()) {
                        String group4 = matcher2.group(1);
                        String group5 = matcher2.group(2);
                        if (group4.length() >= 2) {
                            StringBuilder sb = new StringBuilder();
                            if (matcher2.start(0) > 0) {
                                sb.append(str.substring(0, matcher2.start(0)));
                            }
                            sb.append(group5);
                            if (matcher2.end(0) < str.length()) {
                                sb.append(str.substring(matcher2.end(0), str.length()));
                            }
                            str = sb.toString();
                            int start4 = matcher2.start(0);
                            int length3 = group5.length() + start4;
                            if (start4 < 0 || length3 > str2.length()) {
                                Log.m105921e("MicroMsg.SpanProcessor", "parseHrefWithKefuMenuLink error, start:%d, end:%d, source.length:%d", Integer.valueOf(start4), Integer.valueOf(length3), Integer.valueOf(str2.length()));
                            } else {
                                mo105693a(group4, start4, length3);
                                matcher2 = str.length() < 1500 ? C75369r.f221590f.matcher(str) : C75369r.f221589e.matcher(str);
                            }
                        }
                    }
                } else {
                    str = str2.toString();
                    Matcher matcher3 = str.length() < 1500 ? C75369r.f221586b.matcher(str) : C75369r.f221585a.matcher(str);
                    while (matcher3.find()) {
                        String group6 = matcher3.group(1);
                        String group7 = matcher3.group(2);
                        if (group6.length() >= 2) {
                            StringBuilder sb4 = new StringBuilder();
                            if (matcher3.start(0) > 0) {
                                sb4.append(str.substring(0, matcher3.start(0)));
                            }
                            sb4.append(group7);
                            if (matcher3.end(0) < str.length()) {
                                sb4.append(str.substring(matcher3.end(0), str.length()));
                            }
                            str = sb4.toString();
                            int start5 = matcher3.start(0);
                            int length4 = group7.length() + start5;
                            if (start5 < 0 || length4 > str2.length()) {
                                Log.m105921e("MicroMsg.SpanProcessor", "parseHref error, start:%d, end:%d, source.length:%d", Integer.valueOf(start5), Integer.valueOf(length4), Integer.valueOf(str2.length()));
                            } else {
                                mo105693a(group6, start5, length4);
                                matcher3 = str.length() < 1500 ? C75369r.f221586b.matcher(str) : C75369r.f221585a.matcher(str);
                            }
                        }
                    }
                }
                str2 = str;
            }
        }
        if (this.f221562p) {
            Matcher matcher4 = C75369r.f221593i.matcher(charSequence2.toString());
            while (matcher4.find()) {
                if (this.f221563q) {
                    charSequence2 = charSequence2.toString().replace(matcher4.group(0), "");
                } else {
                    charSequence2 = charSequence2.toString().replace(matcher4.group(0), "  ");
                    String group8 = matcher4.group(1);
                    int start6 = matcher4.start();
                    int i5 = start6 + 2;
                    int identifier = this.f221570x.getResources().getIdentifier(group8.toLowerCase(), "drawable", this.f221570x.getPackageName());
                    if (identifier != 0) {
                        C78589z0 z0Var = new C78589z0(start6, i5, identifier);
                        if (!Util.isNullOrNil(group8) && "original_label".equals(group8)) {
                            z0Var.f230217e = 15;
                            z0Var.f230216d = 35;
                        }
                        this.f221549c.add(z0Var);
                    } else {
                        Log.m105929w("MicroMsg.SpanProcessor", "dz[parseImgSpan:error drawable name %s]", group8);
                    }
                }
                matcher4 = C75369r.f221586b.matcher(charSequence2);
            }
        }
        if (this.f221564r) {
            boolean z35 = this.f221567u;
            Matcher matcher5 = C75369r.f221591g.matcher(charSequence2);
            CharSequence charSequence4 = charSequence2;
            boolean z36 = false;
            while (matcher5.find()) {
                String group9 = matcher5.group(0);
                String group10 = matcher5.group(1);
                String group11 = matcher5.group(2);
                String group12 = matcher5.group(3);
                if (group12 == null) {
                    group12 = "";
                }
                charSequence4 = charSequence4.toString().replace(group9, group12);
                int start7 = matcher5.start(0);
                int length5 = group12.length() + start7;
                if (start7 < 0 || length5 > charSequence2.length()) {
                    Log.m105921e("MicroMsg.SpanProcessor", "dz[parseWCCustomLink error: start:%d, end:%d, source.length:%d]", Integer.valueOf(start7), Integer.valueOf(length5), Integer.valueOf(charSequence2.length()));
                } else {
                    try {
                        i = Color.parseColor(group10);
                    } catch (Exception unused2) {
                        Context context = MMApplicationContext.getContext();
                        int identifier2 = context.getResources().getIdentifier(group10, "color", context.getPackageName());
                        int color = identifier2 <= 0 ? 0 : MMApplicationContext.getContext().getResources().getColor(identifier2);
                        Log.m105929w("MicroMsg.SpanProcessor", "dz[parseWCCustomLink error at color : %s, resId : %s]", group10, Integer.valueOf(identifier2));
                        i = color;
                    }
                    if (Util.isNullOrNil(group11)) {
                        C53155r0 r0Var3 = new C53155r0(start7, length5, (String) null, 0, (Object) null);
                        r0Var3.f148320k = i;
                        this.f221547a.add(r0Var3);
                        this.f221548b.add(new C75363a(this, start7, length5));
                    } else {
                        C53155r0 a = C45330b.m50240a(this.f221570x, group11, start7, length5, i, i & -1711276033);
                        if (a != null) {
                            Object obj = this.f221546D;
                            if (obj != null) {
                                a.f148314e = obj;
                            }
                            this.f221547a.add(a);
                            this.f221548b.add(new C75363a(this, start7, length5));
                        }
                    }
                    matcher5 = C75369r.f221591g.matcher(charSequence4);
                    z36 = true;
                }
            }
            int i6 = 2;
            if (!z36) {
                Matcher matcher6 = C75369r.f221592h.matcher(charSequence2);
                while (matcher6.find()) {
                    String group13 = matcher6.group(0);
                    String group14 = matcher6.group(1);
                    String group15 = matcher6.group(i6);
                    if (group15 == null) {
                        group15 = "";
                    }
                    if (group14.length() >= i6) {
                        charSequence4 = charSequence4.toString().replace(group13, group15);
                        int start8 = matcher6.start(0);
                        int length6 = group15.length() + start8;
                        if (start8 < 0 || length6 > charSequence2.length()) {
                            Log.m105921e("MicroMsg.SpanProcessor", "dz[parseWCCustomLink error: start:%d, end:%d, source.length:%d]", Integer.valueOf(start8), Integer.valueOf(length6), Integer.valueOf(charSequence2.length()));
                        } else {
                            if (!mo105693a(group14, start8, length6) && z35) {
                                C53155r0 r0Var4 = new C53155r0(group14, 2147483646, (Object) null);
                                Object obj2 = this.f221546D;
                                if (obj2 != null) {
                                    r0Var4.f148314e = obj2;
                                }
                                r0Var4.f148310a = start8;
                                r0Var4.f148311b = length6;
                                Iterator<C75363a> it = this.f221548b.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z28 = false;
                                        break;
                                    }
                                    C75363a next = it.next();
                                    if (next.f221574b <= start8 || length6 <= next.f221573a) {
                                        z29 = false;
                                        continue;
                                    } else {
                                        z29 = true;
                                        continue;
                                    }
                                    if (z29) {
                                        z28 = true;
                                        break;
                                    }
                                }
                                if (!z28) {
                                    this.f221547a.add(r0Var4);
                                    this.f221548b.add(new C75363a(this, start8, length6));
                                }
                            }
                            matcher6 = C75369r.f221591g.matcher(charSequence4);
                        }
                        i6 = 2;
                    }
                }
            }
            charSequence2 = charSequence4;
        }
        if (this.f221565s) {
            charSequence2 = ((C58258h) C86312j.m106911c(cls)).mo83004M(this.f221570x, charSequence2);
        }
        if (this.f221553g) {
            if (this.f221556j) {
                ArrayList<C75363a> arrayList = this.f221548b;
                ArrayList arrayList2 = new ArrayList();
                Pattern pattern = C75369r.f221597m;
                int i7 = 2000;
                if (charSequence2.length() <= 2000) {
                    i7 = charSequence2.length();
                }
                Matcher matcher7 = pattern.matcher(charSequence2.subSequence(0, i7));
                while (matcher7.find()) {
                    int start9 = matcher7.start();
                    int end = matcher7.end();
                    C53155r0 r0Var5 = new C53155r0(matcher7.group(), 24, (Object) null);
                    r0Var5.f148310a = start9;
                    r0Var5.f148311b = end;
                    Iterator<C75363a> it4 = this.f221548b.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            z26 = false;
                            break;
                        }
                        C75363a next2 = it4.next();
                        if (next2.f221574b <= start9 || end <= next2.f221573a) {
                            z27 = false;
                            continue;
                        } else {
                            z27 = true;
                            continue;
                        }
                        if (z27) {
                            z26 = true;
                            break;
                        }
                    }
                    if (!z26) {
                        this.f221547a.add(r0Var5);
                        arrayList2.add(new C75363a(this, start9, end));
                    }
                }
                arrayList.addAll(arrayList2);
            }
            if (this.f221552f) {
                ArrayList<C75363a> arrayList3 = this.f221548b;
                ArrayList arrayList4 = new ArrayList();
                String charSequence5 = charSequence2.toString();
                Matcher matcher8 = charSequence5.length() > 500 ? C75369r.f221596l.matcher(charSequence5.toLowerCase()) : C75369r.f221595k.matcher(charSequence5.toLowerCase());
                while (matcher8.find()) {
                    int start10 = matcher8.start();
                    int end2 = matcher8.end();
                    Iterator<C75363a> it5 = this.f221548b.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            z19 = false;
                            break;
                        }
                        C75363a next3 = it5.next();
                        if (next3.f221574b <= start10 || end2 <= next3.f221573a) {
                            z25 = false;
                            continue;
                        } else {
                            z25 = true;
                            continue;
                        }
                        if (z25) {
                            z19 = true;
                            break;
                        }
                    }
                    if (!z19 && start10 >= 0 && end2 <= charSequence5.length() && (end2 >= charSequence5.length() || 'a' > (charAt = charSequence5.charAt(end2)) || charAt > 'z')) {
                        C53155r0 r0Var6 = new C53155r0(charSequence5.substring(start10, end2), 1, this.f221546D);
                        r0Var6.f148310a = start10;
                        r0Var6.f148311b = end2;
                        this.f221547a.add(r0Var6);
                        arrayList4.add(new C75363a(this, start10, end2));
                    }
                }
                arrayList3.addAll(arrayList4);
            }
            if (this.f221554h) {
                ArrayList<C75363a> arrayList5 = this.f221548b;
                ArrayList arrayList6 = new ArrayList();
                String charSequence6 = charSequence2.toString();
                if (charSequence6.length() <= 200) {
                    Matcher matcher9 = C75369r.f221602r.matcher(charSequence6);
                    while (matcher9.find()) {
                        int start11 = matcher9.start();
                        int end3 = matcher9.end();
                        Iterator<C75363a> it6 = this.f221548b.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                z17 = false;
                                break;
                            }
                            C75363a next4 = it6.next();
                            if (next4.f221574b <= start11 || end3 <= next4.f221573a) {
                                z18 = false;
                                continue;
                            } else {
                                z18 = true;
                                continue;
                            }
                            if (z18) {
                                z17 = true;
                                break;
                            }
                        }
                        if (!z17 && start11 >= 0 && end3 <= charSequence6.length()) {
                            C53155r0 r0Var7 = new C53155r0(charSequence6.substring(start11, end3), 44, this.f221546D);
                            r0Var7.f148310a = start11;
                            r0Var7.f148311b = end3;
                            this.f221547a.add(r0Var7);
                            arrayList6.add(new C75363a(this, start11, end3));
                        }
                    }
                }
                arrayList5.addAll(arrayList6);
            }
            if (this.f221560n) {
                ArrayList<C75363a> arrayList7 = this.f221548b;
                ArrayList arrayList8 = new ArrayList();
                String charSequence7 = charSequence2.toString();
                Matcher matcher10 = C75369r.f221601q.matcher(charSequence7);
                while (matcher10.find()) {
                    int start12 = matcher10.start();
                    int end4 = matcher10.end();
                    C75363a aVar = new C75363a(this, start12, end4);
                    if (!mo105694b(this.f221548b, aVar) && start12 >= 0 && end4 <= charSequence7.length()) {
                        C53155r0 r0Var8 = new C53155r0(charSequence7.substring(start12, end4), 30, (Object) null);
                        r0Var8.f148310a = start12;
                        r0Var8.f148311b = end4;
                        this.f221547a.add(r0Var8);
                        arrayList8.add(aVar);
                    }
                }
                if (arrayList8.size() <= 0) {
                    Matcher matcher11 = C75369r.f221600p.matcher(charSequence7);
                    while (matcher11.find()) {
                        int start13 = matcher11.start();
                        int end5 = matcher11.end();
                        C75363a aVar2 = new C75363a(this, start13, end5);
                        if (!mo105694b(this.f221548b, aVar2) && start13 >= 0 && end5 <= charSequence7.length()) {
                            C53155r0 r0Var9 = new C53155r0(charSequence7.substring(start13, end5), 30, (Object) null);
                            r0Var9.f148310a = start13;
                            r0Var9.f148311b = end5;
                            this.f221547a.add(r0Var9);
                            arrayList8.add(aVar2);
                        }
                    }
                }
                arrayList7.addAll(arrayList8);
            }
            if (this.f221557k) {
                ArrayList<C75363a> arrayList9 = this.f221548b;
                ArrayList arrayList10 = new ArrayList();
                String charSequence8 = charSequence2.toString();
                Matcher matcher12 = C75369r.f221599o.matcher(charSequence2);
                while (matcher12.find()) {
                    int start14 = matcher12.start();
                    int end6 = matcher12.end();
                    Iterator<C75363a> it7 = this.f221548b.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            z15 = false;
                            break;
                        }
                        C75363a next5 = it7.next();
                        if (next5.f221574b <= start14 || end6 <= next5.f221573a) {
                            z16 = false;
                            continue;
                        } else {
                            z16 = true;
                            continue;
                        }
                        if (z16) {
                            z15 = true;
                            break;
                        }
                    }
                    if (!z15 && start14 >= 0 && end6 <= charSequence8.length()) {
                        C53155r0 r0Var10 = new C53155r0(charSequence8.substring(start14, end6), 28, (Object) null);
                        r0Var10.f148310a = start14;
                        r0Var10.f148311b = end6;
                        this.f221547a.add(r0Var10);
                        arrayList10.add(new C75363a(this, start14, end6));
                    }
                }
                arrayList9.addAll(arrayList10);
            }
            if (this.f221558l) {
                ArrayList<C75363a> arrayList11 = this.f221548b;
                ArrayList arrayList12 = new ArrayList();
                String charSequence9 = charSequence2.toString();
                Matcher matcher13 = C75369r.f221603s.matcher(charSequence2);
                while (matcher13.find()) {
                    String group16 = matcher13.group();
                    C31171e.C31173b bVar = C31171e.f83548d.f83551c;
                    if (bVar != null) {
                        char[] charArray = group16.toUpperCase().toCharArray();
                        int i8 = 0;
                        while (true) {
                            if (i8 < charArray.length) {
                                char c = charArray[i8];
                                int i9 = c <= '9' ? c - '0' : (c - 'A') + 10;
                                if (bVar == null || (bVarArr = bVar.f83553b) == null) {
                                    break;
                                }
                                bVar = bVarArr[i9];
                                i8++;
                            } else if (bVar != null) {
                                z7 = bVar.f83552a;
                            }
                        }
                    }
                    z7 = false;
                    if (z7) {
                        int start15 = matcher13.start();
                        int end7 = matcher13.end();
                        Iterator<C75363a> it8 = this.f221548b.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                z8 = false;
                                break;
                            }
                            C75363a next6 = it8.next();
                            if (next6.f221574b <= start15 || end7 <= next6.f221573a) {
                                z9 = false;
                                continue;
                            } else {
                                z9 = true;
                                continue;
                            }
                            if (z9) {
                                z8 = true;
                                break;
                            }
                        }
                        if (!z8 && start15 >= 0 && end7 <= charSequence9.length()) {
                            C53155r0 r0Var11 = new C53155r0(charSequence9.substring(start15, end7), 50, this.f221546D);
                            r0Var11.f148310a = start15;
                            r0Var11.f148311b = end7;
                            this.f221547a.add(r0Var11);
                            arrayList12.add(new C75363a(this, start15, end7));
                        }
                    }
                }
                arrayList11.addAll(arrayList12);
            }
            if (this.f221561o) {
                ArrayList<C75363a> arrayList13 = this.f221548b;
                ArrayList arrayList14 = new ArrayList();
                String charSequence10 = charSequence2.toString();
                Matcher matcher14 = C75369r.f221604t.matcher(charSequence2);
                while (matcher14.find()) {
                    matcher14.group();
                    int start16 = matcher14.start();
                    int end8 = matcher14.end();
                    Iterator<C75363a> it9 = this.f221548b.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            z5 = false;
                            break;
                        }
                        C75363a next7 = it9.next();
                        if (next7.f221574b <= start16 || end8 <= next7.f221573a) {
                            z6 = false;
                            continue;
                        } else {
                            z6 = true;
                            continue;
                        }
                        if (z6) {
                            z5 = true;
                            break;
                        }
                    }
                    if (!z5 && start16 >= 0 && end8 <= charSequence10.length()) {
                        C53155r0 r0Var12 = new C53155r0(charSequence10.substring(start16, end8), 58, this.f221546D);
                        r0Var12.f148310a = start16;
                        r0Var12.f148311b = end8;
                        this.f221547a.add(r0Var12);
                        arrayList14.add(new C75363a(this, start16, end8));
                    }
                }
                arrayList13.addAll(arrayList14);
            }
            if (this.f221555i) {
                ArrayList<C75363a> arrayList15 = this.f221548b;
                ArrayList arrayList16 = new ArrayList();
                Matcher matcher15 = C75369r.f221598n.matcher(charSequence2);
                while (matcher15.find()) {
                    int start17 = matcher15.start();
                    int end9 = matcher15.end();
                    String group17 = matcher15.group();
                    int i15 = end9 - start17;
                    if (group17.startsWith("+")) {
                        i15--;
                    }
                    if ((!(i15 == 6 || i15 == 5) || "+12306+12110+12395+12121+12117+12119+95555+95566+95533+95588+95558+95599+95568+95595+95559+95508+95528+95501+95577+95561+10086+10010+10000+17951+17911+17900+118114+116114+950718+95598+12318+12315+12358+12365+12310+12369+12333+12366+95518+95519+95511+95500+95522+95567+95017".contains(group17)) && i15 < 100) {
                        Iterator<C75363a> it10 = this.f221548b.iterator();
                        while (true) {
                            if (!it10.hasNext()) {
                                z3 = false;
                                break;
                            }
                            C75363a next8 = it10.next();
                            if (next8.f221574b <= start17 || end9 <= next8.f221573a) {
                                z4 = false;
                                continue;
                            } else {
                                z4 = true;
                                continue;
                            }
                            if (z4) {
                                z3 = true;
                                break;
                            }
                        }
                        if (!z3) {
                            C53155r0 r0Var13 = new C53155r0(group17, 25, this.f221546D);
                            r0Var13.f148310a = start17;
                            r0Var13.f148311b = end9;
                            this.f221547a.add(r0Var13);
                            arrayList16.add(new C75363a(this, start17, end9));
                        }
                    }
                }
                arrayList15.addAll(arrayList16);
            }
            if (this.f221559m) {
                ArrayList<C75363a> arrayList17 = this.f221548b;
                ArrayList arrayList18 = new ArrayList();
                Iterator<C53155r0> it11 = C45330b.m50241b(this.f221570x, charSequence2.toString()).iterator();
                while (it11.hasNext()) {
                    C53155r0 next9 = it11.next();
                    C75363a aVar3 = new C75363a(this, next9.f148310a, next9.f148311b);
                    if (!mo105694b(this.f221548b, aVar3)) {
                        this.f221547a.add(next9);
                        arrayList18.add(aVar3);
                    }
                }
                arrayList17.addAll(arrayList18);
            }
            if (this.f221566t) {
                ArrayList<C75363a> arrayList19 = this.f221548b;
                ArrayList arrayList20 = new ArrayList();
                String charSequence11 = charSequence2.toString();
                Matcher matcher16 = C75369r.f221605u.matcher(charSequence11);
                while (matcher16.find()) {
                    int start18 = matcher16.start();
                    int end10 = matcher16.end();
                    C75363a aVar4 = new C75363a(this, start18, end10);
                    if (!mo105694b(this.f221548b, aVar4) && start18 >= 0 && end10 <= charSequence11.length()) {
                        C53155r0 r0Var14 = new C53155r0(charSequence11.substring(start18, end10), 60, (Object) null);
                        r0Var14.f148310a = start18;
                        r0Var14.f148314e = this.f221546D;
                        r0Var14.f148311b = end10;
                        this.f221547a.add(r0Var14);
                        arrayList20.add(aVar4);
                    }
                }
                arrayList19.addAll(arrayList20);
            }
        }
        return charSequence2 instanceof SpannableString ? (SpannableString) charSequence2 : new SpannableString(charSequence2);
    }

    /* renamed from: f */
    public C75362d0 mo105698f(TextView textView) {
        this.f221550d = textView;
        if (textView != null) {
            this.f221570x = textView.getContext();
        }
        return this;
    }
}
