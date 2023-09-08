package com.tencent.p014mm.p136ui.contact;

import android.database.Cursor;
import android.database.MergeCursor;
import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import ge0.C32415b;
import gl3.C75922b;
import gl3.C75939h;
import gl3.C75957r;
import he0.C76158j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import re0.C36307d;

/* renamed from: com.tencent.mm.ui.contact.c3 */
public class C44875c3 extends C74526m1 implements MStorageEx.IOnStorageChange {

    /* renamed from: n */
    public final String f121737n;

    /* renamed from: o */
    public HashMap<String, Integer> f121738o = null;

    /* renamed from: p */
    public SparseArray<String> f121739p = null;

    /* renamed from: q */
    public Cursor f121740q;

    /* renamed from: com.tencent.mm.ui.contact.c3$a */
    public static class C44876a {
    }

    public C44875c3(String str, MMBaseSelectContactUI mMBaseSelectContactUI, List<String> list, boolean z, C44876a aVar) {
        super((C74493g1) mMBaseSelectContactUI, list, false, z, false);
        this.f121737n = str;
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().add(this);
        mo7853r();
    }

    public int getCount() {
        return this.f121740q.getCount() + this.f121738o.size();
    }

    /* renamed from: h */
    public C75922b mo7850h(int i) {
        if (this.f121739p.indexOfKey(i) >= 0) {
            C75957r rVar = new C75957r(i);
            rVar.f222731x = this.f121739p.get(i);
            return rVar;
        }
        int i2 = i;
        int i3 = 0;
        while (i3 <= this.f121739p.size()) {
            if (this.f121739p.indexOfKey(i2) >= 0) {
                i3++;
            }
            i2--;
            if (i2 < 0) {
                break;
            }
        }
        int i4 = i - i3;
        if (this.f121740q.moveToPosition(i4)) {
            Log.m105919d("MicroMsg.OpenIMSelectContactAdapter", "create contact item position=%d | index=%d", Integer.valueOf(i), Integer.valueOf(i4));
            C72996z1 z1Var = new C72996z1();
            z1Var.convertFrom(this.f121740q);
            C75939h hVar = new C75939h(i);
            hVar.mo106181j(z1Var);
            hVar.f222608e = this.f219057f;
            hVar.f222611h = this.f219058g;
            hVar.f222679E = true;
            return hVar;
        }
        Log.m105925i("MicroMsg.OpenIMSelectContactAdapter", "create contact item error: position=%d | index=%d", Integer.valueOf(i), Integer.valueOf(i4));
        return null;
    }

    /* renamed from: i */
    public void mo7851i() {
        mo103564g();
        Log.m105924i("MicroMsg.OpenIMSelectContactAdapter", "finish!");
        Cursor cursor = this.f121740q;
        if (cursor != null) {
            cursor.close();
            this.f121740q = null;
        }
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().remove(this);
    }

    /* renamed from: n */
    public boolean mo70169n(C75922b bVar) {
        return this.f121739p.indexOfKey(bVar.f222605b + 1) >= 0;
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        mo7853r();
        notifyDataSetChanged();
    }

    /* renamed from: q */
    public int mo7852q(String str) {
        if (str.equals("↑")) {
            return 0;
        }
        HashMap<String, Integer> hashMap = this.f121738o;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return -1;
        }
        return this.f121738o.get(str).intValue() + this.f219055d.mo7831f6().getHeaderViewsCount();
    }

    /* renamed from: r */
    public void mo7853r() {
        HashMap<String, Integer> hashMap = this.f121738o;
        if (hashMap != null) {
            hashMap.clear();
        } else {
            this.f121738o = new HashMap<>();
        }
        SparseArray<String> sparseArray = this.f121739p;
        if (sparseArray != null) {
            sparseArray.clear();
        } else {
            this.f121739p = new SparseArray<>();
        }
        ArrayList arrayList = new ArrayList();
        C36307d wx02 = ((C32415b) C86312j.m106911c(C32415b.class)).wx0();
        String str = this.f121737n;
        wx02.getClass();
        LinkedList linkedList = new LinkedList();
        Cursor rawQuery = wx02.f96659d.rawQuery("select distinct appid from OpenIMAppIdInfo where appid=? ", new String[]{str}, 2);
        if (rawQuery.moveToFirst()) {
            do {
                String string = rawQuery.getString(0);
                if (!Util.isNullOrNil(string)) {
                    linkedList.add(string);
                }
            } while (rawQuery.moveToNext());
        }
        rawQuery.close();
        arrayList.add(C97625j3.m125812b().mo105907v().mo69657I3(this.f219096j, LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()), linkedList));
        Cursor e3 = C97625j3.m125812b().mo105907v().mo69693e3("select rcontact.username ,rcontact.nickname ,rcontact.alias,rcontact.conRemark,rcontact.verifyFlag,rcontact.showHead,rcontact.weiboFlag,rcontact.rowid ,rcontact.deleteFlag,rcontact.lvbuff,rcontact.descWordingId, rcontact.openImAppid,  OpenIMWordingInfo.wording, OpenIMWordingInfo.quanpin  from rcontact left join OpenIMWordingInfo on rcontact.descWordingId=OpenIMWordingInfo.wordingId  and OpenIMWordingInfo.language='zh_CN'  where (type & 1!=0) and type & 32=0   and type & 8=0 and username like '%@openim' and username != 'appbrandcustomerservicemsg' and username != 'notifymessage' and username != 'weibo' and username != 'pc_share' and username != 'officialaccounts' and username != 'voicevoipapp' and username != 'cardpackage' and username != 'qqfriend' and username != 'helper_entry' and username != 'medianote' and username != 'shakeapp' and username != 'topstoryapp' and username != 'qmessage' and username != 'voipapp' and username != 'qqsync' and username != 'qqmail' and username != 'blogapp' and username != 'lbsapp' and username != 'readerapp' and username != 'feedsapp' and username != 'newsapp' and username != 'floatbottle' and username != 'fmessage' and username != 'tmessage' and username != 'weixin' and username != 'facebookapp' and username != 'meishiapp' and username != 'masssendapp' and username != 'voiceinputapp' and username != 'filehelper' and username != 'linkedinplugin' group by rcontact.openImAppid");
        ArrayList arrayList2 = new ArrayList();
        if (e3.moveToFirst()) {
            do {
                C72996z1 z1Var = new C72996z1();
                z1Var.convertFrom(e3);
                arrayList2.add(z1Var);
            } while (e3.moveToNext());
        }
        e3.close();
        Cursor b3 = C97625j3.m125812b().mo105907v().mo69686b3(this.f219096j, LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()), linkedList);
        int[] iArr = new int[b3.getCount()];
        if (b3.moveToFirst()) {
            int i = 0;
            do {
                iArr[i] = b3.getInt(0);
                i++;
            } while (b3.moveToNext());
        }
        b3.close();
        Cursor c3 = C97625j3.m125812b().mo105907v().mo69689c3(this.f219096j, LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()), linkedList);
        if (c3.moveToFirst()) {
            int i2 = 0;
            int i3 = 0;
            do {
                C72996z1 z1Var2 = new C72996z1();
                z1Var2.convertFrom(c3);
                String wo = ((C76158j) C86312j.m106911c(C76158j.class)).mo106373wo(this.f121737n, z1Var2.mo73976t2());
                this.f121738o.put(wo, Integer.valueOf(i2));
                this.f121739p.put(i2, wo);
                i2 = i2 + 1 + iArr[i3];
                i3++;
            } while (c3.moveToNext());
        }
        c3.close();
        Log.m105919d("MicroMsg.OpenIMSelectContactAdapter", "headerPosMap=%s", this.f121738o.toString());
        this.f121740q = new MergeCursor((Cursor[]) arrayList.toArray(new Cursor[0]));
        notifyDataSetChanged();
    }
}
