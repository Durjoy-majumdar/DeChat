package lc1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.FlowLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C75592q0;
import eb0.C75597w2;
import f40.C86709a0;
import f62.C75700k0;
import java.util.GregorianCalendar;
import p629ny.C76979h;
import pb1.C100734q;
import pb1.C100755z;
import te3.C101811md0;
import te3.C101835rd0;

/* renamed from: lc1.c */
public abstract class C99373c {

    /* renamed from: a */
    public FavoriteImageServer f291378a;

    /* renamed from: b */
    public final c$$d f291379b = new c$$d();

    public C99373c(FavoriteImageServer favoriteImageServer) {
        this.f291378a = favoriteImageServer;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0274  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m129676f(android.view.View r5, int r6) {
        /*
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.FavBaseListItem"
            java.lang.String r4 = "field type %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r4, r1)
            boolean r1 = r5 instanceof android.widget.TextView
            if (r1 == 0) goto L_0x0027
            r1 = r5
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.CharSequence r2 = r1.getText()
            if (r2 == 0) goto L_0x0027
            java.lang.CharSequence r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            goto L_0x0029
        L_0x0027:
            java.lang.String r1 = ""
        L_0x0029:
            r2 = 10
            if (r6 == r2) goto L_0x0274
            r2 = 11
            if (r6 == r2) goto L_0x0274
            r2 = 22
            if (r6 == r2) goto L_0x024c
            r2 = 29
            r4 = 2131825794(0x7f111482, float:1.9284454E38)
            if (r6 == r2) goto L_0x022d
            r2 = 31
            if (r6 == r2) goto L_0x020b
            switch(r6) {
                case 1: goto L_0x01e8;
                case 2: goto L_0x01c5;
                case 3: goto L_0x01a2;
                case 4: goto L_0x017f;
                case 5: goto L_0x015c;
                case 6: goto L_0x0139;
                case 7: goto L_0x0119;
                case 8: goto L_0x00f6;
                default: goto L_0x0043;
            }
        L_0x0043:
            switch(r6) {
                case 15: goto L_0x00d3;
                case 16: goto L_0x00b0;
                case 17: goto L_0x008d;
                case 18: goto L_0x006a;
                case 19: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            return r3
        L_0x0047:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131825781(0x7f111475, float:1.9284428E38)
            java.lang.String r2 = r2.getString(r3)
            r6.append(r2)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.setContentDescription(r6)
            goto L_0x0295
        L_0x006a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131825795(0x7f111483, float:1.9284456E38)
            java.lang.String r2 = r2.getString(r3)
            r6.append(r2)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.setContentDescription(r6)
            goto L_0x0295
        L_0x008d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131825797(0x7f111485, float:1.928446E38)
            java.lang.String r2 = r2.getString(r3)
            r6.append(r2)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.setContentDescription(r6)
            goto L_0x0295
        L_0x00b0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131825679(0x7f11140f, float:1.928422E38)
            java.lang.String r2 = r2.getString(r3)
            r6.append(r2)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.setContentDescription(r6)
            goto L_0x0295
        L_0x00d3:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131825779(0x7f111473, float:1.9284424E38)
            java.lang.String r2 = r2.getString(r3)
            r6.append(r2)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.setContentDescription(r6)
            goto L_0x0295
        L_0x00f6:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131825783(0x7f111477, float:1.9284432E38)
            java.lang.String r2 = r2.getString(r3)
            r6.append(r2)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.setContentDescription(r6)
            goto L_0x0295
        L_0x0119:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r2 = r2.getString(r4)
            r6.append(r2)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.setContentDescription(r6)
            goto L_0x0295
        L_0x0139:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131825793(0x7f111481, float:1.9284452E38)
            java.lang.String r2 = r2.getString(r3)
            r6.append(r2)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.setContentDescription(r6)
            goto L_0x0295
        L_0x015c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131825799(0x7f111487, float:1.9284464E38)
            java.lang.String r2 = r2.getString(r3)
            r6.append(r2)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.setContentDescription(r6)
            goto L_0x0295
        L_0x017f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131825800(0x7f111488, float:1.9284466E38)
            java.lang.String r2 = r2.getString(r3)
            r6.append(r2)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.setContentDescription(r6)
            goto L_0x0295
        L_0x01a2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131833637(0x7f113325, float:1.9300362E38)
            java.lang.String r2 = r2.getString(r3)
            r6.append(r2)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.setContentDescription(r6)
            goto L_0x0295
        L_0x01c5:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131825791(0x7f11147f, float:1.9284448E38)
            java.lang.String r2 = r2.getString(r3)
            r6.append(r2)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.setContentDescription(r6)
            goto L_0x0295
        L_0x01e8:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131825782(0x7f111476, float:1.928443E38)
            java.lang.String r2 = r2.getString(r3)
            r6.append(r2)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.setContentDescription(r6)
            goto L_0x0295
        L_0x020b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131825696(0x7f111420, float:1.9284255E38)
            java.lang.String r2 = r2.getString(r3)
            r6.append(r2)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.setContentDescription(r6)
            goto L_0x0295
        L_0x022d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r2 = r2.getString(r4)
            r6.append(r2)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.setContentDescription(r6)
            goto L_0x0295
        L_0x024c:
            boolean r6 = pb1.C100734q.m131837a0()
            if (r6 == 0) goto L_0x0295
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131833639(0x7f113327, float:1.9300366E38)
            java.lang.String r2 = r2.getString(r3)
            r6.append(r2)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.setContentDescription(r6)
            goto L_0x0295
        L_0x0274:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131825700(0x7f111424, float:1.9284264E38)
            java.lang.String r2 = r2.getString(r3)
            r6.append(r2)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.setContentDescription(r6)
        L_0x0295:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lc1.C99373c.m129676f(android.view.View, int):boolean");
    }

    /* renamed from: g */
    public static boolean m129677g(View view, C100755z zVar) {
        if (zVar == null) {
            return false;
        }
        return m129676f(view, zVar.field_type);
    }

    /* renamed from: a */
    public View mo138843a(View view, c$$e c__e, C100755z zVar) {
        if (view == null) {
            throw new NullPointerException("base item view is null");
        } else if (c__e != null) {
            WeImageView weImageView = (WeImageView) view.findViewById(C0966R.C0970id.f357992cx0);
            c__e.f291388b = weImageView;
            if (weImageView != null) {
                TextView textView = (TextView) view.findViewById(C0966R.C0970id.cvu);
                c__e.f291389c = textView;
                if (textView != null) {
                    TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.cx6);
                    c__e.f291390d = textView2;
                    if (textView2 != null) {
                        TextView textView3 = (TextView) view.findViewById(C0966R.C0970id.cwv);
                        c__e.f291391e = textView3;
                        if (textView3 != null) {
                            CheckBox checkBox = (CheckBox) view.findViewById(C0966R.C0970id.cum);
                            c__e.f291392f = checkBox;
                            if (checkBox != null) {
                                LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.dx6);
                                c__e.f291395i = linearLayout;
                                if (linearLayout != null) {
                                    FlowLayout flowLayout = (FlowLayout) view.findViewById(C0966R.C0970id.f1q);
                                    c__e.f291396j = flowLayout;
                                    if (flowLayout != null) {
                                        c__e.f291392f.setOnCheckedChangeListener(new c$$b(this));
                                        c__e.f291387a = zVar;
                                        view.setTag(c__e);
                                        c__e.f291393g = (LinearLayout) view.findViewById(C0966R.C0970id.cwp);
                                        TextView textView4 = (TextView) view.findViewById(C0966R.C0970id.cwo);
                                        c__e.f291394h = textView4;
                                        textView4.setOnClickListener(new c$$c(this));
                                        return view;
                                    }
                                    throw new IllegalArgumentException("base item view do not contain id named fav_fl_tag_list");
                                }
                                throw new IllegalArgumentException("base item view do not contain id named fav_fl_tag_list");
                            }
                            throw new IllegalArgumentException("base item view do not contain id named checkbox");
                        }
                        throw new IllegalArgumentException("base item view do not contain id named fav_time");
                    }
                    throw new IllegalArgumentException("base item view do not contain id named fav_version_info");
                }
                throw new IllegalArgumentException("base item view do not contain id named fav_name");
            }
            throw new IllegalArgumentException("base item view do not contain id named fav_type_iv");
        } else {
            throw new NullPointerException("base holder is null");
        }
    }

    /* renamed from: b */
    public abstract View mo138840b(View view, ViewGroup viewGroup, C100755z zVar);

    /* renamed from: c */
    public abstract void mo138841c(View view, C101811md0 md02);

    /* renamed from: d */
    public void mo138844d(c$$e c__e, C100755z zVar) {
        c__e.f291387a = zVar;
        boolean z = true;
        if (!this.f291379b.f291386f) {
            TextView textView = c__e.f291391e;
            Context context = textView.getContext();
            long j = c__e.f291387a.field_updateTime;
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(j);
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
            gregorianCalendar2.setTimeInMillis(System.currentTimeMillis());
            textView.setText(gregorianCalendar2.get(1) == gregorianCalendar.get(1) ? C72715f.m85111d(context.getString(C0966R.string.n6p), j / 1000) : C72715f.m85111d(context.getString(C0966R.string.cp7), j / 1000));
        } else {
            c__e.f291391e.setText(C100734q.m131824O(zVar.field_datatotalsize));
        }
        mo138842e(c__e);
        if (c__e.f291387a.mo140174A2()) {
            c__e.f291393g.setVisibility(0);
        } else {
            c__e.f291393g.setVisibility(8);
        }
        c__e.f291392f.setTag(zVar);
        c$$d c__d = this.f291379b;
        if (c__d.f291383c || c__d.f291386f) {
            c__e.f291392f.setVisibility(0);
            if (zVar.f295172Q0) {
                CheckBox checkBox = c__e.f291392f;
                if (this.f291379b.f291384d.get(zVar.f295174S0) == null) {
                    z = false;
                }
                checkBox.setChecked(z);
            } else {
                CheckBox checkBox2 = c__e.f291392f;
                if (this.f291379b.f291384d.get(Util.notNullToString(Long.valueOf(zVar.field_localId))) == null) {
                    z = false;
                }
                checkBox2.setChecked(z);
            }
        } else {
            c__e.f291392f.setVisibility(8);
        }
        c__e.f291394h.setTag(zVar);
        LinearLayout linearLayout = c__e.f291395i;
        linearLayout.post(new c$$a(this, linearLayout, c__e, zVar));
    }

    /* renamed from: e */
    public void mo138842e(c$$e c__e) {
        String str;
        Context context = c__e.f291389c.getContext();
        C72996z1 H3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69656H3(c__e.f291387a.field_fromUser);
        if (H3 == null || !H3.getUsername().equals(c__e.f291387a.field_fromUser)) {
            Log.m105929w("MicroMsg.FavBaseListItem", "render name, user is %s, but name is null", c__e.f291387a.field_fromUser);
            c__e.f291389c.setText("");
            C31519v2.m39436a().mo55988e(c__e.f291387a.field_fromUser, "", (C75597w2.C31525a) null);
            return;
        }
        if (C72996z1.m85820U5(c__e.f291387a.field_fromUser)) {
            C101835rd0 rd02 = c__e.f291387a.field_favProto.f298616d;
            str = C75592q0.m90789s().equals(rd02.f299348f) ? C100734q.m131878v(rd02.f299350h) : ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(rd02.f299348f);
        } else {
            str = C100734q.m131878v(H3.getUsername());
        }
        c__e.f291389c.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(context, str, c__e.f291389c.getTextSize()));
    }
}
