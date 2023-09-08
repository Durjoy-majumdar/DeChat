package com.tencent.p014mm.plugin.label.p067ui.searchLabel;

import a22.C27740g;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.plugin.label.p067ui.searchLabel.C69101b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72955b2;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import p1136n3.C109678b;
import p910lj.C76701a;
import uo3.C78253a;

/* renamed from: com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI */
public class LabelSearchUI extends MMActivity implements C7020t0 {

    /* renamed from: t */
    public static final /* synthetic */ int f198679t = 0;

    /* renamed from: d */
    public RecyclerView f198680d;

    /* renamed from: e */
    public ArrayList<String> f198681e = new ArrayList<>();

    /* renamed from: f */
    public int f198682f = -1;

    /* renamed from: g */
    public C106742j1 f198683g;

    /* renamed from: h */
    public TextView f198684h;

    /* renamed from: i */
    public boolean f198685i = false;

    /* renamed from: j */
    public Button f198686j;

    /* renamed from: n */
    public C69101b f198687n;

    /* renamed from: o */
    public ArrayList<C72955b2> f198688o = null;

    /* renamed from: p */
    public View f198689p;

    /* renamed from: q */
    public KeyboardHeightProvider f198690q;

    /* renamed from: r */
    public boolean f198691r = true;

    /* renamed from: s */
    public TextView f198692s;

    /* renamed from: com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI$a */
    public class C69093a implements C106742j1.C74847n {
        public C69093a() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI$b */
    public class C69094b implements C106742j1.C106756o {
        public C69094b() {
        }

        /* renamed from: H5 */
        public void mo1321H5() {
            KeyboardHeightProvider keyboardHeightProvider = LabelSearchUI.this.f198690q;
            if (keyboardHeightProvider != null) {
                keyboardHeightProvider.mo104021d();
            }
        }

        /* renamed from: S6 */
        public boolean mo1322S6(String str) {
            return false;
        }

        /* renamed from: i7 */
        public void mo1323i7() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: android.database.Cursor} */
        /* JADX WARNING: type inference failed for: r7v7, types: [java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r7v14 */
        /* JADX WARNING: type inference failed for: r7v15 */
        /* JADX WARNING: type inference failed for: r7v16 */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b4, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b5, code lost:
            r16 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00be, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x01a3, code lost:
            r7.close();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00be A[ExcHandler: all (th java.lang.Throwable), Splitter:B:13:0x0084] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00de  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00eb  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00ee  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x01a3  */
        /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: l3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1324l3(java.lang.String r25) {
            /*
                r24 = this;
                r1 = r24
                r2 = r25
                java.lang.String r0 = "MicroMsg.LabelSearchUI"
                java.lang.String r3 = "onSearchChange: "
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r3)
                boolean r0 = android.text.TextUtils.isEmpty(r25)
                r3 = 0
                if (r0 == 0) goto L_0x001b
                com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI r0 = com.tencent.p014mm.plugin.label.p067ui.searchLabel.LabelSearchUI.this
                androidx.recyclerview.widget.RecyclerView r0 = r0.f198680d
                r4 = 4
                r0.setVisibility(r4)
                goto L_0x0022
            L_0x001b:
                com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI r0 = com.tencent.p014mm.plugin.label.p067ui.searchLabel.LabelSearchUI.this
                androidx.recyclerview.widget.RecyclerView r0 = r0.f198680d
                r0.setVisibility(r3)
            L_0x0022:
                com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI r0 = com.tencent.p014mm.plugin.label.p067ui.searchLabel.LabelSearchUI.this
                com.tencent.mm.plugin.label.ui.searchLabel.b r4 = r0.f198687n
                android.util.SparseArray<android.text.SpannableString> r0 = r4.f198719u
                if (r0 == 0) goto L_0x002d
                r0.clear()
            L_0x002d:
                java.lang.String r0 = ""
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r0)
                r4.f198714p = r0
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                r5 = 1
                if (r0 == 0) goto L_0x0043
                java.util.ArrayList<com.tencent.mm.storage.b2> r0 = r4.f198712n
                r4.mo95175O4(r0)
                goto L_0x00e4
            L_0x0043:
                com.tencent.mm.storage.e2 r0 = a22.C27740g.vx0()
                r0.getClass()
                java.lang.String r6 = "MicroMsg.Label.ContactLabelStorage"
                java.lang.String r10 = "labelName like ?"
                java.lang.String[] r11 = new java.lang.String[r5]
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "%"
                r7.append(r8)
                r7.append(r2)
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r11[r3] = r7
                r16 = 0
                com.tencent.mm.sdk.storage.ISQLiteDatabase r7 = r0.f212650d     // Catch:{ Exception -> 0x00cc }
                java.lang.String r8 = "ContactLabel"
                java.lang.String r17 = "labelID"
                java.lang.String r18 = "createTime"
                java.lang.String r19 = "isTemporary"
                java.lang.String r20 = "labelName"
                java.lang.String r21 = "labelPYFull"
                java.lang.String r22 = "labelPYShort"
                java.lang.String[] r9 = new java.lang.String[]{r17, r18, r19, r20, r21, r22}     // Catch:{ Exception -> 0x00cc }
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 2
                android.database.Cursor r7 = r7.query(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x00cc }
                boolean r0 = r7.moveToFirst()     // Catch:{ Exception -> 0x00c1, all -> 0x00be }
                if (r0 == 0) goto L_0x00b8
                java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ Exception -> 0x00c1, all -> 0x00be }
                r8.<init>()     // Catch:{ Exception -> 0x00c1, all -> 0x00be }
            L_0x008f:
                com.tencent.mm.storage.b2 r0 = new com.tencent.mm.storage.b2     // Catch:{ Exception -> 0x00b4, all -> 0x00be }
                r0.<init>()     // Catch:{ Exception -> 0x00b4, all -> 0x00be }
                r0.convertFrom(r7)     // Catch:{ Exception -> 0x00b4, all -> 0x00be }
                r8.add(r0)     // Catch:{ Exception -> 0x00b4, all -> 0x00be }
                boolean r0 = r7.moveToNext()     // Catch:{ Exception -> 0x00b4, all -> 0x00be }
                if (r0 != 0) goto L_0x008f
                java.lang.String r0 = "cpan[getLabelIdListNoInList] resut size:%d"
                java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00b4, all -> 0x00be }
                int r10 = r8.size()     // Catch:{ Exception -> 0x00b4, all -> 0x00be }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x00b4, all -> 0x00be }
                r9[r3] = r10     // Catch:{ Exception -> 0x00b4, all -> 0x00be }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r0, r9)     // Catch:{ Exception -> 0x00b4, all -> 0x00be }
                r16 = r8
                goto L_0x00b8
            L_0x00b4:
                r0 = move-exception
                r16 = r8
                goto L_0x00c2
            L_0x00b8:
                r7.close()
                r7 = r16
                goto L_0x00e1
            L_0x00be:
                r0 = move-exception
                goto L_0x01a1
            L_0x00c1:
                r0 = move-exception
            L_0x00c2:
                r23 = r16
                r16 = r7
                r7 = r23
                goto L_0x00cf
            L_0x00c9:
                r0 = move-exception
                goto L_0x019f
            L_0x00cc:
                r0 = move-exception
                r7 = r16
            L_0x00cf:
                java.lang.String r8 = "cpan[getLabelIdByStr] exception %s"
                java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x00c9 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00c9 }
                r9[r3] = r0     // Catch:{ all -> 0x00c9 }
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r8, r9)     // Catch:{ all -> 0x00c9 }
                if (r16 == 0) goto L_0x00e1
                r16.close()
            L_0x00e1:
                r4.mo95175O4(r7)
            L_0x00e4:
                com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI r0 = com.tencent.p014mm.plugin.label.p067ui.searchLabel.LabelSearchUI.this
                int r0 = r0.f198682f
                if (r0 != r5) goto L_0x00eb
                goto L_0x00ec
            L_0x00eb:
                r5 = 0
            L_0x00ec:
                if (r5 == 0) goto L_0x019e
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r25)
                if (r0 != 0) goto L_0x0146
                com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI r0 = com.tencent.p014mm.plugin.label.p067ui.searchLabel.LabelSearchUI.this
                com.tencent.mm.plugin.label.ui.searchLabel.b r0 = r0.f198687n
                java.util.ArrayList<com.tencent.mm.storage.b2> r0 = r0.f198705d
                if (r0 == 0) goto L_0x0146
                int r0 = r0.size()
                if (r0 != 0) goto L_0x0103
                goto L_0x0146
            L_0x0103:
                com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI r0 = com.tencent.p014mm.plugin.label.p067ui.searchLabel.LabelSearchUI.this
                android.view.View r0 = r0.f198689p
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                r2.mo10233c(r4)
                java.lang.Object[] r5 = r2.mo10232b()
                java.lang.String r6 = "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI$4"
                java.lang.String r7 = "onSearchChange"
                java.lang.String r8 = "(Ljava/lang/String;)V"
                java.lang.String r9 = "android/view/View_EXEC_"
                java.lang.String r10 = "setVisibility"
                java.lang.String r11 = "(I)V"
                r4 = r0
                j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
                java.lang.Object r2 = r2.mo10231a(r3)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r0.setVisibility(r2)
                java.lang.String r5 = "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI$4"
                java.lang.String r6 = "onSearchChange"
                java.lang.String r7 = "(Ljava/lang/String;)V"
                java.lang.String r8 = "android/view/View_EXEC_"
                java.lang.String r9 = "setVisibility"
                java.lang.String r10 = "(I)V"
                j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
                goto L_0x019e
            L_0x0146:
                com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI r0 = com.tencent.p014mm.plugin.label.p067ui.searchLabel.LabelSearchUI.this
                android.widget.Button r2 = r0.f198686j
                android.content.res.Resources r0 = r0.getResources()
                r4 = 2131821601(0x7f110421, float:1.927595E38)
                java.lang.String r0 = r0.getString(r4)
                r2.setText(r0)
                com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI r0 = com.tencent.p014mm.plugin.label.p067ui.searchLabel.LabelSearchUI.this
                r0.f198685i = r3
                android.view.View r0 = r0.f198689p
                r2 = 8
                k20.a r12 = new k20.a
                r12.<init>()
                java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r12.mo10233c(r2)
                java.lang.Object[] r5 = r12.mo10232b()
                java.lang.String r6 = "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI$4"
                java.lang.String r7 = "onSearchChange"
                java.lang.String r8 = "(Ljava/lang/String;)V"
                java.lang.String r9 = "android/view/View_EXEC_"
                java.lang.String r10 = "setVisibility"
                java.lang.String r11 = "(I)V"
                r4 = r0
                j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
                java.lang.Object r2 = r12.mo10231a(r3)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r0.setVisibility(r2)
                java.lang.String r5 = "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI$4"
                java.lang.String r6 = "onSearchChange"
                java.lang.String r7 = "(Ljava/lang/String;)V"
                java.lang.String r8 = "android/view/View_EXEC_"
                java.lang.String r9 = "setVisibility"
                java.lang.String r10 = "(I)V"
                j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            L_0x019e:
                return
            L_0x019f:
                r7 = r16
            L_0x01a1:
                if (r7 == 0) goto L_0x01a6
                r7.close()
            L_0x01a6:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.label.p067ui.searchLabel.LabelSearchUI.C69094b.mo1324l3(java.lang.String):void");
        }

        /* renamed from: l5 */
        public void mo1325l5() {
        }

        /* renamed from: y4 */
        public void mo1326y4() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI$c */
    public class C69095c implements View.OnClickListener {
        public C69095c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LabelSearchUI labelSearchUI = LabelSearchUI.this;
            int i = LabelSearchUI.f198679t;
            labelSearchUI.getClass();
            Intent intent = new Intent();
            ArrayList<String> stringsToList = Util.stringsToList((String[]) ((LinkedList) labelSearchUI.f198687n.f198706e).toArray(new String[0]));
            if (stringsToList == null) {
                stringsToList = new ArrayList<>();
            }
            String string = labelSearchUI.getResources().getString(C0966R.string.g2s, new Object[]{Integer.valueOf(stringsToList.size())});
            if (!labelSearchUI.f198691r) {
                Log.m105918d("MicroMsg.LabelSearchUI", "showToastBlack: skip");
            } else {
                C76701a.makeText((Context) labelSearchUI, (CharSequence) string, 0).show();
            }
            intent.putExtra("contact_choose_label_list", Util.listToString(stringsToList, ","));
            labelSearchUI.setResult(-1, intent);
            labelSearchUI.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI$d */
    public class C69096d implements View.OnClickListener {
        public C69096d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LabelSearchUI labelSearchUI = LabelSearchUI.this;
            if (!labelSearchUI.f198685i) {
                labelSearchUI.f198685i = true;
                labelSearchUI.f198686j.setText(labelSearchUI.getResources().getString(C0966R.string.f360930g23));
                LabelSearchUI.this.f198692s.setVisibility(0);
                List<String> list = LabelSearchUI.this.f198687n.f198706e;
                if (list == null || ((LinkedList) list).size() == 0) {
                    LabelSearchUI labelSearchUI2 = LabelSearchUI.this;
                    labelSearchUI2.f198692s.setText(labelSearchUI2.getString(C0966R.string.f7929wj));
                } else {
                    TextView textView = LabelSearchUI.this.f198692s;
                    textView.setText(LabelSearchUI.this.getString(C0966R.string.f7929wj) + "(" + ((LinkedList) LabelSearchUI.this.f198687n.f198706e).size() + ")");
                }
                C69101b bVar = LabelSearchUI.this.f198687n;
                bVar.f198715q = false;
                bVar.f198711j = 1;
                List<String> list2 = bVar.f198706e;
                if (list2 != null) {
                    ((LinkedList) list2).clear();
                }
                bVar.notifyDataSetChanged();
            } else {
                labelSearchUI.f198685i = false;
                labelSearchUI.f198686j.setText(labelSearchUI.getResources().getString(C0966R.string.a0r));
                LabelSearchUI.this.f198692s.setVisibility(8);
                C69101b bVar2 = LabelSearchUI.this.f198687n;
                bVar2.f198715q = true;
                bVar2.f198711j = 0;
                List<String> list3 = bVar2.f198706e;
                if (list3 != null) {
                    ((LinkedList) list3).clear();
                }
                bVar2.notifyDataSetChanged();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI$e */
    public class C69097e implements C69101b.C69102a {
        public C69097e() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI$f */
    public class C69098f implements MenuItem.OnMenuItemClickListener {
        public C69098f() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            LabelSearchUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.label.ui.searchLabel.LabelSearchUI$g */
    public class C69099g implements ValueAnimator.AnimatorUpdateListener {
        public C69099g() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue("translationY")).floatValue();
            Log.m105925i("MicroMsg.LabelSearchUI", "onAnimationUpdate %s", Float.valueOf(floatValue));
            RecyclerView recyclerView = LabelSearchUI.this.f198680d;
            if (recyclerView != null) {
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    LabelSearchUI labelSearchUI = LabelSearchUI.this;
                    marginLayoutParams.bottomMargin = (int) (((labelSearchUI.f198682f == 0) || labelSearchUI.f198689p.getVisibility() != 0) ? 0.0f : LabelSearchUI.this.getResources().getDimension(C0966R.dimen.f3758d_) - floatValue);
                    LabelSearchUI.this.f198680d.setLayoutParams(layoutParams);
                    Log.m105919d("MicroMsg.LabelSearchUI", "onAnimationUpdate: update recyclerview bottom margin:%d", Integer.valueOf(marginLayoutParams.bottomMargin));
                }
            }
        }
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        ObjectAnimator objectAnimator;
        Log.m105925i("MicroMsg.LabelSearchUI", "onKeyboardHeightChanged, height:%s", Integer.valueOf(i));
        View view = this.f198689p;
        if (view == null) {
            Log.m105924i("MicroMsg.LabelSearchUI", "moveViewUppos, container: isNull");
            return;
        }
        if (i > 0) {
            if (view.getTranslationY() != 0.0f) {
                view.setTranslationY(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, "translationY", new float[]{0.0f, (float) (-i)});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, "translationY", new float[]{view.getTranslationY(), 0.0f});
        }
        objectAnimator.setDuration(200);
        objectAnimator.setInterpolator(new C109678b());
        objectAnimator.addUpdateListener(new C69099g());
        objectAnimator.start();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b3m;
    }

    public void initView() {
        setMMTitle("");
        TextView textView = (TextView) findViewById(C0966R.C0970id.cjj);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(textView, aVar.mo10232b(), "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI", "hideViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(textView, "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI", "hideViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f198680d = (RecyclerView) findViewById(C0966R.C0970id.f358496fh0);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.cjj);
        this.f198684h = textView2;
        textView2.setText(C0966R.string.f7456gr);
        this.f198682f = getIntent().getIntExtra("edit_mode_state", -1);
        this.f198688o = C27740g.vx0().mo100946SE();
        C69101b bVar = new C69101b(getContext());
        this.f198687n = bVar;
        boolean z = true;
        bVar.f198715q = true;
        bVar.f198716r = getIntent().getBooleanExtra("contact_search_label_show_member_count", false);
        this.f198687n.f198717s = getIntent().getBooleanExtra("contact_search_label_enable_choose_empty_label", true);
        this.f198691r = getIntent().getBooleanExtra("contact_search_label_need_toast_after_choose", true);
        String stringExtra = getIntent().getStringExtra("contact_has_choose_label_list");
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f198681e.clear();
            this.f198681e.addAll(Util.stringToList(stringExtra, ","));
            if (!this.f198681e.isEmpty()) {
                this.f198687n.f198708g = this.f198681e;
            }
        }
        this.f198680d.setAdapter(this.f198687n);
        this.f198680d.setLayoutManager(new LinearLayoutManager(this));
        this.f198680d.setHasFixedSize(true);
        this.f198687n.mo95175O4(this.f198688o);
        C106742j1 j1Var = new C106742j1(true, false);
        this.f198683g = j1Var;
        j1Var.mo153851c(true);
        this.f198683g.f319115c = true;
        this.f198689p = findViewById(C0966R.C0970id.cau);
        this.f198683g.mo153859q(getResources().getString(C0966R.string.g2j));
        this.f198687n.f198712n = this.f198688o;
        View view = this.f198689p;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C106742j1 j1Var2 = this.f198683g;
        j1Var2.f319127o = new C69093a();
        j1Var2.f319122j = new C69094b();
        addSearchMenu(true, j1Var2);
        this.f198692s = (TextView) findViewById(C0966R.C0970id.etn);
        Button button = (Button) findViewById(C0966R.C0970id.go_);
        this.f198686j = button;
        button.setText(getResources().getString(C0966R.string.a0r));
        this.f198692s.setOnClickListener(new C69095c());
        this.f198686j.setOnClickListener(new C69096d());
        new C78253a(getContext());
        this.f198687n.f198718t = new C69097e();
        setBackBtn(new C69098f());
        this.f198680d.setVisibility(4);
        ViewGroup.LayoutParams layoutParams = this.f198680d.getLayoutParams();
        if (this.f198682f != 0) {
            z = false;
        }
        if (z && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
            this.f198680d.setLayoutParams(layoutParams);
        }
        if (this.f198687n.getItemCount() == 0) {
            this.f198684h.setSingleLine(false);
            this.f198684h.setPadding(40, 0, 40, 0);
            this.f198684h.setVisibility(0);
        }
        KeyboardHeightProvider keyboardHeightProvider = new KeyboardHeightProvider(this);
        this.f198690q = keyboardHeightProvider;
        keyboardHeightProvider.f220015b = this;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        KeyboardHeightProvider keyboardHeightProvider = this.f198690q;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
        super.onPause();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        KeyboardHeightProvider keyboardHeightProvider = this.f198690q;
        if (keyboardHeightProvider != null && z) {
            keyboardHeightProvider.mo104022e();
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
    }
}
