package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMDotView;
import com.tencent.p014mm.p136ui.base.MMFlipper;
import com.tencent.p014mm.plugin.scanner.p101ui.SelectScanModeGrid;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lc3.C10485b;
import vl2.C37751c0;

/* renamed from: com.tencent.mm.plugin.scanner.ui.SelectScanModePanel */
public class SelectScanModePanel extends LinearLayout {

    /* renamed from: d */
    public boolean f315864d = C37751c0.m41524d();

    /* renamed from: e */
    public int f315865e = 4;

    /* renamed from: f */
    public int f315866f = 0;

    /* renamed from: g */
    public List<SelectScanModeGrid> f315867g;

    /* renamed from: h */
    public String[] f315868h;

    /* renamed from: i */
    public int[] f315869i;

    /* renamed from: j */
    public int[] f315870j;

    /* renamed from: n */
    public int[] f315871n;

    /* renamed from: o */
    public ArrayList<Integer> f315872o;

    /* renamed from: p */
    public Set<Integer> f315873p;

    /* renamed from: q */
    public AdapterView.OnItemClickListener f315874q;

    /* renamed from: r */
    public int f315875r;

    /* renamed from: s */
    public boolean f315876s;

    /* renamed from: t */
    public int f315877t;

    /* renamed from: u */
    public int f315878u;

    /* renamed from: v */
    public Context f315879v;

    /* renamed from: w */
    public MMFlipper f315880w;

    /* renamed from: x */
    public MMDotView f315881x;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.SelectScanModePanel$a */
    public class C106093a implements AdapterView.OnItemClickListener {
        public C106093a() {
        }

        /* JADX WARNING: type inference failed for: r8v0, types: [android.widget.AdapterView<?>, java.lang.Object, android.widget.AdapterView] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onItemClick(android.widget.AdapterView<?> r8, android.view.View r9, int r10, long r11) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                r0.add(r9)
                java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
                r0.add(r9)
                java.lang.Long r9 = java.lang.Long.valueOf(r11)
                r0.add(r9)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/scanner/ui/SelectScanModePanel$3"
                java.lang.String r2 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r3 = "onItemClick"
                java.lang.String r4 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                java.lang.String r9 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                java.lang.String r11 = "onItemClick"
                java.lang.String r12 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r0 = "com/tencent/mm/plugin/scanner/ui/SelectScanModePanel$3"
                r1 = 1
                r2 = 0
                java.lang.String r3 = "MicroMsg.scanner.SelectScanModePanel"
                if (r8 == 0) goto L_0x0083
                com.tencent.mm.plugin.scanner.ui.SelectScanModePanel r4 = com.tencent.p014mm.plugin.scanner.p101ui.SelectScanModePanel.this
                android.content.Context r4 = r4.f315879v
                if (r4 != 0) goto L_0x0043
                goto L_0x0083
            L_0x0043:
                android.widget.Adapter r4 = r8.getAdapter()
                java.lang.Object r4 = r4.getItem(r10)
                com.tencent.mm.plugin.scanner.ui.SelectScanModeGrid$b r4 = (com.tencent.p014mm.plugin.scanner.p101ui.SelectScanModeGrid.C106092b) r4
                if (r4 != 0) goto L_0x0058
                java.lang.String r8 = "clickItem == null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r8)
                j20.C117292a.m165361g(r7, r0, r12, r11, r9)
                return
            L_0x0058:
                android.widget.Adapter r8 = r8.getAdapter()
                com.tencent.mm.plugin.scanner.ui.SelectScanModeGrid$a r8 = (com.tencent.p014mm.plugin.scanner.p101ui.SelectScanModeGrid.C106090a) r8
                r8.f315854f = r10
                r8 = 2
                java.lang.Object[] r8 = new java.lang.Object[r8]
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r8[r2] = r10
                java.lang.String r10 = r4.f315858a
                r8[r1] = r10
                java.lang.String r10 = "position=[%s], clickItem=[%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r10, r8)
                com.tencent.mm.plugin.scanner.ui.SelectScanModePanel r8 = com.tencent.p014mm.plugin.scanner.p101ui.SelectScanModePanel.this
                r8.getClass()
                com.tencent.mm.plugin.scanner.ui.SelectScanModePanel r8 = com.tencent.p014mm.plugin.scanner.p101ui.SelectScanModePanel.this
                int r10 = r4.f315861d
                r8.setSelectedMode(r10)
                j20.C117292a.m165361g(r7, r0, r12, r11, r9)
                return
            L_0x0083:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r2 = "parent == null ? "
                r10.append(r2)
                if (r8 != 0) goto L_0x0092
                r8 = 1
                goto L_0x0093
            L_0x0092:
                r8 = 0
            L_0x0093:
                r10.append(r8)
                java.lang.String r8 = ", context == null ? "
                r10.append(r8)
                com.tencent.mm.plugin.scanner.ui.SelectScanModePanel r8 = com.tencent.p014mm.plugin.scanner.p101ui.SelectScanModePanel.this
                android.content.Context r8 = r8.f315879v
                if (r8 != 0) goto L_0x00a2
                goto L_0x00a3
            L_0x00a2:
                r1 = 0
            L_0x00a3:
                r10.append(r1)
                java.lang.String r8 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r8)
                j20.C117292a.m165361g(r7, r0, r12, r11, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.p101ui.SelectScanModePanel.C106093a.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.SelectScanModePanel$b */
    public interface C106094b {
        /* renamed from: a */
        void mo151658a(int i);
    }

    public SelectScanModePanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String[] split;
        int i = 5;
        this.f315869i = new int[]{C0966R.C0969drawable.f357335cb2, C0966R.C0969drawable.car, C0966R.C0969drawable.cb4, C0966R.raw.scan_translation, C0966R.C0969drawable.car};
        this.f315870j = new int[]{C0966R.C0969drawable.f357336cb3, C0966R.C0969drawable.cas, C0966R.C0969drawable.cb5, C0966R.raw.scan_translation_hl, C0966R.C0969drawable.cas};
        this.f315871n = new int[]{1, 2, 5, 3, 12};
        this.f315872o = new ArrayList<>();
        this.f315873p = new HashSet();
        this.f315875r = 0;
        this.f315876s = false;
        this.f315879v = context;
        View.inflate(context, C0966R.C0971layout.bwc, this);
        this.f315881x = (MMDotView) findViewById(C0966R.C0970id.j_u);
        this.f315872o.clear();
        this.f315872o.add(1);
        this.f315872o.add(2);
        this.f315872o.add(5);
        this.f315872o.add(3);
        if (this.f315864d) {
            this.f315872o.add(12);
        }
        i = !this.f315864d ? 4 : i;
        this.f315865e = i;
        String[] strArr = new String[i];
        this.f315868h = strArr;
        strArr[0] = this.f315879v.getString(C0966R.string.ibx);
        String[] strArr2 = this.f315868h;
        String string = this.f315879v.getString(C0966R.string.ibu);
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("ScanBookWording");
        Log.m105924i("MicroMsg.ScannerUtil", "scan image dynamic wording: " + Util.nullAsNil(c));
        if (!Util.isNullOrNil(c) && (split = c.split("&")) != null) {
            HashMap hashMap = new HashMap();
            for (String split2 : split) {
                String[] split3 = split2.split("=");
                if (split3.length == 2) {
                    hashMap.put(split3[0], split3[1]);
                }
            }
            String str = (String) hashMap.get("buttonTitle");
            if (!Util.isNullOrNil(str)) {
                string = str;
            }
        }
        strArr2[1] = string;
        this.f315868h[2] = this.f315879v.getString(C0966R.string.ibz);
        this.f315868h[3] = this.f315879v.getString(C0966R.string.ibv);
        if (this.f315864d) {
            this.f315868h[4] = this.f315879v.getString(C0966R.string.ibr);
        }
        Log.m105926v("MicroMsg.scanner.SelectScanModePanel", "AppPanel initFlipper");
        this.f315880w = (MMFlipper) findViewById(C0966R.C0970id.j_v);
        View findViewById = findViewById(C0966R.C0970id.j_t);
        if (this.f315879v.getResources().getConfiguration().orientation == 2) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.height = BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f315879v, (float) 85);
            findViewById.setLayoutParams(layoutParams);
        } else {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams2.height = BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f315879v, (float) 85);
            findViewById.setLayoutParams(layoutParams2);
        }
        this.f315880w.removeAllViews();
        this.f315880w.setOnMeasureListener(new C106098r(this));
        this.f315880w.setOnScreenChangedListener(new C106099s(this));
    }

    /* renamed from: a */
    public final void mo151652a() {
        if (this.f315874q == null) {
            this.f315874q = new C106093a();
        }
        this.f315867g = new ArrayList();
        if (this.f315877t != 0 && this.f315878u != 0) {
            this.f315880w.removeAllViews();
            int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f315879v, 64.0f);
            int fromDPToPix2 = BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f315879v, 78.0f);
            int i = this.f315877t / fromDPToPix;
            int i2 = this.f315878u / fromDPToPix2;
            if (i == 0) {
                i = 1;
            } else if (i > this.f315872o.size()) {
                i = this.f315872o.size();
            }
            if (i2 == 0) {
                i2 = 1;
            }
            int i3 = i * i2;
            this.f315875r = 0;
            int i4 = this.f315865e;
            while (i4 > 0) {
                i4 -= i3;
                this.f315875r++;
            }
            for (int i5 = 0; i5 < this.f315875r; i5++) {
                ArrayList arrayList = new ArrayList();
                int i6 = i5 * i3;
                int i7 = i6;
                while (true) {
                    int i8 = -1;
                    if (i7 < this.f315872o.size() && i7 < i6 + i3) {
                        int intValue = this.f315872o.get(i7).intValue();
                        int i9 = 0;
                        while (true) {
                            int[] iArr = this.f315871n;
                            if (i9 >= iArr.length) {
                                break;
                            } else if (iArr[i9] == intValue) {
                                i8 = i9;
                                break;
                            } else {
                                i9++;
                            }
                        }
                        arrayList.add(new SelectScanModeGrid.C106092b(this.f315868h[i8], this.f315869i[i8], this.f315870j[i8], this.f315872o.get(i7).intValue(), ((HashSet) this.f315873p).contains(this.f315872o.get(i7))));
                        i7++;
                    }
                }
                if (arrayList.size() > 0) {
                    SelectScanModeGrid selectScanModeGrid = (SelectScanModeGrid) View.inflate(this.f315879v, C0966R.C0971layout.bwa, (ViewGroup) null);
                    selectScanModeGrid.setNumColumns(i3);
                    SelectScanModeGrid.C106090a aVar = new SelectScanModeGrid.C106090a(this.f315879v, arrayList);
                    aVar.f315854f = this.f315866f;
                    selectScanModeGrid.setAdapter(aVar);
                    this.f315880w.addView(selectScanModeGrid, new LinearLayout.LayoutParams(-1, -1));
                    selectScanModeGrid.setOnItemClickListener(this.f315874q);
                    ((ArrayList) this.f315867g).add(selectScanModeGrid);
                }
            }
            if (((ArrayList) this.f315867g).size() <= 1) {
                this.f315881x.setVisibility(4);
                return;
            }
            this.f315881x.setVisibility(0);
            this.f315881x.setDotCount(((ArrayList) this.f315867g).size());
            int curScreen = this.f315880w.getCurScreen();
            this.f315880w.setToScreen(curScreen);
            this.f315881x.setSelectedDot(curScreen);
        }
    }

    public void setDisplayModes(int[] iArr) {
        this.f315872o.clear();
        for (int valueOf : iArr) {
            this.f315872o.add(Integer.valueOf(valueOf));
        }
        mo151652a();
    }

    public void setOnGridItemClickCallback(C106094b bVar) {
    }

    public void setSelectedMode(int i) {
        TextView textView;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f315871n;
            if (i2 >= iArr.length) {
                i2 = -1;
                break;
            } else if (iArr[i2] == i) {
                break;
            } else {
                i2++;
            }
        }
        this.f315866f = i2;
        if (this.f315867g != null) {
            for (int i3 = 0; i3 < ((ArrayList) this.f315867g).size(); i3++) {
                SelectScanModeGrid.C106090a aVar = (SelectScanModeGrid.C106090a) ((SelectScanModeGrid) ((ArrayList) this.f315867g).get(i3)).getAdapter();
                if (aVar != null) {
                    for (int i4 = 0; i4 < aVar.getCount(); i4++) {
                        SelectScanModeGrid.C106092b bVar = (SelectScanModeGrid.C106092b) aVar.getItem(i4);
                        if (!(bVar == null || (textView = bVar.f315862e) == null)) {
                            if (bVar.f315861d == i) {
                                textView.setBackgroundResource(bVar.f315860c);
                                bVar.f315863f = false;
                                if (i3 > 0) {
                                    this.f315880w.setToScreen(i3);
                                    this.f315881x.setSelectedDot(i3);
                                }
                            } else {
                                textView.setBackgroundResource(bVar.f315859b);
                            }
                        }
                    }
                    aVar.f315854f = this.f315866f;
                    aVar.notifyDataSetChanged();
                }
            }
        }
    }

    public void setShowRedDotModes(Set<Integer> set) {
        if (set != null) {
            ((HashSet) this.f315873p).clear();
            this.f315873p.addAll(set);
        }
    }
}
