package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import kv1.C99254i;
import p196ln.C10579k;
import p196ln.C76706g;
import p447aw.C103918d;
import s12.C13611b;
import s12.C13612c;
import sf0.C77691f;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.j */
public class C4684j extends C6975i1<C13612c> implements C10579k.C10580a {

    /* renamed from: x */
    public static HashMap<String, C13612c> f19652x;

    /* renamed from: o */
    public C94154k f19653o;

    /* renamed from: p */
    public Context f19654p;

    /* renamed from: q */
    public HashMap<Long, C13612c> f19655q = new HashMap<>();

    /* renamed from: r */
    public HashMap<String, Integer> f19656r = new HashMap<>();

    /* renamed from: s */
    public HashSet<String> f19657s = new HashSet<>();

    /* renamed from: t */
    public String f19658t;

    /* renamed from: u */
    public boolean f19659u = false;

    /* renamed from: v */
    public boolean f19660v = false;

    /* renamed from: w */
    public View.OnClickListener f19661w = new C4685a();

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.j$a */
    public class C4685a implements View.OnClickListener {
        public C4685a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.getTag() instanceof Integer) {
                C13612c t = C4684j.this.getItem(((Integer) view.getTag()).intValue());
                Intent intent = new Intent(C4684j.this.f24696e, IPCallUserProfileUI.class);
                intent.putExtra("IPCallProfileUI_contactid", t.field_contactId);
                intent.putExtra("IPCallProfileUI_systemUsername", t.field_systemAddressBookUsername);
                intent.putExtra("IPCallProfileUI_wechatUsername", t.field_wechatUsername);
                Context context = C4684j.this.f24696e;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.j$b */
    public class C4686b implements Runnable {
        public C4686b() {
        }

        public void run() {
            C4684j.this.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.j$c */
    public class C4687c {

        /* renamed from: a */
        public String f19664a;

        /* renamed from: b */
        public String f19665b;

        public C4687c(C4684j jVar, String str, String str2) {
            this.f19665b = str2;
            this.f19664a = str;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.j$d */
    public class C4688d {

        /* renamed from: a */
        public ImageView f19666a;

        /* renamed from: b */
        public TextView f19667b;

        /* renamed from: c */
        public TextView f19668c;

        /* renamed from: d */
        public LinearLayout f19669d;

        /* renamed from: e */
        public TextView f19670e;

        /* renamed from: f */
        public TextView f19671f;

        /* renamed from: g */
        public ImageView f19672g;

        /* renamed from: h */
        public View f19673h;

        /* renamed from: i */
        public View f19674i;

        /* renamed from: j */
        public View f19675j;

        /* renamed from: k */
        public ImageView f19676k;

        public C4688d(C4684j jVar, C4685a aVar) {
        }
    }

    public C4684j(Context context) {
        super(context, null);
        new PhoneFormater();
        mo7997q(true);
        this.f19654p = context;
        this.f19653o = new C94154k(context);
        ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93557b(this);
    }

    /* renamed from: X */
    public void mo1428X(String str) {
        if (this.f19657s.contains(str)) {
            MMHandlerThread.postToMainThread(new C4686b());
        }
    }

    /* renamed from: b */
    public void mo5580b() {
        super.mo5580b();
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
        return super.getCount();
    }

    public int getItemViewType(int i) {
        return super.getItemViewType(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        HashMap<String, C13612c> hashMap;
        HashMap<String, C13612c> hashMap2;
        if (view == null) {
            View inflate = LayoutInflater.from(this.f24696e).inflate(C0966R.C0971layout.b2f, viewGroup, false);
            C4688d dVar = new C4688d(this, (C4685a) null);
            dVar.f19674i = inflate.findViewById(C0966R.C0970id.faj);
            dVar.f19675j = inflate.findViewById(C0966R.C0970id.c8_);
            dVar.f19666a = (ImageView) inflate.findViewById(C0966R.C0970id.a27);
            dVar.f19667b = (TextView) inflate.findViewById(C0966R.C0970id.hg4);
            dVar.f19668c = (TextView) inflate.findViewById(C0966R.C0970id.hvq);
            dVar.f19669d = (LinearLayout) inflate.findViewById(C0966R.C0970id.ifh);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.ifl);
            TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.ifm);
            dVar.f19670e = (TextView) inflate.findViewById(C0966R.C0970id.f5632kc);
            dVar.f19671f = (TextView) inflate.findViewById(C0966R.C0970id.f5622k3);
            dVar.f19672g = (ImageView) inflate.findViewById(C0966R.C0970id.f5623k4);
            View findViewById = inflate.findViewById(C0966R.C0970id.fan);
            dVar.f19673h = findViewById;
            findViewById.setClickable(true);
            dVar.f19676k = (ImageView) inflate.findViewById(C0966R.C0970id.c7p);
            inflate.setTag(dVar);
            view2 = inflate;
        } else {
            view2 = view;
        }
        C4688d dVar2 = (C4688d) view2.getTag();
        dVar2.f19673h.setClickable(true);
        dVar2.f19673h.setTag(Integer.valueOf(i));
        dVar2.f19676k.setVisibility(8);
        if (mo7996n(i)) {
            dVar2.f19667b.setVisibility(8);
            dVar2.f19668c.setVisibility(8);
            dVar2.f19669d.setVisibility(8);
            dVar2.f19666a.setVisibility(8);
            dVar2.f19666a.setTag((Object) null);
            dVar2.f19671f.setVisibility(8);
            dVar2.f19670e.setVisibility(8);
            dVar2.f19672g.setVisibility(8);
        } else {
            C13612c t = getItem(i);
            if (t != null) {
                if (!Util.isNullOrNil(t.field_systemAddressBookUsername)) {
                    dVar2.f19667b.setVisibility(0);
                    if (this.f19659u) {
                        dVar2.f19668c.setVisibility(0);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dVar2.f19674i.getLayoutParams();
                        layoutParams.height = (int) dVar2.f19668c.getContext().getResources().getDimension(C0966R.dimen.aw8);
                        dVar2.f19674i.setLayoutParams(layoutParams);
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) dVar2.f19666a.getLayoutParams();
                        layoutParams2.height = (int) dVar2.f19666a.getContext().getResources().getDimension(C0966R.dimen.f4041pd);
                        layoutParams2.width = (int) dVar2.f19666a.getContext().getResources().getDimension(C0966R.dimen.f4041pd);
                        dVar2.f19666a.setLayoutParams(layoutParams2);
                    } else {
                        dVar2.f19668c.setVisibility(8);
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) dVar2.f19674i.getLayoutParams();
                        layoutParams3.height = (int) dVar2.f19668c.getContext().getResources().getDimension(C0966R.dimen.f4042pe);
                        dVar2.f19674i.setLayoutParams(layoutParams3);
                        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) dVar2.f19666a.getLayoutParams();
                        layoutParams4.height = (int) dVar2.f19666a.getContext().getResources().getDimension(C0966R.dimen.aw6);
                        layoutParams4.width = (int) dVar2.f19666a.getContext().getResources().getDimension(C0966R.dimen.aw6);
                        dVar2.f19666a.setLayoutParams(layoutParams4);
                    }
                    if (this.f19659u && t.f38576t == null && (hashMap2 = f19652x) != null && hashMap2.containsKey(t.field_contactId)) {
                        t.f38576t = f19652x.get(t.field_contactId).f38576t;
                    } else if (this.f19659u && t.f38576t == null && ((hashMap = f19652x) == null || hashMap.containsKey(t.field_contactId))) {
                        String str = t.field_contactId;
                        String str2 = C13611b.f38573a;
                        ArrayList<String> arrayList = new ArrayList<>();
                        if (!((C103918d) C86312j.m106911c(C103918d.class)).Lb0(MMApplicationContext.getContext(), "android.permission.READ_CONTACTS")) {
                            Log.m105920e("MicroMsg.IPCallAddressBookInfoExtracter", "no contact permission");
                        } else {
                            Cursor query = MMApplicationContext.getContext().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, (String[]) null, "contact_id=?", new String[]{str}, (String) null);
                            if (query != null) {
                                try {
                                    if (query.moveToFirst()) {
                                        while (!query.isAfterLast()) {
                                            arrayList.add(query.getString(query.getColumnIndex("data1")));
                                            query.moveToNext();
                                        }
                                    }
                                } catch (Exception e) {
                                    Log.m105921e("MicroMsg.IPCallAddressBookInfoExtracter", "extractAddressItemFromCursor, error: %s, class: %s", e.getMessage(), e.getClass().getSimpleName());
                                } catch (Throwable th) {
                                    query.close();
                                    throw th;
                                }
                                query.close();
                            }
                        }
                        t.f38576t = arrayList;
                    }
                    if (!Util.isNullOrNil(this.f19658t) && (Util.isNum(this.f19658t.charAt(0)) || this.f19658t.startsWith("+"))) {
                        dVar2.f19668c.setText(C99254i.m129306c(this.f19654p, mo5590w(t, this.f19658t), PhoneFormater.formatMobileString(this.f19658t)));
                        dVar2.f19667b.setText(C99254i.m129306c(this.f19654p, t.field_systemAddressBookUsername, this.f19658t));
                    } else if (!Util.isNullOrNil(this.f19658t) && !Util.isNum(this.f19658t.charAt(0))) {
                        Context context = this.f19654p;
                        String str3 = t.field_systemAddressBookUsername;
                        String str4 = this.f19658t;
                        if (Util.isNullOrNil(str4) || Util.isNullOrNil(str3)) {
                            str4 = "";
                        } else if (!Util.isChinese(str4) && Util.isAllAlpha(str4)) {
                            ArrayList arrayList2 = new ArrayList();
                            int i2 = 0;
                            while (i2 < str3.length()) {
                                int i3 = i2 + 1;
                                String substring = str3.substring(i2, i3);
                                arrayList2.add(new C4687c(this, C77691f.m93686a(substring), substring));
                                i2 = i3;
                            }
                            for (int i4 = 2; i4 <= str3.length(); i4++) {
                                for (int i5 = 0; i5 <= str3.length() - i4; i5++) {
                                    String substring2 = str3.substring(i5, i5 + i4);
                                    arrayList2.add(new C4687c(this, C77691f.m93686a(substring2), substring2));
                                }
                            }
                            int i6 = 0;
                            while (true) {
                                if (i6 >= arrayList2.size()) {
                                    break;
                                }
                                C4687c cVar = (C4687c) arrayList2.get(i6);
                                if (cVar.f19664a.contains(str4)) {
                                    str4 = cVar.f19665b;
                                    break;
                                }
                                i6++;
                            }
                        }
                        dVar2.f19667b.setText(C99254i.m129306c(context, str3, str4));
                        dVar2.f19668c.setText(mo5590w(t, this.f19658t));
                    } else if (Util.isNullOrNil(this.f19658t)) {
                        dVar2.f19667b.setText(t.field_systemAddressBookUsername);
                    }
                } else {
                    dVar2.f19667b.setVisibility(8);
                    dVar2.f19668c.setVisibility(8);
                }
                ImageView imageView = dVar2.f19666a;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    imageView.setTag((Object) null);
                    imageView.setImageResource(C0966R.C0969drawable.c4q);
                    if (!Util.isNullOrNil(t.field_contactId) && !Util.isNullOrNil(t.field_wechatUsername)) {
                        this.f19653o.mo129345d(t.field_contactId, t.field_wechatUsername, imageView);
                    } else if (!Util.isNullOrNil(t.field_contactId)) {
                        this.f19653o.mo129344c(t.field_contactId, imageView);
                    } else if (!Util.isNullOrNil(t.field_wechatUsername)) {
                        this.f19653o.mo129347f(t.field_wechatUsername, imageView);
                    }
                    if (!Util.isNullOrNil(t.field_wechatUsername)) {
                        this.f19657s.add(t.field_wechatUsername);
                    }
                }
                dVar2.f19669d.setVisibility(8);
                String u = mo5589u(t.field_sortKey);
                if (i == 0) {
                    dVar2.f19670e.setVisibility(0);
                    dVar2.f19670e.setText(u);
                    dVar2.f19671f.setVisibility(8);
                } else if (!mo5589u(getItem(i - 1).field_sortKey).equals(u)) {
                    dVar2.f19670e.setVisibility(0);
                    dVar2.f19670e.setText(u);
                    dVar2.f19671f.setVisibility(8);
                } else {
                    dVar2.f19670e.setVisibility(8);
                    dVar2.f19670e.setText("");
                    dVar2.f19671f.setVisibility(8);
                }
            }
            View view3 = dVar2.f19673h;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter", "handleAddresItem", "(ILcom/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter", "handleAddresItem", "(ILcom/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            dVar2.f19672g.setVisibility(8);
            dVar2.f19672g.setOnClickListener(this.f19661w);
        }
        int i7 = i + 1;
        boolean z = getItem(i7) == null || getItem(i) == null || mo5589u(getItem(i7).field_sortKey).equals(mo5589u(getItem(i).field_sortKey));
        if (i7 == super.getCount() || !z) {
            View view5 = dVar2.f19675j;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view6 = view5;
            C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view7 = dVar2.f19675j;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view8 = view7;
            C117292a.m165358d(view8, aVar3.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return view2;
    }

    public int getViewTypeCount() {
        return super.getViewTypeCount();
    }

    /* renamed from: l */
    public void mo1332l() {
        super.mo5580b();
        mo1333o();
    }

    public void notifyDataSetChanged() {
        this.f19655q.clear();
        super.notifyDataSetChanged();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c5, code lost:
        if (r5 == null) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fe, code lost:
        if (r3 == null) goto L_0x0103;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1333o() {
        /*
            r13 = this;
            boolean r0 = r13.f19659u
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001d
            s12.d r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.vx0()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r0.f38579d
            java.lang.String[] r5 = s12.C13613d.f38578f
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r4 = "IPCallAddressItem"
            java.lang.String r10 = "upper(sortKey) asc"
            android.database.Cursor r0 = r3.query(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0174
        L_0x001d:
            r13.f19660v = r2
            s12.d r0 = com.tencent.p014mm.plugin.ipcall.model.C105385g.vx0()
            java.lang.String r3 = r13.f19658t
            r0.getClass()
            java.lang.System.currentTimeMillis()
            r4 = 0
        L_0x002c:
            int r5 = r3.length()
            if (r4 >= r5) goto L_0x0041
            char r5 = r3.charAt(r4)
            boolean r5 = java.lang.Character.isDigit(r5)
            if (r5 != 0) goto L_0x003e
            r4 = 0
            goto L_0x0042
        L_0x003e:
            int r4 = r4 + 1
            goto L_0x002c
        L_0x0041:
            r4 = 1
        L_0x0042:
            if (r4 != 0) goto L_0x004a
            android.database.Cursor r0 = r0.mo13008bD(r3)
            goto L_0x016f
        L_0x004a:
            com.tencent.mm.sdk.platformtools.PhoneFormater r4 = t12.C13818a.f38950a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.Class<aw.d> r5 = p447aw.C103918d.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            aw.d r5 = (p447aw.C103918d) r5
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r7 = "android.permission.READ_CONTACTS"
            boolean r5 = r5.Lb0(r6, r7)
            java.lang.String r6 = "MicroMsg.IPCallAddressUtil"
            if (r5 != 0) goto L_0x006d
            java.lang.String r5 = "no contact permission"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r5)
            goto L_0x00ca
        L_0x006d:
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.ContentResolver r7 = r5.getContentResolver()
            android.net.Uri r8 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI
            r9 = 0
            java.lang.String[] r11 = new java.lang.String[r2]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r10 = "%"
            r5.append(r10)
            r5.append(r3)
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            r11[r1] = r5
            r12 = 0
            java.lang.String r10 = "data1 LIKE ?"
            android.database.Cursor r5 = r7.query(r8, r9, r10, r11, r12)
            boolean r7 = r5.moveToFirst()     // Catch:{ Exception -> 0x00b7 }
            if (r7 == 0) goto L_0x00c7
        L_0x009d:
            boolean r7 = r5.isAfterLast()     // Catch:{ Exception -> 0x00b7 }
            if (r7 != 0) goto L_0x00c7
            java.lang.String r7 = "contact_id"
            int r7 = r5.getColumnIndex(r7)     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r7 = r5.getString(r7)     // Catch:{ Exception -> 0x00b7 }
            r4.add(r7)     // Catch:{ Exception -> 0x00b7 }
            r5.moveToNext()     // Catch:{ Exception -> 0x00b7 }
            goto L_0x009d
        L_0x00b4:
            r0 = move-exception
            goto L_0x01dd
        L_0x00b7:
            r7 = move-exception
            java.lang.String r8 = "getQueryPhoneNumberContactIdList error: %s"
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ all -> 0x00b4 }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x00b4 }
            r9[r1] = r7     // Catch:{ all -> 0x00b4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r8, r9)     // Catch:{ all -> 0x00b4 }
            if (r5 == 0) goto L_0x00ca
        L_0x00c7:
            r5.close()
        L_0x00ca:
            android.database.Cursor r3 = r0.mo13008bD(r3)
            boolean r5 = r3.moveToFirst()     // Catch:{ Exception -> 0x00ee }
            if (r5 == 0) goto L_0x0100
        L_0x00d4:
            boolean r5 = r3.isAfterLast()     // Catch:{ Exception -> 0x00ee }
            if (r5 != 0) goto L_0x0100
            java.lang.String r5 = "contactId"
            int r5 = r3.getColumnIndex(r5)     // Catch:{ Exception -> 0x00ee }
            java.lang.String r5 = r3.getString(r5)     // Catch:{ Exception -> 0x00ee }
            r4.add(r5)     // Catch:{ Exception -> 0x00ee }
            r3.moveToNext()     // Catch:{ Exception -> 0x00ee }
            goto L_0x00d4
        L_0x00eb:
            r0 = move-exception
            goto L_0x01d7
        L_0x00ee:
            r5 = move-exception
            java.lang.String r6 = "MicroMsg.IPCallAddressStorage"
            java.lang.String r7 = "getContactIdList error: %s"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x00eb }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x00eb }
            r8[r1] = r5     // Catch:{ all -> 0x00eb }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r7, r8)     // Catch:{ all -> 0x00eb }
            if (r3 == 0) goto L_0x0103
        L_0x0100:
            r3.close()
        L_0x0103:
            java.util.Iterator r3 = r4.iterator()
            java.lang.String r4 = ""
        L_0x0109:
            boolean r5 = r3.hasNext()
            java.lang.String r6 = ","
            if (r5 == 0) goto L_0x012a
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r5)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            goto L_0x0109
        L_0x012a:
            int r3 = r4.lastIndexOf(r6)
            if (r3 < 0) goto L_0x0138
            int r3 = r4.lastIndexOf(r6)
            java.lang.String r4 = r4.substring(r1, r3)
        L_0x0138:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "("
            r3.append(r5)
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r0.f38579d
            java.lang.String[] r6 = s12.C13613d.f38578f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "contactId IN "
            r0.append(r5)
            r0.append(r3)
            java.lang.String r7 = r0.toString()
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r5 = "IPCallAddressItem"
            java.lang.String r11 = "upper(sortKey) asc"
            android.database.Cursor r0 = r4.query(r5, r6, r7, r8, r9, r10, r11)
        L_0x016f:
            java.lang.System.currentTimeMillis()
            r13.f19660v = r1
        L_0x0174:
            if (r0 == 0) goto L_0x0179
            r0.moveToFirst()
        L_0x0179:
            r13.mo7998r(r0)
            android.database.Cursor r0 = r13.mo7992g()
            if (r0 == 0) goto L_0x01d6
            android.database.Cursor r0 = r13.mo7992g()
            r3 = 0
            boolean r4 = r0.moveToFirst()     // Catch:{ Exception -> 0x01c6 }
            if (r4 == 0) goto L_0x01d6
            r4 = 0
        L_0x018e:
            boolean r5 = r0.isAfterLast()     // Catch:{ Exception -> 0x01c6 }
            if (r5 != 0) goto L_0x01d6
            s12.c r5 = new s12.c     // Catch:{ Exception -> 0x01c6 }
            r5.<init>()     // Catch:{ Exception -> 0x01c6 }
            r5.convertFrom(r0)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r5 = r5.field_sortKey     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r5 = r13.mo5589u(r5)     // Catch:{ Exception -> 0x01c6 }
            if (r4 != 0) goto L_0x01ae
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r13.f19656r     // Catch:{ Exception -> 0x01c6 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x01c6 }
            r3.put(r5, r6)     // Catch:{ Exception -> 0x01c6 }
            goto L_0x01bf
        L_0x01ae:
            if (r3 == 0) goto L_0x01bf
            boolean r3 = r5.equals(r3)     // Catch:{ Exception -> 0x01c6 }
            if (r3 != 0) goto L_0x01bf
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r13.f19656r     // Catch:{ Exception -> 0x01c6 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x01c6 }
            r3.put(r5, r6)     // Catch:{ Exception -> 0x01c6 }
        L_0x01bf:
            int r4 = r4 + 1
            r0.moveToNext()     // Catch:{ Exception -> 0x01c6 }
            r3 = r5
            goto L_0x018e
        L_0x01c6:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r2[r1] = r0
            java.lang.String r0 = "MicroMsg.IPCallAddressAdapter"
            java.lang.String r1 = "initSectionPosMap error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r1, r2)
        L_0x01d6:
            return
        L_0x01d7:
            if (r3 == 0) goto L_0x01dc
            r3.close()
        L_0x01dc:
            throw r0
        L_0x01dd:
            if (r5 == 0) goto L_0x01e2
            r5.close()
        L_0x01e2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ipcall.p065ui.C4684j.mo1333o():void");
    }

    /* renamed from: s */
    public int mo5587s() {
        return super.getCount();
    }

    /* renamed from: t */
    public C13612c getItem(int i) {
        return (C13612c) super.getItem(i);
    }

    /* renamed from: u */
    public final String mo5589u(String str) {
        return Util.isNullOrNil(str) ? "" : str.startsWith(C13611b.f38573a) ? "#" : str.toUpperCase().substring(0, 1);
    }

    /* renamed from: w */
    public final String mo5590w(C13612c cVar, String str) {
        ArrayList<String> arrayList;
        if (cVar == null || (arrayList = cVar.f38576t) == null) {
            return null;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains(str)) {
                return next;
            }
        }
        return null;
    }
}
