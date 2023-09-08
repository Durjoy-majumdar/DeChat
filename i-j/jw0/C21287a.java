package jw0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.base.span.BoldForegroundColorSpan;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import fy3.C32224a;
import go3.C76003c;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import p385u2.C111105a;
import p629ny.C76979h;
import pe3.C47465a;
import rb0.C22221f;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import te3.C52214z40;
import z04.C112551y;

/* renamed from: jw0.a */
public final class C21287a {

    /* renamed from: a */
    public static final C21287a f60143a = new C21287a();

    /* renamed from: b */
    public static final C13601g f60144b = C36568h.m40985a(C21288a.f60146d);

    /* renamed from: c */
    public static C52214z40 f60145c;

    /* renamed from: jw0.a$a */
    public static final class C21288a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C21288a f60146d = new C21288a();

        public C21288a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getSingleMMKV("brandService");
        }
    }

    /* renamed from: a */
    public final String mo33260a(String str) {
        return "digest_" + str + '}';
    }

    /* renamed from: b */
    public final String mo33261b(String str) {
        return "digest_show_" + str + '}';
    }

    /* renamed from: c */
    public final CharSequence mo33262c(int i, Context context, C72976h2 h2Var) {
        CharSequence charSequence;
        String str;
        int i2 = i;
        Context context2 = context;
        C72976h2 h2Var2 = h2Var;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(h2Var2, "conv");
        CharSequence charSequence2 = "";
        if (!h2Var2.mo108372k3(128)) {
            charSequence = null;
        } else {
            Drawable drawable = context.getResources().getDrawable(h2Var2.mo108372k3(256) ? C0966R.C0969drawable.c2r : C85875k4.m106211z() ? C0966R.C0969drawable.c2p : C0966R.C0969drawable.c2o);
            drawable.setBounds(0, 0, i2, i2);
            C76003c cVar = new C76003c(drawable, 1);
            SpannableString spannableString = new SpannableString("@");
            spannableString.setSpan(cVar, 0, 1, 33);
            charSequence = TextUtils.concat(new CharSequence[]{spannableString, h2Var2.mo108372k3(32) ? mo33263d(i, context) : charSequence2, h2Var.mo108822p2()});
        }
        if (!(charSequence == null || C112551y.m153811k(charSequence))) {
            return charSequence;
        }
        if (!h2Var2.mo108372k3(16)) {
            String content = h2Var.getContent();
            if (!(content == null || C112551y.m153811k(content))) {
                String content2 = h2Var.getContent();
                C87412m.m108593f(content2, "conv.content");
                if (C112551y.m153819s(content2, h2Var.mo108823q2() + XVFSFile.PATH_SEPARATOR_CHAR, false)) {
                    int length = h2Var.getContent().length();
                    String q2 = h2Var.mo108823q2();
                    if (length > (q2 != null ? q2.length() : 0)) {
                        CharSequence subSequence = h2Var.getContent().subSequence(h2Var.mo108823q2().length() + 1, h2Var.getContent().length());
                        if (subSequence == null || (str = subSequence.toString()) == null) {
                            str = charSequence2;
                        }
                        Map<String, String> parseXml = XmlParser.parseXml(str, "digest_items", (String) null);
                        if (parseXml != null && parseXml.size() > 1) {
                            boolean k3 = h2Var2.mo108372k3(64);
                            int size = (parseXml.size() - 1) / 3;
                            if (size >= 0) {
                                CharSequence charSequence3 = charSequence2;
                                int i3 = 0;
                                while (true) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(".digest_items.item");
                                    sb.append(i3 == 0 ? charSequence2 : Integer.valueOf(i3));
                                    String sb4 = sb.toString();
                                    String str2 = parseXml.get(sb4 + ".font_bold");
                                    String str3 = parseXml.get(sb4 + ".content");
                                    if (!(str2 == null || str3 == null)) {
                                        SpannableString Te0 = ((C76979h) C86312j.m106911c(C76979h.class)).Te0(context2, str3, (float) i2);
                                        if (k3 && C87412m.m108589b(str2, "1")) {
                                            Te0.setSpan(new BoldForegroundColorSpan(C111105a.m151500b(context2, C0966R.color.FG_0)), 0, Te0.length(), 17);
                                        }
                                        charSequence3 = TextUtils.concat(new CharSequence[]{charSequence3, Te0});
                                        C87412m.m108593f(charSequence3, "concat(digest, ss)");
                                    }
                                    if (i3 == size) {
                                        break;
                                    }
                                    i3++;
                                }
                                charSequence2 = charSequence3;
                            }
                            Log.m105924i("MicroMsg.BizDigestUtil", "getOfficialAccountsDigest digest_items digest: " + charSequence2);
                            if (!C112551y.m153811k(charSequence2)) {
                                return charSequence2;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public final SpannableString mo33263d(int i, Context context) {
        C87412m.m108594g(context, "context");
        Drawable drawable = context.getResources().getDrawable(C0966R.C0969drawable.bwa);
        C87412m.m108593f(drawable, "context.resources.getDra…e.biz_timeline_star_icon)");
        drawable.setBounds(0, 0, i, i);
        C76003c cVar = new C76003c(drawable, 1);
        SpannableString spannableString = new SpannableString("@");
        spannableString.setSpan(cVar, 0, 1, 33);
        return spannableString;
    }

    /* renamed from: e */
    public final void mo33264e() {
        byte[] decodeBytes;
        C13601g gVar = f60144b;
        long decodeLong = ((MultiProcessMMKV) ((C36570n) gVar).getValue()).decodeLong("BizLastMsgId");
        long decodeLong2 = ((MultiProcessMMKV) ((C36570n) gVar).getValue()).decodeLong("BizLastMsgTime");
        C22221f fVar = C22221f.f62962a;
        StringBuilder sb = new StringBuilder();
        sb.append(decodeLong);
        sb.append('-');
        sb.append(decodeLong2);
        String a = mo33260a(sb.toString());
        MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) fVar.findSlot(a);
        C47465a aVar = null;
        if (!(multiProcessMMKV == null || !multiProcessMMKV.containsKey(a) || (decodeBytes = multiProcessMMKV.decodeBytes(a)) == null)) {
            if (!(decodeBytes.length == 0)) {
                try {
                    C47465a newInstance = C52214z40.class.newInstance();
                    newInstance.parseFrom(decodeBytes);
                    aVar = newInstance;
                } catch (Exception e) {
                    Log.printErrStackTrace("MultiProcessMMKV.decodeProtoBuffer", e, "decode ProtoBuffer", new Object[0]);
                }
            }
        }
        f60145c = (C52214z40) aVar;
    }

    /* renamed from: f */
    public final C13604l<String, String> mo33265f(C19623o0 o0Var) {
        byte[] decodeBytes;
        C87412m.m108594g(o0Var, "info");
        C22221f fVar = C22221f.f62962a;
        MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) fVar.getSlotForWrite();
        String valueOf = String.valueOf(System.currentTimeMillis() / 43200000);
        if (!fVar.decodeBool("digest_show_" + false + '_' + o0Var.field_msgId + '_' + o0Var.field_createTime, false)) {
            multiProcessMMKV.encode(mo33261b(valueOf), fVar.decodeInt(mo33261b(valueOf), 0) + 1);
            multiProcessMMKV.encode("digest_show_" + false + '_' + o0Var.field_msgId + '_' + o0Var.field_createTime, true);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(o0Var.field_msgId);
        sb.append('-');
        sb.append(o0Var.field_createTime);
        String a = mo33260a(sb.toString());
        MultiProcessMMKV multiProcessMMKV2 = (MultiProcessMMKV) fVar.findSlot(a);
        C47465a aVar = null;
        if (!(multiProcessMMKV2 == null || !multiProcessMMKV2.containsKey(a) || (decodeBytes = multiProcessMMKV2.decodeBytes(a)) == null)) {
            if (!(decodeBytes.length == 0)) {
                try {
                    C47465a newInstance = C52214z40.class.newInstance();
                    newInstance.parseFrom(decodeBytes);
                    aVar = newInstance;
                } catch (Exception e) {
                    Log.printErrStackTrace("MultiProcessMMKV.decodeProtoBuffer", e, "decode ProtoBuffer", new Object[0]);
                }
            }
        }
        C52214z40 z402 = (C52214z40) aVar;
        if (z402 == null) {
            return new C13604l<>("", "");
        }
        Log.m105918d("MicroMsg.BizDigestUtil", "onDigestExpose digest " + z402.f145684e + " showingCustomDigest=" + false);
        return new C13604l<>("", "");
    }

    /* renamed from: g */
    public final void mo33266g(String str, C52214z40 z402, MultiProcessMMKV multiProcessMMKV) {
        try {
            multiProcessMMKV.encode(str, z402.toByteArray());
        } catch (Exception e) {
            Log.m105920e("MicroMsg.BizDigestUtil", "saveWebViewAlbumInfoInfo ex " + e.getMessage());
        }
    }

    /* renamed from: h */
    public final void mo33267h(C52214z40 z402, C19623o0 o0Var) {
        C87412m.m108594g(o0Var, "info");
        if (z402 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(o0Var.field_msgId);
            sb.append('-');
            sb.append(o0Var.field_createTime);
            mo33266g(mo33260a(sb.toString()), z402, (MultiProcessMMKV) C22221f.f62962a.getSlotForWrite());
        }
    }
}
