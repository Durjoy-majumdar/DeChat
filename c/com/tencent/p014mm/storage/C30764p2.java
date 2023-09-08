package com.tencent.p014mm.storage;

import a14.C0001s1;
import a14.C53895h;
import a14.C53934p0;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import ky2.C10432i;
import wh3.C15405b0;
import wh3.C38131e;
import wh3.C38132f;
import wx3.C15601d;
import wx3.C66212f;
import z51.C39315g;
import zt3.C119157j;

/* renamed from: com.tencent.mm.storage.p2 */
public class C30764p2 {

    /* renamed from: j */
    public static final C30764p2 f82718j = new C30764p2();

    /* renamed from: a */
    public boolean f82719a = false;

    /* renamed from: b */
    public String f82720b;

    /* renamed from: c */
    public HashMap<String, String> f82721c = new HashMap<>();

    /* renamed from: d */
    public HashMap<String, ArrayList<String>> f82722d = new HashMap<>();

    /* renamed from: e */
    public HashMap<String, String> f82723e = new HashMap<>();

    /* renamed from: f */
    public final HashMap<String, ArrayList<p2$$e>> f82724f = new HashMap<>();

    /* renamed from: g */
    public final HashMap<String, ArrayList<p2$$e>> f82725g = new HashMap<>();

    /* renamed from: h */
    public int f82726h = 0;

    /* renamed from: i */
    public Comparator<p2$$e> f82727i = new p2$$c(this);

    /* renamed from: a */
    public final void mo57674a(ArrayList<C38131e> arrayList, int i) {
        Iterator<C38131e> it = arrayList.iterator();
        while (it.hasNext()) {
            C38131e next = it.next();
            String str = next.field_desc;
            String str2 = next.field_md5;
            String str3 = next.field_lang;
            if (!Util.isNullOrNil(str) && !Util.isNullOrNil(str3)) {
                String lowerCase = str.toLowerCase();
                if (this.f82724f.containsKey(lowerCase)) {
                    ArrayList arrayList2 = this.f82724f.get(lowerCase);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(new p2$$e(this, str2, i, -1, -1));
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new p2$$e(this, str2, i, -1, -1));
                    this.f82724f.put(lowerCase, arrayList3);
                }
                if (str3.equals(this.f82720b)) {
                    this.f82721c.put(str2, lowerCase);
                } else if (str3.equals("default") && !this.f82721c.containsKey(str2)) {
                    this.f82721c.put(str2, lowerCase);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo57675b() {
        HashMap<String, String> hashMap = this.f82721c;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, ArrayList<String>> hashMap2 = this.f82722d;
        if (hashMap2 != null) {
            hashMap2.clear();
        }
        HashMap<String, String> hashMap3 = this.f82723e;
        if (hashMap3 != null) {
            hashMap3.clear();
        }
        this.f82724f.clear();
        this.f82725g.clear();
    }

    /* renamed from: c */
    public String mo57676c(String str) {
        HashMap<String, String> hashMap = this.f82721c;
        if (hashMap == null || !hashMap.containsKey(str)) {
            Log.m105924i("MicroMsg.emoji.EmojiDescNewMgr", "getCurLangDesc: from db");
            C38132f a = ((C39315g) C86312j.m106911c(C39315g.class)).mo58034O6().mo57714a();
            a.getClass();
            String format = String.format("select %s from %s where %s=?", new Object[]{"desc", "EmojiInfoDesc", "md5_lang"});
            Cursor rawQuery = a.f100771d.rawQuery(format, new String[]{str + LocaleUtil.getApplicationLanguage().toLowerCase()}, 2);
            String string = rawQuery.moveToFirst() ? rawQuery.getString(rawQuery.getColumnIndex("desc")) : null;
            rawQuery.close();
            if (Util.isNullOrNil(string)) {
                Cursor rawQuery2 = a.f100771d.rawQuery(format, new String[]{str + "default"}, 2);
                if (rawQuery2.moveToFirst()) {
                    string = rawQuery2.getString(rawQuery2.getColumnIndex("desc"));
                }
                rawQuery2.close();
            }
            return string;
        }
        Log.m105924i("MicroMsg.emoji.EmojiDescNewMgr", "getCurLangDesc: from map");
        return this.f82721c.get(str);
    }

    /* renamed from: d */
    public boolean mo57677d() {
        if (!((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_custom_emoji_recognition, false) || ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            return false;
        }
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null);
        return !Util.isNullOrNil(str) && str.toUpperCase().equals("CN");
    }

    /* renamed from: e */
    public boolean mo57678e() {
        return mo57677d() && !C30777t2.f82756d.vx0() && (C75592q0.m90781k() & 1152921504606846976L) != 0;
    }

    /* renamed from: f */
    public final boolean mo57679f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f82725g.containsKey(str)) {
            return true;
        }
        if (this.f82726h <= 0 || str.length() > 32 || mo57678e()) {
            return false;
        }
        int a = C45078p0.m49922a(str);
        return (a <= 0 || a != str.length()) ? str.length() + a >= this.f82726h * 2 : str.length() >= this.f82726h;
    }

    /* renamed from: g */
    public void mo57680g() {
        ((C119157j) C119157j.f356862d).mo183876g(new p2$$d(this), "MicroMsg.emoji.EmojiDescNewMgr|newinit");
    }

    /* renamed from: h */
    public void mo57681h(boolean z) {
        Log.m105924i("MicroMsg.emoji.EmojiDescNewMgr", "setCustomEmotionRecognitionEnabled: enabled=" + z);
        C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C15405b0(z, (C15601d<? super C15405b0>) null), 3, (Object) null);
        long k = C75592q0.m90781k();
        C75592q0.m90769Q(Long.valueOf(z ? k | 1152921504606846976L : k & -1152921504606846977L));
        mo57680g();
    }

    /* renamed from: i */
    public final String mo57682i(String str) {
        String replace = str.toLowerCase().replace(" ", "");
        if (replace == null) {
            return null;
        }
        char[] charArray = replace.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == 12288) {
                charArray[i] = ' ';
            } else if (c > 65280 && c < 65375) {
                charArray[i] = (char) (c - 65248);
            }
        }
        return new String(charArray);
    }
}
