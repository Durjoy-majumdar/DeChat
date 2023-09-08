package com.tencent.p014mm.plugin.sns.p106ui.previewimageview;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94958v;
import com.tencent.p014mm.plugin.sns.p106ui.d2$$d;
import com.tencent.p014mm.plugin.sns.p106ui.d2$$j;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import vr2.C102236a0;
import zu2.C103094b;

/* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.a */
public class C96142a extends C103094b {

    /* renamed from: t */
    public static final /* synthetic */ int f280858t = 0;

    /* renamed from: i */
    public HashMap<String, Bitmap> f280859i = new HashMap<>();

    /* renamed from: j */
    public int f280860j;

    /* renamed from: n */
    public boolean f280861n;

    /* renamed from: o */
    public boolean f280862o;

    /* renamed from: p */
    public boolean f280863p;

    /* renamed from: q */
    public boolean f280864q;

    /* renamed from: r */
    public C96144b f280865r;

    /* renamed from: s */
    public int f280866s = 0;

    /* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.a$b */
    public interface C96144b {
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.a$c */
    public class C96145c {

        /* renamed from: a */
        public View f280867a;

        /* renamed from: b */
        public ImageView f280868b;

        /* renamed from: c */
        public ImageView f280869c;

        public C96145c(View view, C96143a aVar) {
            this.f280867a = view;
            this.f280868b = (ImageView) view.findViewById(C0966R.C0970id.fc8);
            this.f280869c = (ImageView) view.findViewById(C0966R.C0970id.a8t);
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.a$d */
    public class C96146d extends C94958v<String, Integer, Boolean> {

        /* renamed from: c */
        public ImageView f280871c;

        /* renamed from: d */
        public String f280872d;

        /* renamed from: e */
        public Bitmap f280873e;

        public C96146d(ImageView imageView, String str) {
            this.f280871c = imageView;
            this.f280872d = str;
        }

        /* renamed from: a */
        public Object mo131151a(Object[] objArr) {
            Boolean bool;
            SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$ThumbLoader");
            String[] strArr = (String[]) objArr;
            SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$ThumbLoader");
            C96142a aVar = C96142a.this;
            int i = C96142a.f280858t;
            SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            boolean z = aVar.f280863p;
            SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            if (z) {
                bool = Boolean.FALSE;
                SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$ThumbLoader");
            } else {
                this.f280873e = BitmapUtil.extractThumbNail(this.f280872d, C94866e1.Hx0(), C94866e1.Hx0(), true);
                int orientationInDegree = Exif.fromFile(this.f280872d).getOrientationInDegree();
                Log.m105919d("MicroMsg.MMAsyncTask", "exifPath : %s degree : %d", this.f280872d, Integer.valueOf(orientationInDegree));
                this.f280873e = BitmapUtil.rotate(this.f280873e, (float) orientationInDegree);
                bool = Boolean.TRUE;
                SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$ThumbLoader");
            }
            SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$ThumbLoader");
            return bool;
        }

        /* renamed from: b */
        public ExecutorService mo131152b() {
            SnsMethodCalculate.markStartTimeMs("getExecutor", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$ThumbLoader");
            ExecutorService Gx0 = C94866e1.Gx0();
            SnsMethodCalculate.markEndTimeMs("getExecutor", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$ThumbLoader");
            return Gx0;
        }

        /* renamed from: c */
        public void mo131153c(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$ThumbLoader");
            SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$ThumbLoader");
            super.mo131153c((Boolean) obj);
            C96142a aVar = C96142a.this;
            int i = C96142a.f280858t;
            SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            boolean z = aVar.f280863p;
            SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            if (z) {
                SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$ThumbLoader");
            } else {
                if (C102236a0.m134740e(this.f280873e)) {
                    C96142a aVar2 = C96142a.this;
                    SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
                    HashMap<String, Bitmap> hashMap = aVar2.f280859i;
                    SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
                    hashMap.put(this.f280872d, this.f280873e);
                    if (this.f280871c.getTag() != null && (this.f280871c.getTag() instanceof String) && this.f280871c.getTag().equals(this.f280872d)) {
                        this.f280871c.setImageBitmap(this.f280873e);
                    }
                }
                SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$ThumbLoader");
            }
            SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$ThumbLoader");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.a$e */
    public class C96147e {

        /* renamed from: a */
        public Object f280875a;

        /* renamed from: b */
        public int f280876b;

        public C96147e(C96142a aVar, C96143a aVar2) {
        }

        public int hashCode() {
            SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$UniqueIdWrapperItem");
            int i = this.f280876b;
            SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$UniqueIdWrapperItem");
            return i;
        }

        public String toString() {
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$UniqueIdWrapperItem");
            String obj = this.f280875a.toString();
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$UniqueIdWrapperItem");
            return obj;
        }
    }

    public C96142a(Context context, List<?> list, int i, int i2, boolean z, boolean z2, C96144b bVar) {
        super(context, i);
        super.mo133754g(mo133760j(list));
        this.f280860j = i2;
        this.f280861n = z;
        this.f280864q = z2;
        this.f280865r = bVar;
        if (z2) {
            mo133758h();
        }
        mo133759i();
    }

    /* renamed from: a */
    public boolean mo133751a(int i) {
        SnsMethodCalculate.markStartTimeMs("canDrag", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        boolean z = false;
        if (i < mo133761k()) {
            SnsMethodCalculate.markEndTimeMs("canDrag", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            return false;
        } else if (this.f280862o) {
            if (i != getCount() - 1) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("canDrag", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            return z;
        } else {
            SnsMethodCalculate.markStartTimeMs("canDrag", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
            SnsMethodCalculate.markEndTimeMs("canDrag", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
            SnsMethodCalculate.markEndTimeMs("canDrag", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            return true;
        }
    }

    /* renamed from: b */
    public void mo133752b(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("reorderItems", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        SnsMethodCalculate.markStartTimeMs("reorderItems", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        if (i2 < getCount()) {
            ArrayList<Object> arrayList = this.f304201g;
            SnsMethodCalculate.markStartTimeMs("reorder", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
            arrayList.add(i2, arrayList.remove(i));
            SnsMethodCalculate.markEndTimeMs("reorder", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
            notifyDataSetChanged();
        }
        SnsMethodCalculate.markEndTimeMs("reorderItems", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        C96144b bVar = this.f280865r;
        if (bVar != null) {
            int l = mo133762l(i);
            int l2 = mo133762l(i2);
            d2$$d d2__d = (d2$$d) bVar;
            d2__d.getClass();
            SnsMethodCalculate.markStartTimeMs("moveItem", "com.tencent.mm.plugin.sns.ui.PicWidget$2");
            d2$$j d2__j = d2__d.f279337a.f279310c;
            d2__j.getClass();
            SnsMethodCalculate.markStartTimeMs("moveItem", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
            if (l == l2) {
                SnsMethodCalculate.markEndTimeMs("moveItem", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
            } else if (d2__j.f279345a.size() <= l) {
                SnsMethodCalculate.markEndTimeMs("moveItem", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
            } else {
                String remove = d2__j.f279345a.remove(l);
                if (l2 < d2__j.f279345a.size()) {
                    d2__j.f279345a.add(l2, remove);
                } else {
                    d2__j.f279345a.add(remove);
                }
                SnsMethodCalculate.markEndTimeMs("moveItem", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
            }
            d2__d.f279337a.f279311d.getIntent().putExtra("sns_kemdia_path_list", d2__d.f279337a.f279310c.mo133209d());
            SnsMethodCalculate.markEndTimeMs("moveItem", "com.tencent.mm.plugin.sns.ui.PicWidget$2");
        }
        SnsMethodCalculate.markEndTimeMs("reorderItems", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
    }

    /* renamed from: d */
    public boolean mo133753d(int i) {
        SnsMethodCalculate.markStartTimeMs("canReorder", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        boolean z = false;
        if (i < mo133761k()) {
            SnsMethodCalculate.markEndTimeMs("canReorder", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            return false;
        } else if (this.f280862o) {
            if (i != getCount() - 1) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("canReorder", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            return z;
        } else {
            SnsMethodCalculate.markStartTimeMs("canReorder", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
            SnsMethodCalculate.markEndTimeMs("canReorder", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
            SnsMethodCalculate.markEndTimeMs("canReorder", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            return true;
        }
    }

    /* renamed from: g */
    public void mo133754g(List<?> list) {
        SnsMethodCalculate.markStartTimeMs("set", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        super.mo133754g(mo133760j(list));
        if (this.f280864q) {
            mo133758h();
        }
        mo133759i();
        SnsMethodCalculate.markEndTimeMs("set", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
    }

    public int getItemViewType(int i) {
        SnsMethodCalculate.markStartTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        if (TextUtils.isEmpty(getItem(i).toString())) {
            SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            return 1;
        }
        SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: com.tencent.mm.plugin.sns.ui.previewimageview.a$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r21, android.view.View r22, android.view.ViewGroup r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            java.lang.String r3 = "getView"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            java.lang.String r5 = "access$300"
            java.lang.String r6 = "access$200"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder"
            r8 = 0
            r9 = 2131306381(0x7f09278d, float:1.823096E38)
            r10 = 0
            if (r2 != 0) goto L_0x0052
            java.lang.String r2 = "getContext"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r11)
            android.content.Context r12 = r0.f304200f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r11)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r12)
            r11 = 2131497711(0x7f0c12ef, float:1.8619023E38)
            r12 = r23
            android.view.View r2 = r2.inflate(r11, r12, r10)
            com.tencent.mm.plugin.sns.ui.previewimageview.a$c r11 = new com.tencent.mm.plugin.sns.ui.previewimageview.a$c
            r11.<init>(r2, r8)
            r2.setTag(r9, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            android.widget.ImageView r9 = r11.f280869c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            r0.mo133763n(r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r7)
            android.widget.ImageView r9 = r11.f280868b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r7)
            r0.mo133763n(r9)
            goto L_0x0059
        L_0x0052:
            java.lang.Object r9 = r2.getTag(r9)
            r11 = r9
            com.tencent.mm.plugin.sns.ui.previewimageview.a$c r11 = (com.tencent.p014mm.plugin.sns.p106ui.previewimageview.C96142a.C96145c) r11
        L_0x0059:
            java.lang.Object r9 = r20.getItem(r21)
            java.lang.String r9 = r9.toString()
            r11.getClass()
            java.lang.String r12 = "build"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r7)
            android.widget.ImageView r13 = r11.f280868b
            boolean r14 = android.text.TextUtils.isEmpty(r9)
            if (r14 == 0) goto L_0x00f2
            android.widget.ImageView r8 = r11.f280869c
            r9 = 2131101550(0x7f06076e, float:1.7815513E38)
            r8.setBackgroundResource(r9)
            android.content.Context r8 = r13.getContext()
            r9 = 2131755060(0x7f100034, float:1.9140989E38)
            android.content.Context r14 = r13.getContext()
            r15 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r14 = kg3.C76577a.m92153d(r14, r15)
            android.graphics.drawable.Drawable r8 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r8, r9, r14)
            r13.setImageDrawable(r8)
            android.widget.ImageView r8 = r11.f280868b
            android.content.Context r8 = r8.getContext()
            r9 = 2131836837(0x7f113fa5, float:1.9306852E38)
            java.lang.String r8 = r8.getString(r9)
            r13.setContentDescription(r8)
            com.tencent.mm.plugin.sns.ui.previewimageview.a r8 = com.tencent.p014mm.plugin.sns.p106ui.previewimageview.C96142a.this
            java.lang.String r9 = "access$400"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r4)
            int r8 = r8.f280866s
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r4)
            int r8 = r8 * 35
            int r8 = r8 / 100
            r13.setPadding(r8, r8, r8, r8)
            r8 = -1
            if (r1 <= 0) goto L_0x00c3
            android.view.View r9 = r11.f280867a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9.setTag(r8)
            goto L_0x0149
        L_0x00c3:
            com.tencent.mm.plugin.sns.ui.previewimageview.a r9 = com.tencent.p014mm.plugin.sns.p106ui.previewimageview.C96142a.this
            int r9 = r9.mo133761k()
            if (r1 >= r9) goto L_0x00d8
            android.view.View r8 = r11.f280867a
            r9 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8.setTag(r9)
            goto L_0x0149
        L_0x00d8:
            if (r1 != 0) goto L_0x0149
            com.tencent.mm.plugin.sns.ui.previewimageview.a r9 = com.tencent.p014mm.plugin.sns.p106ui.previewimageview.C96142a.this
            java.lang.String r13 = "access$500"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r4)
            boolean r9 = r9.f280864q
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r4)
            if (r9 != 0) goto L_0x0149
            android.view.View r9 = r11.f280867a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9.setTag(r8)
            goto L_0x0149
        L_0x00f2:
            android.view.View r14 = r11.f280867a
            com.tencent.mm.plugin.sns.ui.previewimageview.a r15 = com.tencent.p014mm.plugin.sns.p106ui.previewimageview.C96142a.this
            int r15 = r15.mo133762l(r1)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14.setTag(r15)
            r13.setBackgroundDrawable(r8)
            r13.setImageBitmap(r8)
            r13.setTag(r9)
            android.widget.ImageView r8 = r11.f280868b
            android.content.Context r8 = r8.getContext()
            r14 = 2131836953(0x7f114019, float:1.9307087E38)
            java.lang.String r8 = r8.getString(r14)
            r13.setContentDescription(r8)
            r13.setPadding(r10, r10, r10, r10)
            com.tencent.mm.plugin.sns.ui.previewimageview.a r8 = com.tencent.p014mm.plugin.sns.p106ui.previewimageview.C96142a.this
            java.lang.String r14 = "access$600"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r4)
            java.util.HashMap<java.lang.String, android.graphics.Bitmap> r8 = r8.f280859i
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r4)
            java.lang.Object r8 = r8.get(r9)
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            boolean r14 = vr2.C102236a0.m134740e(r8)
            if (r14 != 0) goto L_0x0146
            com.tencent.mm.plugin.sns.ui.previewimageview.a$d r8 = new com.tencent.mm.plugin.sns.ui.previewimageview.a$d
            com.tencent.mm.plugin.sns.ui.previewimageview.a r14 = com.tencent.p014mm.plugin.sns.p106ui.previewimageview.C96142a.this
            r8.<init>(r13, r9)
            java.lang.String r9 = ""
            java.lang.String[] r9 = new java.lang.String[]{r9}
            r8.mo131292d(r9)
            goto L_0x0149
        L_0x0146:
            r13.setImageBitmap(r8)
        L_0x0149:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r7)
            int r8 = r20.mo133761k()
            if (r1 >= r8) goto L_0x01ac
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r7)
            android.widget.ImageView r1 = r11.f280868b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r7)
            r5 = 4
            r1.setVisibility(r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            android.widget.ImageView r1 = r11.f280869c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            r6 = 8
            r1.setVisibility(r6)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.mo10233c(r5)
            java.lang.Object[] r13 = r1.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridAdapter"
            java.lang.String r15 = "getView"
            java.lang.String r16 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r2
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r1 = r1.mo10231a(r10)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.setVisibility(r1)
            java.lang.String r13 = "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridAdapter"
            java.lang.String r14 = "getView"
            java.lang.String r15 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0202
        L_0x01ac:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r7)
            android.widget.ImageView r1 = r11.f280868b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r7)
            r1.setVisibility(r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            android.widget.ImageView r1 = r11.f280869c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            r1.setVisibility(r10)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r1.mo10233c(r5)
            java.lang.Object[] r13 = r1.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridAdapter"
            java.lang.String r15 = "getView"
            java.lang.String r16 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r2
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r1 = r1.mo10231a(r10)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.setVisibility(r1)
            java.lang.String r13 = "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridAdapter"
            java.lang.String r14 = "getView"
            java.lang.String r15 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
        L_0x0202:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.previewimageview.C96142a.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        SnsMethodCalculate.markStartTimeMs("getViewTypeCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        SnsMethodCalculate.markEndTimeMs("getViewTypeCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        return 2;
    }

    /* renamed from: h */
    public final void mo133758h() {
        SnsMethodCalculate.markStartTimeMs("addDummyHeader", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        for (int i = 0; i < mo133761k(); i++) {
            SnsMethodCalculate.markStartTimeMs("convert", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            C96147e eVar = new C96147e(this, (C96143a) null);
            eVar.f280875a = "";
            eVar.f280876b = getCount();
            SnsMethodCalculate.markEndTimeMs("convert", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            eVar.f280876b = getCount();
            SnsMethodCalculate.markStartTimeMs("add", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
            mo142829f(eVar);
            this.f304201g.add(i, eVar);
            notifyDataSetChanged();
            SnsMethodCalculate.markEndTimeMs("add", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        }
        SnsMethodCalculate.markEndTimeMs("addDummyHeader", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
    }

    /* renamed from: i */
    public void mo133759i() {
        SnsMethodCalculate.markStartTimeMs("checkAddImg", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        Log.m105925i("DynamicGridAdapter", "showAddImg %s, getCount %d, getHeaderCount %d, maxShowCount %d， showing %s", Boolean.valueOf(this.f280861n), Integer.valueOf(getCount()), Integer.valueOf(mo133761k()), Integer.valueOf(this.f280860j), Boolean.valueOf(this.f280862o));
        if (this.f280861n) {
            SnsMethodCalculate.markStartTimeMs("getPicCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            int count = (getCount() - mo133761k()) - (this.f280862o ? 1 : 0);
            SnsMethodCalculate.markEndTimeMs("getPicCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            if (count < this.f280860j) {
                if (!this.f280862o) {
                    this.f280862o = true;
                    SnsMethodCalculate.markStartTimeMs("add", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
                    mo142829f("");
                    this.f304201g.add("");
                    notifyDataSetChanged();
                    SnsMethodCalculate.markEndTimeMs("add", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
                }
                SnsMethodCalculate.markEndTimeMs("checkAddImg", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            }
        }
        this.f280862o = false;
        SnsMethodCalculate.markEndTimeMs("checkAddImg", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
    }

    /* renamed from: j */
    public final List<C96147e> mo133760j(List<?> list) {
        SnsMethodCalculate.markStartTimeMs("convert", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (Object next : list) {
            C96147e eVar = new C96147e(this, (C96143a) null);
            eVar.f280875a = next;
            eVar.f280876b = i;
            arrayList.add(eVar);
            i++;
        }
        SnsMethodCalculate.markEndTimeMs("convert", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        return arrayList;
    }

    /* renamed from: k */
    public int mo133761k() {
        SnsMethodCalculate.markStartTimeMs("getHeaderCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        if (!this.f280864q) {
            SnsMethodCalculate.markEndTimeMs("getHeaderCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            return 0;
        }
        int columnCount = getColumnCount();
        SnsMethodCalculate.markEndTimeMs("getHeaderCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        return columnCount;
    }

    /* renamed from: l */
    public int mo133762l(int i) {
        SnsMethodCalculate.markStartTimeMs("getOriginPos", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        int k = i - mo133761k();
        SnsMethodCalculate.markEndTimeMs("getOriginPos", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        return k;
    }

    /* renamed from: n */
    public final void mo133763n(ImageView imageView) {
        SnsMethodCalculate.markStartTimeMs("setPicSize", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        if (this.f280866s == 0) {
            int TO = C94866e1.ay0().mo139868TO();
            if (TO == 0) {
                SnsMethodCalculate.markEndTimeMs("setPicSize", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
                return;
            }
            int dimensionPixelSize = ((TO - (this.f304200f.getResources().getDimensionPixelSize(C0966R.dimen.aot) * 4)) - (this.f304200f.getResources().getDimensionPixelSize(C0966R.dimen.f3898i9) * 2)) / 3;
            this.f280866s = dimensionPixelSize;
            int i = C94866e1.f274870Z;
            if (dimensionPixelSize > i) {
                dimensionPixelSize = i;
            }
            this.f280866s = dimensionPixelSize;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i2 = this.f280866s;
        layoutParams.width = i2;
        layoutParams.height = i2;
        Log.m105919d("DynamicGridAdapter", "setPicSize: %d", Integer.valueOf(i2));
        imageView.setLayoutParams(layoutParams);
        SnsMethodCalculate.markEndTimeMs("setPicSize", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
    }
}
