package com.tencent.p014mm.plugin.record.p094ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FavUIPhotoInfoEvent;
import com.tencent.p014mm.autogen.events.UIStatusChangedEvent;
import com.tencent.p014mm.plugin.fav.p047ui.detail.BaseFavDetailReportUI;
import com.tencent.p014mm.plugin.record.p094ui.C94356i;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import kg3.C76577a;
import p629ny.C76979h;
import pb1.C100755z;
import te3.C101834rc0;
import wc3.C78538u;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgBaseUI */
public abstract class RecordMsgBaseUI extends BaseFavDetailReportUI {

    /* renamed from: j */
    public ListView f272536j = null;

    /* renamed from: n */
    public C94356i f272537n;

    /* renamed from: o */
    public long f272538o = -1;

    /* renamed from: p */
    public String f272539p = "";

    /* renamed from: q */
    public View f272540q;

    /* renamed from: r */
    public IListener<FavUIPhotoInfoEvent> f272541r = new IListener<FavUIPhotoInfoEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1051078375;
        }

        public boolean callback(IEvent iEvent) {
            FavUIPhotoInfoEvent favUIPhotoInfoEvent = (FavUIPhotoInfoEvent) iEvent;
            int firstVisiblePosition = RecordMsgBaseUI.this.f272536j.getFirstVisiblePosition();
            int lastVisiblePosition = RecordMsgBaseUI.this.f272536j.getLastVisiblePosition();
            int max = Math.max(firstVisiblePosition, 0);
            int max2 = Math.max(lastVisiblePosition, 0);
            if (max < 0 || max2 >= RecordMsgBaseUI.this.f272536j.getAdapter().getCount()) {
                Log.m105925i("MicroMsg.RecordMsgBaseUI", "invalid position %d-%d, cnt:%d", Integer.valueOf(max), Integer.valueOf(max2), Integer.valueOf(RecordMsgBaseUI.this.f272536j.getAdapter().getCount()));
                return false;
            }
            while (max <= max2) {
                C101834rc0 rc02 = (C101834rc0) RecordMsgBaseUI.this.f272536j.getAdapter().getItem(max);
                if (rc02 != null && Util.isEqual(rc02.f299280T, favUIPhotoInfoEvent.f264826d.f264828a)) {
                    View childAt = RecordMsgBaseUI.this.f272536j.getChildAt(max);
                    if (childAt == null) {
                        Log.m105921e("MicroMsg.RecordMsgBaseUI", "[getPhotoInfo] getChildAt(%d)", Integer.valueOf(max));
                    } else {
                        View findViewById = childAt.findViewById(C0966R.C0970id.iht);
                        if (findViewById != null) {
                            int[] iArr = new int[2];
                            findViewById.getLocationInWindow(iArr);
                            FavUIPhotoInfoEvent.C92514b bVar = favUIPhotoInfoEvent.f264827e;
                            bVar.f264829a = iArr[0];
                            bVar.f264830b = iArr[1];
                            bVar.f264831c = findViewById.getWidth();
                            favUIPhotoInfoEvent.f264827e.f264832d = findViewById.getHeight();
                        }
                    }
                }
                max++;
            }
            return true;
        }
    };

    /* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgBaseUI$a */
    public class C94333a implements AbsListView.OnScrollListener {
        public C94333a() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/record/ui/RecordMsgBaseUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            if (i == 0) {
                int i4 = 0;
                View childAt = RecordMsgBaseUI.this.f272536j.getChildAt(0);
                if (childAt != null) {
                    i4 = childAt.getTop();
                }
                if (i4 == 0) {
                    RecordMsgBaseUI.this.hideActionbarLine();
                    C117292a.m165361g(this, "com/tencent/mm/plugin/record/ui/RecordMsgBaseUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
                    return;
                }
            }
            RecordMsgBaseUI.this.showActionbarLine();
            C117292a.m165361g(this, "com/tencent/mm/plugin/record/ui/RecordMsgBaseUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/record/ui/RecordMsgBaseUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (i == 0) {
                UIStatusChangedEvent uIStatusChangedEvent = new UIStatusChangedEvent();
                UIStatusChangedEvent.C67803a aVar = uIStatusChangedEvent.f193971d;
                aVar.f193972a = 5;
                aVar.f193973b = RecordMsgBaseUI.this.f272536j.getFirstVisiblePosition();
                uIStatusChangedEvent.f193971d.f193974c = RecordMsgBaseUI.this.f272536j.getLastVisiblePosition();
                uIStatusChangedEvent.f193971d.f193975d = RecordMsgBaseUI.this.f272536j.getHeaderViewsCount();
                uIStatusChangedEvent.publish();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/record/ui/RecordMsgBaseUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgBaseUI$b */
    public class C94334b implements MenuItem.OnMenuItemClickListener {
        public C94334b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            RecordMsgBaseUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgBaseUI$c */
    public class C94335c implements Runnable {
        public C94335c() {
        }

        public void run() {
            View view;
            ListView listView = RecordMsgBaseUI.this.f272536j;
            View childAt = listView.getChildAt(listView.getLastVisiblePosition());
            if (childAt != null && (view = RecordMsgBaseUI.this.f272540q) != null && view.getVisibility() == 0) {
                int bottom = childAt.getBottom();
                int bottom2 = RecordMsgBaseUI.this.f272536j.getBottom();
                Log.m105919d("MicroMsg.RecordMsgBaseUI", "footerBotm %d, listBotm %d", Integer.valueOf(bottom), Integer.valueOf(bottom2));
                int b = C76577a.m92151b(RecordMsgBaseUI.this.getContext(), 64);
                int i = bottom2 - bottom;
                if (i > 0) {
                    int b2 = i + C76577a.m92151b(RecordMsgBaseUI.this.getContext(), 15);
                    Log.m105919d("MicroMsg.RecordMsgBaseUI", "offset %d", Integer.valueOf(b2));
                    if (b2 > b) {
                        RecordMsgBaseUI.this.f272540q.setPadding(0, b2, 0, 0);
                    }
                }
            }
        }
    }

    /* renamed from: K7 */
    public final String mo129669K7(String str) {
        try {
            return (String) DateFormat.format(getContext().getString(C0966R.string.f360810ez1), new SimpleDateFormat("yyyy-MM-dd").parse(str).getTime());
        } catch (ParseException unused) {
            return str;
        }
    }

    /* renamed from: L7 */
    public abstract C94356i mo129657L7();

    /* renamed from: M7 */
    public abstract String mo129658M7();

    /* renamed from: N7 */
    public abstract String mo129659N7();

    /* renamed from: O7 */
    public abstract String mo129660O7();

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x013f, code lost:
        r7 = r6.field_appName;
     */
    /* renamed from: P7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo129661P7() {
        /*
            r18 = this;
            r0 = r18
            com.tencent.mm.plugin.record.ui.i r1 = r18.mo129657L7()
            r0.f272537n = r1
            android.content.Intent r1 = r18.getIntent()
            java.lang.String r2 = "message_id"
            r3 = -1
            long r1 = r1.getLongExtra(r2, r3)
            r0.f272538o = r1
            android.content.Intent r1 = r18.getIntent()
            java.lang.String r2 = "record_app_id"
            java.lang.String r1 = r1.getStringExtra(r2)
            r0.f272539p = r1
            r1 = 2131311994(0x7f093d7a, float:1.8242344E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ListView r1 = (android.widget.ListView) r1
            r0.f272536j = r1
            r18.mo129670R7()
            java.lang.String r1 = r18.mo129659N7()
            java.lang.String r2 = r18.mo129658M7()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            r4 = 0
            java.lang.String r5 = " "
            java.lang.String r6 = "subtitle time error!"
            java.lang.String r7 = "MicroMsg.RecordMsgBaseUI"
            r8 = 1
            if (r3 != 0) goto L_0x0085
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 == 0) goto L_0x0050
            goto L_0x0085
        L_0x0050:
            java.lang.String[] r3 = r1.split(r5)
            r3 = r3[r4]
            java.lang.String[] r9 = r2.split(r5)
            r9 = r9[r4]
            java.lang.String r10 = "-"
            java.lang.String[] r1 = r1.split(r10)
            r1 = r1[r4]
            java.lang.String[] r2 = r2.split(r10)
            r2 = r2[r4]
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0075
            com.tencent.mm.plugin.record.ui.i r1 = r0.f272537n
            r1.f272715i = r8
            goto L_0x0088
        L_0x0075:
            boolean r1 = r3.equals(r9)
            if (r1 == 0) goto L_0x0080
            com.tencent.mm.plugin.record.ui.i r1 = r0.f272537n
            r1.f272716j = r4
            goto L_0x0088
        L_0x0080:
            com.tencent.mm.plugin.record.ui.i r1 = r0.f272537n
            r1.f272716j = r8
            goto L_0x0088
        L_0x0085:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
        L_0x0088:
            androidx.appcompat.app.AppCompatActivity r1 = r18.getContext()
            r2 = 2131497113(0x7f0c1099, float:1.861781E38)
            r3 = 0
            android.view.View r1 = android.view.View.inflate(r1, r2, r3)
            r2 = 2131315430(0x7f094ae6, float:1.8249313E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r9 = r18.mo129659N7()
            java.lang.String r10 = r18.mo129658M7()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r11 != 0) goto L_0x00f0
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r11 == 0) goto L_0x00b2
            goto L_0x00f0
        L_0x00b2:
            java.lang.String[] r6 = r9.split(r5)
            r6 = r6[r4]
            java.lang.String r6 = r0.mo129669K7(r6)
            java.lang.String[] r7 = r10.split(r5)
            r7 = r7[r4]
            java.lang.String r7 = r0.mo129669K7(r7)
            boolean r9 = r6.equals(r7)
            if (r9 == 0) goto L_0x00cd
            goto L_0x00ec
        L_0x00cd:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r5)
            r6 = 2131838023(0x7f114447, float:1.9309258E38)
            java.lang.String r6 = r0.getString(r6)
            r9.append(r6)
            r9.append(r5)
            r9.append(r7)
            java.lang.String r6 = r9.toString()
        L_0x00ec:
            r2.setText(r6)
            goto L_0x00f3
        L_0x00f0:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
        L_0x00f3:
            android.widget.ListView r2 = r0.f272536j
            r2.addHeaderView(r1, r3, r4)
            androidx.appcompat.app.AppCompatActivity r1 = r18.getContext()
            r2 = 2131497112(0x7f0c1098, float:1.8617808E38)
            android.view.View r1 = android.view.View.inflate(r1, r2, r3)
            java.lang.Class<ym.l> r2 = p763ym.C79138l.class
            java.lang.String r5 = r0.f272539p
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x0157
            eb0.c r5 = eb0.C97625j3.m125812b()
            g62.l r5 = r5.mo105911z()
            long r6 = r0.f272538o
            com.tencent.mm.storage.g4 r5 = (com.tencent.p014mm.storage.C72972g4) r5
            com.tencent.mm.storage.f4 r5 = r5.b00(r6)
            java.lang.String r6 = r5.getContent()
            java.lang.String r5 = r5.mo108775z2()
            com.tencent.mm.message.l$b r5 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r6, r5)
            if (r5 == 0) goto L_0x0154
            java.lang.String r6 = r5.f195562d
            r0.f272539p = r6
            di3.d r6 = di3.C86312j.m106911c(r2)
            ym.l r6 = (p763ym.C79138l) r6
            java.lang.String r7 = r0.f272539p
            int r9 = r5.f195480E
            com.tencent.mm.pluginsdk.model.app.j r6 = r6.mo74003UV(r7, r9)
            if (r6 == 0) goto L_0x0151
            java.lang.String r7 = r6.field_appName
            if (r7 == 0) goto L_0x0151
            java.lang.String r7 = r7.trim()
            int r7 = r7.length()
            if (r7 > 0) goto L_0x014e
            goto L_0x0151
        L_0x014e:
            java.lang.String r5 = r6.field_appName
            goto L_0x0179
        L_0x0151:
            java.lang.String r5 = r5.f195484F
            goto L_0x0179
        L_0x0154:
            r5 = r3
            r6 = r5
            goto L_0x0179
        L_0x0157:
            di3.d r5 = di3.C86312j.m106911c(r2)
            ym.l r5 = (p763ym.C79138l) r5
            java.lang.String r6 = r0.f272539p
            com.tencent.mm.pluginsdk.model.app.j r6 = r5.getAppInfo(r6)
            if (r6 == 0) goto L_0x0177
            java.lang.String r5 = r6.field_appName
            if (r5 == 0) goto L_0x0177
            java.lang.String r5 = r5.trim()
            int r5 = r5.length()
            if (r5 > 0) goto L_0x0174
            goto L_0x0177
        L_0x0174:
            java.lang.String r5 = r6.field_appName
            goto L_0x0179
        L_0x0177:
            java.lang.String r5 = ""
        L_0x0179:
            java.lang.String r7 = r0.f272539p
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x026d
            if (r6 == 0) goto L_0x026d
            r7 = 2131310571(0x7f0937eb, float:1.8239458E38)
            android.view.View r7 = r1.findViewById(r7)
            r0.f272540q = r7
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r15.mo10233c(r9)
            java.lang.Object[] r10 = r15.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/record/ui/RecordMsgBaseUI"
            java.lang.String r12 = "showSourceLayoutIfNeed"
            java.lang.String r13 = "(Landroid/view/View;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r9 = r7
            r3 = r15
            r15 = r16
            r16 = r17
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r7.setVisibility(r3)
            java.lang.String r10 = "com/tencent/mm/plugin/record/ui/RecordMsgBaseUI"
            java.lang.String r11 = "showSourceLayoutIfNeed"
            java.lang.String r12 = "(Landroid/view/View;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            r3 = 2131297302(0x7f090416, float:1.8212545E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r7 = 2131297303(0x7f090417, float:1.8212547E38)
            android.view.View r7 = r1.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            float r10 = r7.getTextSize()
            double r10 = (double) r10
            r12 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r10 = r10 * r12
            int r10 = (int) r10
            r9.height = r10
            r9.width = r10
            r3.setLayoutParams(r9)
            di3.d r9 = di3.C86312j.m106911c(r2)
            ym.l r9 = (p763ym.C79138l) r9
            androidx.appcompat.app.AppCompatActivity r10 = r18.getContext()
            java.lang.String r5 = r9.mo74019xG(r10, r6, r5)
            android.content.res.Resources r6 = r18.getResources()
            r9 = 2131833874(0x7f113412, float:1.9300842E38)
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r4] = r5
            java.lang.String r5 = r6.getString(r9, r10)
            r7.setText(r5)
            java.lang.String r5 = r0.f272539p
            di3.d r2 = di3.C86312j.m106911c(r2)
            ym.l r2 = (p763ym.C79138l) r2
            androidx.appcompat.app.AppCompatActivity r6 = r18.getContext()
            float r6 = kg3.C76577a.m92156g(r6)
            android.graphics.Bitmap r2 = r2.mo74018ub(r5, r8, r6)
            r5 = 2131165652(0x7f0701d4, float:1.7945527E38)
            if (r2 == 0) goto L_0x024e
            boolean r6 = r2.isRecycled()
            if (r6 != 0) goto L_0x024e
            android.graphics.drawable.BitmapDrawable r6 = new android.graphics.drawable.BitmapDrawable
            r6.<init>(r2)
            android.content.res.Resources r2 = r18.getResources()
            float r2 = r2.getDimension(r5)
            int r2 = (int) r2
            r6.setBounds(r4, r4, r2, r2)
            r3.setImageDrawable(r6)
            goto L_0x026d
        L_0x024e:
            android.content.res.Resources r2 = r18.getResources()
            r6 = 2131234289(0x7f080df1, float:1.808474E38)
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeResource(r2, r6)
            android.graphics.drawable.BitmapDrawable r6 = new android.graphics.drawable.BitmapDrawable
            r6.<init>(r2)
            android.content.res.Resources r2 = r18.getResources()
            float r2 = r2.getDimension(r5)
            int r2 = (int) r2
            r6.setBounds(r4, r4, r2, r2)
            r3.setImageDrawable(r6)
        L_0x026d:
            android.widget.ListView r2 = r0.f272536j
            r3 = 0
            r2.addFooterView(r1, r3, r4)
            android.widget.ListView r1 = r0.f272536j
            com.tencent.mm.plugin.record.ui.i r2 = r0.f272537n
            r1.setAdapter(r2)
            com.tencent.mm.plugin.record.ui.i r1 = r0.f272537n
            android.widget.ListView r2 = r0.f272536j
            r1.f272719p = r2
            pb1.a0$a r2 = r0.f270015g
            int r2 = r2.f295016a
            android.util.SparseArray<com.tencent.mm.plugin.record.ui.i$d> r2 = r1.f272714h
            com.tencent.mm.plugin.record.ui.viewWrappers.f r3 = new com.tencent.mm.plugin.record.ui.viewWrappers.f
            android.content.Context r5 = r1.f272712f
            r3.<init>(r5)
            r2.put(r4, r3)
            com.tencent.mm.plugin.record.ui.viewWrappers.ImageViewWrapper r2 = new com.tencent.mm.plugin.record.ui.viewWrappers.ImageViewWrapper
            com.tencent.mm.plugin.record.ui.i$c r3 = r1.f272722s
            android.widget.ListView r5 = r1.f272719p
            r2.<init>(r3, r5)
            int r3 = r1.f272710d
            r2.f272765h = r3
            android.util.SparseArray<com.tencent.mm.plugin.record.ui.i$d> r3 = r1.f272714h
            com.tencent.mm.plugin.record.ui.viewWrappers.ImageViewWrapper r2 = r1.mo129744i(r2)
            r3.put(r8, r2)
            android.util.SparseArray<com.tencent.mm.plugin.record.ui.i$d> r2 = r1.f272714h
            r3 = 2
            com.tencent.mm.plugin.record.ui.viewWrappers.h r5 = new com.tencent.mm.plugin.record.ui.viewWrappers.h
            r5.<init>()
            r2.put(r3, r5)
            com.tencent.mm.plugin.record.ui.viewWrappers.OtherViewWrapper r2 = new com.tencent.mm.plugin.record.ui.viewWrappers.OtherViewWrapper
            com.tencent.mm.plugin.record.ui.i$c r3 = r1.f272722s
            com.tencent.mm.sdk.platformtools.MMHandler r5 = r1.f272713g
            r2.<init>(r3, r5)
            java.lang.String r3 = r1.f272725v
            r2.f272792e = r3
            java.lang.String r3 = r1.f272726w
            r2.f272793f = r3
            int r3 = r1.f272710d
            r2.f272794g = r3
            java.lang.String r3 = r1.f272711e
            r2.f272795h = r3
            int r3 = r1.mo129739b()
            r2.f272796i = r3
            android.util.SparseArray<com.tencent.mm.plugin.record.ui.i$d> r3 = r1.f272714h
            r5 = 3
            r3.put(r5, r2)
            android.util.SparseArray<com.tencent.mm.plugin.record.ui.i$d> r2 = r1.f272714h
            r3 = 4
            com.tencent.mm.plugin.record.ui.viewWrappers.e r5 = new com.tencent.mm.plugin.record.ui.viewWrappers.e
            com.tencent.mm.plugin.record.ui.i$c r1 = r1.f272722s
            r5.<init>(r1)
            r2.put(r3, r5)
            com.tencent.mm.plugin.record.ui.i r1 = r0.f272537n
            android.content.Intent r2 = r18.getIntent()
            java.lang.String r3 = "preChatTYPE"
            int r2 = r2.getIntExtra(r3, r4)
            r1.f272724u = r2
            android.widget.ListView r1 = r0.f272536j
            com.tencent.mm.plugin.record.ui.RecordMsgBaseUI$a r2 = new com.tencent.mm.plugin.record.ui.RecordMsgBaseUI$a
            r2.<init>()
            r1.setOnScrollListener(r2)
            com.tencent.mm.plugin.record.ui.RecordMsgBaseUI$b r1 = new com.tencent.mm.plugin.record.ui.RecordMsgBaseUI$b
            r1.<init>()
            r0.setBackBtn(r1)
            r18.mo129663S7()
            android.widget.ListView r1 = r0.f272536j
            com.tencent.mm.plugin.record.ui.RecordMsgBaseUI$c r2 = new com.tencent.mm.plugin.record.ui.RecordMsgBaseUI$c
            r2.<init>()
            r3 = 100
            r1.postDelayed(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.record.p094ui.RecordMsgBaseUI.mo129661P7():void");
    }

    /* renamed from: Q7 */
    public abstract void mo129662Q7(int i, int i2, Intent intent);

    /* renamed from: R7 */
    public void mo129670R7() {
        String O7 = mo129660O7();
        String string = getContext().getString(C0966R.string.cgu);
        if (O7 != null && O7.endsWith(string) && O7.lastIndexOf(string) >= 1) {
            O7 = O7.substring(0, O7.lastIndexOf(string) - 1);
        }
        setMMTitle((CharSequence) ((C76979h) C86312j.m106911c(C76979h.class)).op0(getContext(), O7, getResources().getDimensionPixelSize(C0966R.dimen.f3628l)));
    }

    /* renamed from: S7 */
    public abstract void mo129663S7();

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bqo;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        mo129662Q7(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(109);
        super.onCreate(bundle);
        mo129661P7();
        this.f272541r.alive();
        C78538u.m94868d(this);
        if (Log.isDebug()) {
            for (int i = 0; i < this.f272537n.f272721r.f272698a.size(); i++) {
                Log.m105919d("MicroMsg.RecordMsgBaseUI", "--------dump dataItem --- %s %s", Integer.valueOf(i), getClass());
                C100755z.m131901p2(this.f272537n.f272721r.f272698a.get(i), C100755z.f295171W0);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f272541r.dead();
        C94356i iVar = this.f272537n;
        if (iVar != null) {
            iVar.mo129745a();
        }
    }

    public void onPause() {
        super.onPause();
        C94356i iVar = this.f272537n;
        if (iVar != null) {
            for (int i = 0; i < iVar.f272714h.size(); i++) {
                C94356i.C94363d valueAt = iVar.f272714h.valueAt(i);
                if (valueAt != null) {
                    valueAt.pause();
                }
            }
        }
        UIStatusChangedEvent uIStatusChangedEvent = new UIStatusChangedEvent();
        uIStatusChangedEvent.f193971d.f193972a = 1;
        uIStatusChangedEvent.publish();
    }

    public void onResume() {
        super.onResume();
        UIStatusChangedEvent uIStatusChangedEvent = new UIStatusChangedEvent();
        ListView listView = this.f272536j;
        if (listView != null) {
            UIStatusChangedEvent.C67803a aVar = uIStatusChangedEvent.f193971d;
            aVar.f193972a = 0;
            aVar.f193973b = listView.getFirstVisiblePosition();
            uIStatusChangedEvent.f193971d.f193974c = this.f272536j.getLastVisiblePosition();
            uIStatusChangedEvent.f193971d.f193975d = this.f272536j.getHeaderViewsCount();
            uIStatusChangedEvent.publish();
        }
    }
}
