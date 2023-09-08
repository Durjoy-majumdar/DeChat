package k11;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.gridviewheaders.C106705f;
import com.tencent.p014mm.p136ui.gridviewheaders.GridHeadersGridView;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingDetailUI;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import h11.C98311d;
import j11.C98895d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: k11.s */
public class C99085s extends BaseAdapter implements C106705f {

    /* renamed from: t */
    public static int f290451t;

    /* renamed from: u */
    public static final String[] f290452u = {"application/msword", "application/pdf", "application/vnd.ms-excel", "application/vnd.ms-powerpoint", "application/vnd.openxmlformats-officedocument.presentationml.presentation", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/vnd.openxmlformats-officedocument.wordprocessingml.document"};

    /* renamed from: v */
    public static final int[] f290453v = {C0966R.color.f3251bh, C0966R.color.f3252bi, C0966R.color.aly, C0966R.color.alw, C0966R.color.alw, C0966R.color.aly, C0966R.color.f3251bh};

    /* renamed from: d */
    public final HashSet<Integer> f290454d;

    /* renamed from: e */
    public final CleanChattingDetailUI f290455e;

    /* renamed from: f */
    public final ArrayList<C98895d> f290456f;

    /* renamed from: g */
    public final String f290457g;

    /* renamed from: h */
    public final int[] f290458h;

    /* renamed from: i */
    public final long f290459i;

    /* renamed from: j */
    public final long f290460j;

    /* renamed from: n */
    public boolean f290461n;

    /* renamed from: o */
    public boolean f290462o = false;

    /* renamed from: p */
    public final GridHeadersGridView.C97216d f290463p = new s$$b(this);

    /* renamed from: q */
    public final AdapterView.OnItemClickListener f290464q = new s$$d(this);

    /* renamed from: r */
    public final MMHandler f290465r = new s$$e(this);

    /* renamed from: s */
    public final AbsListView.OnScrollListener f290466s = new s$$f(this);

    public C99085s(CleanChattingDetailUI cleanChattingDetailUI, String str, int[] iArr, long j, long j2) {
        this.f290455e = cleanChattingDetailUI;
        this.f290454d = new HashSet<>();
        this.f290456f = new ArrayList<>();
        this.f290457g = str;
        this.f290458h = iArr;
        this.f290459i = j;
        this.f290460j = j2;
    }

    /* renamed from: a */
    public final void mo138425a() {
        this.f290455e.f267879g.setEnabled(this.f290454d.size() > 0);
        this.f290455e.f267877e.setText(!this.f290454d.isEmpty() && this.f290454d.size() == this.f290456f.size() ? C0966R.string.auk : C0966R.string.f7555ji);
        Iterator<Integer> it = this.f290454d.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += this.f290456f.get(it.next().intValue()).f289894a;
        }
        CleanChattingDetailUI cleanChattingDetailUI = this.f290455e;
        if (j > 0) {
            cleanChattingDetailUI.f267878f.setText(cleanChattingDetailUI.getString(C0966R.string.byb, new Object[]{C98311d.m127053b(j)}));
        } else {
            cleanChattingDetailUI.f267878f.setText("");
        }
    }

    /* renamed from: c */
    public View mo138426c(int i, View view, ViewGroup viewGroup) {
        s$$g s__g;
        boolean z = false;
        if (view == null) {
            Log.m105926v("MicroMsg.CleanChattingDetailAdapter", "convertView is null");
            view = this.f290455e.getLayoutInflater().inflate(C0966R.C0971layout.f7004uo, viewGroup, false);
            s__g = new s$$g();
            s__g.f290473b = (TextView) view.findViewById(C0966R.C0970id.evf);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.ev6);
            s__g.f290474c = (CheckBox) view.findViewById(C0966R.C0970id.ev5);
            view.setTag(s__g);
        } else {
            Log.m105926v("MicroMsg.CleanChattingDetailAdapter", "convertView is not null");
            s__g = (s$$g) view.getTag();
        }
        C98895d dVar = this.f290456f.get(i);
        s__g.f290472a = i;
        s__g.f290473b.setText(C72715f.m85111d(this.f290455e.getString(C0966R.string.f0r), dVar.f289900g / 1000));
        CheckBox checkBox = s__g.f290474c;
        long a = dVar.mo138237a();
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < this.f290456f.size(); i2++) {
            if (this.f290456f.get(i2).mo138237a() == a) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            if (!this.f290454d.contains(Integer.valueOf(((Integer) it.next()).intValue()))) {
                break;
            }
        }
        checkBox.setChecked(z);
        return view;
    }

    public int getCount() {
        return this.f290456f.size();
    }

    public Object getItem(int i) {
        return this.f290456f.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: k11.s$$i} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r22, android.view.View r23, android.view.ViewGroup r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            if (r23 != 0) goto L_0x0098
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailUI r6 = r0.f290455e
            android.view.LayoutInflater r6 = r6.getLayoutInflater()
            r7 = 2131493825(0x7f0c03c1, float:1.8611141E38)
            r8 = r24
            android.view.View r6 = r6.inflate(r7, r8, r4)
            k11.s$$i r7 = new k11.s$$i
            r7.<init>()
            r8 = 2131300397(0x7f09102d, float:1.8218822E38)
            android.view.View r8 = r6.findViewById(r8)
            com.tencent.mm.ui.MMImageView r8 = (com.tencent.p014mm.p136ui.MMImageView) r8
            r7.f290476a = r8
            r8 = 2131313069(0x7f0941ad, float:1.8244524E38)
            android.view.View r8 = r6.findViewById(r8)
            android.widget.CheckBox r8 = (android.widget.CheckBox) r8
            r7.f290479d = r8
            r8 = 2131313071(0x7f0941af, float:1.8244528E38)
            android.view.View r8 = r6.findViewById(r8)
            r7.f290480e = r8
            r8 = 2131313134(0x7f0941ee, float:1.8244656E38)
            android.view.View r8 = r6.findViewById(r8)
            r7.f290481f = r8
            r8 = 2131311979(0x7f093d6b, float:1.8242314E38)
            android.view.View r8 = r6.findViewById(r8)
            r7.f290482g = r8
            r8 = 2131315901(0x7f094cbd, float:1.8250268E38)
            android.view.View r8 = r6.findViewById(r8)
            r7.f290477b = r8
            r8 = 2131315905(0x7f094cc1, float:1.8250276E38)
            android.view.View r8 = r6.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r7.f290478c = r8
            r8 = 2131315907(0x7f094cc3, float:1.825028E38)
            android.view.View r8 = r6.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r7.f290483h = r8
            r8 = 2131309967(0x7f09358f, float:1.8238233E38)
            android.view.View r8 = r6.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r7.f290484i = r8
            r8 = 2131313053(0x7f09419d, float:1.8244492E38)
            android.view.View r8 = r6.findViewById(r8)
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingAlbumContainer r8 = (com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingAlbumContainer) r8
            r7.f290485j = r8
            r8 = 2131296894(0x7f09027e, float:1.8211718E38)
            android.view.View r8 = r6.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r7.f290486k = r8
            r6.setTag(r7)
            goto L_0x00a1
        L_0x0098:
            java.lang.Object r6 = r23.getTag()
            r7 = r6
            k11.s$$i r7 = (k11.s$$i) r7
            r6 = r23
        L_0x00a1:
            java.util.ArrayList<j11.d> r8 = r0.f290456f
            java.lang.Object r8 = r8.get(r1)
            j11.d r8 = (j11.C98895d) r8
            com.tencent.mm.ui.MMImageView r9 = r7.f290476a
            java.lang.String r10 = r8.f289897d
            r9.setTag(r10)
            gc0.a r9 = gc0.C20828a.m22825b()
            com.tencent.mm.ui.MMImageView r10 = r7.f290476a
            r11 = 0
            r9.mo32513a(r11, r10)
            android.view.View r9 = r7.f290480e
            k11.s$$c r10 = new k11.s$$c
            r10.<init>(r0, r1)
            r9.setOnClickListener(r10)
            java.util.HashSet<java.lang.Integer> r9 = r0.f290454d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            boolean r1 = r9.contains(r1)
            r9 = 1
            r10 = 8
            if (r1 == 0) goto L_0x0122
            android.widget.CheckBox r1 = r7.f290479d
            r1.setChecked(r9)
            android.view.View r1 = r7.f290481f
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            r15.mo10233c(r5)
            java.lang.Object[] r13 = r15.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter"
            java.lang.String r16 = "getView"
            java.lang.String r17 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r12 = r1
            r11 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r11 = r11.mo10231a(r4)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r1.setVisibility(r11)
            java.lang.String r13 = "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter"
            java.lang.String r14 = "getView"
            java.lang.String r15 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0172
        L_0x0122:
            android.widget.CheckBox r1 = r7.f290479d
            r1.setChecked(r4)
            android.view.View r1 = r7.f290481f
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r15.mo10233c(r11)
            java.lang.Object[] r12 = r15.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter"
            java.lang.String r14 = "getView"
            java.lang.String r16 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r11 = r1
            r9 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r9 = r9.mo10231a(r4)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r1.setVisibility(r9)
            java.lang.String r12 = "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter"
            java.lang.String r13 = "getView"
            java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
        L_0x0172:
            com.tencent.mm.ui.MMImageView r1 = r7.f290476a
            r1.setVisibility(r4)
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingAlbumContainer r1 = r7.f290485j
            r1.setVisibility(r10)
            android.widget.TextView r1 = r7.f290486k
            r1.setVisibility(r10)
            int r1 = r8.f289901h
            r9 = 1124073521(0x43000031, float:128.00075)
            if (r1 == r9) goto L_0x0461
            r9 = 98
            if (r1 != r9) goto L_0x018e
            goto L_0x0461
        L_0x018e:
            int r1 = r8.f289895b
            r9 = 3
            if (r1 != r9) goto L_0x01e0
            android.view.View r1 = r7.f290477b
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r5)
            java.lang.Object[] r12 = r9.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter"
            java.lang.String r14 = "getView"
            java.lang.String r15 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r9 = r9.mo10231a(r4)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r1.setVisibility(r9)
            java.lang.String r12 = "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter"
            java.lang.String r13 = "getView"
            java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            android.widget.TextView r1 = r7.f290478c
            int r9 = r8.f289904k
            if (r9 < 0) goto L_0x01da
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.formatSecToMin(r9)
            goto L_0x01dc
        L_0x01da:
            java.lang.String r9 = ""
        L_0x01dc:
            r1.setText(r9)
            goto L_0x0220
        L_0x01e0:
            android.view.View r1 = r7.f290477b
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r9.mo10233c(r11)
            java.lang.Object[] r12 = r9.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter"
            java.lang.String r14 = "getView"
            java.lang.String r15 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r9 = r9.mo10231a(r4)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r1.setVisibility(r9)
            java.lang.String r12 = "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter"
            java.lang.String r13 = "getView"
            java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
        L_0x0220:
            int r1 = r8.f289895b
            r9 = 4
            if (r1 != r9) goto L_0x02f5
            android.widget.TextView r1 = r7.f290483h
            r5 = 2131823760(0x7f110c90, float:1.9280329E38)
            r1.setText(r5)
            android.widget.TextView r1 = r7.f290483h
            r1.setVisibility(r4)
            java.lang.String r1 = r8.f289897d
            if (r1 == 0) goto L_0x02b3
            android.widget.TextView r5 = r7.f290484i
            java.lang.String r9 = r8.f289902i
            if (r9 == 0) goto L_0x023d
            goto L_0x0275
        L_0x023d:
            android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r1)
            java.lang.String r9 = r1.getPath()
            if (r9 == 0) goto L_0x0261
            java.lang.String r9 = com.tencent.p014mm.vfs.C116299g2.m163855k(r9, r4, r4)
            java.lang.String r11 = r1.getPath()
            boolean r11 = r11.equals(r9)
            if (r11 != 0) goto L_0x0261
            android.net.Uri$Builder r1 = r1.buildUpon()
            android.net.Uri$Builder r1 = r1.path(r9)
            android.net.Uri r1 = r1.build()
        L_0x0261:
            java.lang.String r1 = r1.getPath()
            java.lang.String r9 = "/"
            int r9 = r1.lastIndexOf(r9)
            if (r9 >= 0) goto L_0x026e
            goto L_0x0274
        L_0x026e:
            r11 = 1
            int r9 = r9 + r11
            java.lang.String r1 = r1.substring(r9)
        L_0x0274:
            r9 = r1
        L_0x0275:
            r5.setText(r9)
            android.widget.TextView r1 = r7.f290484i
            r1.setVisibility(r4)
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r5 = r8.f289897d
            java.lang.String r5 = com.tencent.p014mm.vfs.C86013q1.m106454o(r5)
            java.lang.String r1 = r1.getMimeTypeFromExtension(r5)
            if (r1 != 0) goto L_0x028f
            r1 = -1
            goto L_0x0295
        L_0x028f:
            java.lang.String[] r5 = f290452u
            int r1 = java.util.Arrays.binarySearch(r5, r1)
        L_0x0295:
            if (r1 < 0) goto L_0x029c
            int[] r5 = f290453v
            r1 = r5[r1]
            goto L_0x029f
        L_0x029c:
            r1 = 2131100333(0x7f0602ad, float:1.7813044E38)
        L_0x029f:
            com.tencent.mm.ui.MMImageView r5 = r7.f290476a
            android.graphics.drawable.ColorDrawable r8 = new android.graphics.drawable.ColorDrawable
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailUI r9 = r0.f290455e
            android.content.res.Resources r9 = r9.getResources()
            int r1 = r9.getColor(r1)
            r8.<init>(r1)
            r5.setImageDrawable(r8)
        L_0x02b3:
            android.view.View r1 = r7.f290482g
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r5.mo10233c(r7)
            java.lang.Object[] r12 = r5.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter"
            java.lang.String r14 = "getView"
            java.lang.String r15 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.setVisibility(r5)
            java.lang.String r12 = "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter"
            java.lang.String r13 = "getView"
            java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x044b
        L_0x02f5:
            r9 = 5
            if (r1 == r9) goto L_0x03af
            r11 = 6
            if (r1 != r11) goto L_0x02fd
            goto L_0x03af
        L_0x02fd:
            int r1 = f290451t
            if (r1 != 0) goto L_0x0307
            int r1 = r6.getMeasuredWidth()
            f290451t = r1
        L_0x0307:
            hc0.c$b r1 = new hc0.c$b
            r1.<init>()
            r5 = 1
            r1.f59353i = r5
            r1.f59348d = r4
            int r11 = f290451t
            r1.f59355k = r11
            r1.f59354j = r11
            int r11 = r8.f289895b
            if (r11 != r5) goto L_0x032f
            java.lang.String r5 = r8.f289897d
            r1.f59350f = r5
            hc0.c r1 = r1.mo32666a()
            gc0.a r5 = gc0.C20828a.m22825b()
            java.lang.String r8 = r8.f289897d
            com.tencent.mm.ui.MMImageView r9 = r7.f290476a
            r5.mo32519h(r8, r9, r1)
            goto L_0x0363
        L_0x032f:
            int r5 = r8.f289901h
            r11 = 486539313(0x1d000031, float:1.6940758E-21)
            if (r5 != r11) goto L_0x0350
            java.lang.String r5 = r8.f289896c
            java.lang.String r5 = p243tn.C14050a.m13405b(r5)
            r1.f59350f = r5
            r1.f59353i = r9
            hc0.c r1 = r1.mo32666a()
            gc0.a r5 = gc0.C20828a.m22825b()
            java.lang.String r8 = r8.f289896c
            com.tencent.mm.ui.MMImageView r9 = r7.f290476a
            r5.mo32519h(r8, r9, r1)
            goto L_0x0363
        L_0x0350:
            java.lang.String r5 = r8.f289896c
            r1.f59350f = r5
            hc0.c r1 = r1.mo32666a()
            gc0.a r5 = gc0.C20828a.m22825b()
            java.lang.String r8 = r8.f289896c
            com.tencent.mm.ui.MMImageView r9 = r7.f290476a
            r5.mo32519h(r8, r9, r1)
        L_0x0363:
            android.widget.TextView r1 = r7.f290483h
            r1.setVisibility(r10)
            android.widget.TextView r1 = r7.f290484i
            r1.setVisibility(r10)
            android.view.View r1 = r7.f290482g
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r5.mo10233c(r7)
            java.lang.Object[] r12 = r5.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter"
            java.lang.String r14 = "getView"
            java.lang.String r15 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.setVisibility(r5)
            java.lang.String r12 = "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter"
            java.lang.String r13 = "getView"
            java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x044b
        L_0x03af:
            if (r1 != r9) goto L_0x03b5
            r1 = 2131823762(0x7f110c92, float:1.9280333E38)
            goto L_0x03b8
        L_0x03b5:
            r1 = 2131823761(0x7f110c91, float:1.928033E38)
        L_0x03b8:
            android.widget.TextView r9 = r7.f290483h
            r9.setText(r1)
            android.widget.TextView r1 = r7.f290484i
            java.lang.Class<ny.h> r9 = p629ny.C76979h.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            ny.h r9 = (p629ny.C76979h) r9
            android.widget.TextView r10 = r7.f290484i
            android.content.Context r10 = r10.getContext()
            java.lang.String r11 = r8.f289902i
            android.widget.TextView r12 = r7.f290484i
            float r12 = r12.getTextSize()
            android.text.SpannableString r9 = r9.yp0(r10, r11, r12)
            r1.setText(r9)
            android.widget.TextView r1 = r7.f290483h
            r1.setVisibility(r4)
            android.widget.TextView r1 = r7.f290484i
            r1.setVisibility(r4)
            com.tencent.mm.ui.MMImageView r1 = r7.f290476a
            r9 = 0
            r1.setImageDrawable(r9)
            android.view.View r1 = r7.f290482g
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r5)
            java.lang.Object[] r11 = r9.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter"
            java.lang.String r13 = "getView"
            java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r1
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r5 = r9.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.setVisibility(r5)
            java.lang.String r11 = "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter"
            java.lang.String r12 = "getView"
            java.lang.String r13 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            hc0.c$b r1 = new hc0.c$b
            r1.<init>()
            r5 = 1
            r1.f59353i = r5
            r1.f59348d = r4
            int r5 = f290451t
            r1.f59355k = r5
            r1.f59354j = r5
            java.lang.String r5 = r8.f289897d
            r1.f59350f = r5
            gc0.a r5 = gc0.C20828a.m22825b()
            java.lang.String r8 = r8.f289897d
            com.tencent.mm.ui.MMImageView r7 = r7.f290476a
            hc0.c r1 = r1.mo32666a()
            r5.mo32519h(r8, r7, r1)
        L_0x044b:
            long r7 = java.lang.System.currentTimeMillis()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long r7 = r7 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            r1[r4] = r2
            java.lang.String r2 = "MicroMsg.CleanChattingDetailAdapter"
            java.lang.String r3 = "getView time=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r3, r1)
            return r6
        L_0x0461:
            android.view.View r1 = r7.f290477b
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r2.mo10233c(r3)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter"
            java.lang.String r14 = "getView"
            java.lang.String r15 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter"
            java.lang.String r13 = "getView"
            java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            com.tencent.mm.ui.MMImageView r1 = r7.f290476a
            r1.setVisibility(r10)
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingAlbumContainer r1 = r7.f290485j
            r1.setVisibility(r4)
            android.widget.TextView r1 = r7.f290486k
            r1.setVisibility(r4)
            ig.a r1 = new ig.a
            r1.<init>()
            ig.g r2 = new ig.g
            r2.<init>()
            java.lang.String r3 = r8.f289902i
            if (r3 == 0) goto L_0x04c6
            r1.mo141099d(r3)
            java.lang.String r1 = r1.f289309p
            r2.mo141099d(r1)
        L_0x04c6:
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingAlbumContainer r1 = r7.f290485j
            java.lang.String r12 = r8.f289898e
            long r10 = r8.f289899f
            r1.getClass()
            java.lang.String r3 = "talker"
            gy3.C87412m.m108594g(r12, r3)
            uh0.a r3 = new uh0.a
            r14 = 0
            r15 = 0
            r9 = r3
            r13 = r2
            r9.<init>(r10, r12, r13, r14, r15)
            r1.setAlbumFiller(r3)
            java.util.List<ig.d> r3 = r2.f289364h
            int r3 = r3.size()
            r1.mo104368f(r3)
            android.widget.TextView r1 = r7.f290486k
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "("
            r3.append(r4)
            java.util.List<ig.d> r2 = r2.f289364h
            int r2 = r2.size()
            r3.append(r2)
            java.lang.String r2 = ")"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.setText(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k11.C99085s.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* renamed from: y */
    public long mo138431y(int i) {
        return this.f290456f.get(i).mo138237a();
    }
}
