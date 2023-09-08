package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.plugin.ipcall.model.C105385g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import p196ln.C10579k;
import p196ln.C76706g;
import s12.C13612c;
import s12.C13614k;
import s12.C13615l;
import t12.C110899d;
import t12.C13818a;
import wc3.C15131b;
import zh3.C91753f;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.r0 */
public class C4709r0 extends C6975i1<C13612c> implements C10579k.C10580a {

    /* renamed from: t */
    public static final /* synthetic */ int f19698t = 0;

    /* renamed from: o */
    public C94154k f19699o;

    /* renamed from: p */
    public HashMap<Long, C13612c> f19700p = new HashMap<>();

    /* renamed from: q */
    public ArrayList<C13614k> f19701q;

    /* renamed from: r */
    public HashSet<String> f19702r = new HashSet<>();

    /* renamed from: s */
    public View.OnClickListener f19703s = new C4710a();

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.r0$a */
    public class C4710a implements View.OnClickListener {
        public C4710a() {
        }

        public void onClick(View view) {
            Class<IPCallTalkUI> cls = IPCallTalkUI.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallRecentRecordAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.getTag() instanceof Integer) {
                int intValue = ((Integer) view.getTag()).intValue();
                C4709r0 r0Var = C4709r0.this;
                int i = C4709r0.f19698t;
                if (!C110899d.m151189c(r0Var.f24696e)) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallRecentRecordAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C13614k kVar = C4709r0.this.f19701q.get(intValue);
                C13612c cVar = null;
                long j = kVar.field_addressId;
                if (j > 0) {
                    cVar = C4709r0.this.f19700p.containsKey(Long.valueOf(j)) ? C4709r0.this.f19700p.get(Long.valueOf(kVar.field_addressId)) : C105385g.vx0().mo13007Yt(kVar.field_addressId);
                    if (cVar != null) {
                        C4709r0.this.f19700p.put(Long.valueOf(kVar.field_addressId), cVar);
                    }
                }
                if (cVar != null) {
                    Intent intent = new Intent(C4709r0.this.f24696e, cls);
                    intent.putExtra("IPCallTalkUI_phoneNumber", kVar.field_phonenumber);
                    intent.putExtra("IPCallTalkUI_contactId", cVar.field_contactId);
                    intent.putExtra("IPCallTalkUI_nickname", cVar.field_systemAddressBookUsername);
                    intent.putExtra("IPCallTalkUI_toWechatUsername", cVar.field_wechatUsername);
                    intent.putExtra("IPCallTalkUI_dialScene", 3);
                    C115669n.INSTANCE.mo160131h(12059, 0, 0, 0, 0, 3);
                    ((FragmentActivity) C4709r0.this.f24696e).startActivityForResult(intent, 1001);
                } else {
                    Intent intent2 = new Intent(C4709r0.this.f24696e, cls);
                    intent2.putExtra("IPCallTalkUI_phoneNumber", kVar.field_phonenumber);
                    intent2.putExtra("IPCallTalkUI_dialScene", 3);
                    C115669n.INSTANCE.mo160131h(12059, 0, 0, 0, 0, 3);
                    ((FragmentActivity) C4709r0.this.f24696e).startActivityForResult(intent2, 1001);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallRecentRecordAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.r0$b */
    public class C4711b implements Runnable {
        public C4711b() {
        }

        public void run() {
            C4709r0.this.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.r0$c */
    public class C4712c {

        /* renamed from: a */
        public ImageView f19706a;

        /* renamed from: b */
        public TextView f19707b;

        /* renamed from: c */
        public TextView f19708c;

        /* renamed from: d */
        public LinearLayout f19709d;

        /* renamed from: e */
        public TextView f19710e;

        /* renamed from: f */
        public TextView f19711f;

        /* renamed from: g */
        public TextView f19712g;

        /* renamed from: h */
        public TextView f19713h;

        /* renamed from: i */
        public ImageView f19714i;

        /* renamed from: j */
        public View f19715j;

        /* renamed from: k */
        public View f19716k;

        /* renamed from: l */
        public View f19717l;

        /* renamed from: m */
        public ImageView f19718m;

        public C4712c(C4709r0 r0Var, C4710a aVar) {
        }
    }

    public C4709r0(Context context) {
        super(context, null);
        mo7997q(true);
        this.f19699o = new C94154k(context);
        ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93557b(this);
    }

    /* renamed from: X */
    public void mo1428X(String str) {
        if (this.f19702r.contains(str)) {
            MMHandlerThread.postToMainThread(new C4711b());
        }
    }

    /* renamed from: d */
    public Object mo1330d(Object obj, Cursor cursor) {
        C13612c cVar = (C13612c) obj;
        if (cVar == null) {
            cVar = new C13612c();
        }
        cVar.convertFrom(cursor);
        return cVar;
    }

    public int getCount() {
        if (this.f19701q == null) {
            mo5617s();
        }
        ArrayList<C13614k> arrayList = this.f19701q;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public int getItemViewType(int i) {
        return super.getItemViewType(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C13612c cVar;
        if (view == null) {
            view = LayoutInflater.from(this.f24696e).inflate(C0966R.C0971layout.b2f, viewGroup, false);
            C4712c cVar2 = new C4712c(this, (C4710a) null);
            cVar2.f19716k = view.findViewById(C0966R.C0970id.faj);
            cVar2.f19717l = view.findViewById(C0966R.C0970id.c8_);
            cVar2.f19706a = (ImageView) view.findViewById(C0966R.C0970id.a27);
            cVar2.f19707b = (TextView) view.findViewById(C0966R.C0970id.hg4);
            cVar2.f19708c = (TextView) view.findViewById(C0966R.C0970id.hvq);
            cVar2.f19709d = (LinearLayout) view.findViewById(C0966R.C0970id.ifh);
            cVar2.f19710e = (TextView) view.findViewById(C0966R.C0970id.ifl);
            cVar2.f19711f = (TextView) view.findViewById(C0966R.C0970id.ifm);
            cVar2.f19712g = (TextView) view.findViewById(C0966R.C0970id.f5632kc);
            cVar2.f19713h = (TextView) view.findViewById(C0966R.C0970id.f5622k3);
            cVar2.f19714i = (ImageView) view.findViewById(C0966R.C0970id.f5623k4);
            View findViewById = view.findViewById(C0966R.C0970id.fan);
            cVar2.f19715j = findViewById;
            findViewById.setClickable(true);
            cVar2.f19718m = (ImageView) view.findViewById(C0966R.C0970id.c7p);
            view.setTag(cVar2);
        }
        C4712c cVar3 = (C4712c) view.getTag();
        cVar3.f19715j.setClickable(true);
        cVar3.f19715j.setTag(Integer.valueOf(i));
        cVar3.f19718m.setVisibility(8);
        if (mo7996n(i)) {
            cVar3.f19707b.setVisibility(8);
            cVar3.f19708c.setVisibility(8);
            cVar3.f19709d.setVisibility(8);
            cVar3.f19706a.setVisibility(8);
            cVar3.f19706a.setTag((Object) null);
            cVar3.f19713h.setVisibility(8);
            cVar3.f19712g.setVisibility(8);
            cVar3.f19714i.setVisibility(8);
        } else {
            C13614k kVar = this.f19701q.get(i);
            if (kVar != null) {
                if (i == 0) {
                    cVar3.f19713h.setVisibility(0);
                    cVar3.f19712g.setVisibility(8);
                    cVar3.f19713h.setText(this.f24696e.getString(C0966R.string.fux));
                } else {
                    cVar3.f19713h.setVisibility(8);
                    cVar3.f19712g.setVisibility(8);
                }
                cVar3.f19718m.setVisibility(0);
                cVar3.f19707b.setVisibility(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cVar3.f19716k.getLayoutParams();
                layoutParams.height = (int) cVar3.f19708c.getContext().getResources().getDimension(C0966R.dimen.f4042pe);
                cVar3.f19716k.setLayoutParams(layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) cVar3.f19706a.getLayoutParams();
                layoutParams2.height = (int) cVar3.f19706a.getContext().getResources().getDimension(C0966R.dimen.aw6);
                layoutParams2.width = (int) cVar3.f19706a.getContext().getResources().getDimension(C0966R.dimen.aw6);
                cVar3.f19706a.setLayoutParams(layoutParams2);
                long j = kVar.field_addressId;
                if (j > 0) {
                    cVar = this.f19700p.containsKey(Long.valueOf(j)) ? this.f19700p.get(Long.valueOf(kVar.field_addressId)) : C105385g.vx0().mo13007Yt(kVar.field_addressId);
                    if (cVar != null) {
                        this.f19700p.put(Long.valueOf(kVar.field_addressId), cVar);
                        cVar3.f19707b.setText(cVar.field_systemAddressBookUsername);
                    }
                } else {
                    cVar3.f19707b.setText(C13818a.m13108d(kVar.field_phonenumber));
                    cVar = null;
                }
                cVar3.f19708c.setVisibility(8);
                cVar3.f19709d.setVisibility(0);
                cVar3.f19711f.setText(C110899d.m151188b(kVar.field_calltime));
                long j2 = kVar.field_duration;
                if (j2 > 0) {
                    cVar3.f19710e.setText(C110899d.m151187a(j2));
                } else {
                    cVar3.f19710e.setText(C110899d.m151195i(kVar.field_status));
                }
                ImageView imageView = cVar3.f19706a;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    imageView.setTag((Object) null);
                    imageView.setImageResource(C0966R.C0969drawable.c4q);
                    if (cVar != null) {
                        if (!Util.isNullOrNil(cVar.field_contactId) && !Util.isNullOrNil(cVar.field_wechatUsername)) {
                            this.f19699o.mo129345d(cVar.field_contactId, cVar.field_wechatUsername, imageView);
                        } else if (!Util.isNullOrNil(cVar.field_contactId)) {
                            this.f19699o.mo129344c(cVar.field_contactId, imageView);
                        } else if (!Util.isNullOrNil(cVar.field_wechatUsername)) {
                            this.f19699o.mo129347f(cVar.field_wechatUsername, imageView);
                        }
                        if (!Util.isNullOrNil(cVar.field_wechatUsername)) {
                            this.f19702r.add(cVar.field_wechatUsername);
                        }
                    }
                }
            }
            View view2 = cVar3.f19715j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallRecentRecordAdapter", "handleRencetContactView", "(ILcom/tencent/mm/plugin/ipcall/ui/IPCallRecentRecordAdapter$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/ipcall/ui/IPCallRecentRecordAdapter", "handleRencetContactView", "(ILcom/tencent/mm/plugin/ipcall/ui/IPCallRecentRecordAdapter$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            cVar3.f19714i.setVisibility(0);
            cVar3.f19715j.setOnClickListener(this.f19703s);
        }
        return view;
    }

    public int getViewTypeCount() {
        return super.getViewTypeCount();
    }

    /* renamed from: l */
    public void mo1332l() {
        mo5617s();
    }

    public void notifyDataSetChanged() {
        mo5617s();
        this.f19700p.clear();
        super.notifyDataSetChanged();
    }

    /* renamed from: o */
    public void mo1333o() {
        mo5617s();
    }

    /* renamed from: s */
    public final void mo5617s() {
        int i;
        long j;
        char c;
        int i2;
        long j2;
        long currentTimeMillis = System.currentTimeMillis();
        C13615l Cx0 = C105385g.Cx0();
        Calendar instance = Calendar.getInstance();
        instance.add(6, -30);
        long timeInMillis = instance.getTimeInMillis();
        ISQLiteDatabase iSQLiteDatabase = Cx0.f38583d;
        String[] strArr = C13615l.f38582f;
        int i3 = 1;
        char c2 = 0;
        Cursor query = iSQLiteDatabase.query("IPCallRecord", strArr, "calltime>=?", new String[]{timeInMillis + ""}, "addressId, phonenumber", (String) null, "calltime desc");
        if (query.getCount() < 30) {
            query.close();
            String[] strArr2 = strArr;
            i = 30;
            query = C105385g.Cx0().f38583d.query("IPCallRecord", strArr2, (String) null, (String[]) null, "addressId, phonenumber", (String) null, "calltime desc");
        } else {
            i = 30;
        }
        Log.m105919d("MicroMsg.IPCallRecordStorageLogic", "finish query used %dms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        HashMap hashMap = new HashMap();
        ArrayList<C13614k> arrayList = new ArrayList<>();
        try {
            if (query.moveToFirst()) {
                while (true) {
                    if (query.isAfterLast()) {
                        break;
                    } else if (arrayList.size() > i) {
                        break;
                    } else {
                        C13614k kVar = new C13614k();
                        kVar.convertFrom(query);
                        if (kVar.field_addressId != -1) {
                            if (!hashMap.containsKey(kVar.field_addressId + "")) {
                                hashMap.put(kVar.field_addressId + "", kVar);
                                arrayList.add(kVar);
                            }
                            j = currentTimeMillis;
                        } else {
                            Context context = MMApplicationContext.getContext();
                            String f = C13818a.m13110f(context, kVar.field_phonenumber);
                            C13612c Ow = C105385g.vx0().mo13006Ow(!Util.isNullOrNil(f) ? C15131b.m14239c(f, context) : null);
                            if (Ow != null) {
                                ISQLiteDatabase iSQLiteDatabase2 = C105385g.Cx0().f38583d;
                                if (iSQLiteDatabase2 instanceof C91753f) {
                                    j2 = ((C91753f) iSQLiteDatabase2).mo125613a();
                                    j = currentTimeMillis;
                                } else {
                                    j = currentTimeMillis;
                                    j2 = -1;
                                }
                                try {
                                    C13615l Cx02 = C105385g.Cx0();
                                    String str = kVar.field_phonenumber;
                                    ISQLiteDatabase iSQLiteDatabase3 = Cx02.f38583d;
                                    String[] strArr3 = C13615l.f38582f;
                                    String[] strArr4 = new String[i3];
                                    strArr4[c2] = str;
                                    Cursor query2 = iSQLiteDatabase3.query("IPCallRecord", strArr3, "phonenumber=?", strArr4, (String) null, (String) null, "calltime desc");
                                    if (query2.moveToFirst()) {
                                        while (!query2.isAfterLast()) {
                                            C13614k kVar2 = new C13614k();
                                            kVar2.convertFrom(query2);
                                            kVar2.field_addressId = Ow.systemRowid;
                                            C105385g.Cx0().mo13011Lo(kVar2);
                                            query2.moveToNext();
                                        }
                                    }
                                    ISQLiteDatabase iSQLiteDatabase4 = C105385g.Cx0().f38583d;
                                    if ((iSQLiteDatabase4 instanceof C91753f) && j2 != -1) {
                                        ((C91753f) iSQLiteDatabase4).endTransaction(j2);
                                    }
                                    if (!hashMap.containsKey(kVar.field_addressId + "")) {
                                        hashMap.put(kVar.field_addressId + "", kVar);
                                        arrayList.add(kVar);
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    i2 = 1;
                                    try {
                                        c = 0;
                                        Log.m105921e("MicroMsg.IPCallRecordStorageLogic", "getRecentRecordGroupByUser error: %s", e.getMessage());
                                        query.close();
                                        Object[] objArr = new Object[i2];
                                        objArr[c] = Long.valueOf(System.currentTimeMillis() - j);
                                        Log.m105919d("MicroMsg.IPCallRecordStorageLogic", "getRecentRecordGroupByUser, used: %dms", objArr);
                                        this.f19701q = arrayList;
                                    } catch (Throwable th) {
                                        query.close();
                                        throw th;
                                    }
                                }
                            } else {
                                j = currentTimeMillis;
                                if (!hashMap.containsKey(kVar.field_phonenumber)) {
                                    hashMap.put(kVar.field_phonenumber, kVar);
                                    arrayList.add(kVar);
                                }
                            }
                        }
                        query.moveToNext();
                        currentTimeMillis = j;
                        i = 30;
                        i3 = 1;
                        c2 = 0;
                    }
                }
            }
            j = currentTimeMillis;
            query.close();
            i2 = 1;
            c = 0;
        } catch (Exception e2) {
            e = e2;
            j = currentTimeMillis;
            i2 = 1;
            c = 0;
            Log.m105921e("MicroMsg.IPCallRecordStorageLogic", "getRecentRecordGroupByUser error: %s", e.getMessage());
            query.close();
            Object[] objArr2 = new Object[i2];
            objArr2[c] = Long.valueOf(System.currentTimeMillis() - j);
            Log.m105919d("MicroMsg.IPCallRecordStorageLogic", "getRecentRecordGroupByUser, used: %dms", objArr2);
            this.f19701q = arrayList;
        }
        Object[] objArr22 = new Object[i2];
        objArr22[c] = Long.valueOf(System.currentTimeMillis() - j);
        Log.m105919d("MicroMsg.IPCallRecordStorageLogic", "getRecentRecordGroupByUser, used: %dms", objArr22);
        this.f19701q = arrayList;
    }
}
