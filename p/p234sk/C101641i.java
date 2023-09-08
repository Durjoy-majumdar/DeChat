package p234sk;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.tencent.p014mm.emoji.debug.EmojiDebugUI;
import com.tencent.p014mm.emoji.decode.MMGIFJNIFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.smiley.C96927c;
import com.tencent.p014mm.smiley.C96928c0;
import com.tencent.p014mm.smiley.C96930d0;
import com.tencent.p014mm.smiley.C96964q;
import com.tencent.p014mm.smiley.C96965r;
import com.tencent.p014mm.smiley.C96971s0;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import cy3.C58003b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C64197v;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: sk.i */
public final class C101641i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f297526d;

    /* renamed from: e */
    public final /* synthetic */ String f297527e;

    /* renamed from: f */
    public final /* synthetic */ long f297528f;

    /* renamed from: g */
    public final /* synthetic */ EmojiDebugUI f297529g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101641i(String str, String str2, long j, EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f297526d = str;
        this.f297527e = str2;
        this.f297528f = j;
        this.f297529g = emojiDebugUI;
    }

    /* JADX INFO: finally extract failed */
    public Object invoke() {
        String str;
        Throwable th;
        int i;
        Iterator<C86001b0> it;
        int intValue;
        String str2 = this.f297526d;
        String str3 = this.f297526d + "FileContent";
        String str4 = this.f297527e;
        C86013q1.m106447h(str3);
        C86013q1.m106447h(str2);
        C86013q1.m106444e(str3);
        C86013q1.m106444e(str2);
        Iterable<C86001b0> t = C86013q1.m106459t(str4, false);
        C96964q qVar = new C96964q();
        LinkedList<C96927c> linkedList = qVar.f284064d;
        LinkedList<C96971s0> linkedList2 = qVar.f284065e;
        LinkedList<C96928c0> linkedList3 = qVar.f284066f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = C96965r.f284067d;
        LinkedList<C96971s0> linkedList4 = C96965r.C44649c.f121057a.f284071a.f284065e;
        C87412m.m108593f(linkedList4, "EmojiResProcessor.getIns…ader().softbankEmojiItems");
        Iterator<T> it4 = linkedList4.iterator();
        while (true) {
            str = "emojiItemCodePoints[0]";
            if (!it4.hasNext()) {
                break;
            }
            C96971s0 s0Var = (C96971s0) it4.next();
            boolean z2 = C96965r.f284067d;
            LinkedList<Integer> linkedList5 = C96965r.C44649c.f121057a.f284071a.f284064d.get(s0Var.f284090f).f283943d;
            Iterator<T> it5 = it4;
            Integer num = linkedList5.get(0);
            C87412m.m108593f(num, str);
            String hexString = Integer.toHexString(num.intValue());
            if (linkedList5.size() >= 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(hexString);
                sb.append('-');
                Integer num2 = linkedList5.get(1);
                C87412m.m108593f(num2, "emojiItemCodePoints[1]");
                sb.append(Integer.toHexString(num2.intValue()));
                hexString = sb.toString();
            }
            C87412m.m108593f(hexString, "codePointName");
            String hexString2 = Integer.toHexString(s0Var.f284088d);
            C87412m.m108593f(hexString2, "toHexString(it.softbankVal)");
            linkedHashMap.put(hexString, hexString2);
            it4 = it5;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        boolean z3 = C96965r.f284067d;
        LinkedList<C96928c0> linkedList6 = C96965r.C44649c.f121057a.f284071a.f284066f;
        C87412m.m108593f(linkedList6, "EmojiResProcessor.getIns…eader().nameIdxEmojiItems");
        Iterator<T> it6 = linkedList6.iterator();
        while (it6.hasNext()) {
            C96928c0 c0Var = (C96928c0) it6.next();
            boolean z4 = C96965r.f284067d;
            Iterator<T> it7 = it6;
            LinkedList<Integer> linkedList7 = C96965r.C44649c.f121057a.f284071a.f284064d.get(c0Var.f283947f).f283943d;
            String str5 = str2;
            Integer num3 = linkedList7.get(0);
            C87412m.m108593f(num3, str);
            String hexString3 = Integer.toHexString(num3.intValue());
            String str6 = str;
            if (linkedList7.size() >= 2) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(hexString3);
                sb4.append('-');
                Integer num4 = linkedList7.get(1);
                C87412m.m108593f(num4, "emojiItemCodePoints[1]");
                sb4.append(Integer.toHexString(num4.intValue()));
                hexString3 = sb4.toString();
            }
            C87412m.m108593f(hexString3, "codePointName");
            linkedHashMap2.put(hexString3, Integer.valueOf(c0Var.f283945d));
            it6 = it7;
            str2 = str5;
            str = str6;
        }
        String str7 = str2;
        if (t != null) {
            EmojiDebugUI emojiDebugUI = this.f297529g;
            Iterator<C86001b0> it8 = t.iterator();
            int i2 = 0;
            int i3 = 0;
            while (it8.hasNext()) {
                C86001b0 next = it8.next();
                int i4 = i2 + 1;
                if (i2 >= 0) {
                    C86001b0 b0Var = next;
                    String str8 = b0Var.f250472b;
                    C87412m.m108593f(str8, "fileEntry.name");
                    if (!C87412m.m108589b(str8, "")) {
                        it = it8;
                        i = i4;
                        C86013q1.m106440a(str3, C86013q1.m106433O(b0Var.f250471a, 0, -1));
                    } else {
                        it = it8;
                        i = i4;
                        Log.m105924i(emojiDebugUI.f266603d, "skip srcFile index: " + i2);
                    }
                    C96927c cVar = new C96927c();
                    String str9 = str3;
                    C96964q qVar2 = qVar;
                    LinkedList<C96927c> linkedList8 = linkedList;
                    Iterator it9 = C112550d0.m153784T(C112551y.m153814n(C112551y.m153814n(str8, ".wxam", "", false), ".png", "", false), new char[]{'-'}, false, 0, 6, (Object) null).iterator();
                    int i5 = 0;
                    while (it9.hasNext()) {
                        Object next2 = it9.next();
                        int i6 = i5 + 1;
                        if (i5 >= 0) {
                            Iterator it10 = it9;
                            int parseInt = Integer.parseInt((String) next2, 16);
                            if (parseInt != 65039 || (i5 == 0 && parseInt == 65039)) {
                                cVar.f283943d.add(Integer.valueOf(parseInt));
                            }
                            i5 = i6;
                            it9 = it10;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                    C96930d0 d0Var = new C96930d0();
                    String str10 = ".wxam";
                    d0Var.f283954e = (int) C86013q1.m106451l(b0Var.f250471a);
                    d0Var.f283953d = i3;
                    Log.m105924i(emojiDebugUI.f266603d, i2 + " , startPos:" + d0Var.f283953d + " , size:" + d0Var.f283954e);
                    int i7 = d0Var.f283954e;
                    i3 += i7;
                    Bitmap decodeThumb = MMGIFJNIFactory.Companion.decodeThumb(C86013q1.m106433O(b0Var.f250471a, 0, i7));
                    if (decodeThumb != null) {
                        decodeThumb.setDensity(240);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(MMApplicationContext.getContext().getResources(), decodeThumb);
                        d0Var.f283955f = bitmapDrawable.getIntrinsicWidth();
                        d0Var.f283956g = bitmapDrawable.getIntrinsicHeight();
                    }
                    cVar.f283944e = d0Var;
                    String n = C112551y.m153814n(C112551y.m153814n(C112551y.m153814n(str8, str10, "", false), ".png", "", false), "-fe0f", "", false);
                    if (linkedHashMap.containsKey(n)) {
                        C96971s0 s0Var2 = new C96971s0();
                        String str11 = (String) linkedHashMap.get(n);
                        if (str11 != null) {
                            if (str11.length() > 0) {
                                s0Var2.f284090f = i2;
                                s0Var2.f284088d = Integer.parseInt(str11, 16);
                                linkedList2.add(s0Var2);
                            }
                        }
                    }
                    if (linkedHashMap2.containsKey(n) && (intValue = ((Number) linkedHashMap2.getOrDefault(n, -1)).intValue()) != -1) {
                        C96928c0 c0Var2 = new C96928c0();
                        c0Var2.f283947f = i2;
                        c0Var2.f283945d = intValue;
                        linkedList3.add(c0Var2);
                    }
                    LinkedList<C96927c> linkedList9 = linkedList8;
                    linkedList9.add(cVar);
                    linkedList = linkedList9;
                    it8 = it;
                    i2 = i;
                    str3 = str9;
                    qVar = qVar2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        String str12 = str3;
        C96964q qVar3 = qVar;
        byte[] byteArray = qVar3.toByteArray();
        long j = this.f297528f;
        if (j == -1) {
            j = System.currentTimeMillis() * ((long) 1000);
        }
        OutputStream K = C86013q1.m106429K(str7, false);
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(K);
            try {
                dataOutputStream.writeInt(1);
                dataOutputStream.writeLong(j);
                dataOutputStream.writeInt(byteArray.length);
                dataOutputStream.write(byteArray);
                dataOutputStream.write(C86013q1.m106433O(str12, 0, -1));
                C13598b0 b0Var2 = C13598b0.f38549a;
                C58003b.m67160a(dataOutputStream, (Throwable) null);
                C58003b.m67160a(K, (Throwable) null);
                String str13 = this.f297529g.f266603d;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("new emoji:emojiVersion=");
                sb5.append(j);
                sb5.append(" ,result emojiItems.size=");
                C96964q qVar4 = qVar3;
                sb5.append(qVar4.f284064d.size());
                sb5.append(", softbankItems.size=");
                sb5.append(qVar4.f284065e.size());
                sb5.append(", nameIdxEmojiItems.size=");
                sb5.append(qVar4.f284066f.size());
                Log.m105924i(str13, sb5.toString());
                C61926c.m72668M(new C13694h(this.f297529g));
                return C13598b0.f38549a;
            } catch (Throwable th4) {
                Throwable th5 = th4;
                C58003b.m67160a(dataOutputStream, th);
                throw th5;
            }
        } catch (Throwable th6) {
            Throwable th7 = th6;
            try {
                throw th7;
            } catch (Throwable th8) {
                Throwable th9 = th8;
                C58003b.m67160a(K, th7);
                throw th9;
            }
        }
    }
}
