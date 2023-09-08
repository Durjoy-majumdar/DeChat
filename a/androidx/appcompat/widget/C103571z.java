package androidx.appcompat.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p1117h3.C108046c;

/* renamed from: androidx.appcompat.widget.z */
public class C103571z extends C108046c implements View.OnClickListener {

    /* renamed from: E */
    public static final /* synthetic */ int f305864E = 0;

    /* renamed from: A */
    public int f305865A = -1;

    /* renamed from: B */
    public int f305866B = -1;

    /* renamed from: C */
    public int f305867C = -1;

    /* renamed from: D */
    public int f305868D = -1;

    /* renamed from: r */
    public final SearchView f305869r;

    /* renamed from: s */
    public final SearchableInfo f305870s;

    /* renamed from: t */
    public final Context f305871t;

    /* renamed from: u */
    public final WeakHashMap<String, Drawable.ConstantState> f305872u;

    /* renamed from: v */
    public final int f305873v;

    /* renamed from: w */
    public int f305874w = 1;

    /* renamed from: x */
    public ColorStateList f305875x;

    /* renamed from: y */
    public int f305876y = -1;

    /* renamed from: z */
    public int f305877z = -1;

    /* renamed from: androidx.appcompat.widget.z$a */
    public static final class C103572a {

        /* renamed from: a */
        public final TextView f305878a;

        /* renamed from: b */
        public final TextView f305879b;

        /* renamed from: c */
        public final ImageView f305880c;

        /* renamed from: d */
        public final ImageView f305881d;

        /* renamed from: e */
        public final ImageView f305882e;

        public C103572a(View view) {
            this.f305878a = (TextView) view.findViewById(16908308);
            this.f305879b = (TextView) view.findViewById(16908309);
            this.f305880c = (ImageView) view.findViewById(16908295);
            this.f305881d = (ImageView) view.findViewById(16908296);
            this.f305882e = (ImageView) view.findViewById(C0966R.C0970id.cb7);
        }
    }

    public C103571z(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        SearchManager searchManager = (SearchManager) this.f323544g.getSystemService("search");
        this.f305869r = searchView;
        this.f305870s = searchableInfo;
        this.f305873v = searchView.getSuggestionCommitIconResId();
        this.f305871t = context;
        this.f305872u = weakHashMap;
    }

    /* renamed from: j */
    public static String m137689j(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo144460a(android.view.View r19, android.content.Context r20, android.database.Cursor r21) {
        /*
            r18 = this;
            r1 = r18
            r2 = r21
            java.lang.Object r0 = r19.getTag()
            r3 = r0
            androidx.appcompat.widget.z$a r3 = (androidx.appcompat.widget.C103571z.C103572a) r3
            int r0 = r1.f305868D
            r4 = -1
            r5 = 0
            if (r0 == r4) goto L_0x0017
            int r0 = r2.getInt(r0)
            r6 = r0
            goto L_0x0018
        L_0x0017:
            r6 = 0
        L_0x0018:
            android.widget.TextView r0 = r3.f305878a
            r7 = 8
            if (r0 == 0) goto L_0x0036
            int r0 = r1.f305876y
            java.lang.String r0 = m137689j(r2, r0)
            android.widget.TextView r8 = r3.f305878a
            r8.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0033
            r8.setVisibility(r7)
            goto L_0x0036
        L_0x0033:
            r8.setVisibility(r5)
        L_0x0036:
            android.widget.TextView r0 = r3.f305879b
            r8 = 2
            r9 = 1
            if (r0 == 0) goto L_0x00bf
            int r0 = r1.f305865A
            java.lang.String r0 = m137689j(r2, r0)
            if (r0 == 0) goto L_0x0088
            android.content.res.ColorStateList r10 = r1.f305875x
            if (r10 != 0) goto L_0x0067
            android.util.TypedValue r10 = new android.util.TypedValue
            r10.<init>()
            android.content.Context r11 = r1.f323544g
            android.content.res.Resources$Theme r11 = r11.getTheme()
            r12 = 2130969776(0x7f0404b0, float:1.7548243E38)
            r11.resolveAttribute(r12, r10, r9)
            android.content.Context r11 = r1.f323544g
            android.content.res.Resources r11 = r11.getResources()
            int r10 = r10.resourceId
            android.content.res.ColorStateList r10 = r11.getColorStateList(r10)
            r1.f305875x = r10
        L_0x0067:
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r0)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            r12 = 0
            r13 = 0
            r14 = 0
            android.content.res.ColorStateList r11 = r1.f305875x
            r16 = 0
            r17 = r11
            r11 = r15
            r4 = r15
            r15 = r17
            r11.<init>(r12, r13, r14, r15, r16)
            int r0 = r0.length()
            r11 = 33
            r10.setSpan(r4, r5, r0, r11)
            goto L_0x008e
        L_0x0088:
            int r0 = r1.f305877z
            java.lang.String r10 = m137689j(r2, r0)
        L_0x008e:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x00a1
            android.widget.TextView r0 = r3.f305878a
            if (r0 == 0) goto L_0x00ad
            r0.setSingleLine(r5)
            android.widget.TextView r0 = r3.f305878a
            r0.setMaxLines(r8)
            goto L_0x00ad
        L_0x00a1:
            android.widget.TextView r0 = r3.f305878a
            if (r0 == 0) goto L_0x00ad
            r0.setSingleLine(r9)
            android.widget.TextView r0 = r3.f305878a
            r0.setMaxLines(r9)
        L_0x00ad:
            android.widget.TextView r0 = r3.f305879b
            r0.setText(r10)
            boolean r4 = android.text.TextUtils.isEmpty(r10)
            if (r4 == 0) goto L_0x00bc
            r0.setVisibility(r7)
            goto L_0x00bf
        L_0x00bc:
            r0.setVisibility(r5)
        L_0x00bf:
            android.widget.ImageView r4 = r3.f305880c
            r10 = 0
            if (r4 == 0) goto L_0x0158
            int r0 = r1.f305866B
            r11 = -1
            if (r0 != r11) goto L_0x00cc
            r0 = r10
            goto L_0x0145
        L_0x00cc:
            java.lang.String r0 = r2.getString(r0)
            android.graphics.drawable.Drawable r0 = r1.mo144467h(r0)
            if (r0 == 0) goto L_0x00d8
            goto L_0x0145
        L_0x00d8:
            android.app.SearchableInfo r0 = r1.f305870s
            android.content.ComponentName r0 = r0.getSearchActivity()
            java.lang.String r11 = r0.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r12 = r1.f305872u
            boolean r12 = r12.containsKey(r11)
            if (r12 == 0) goto L_0x0101
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r1.f305872u
            java.lang.Object r0 = r0.get(r11)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto L_0x00f6
            r0 = r10
            goto L_0x0138
        L_0x00f6:
            android.content.Context r11 = r1.f305871t
            android.content.res.Resources r11 = r11.getResources()
            android.graphics.drawable.Drawable r0 = r0.newDrawable(r11)
            goto L_0x0138
        L_0x0101:
            android.content.Context r12 = r1.f323544g
            android.content.pm.PackageManager r12 = r12.getPackageManager()
            r13 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r13 = r12.getActivityInfo(r0, r13)     // Catch:{ NameNotFoundException -> 0x0124 }
            int r14 = r13.getIconResource()
            if (r14 != 0) goto L_0x0114
            goto L_0x0129
        L_0x0114:
            java.lang.String r15 = r0.getPackageName()
            android.content.pm.ApplicationInfo r13 = r13.applicationInfo
            android.graphics.drawable.Drawable r12 = r12.getDrawable(r15, r14, r13)
            if (r12 != 0) goto L_0x012a
            r0.flattenToShortString()
            goto L_0x0129
        L_0x0124:
            r0 = move-exception
            r12 = r0
            r12.toString()
        L_0x0129:
            r12 = r10
        L_0x012a:
            if (r12 != 0) goto L_0x012e
            r0 = r10
            goto L_0x0132
        L_0x012e:
            android.graphics.drawable.Drawable$ConstantState r0 = r12.getConstantState()
        L_0x0132:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r13 = r1.f305872u
            r13.put(r11, r0)
            r0 = r12
        L_0x0138:
            if (r0 == 0) goto L_0x013b
            goto L_0x0145
        L_0x013b:
            android.content.Context r0 = r1.f323544g
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
        L_0x0145:
            r11 = 4
            r4.setImageDrawable(r0)
            if (r0 != 0) goto L_0x014f
            r4.setVisibility(r11)
            goto L_0x0158
        L_0x014f:
            r4.setVisibility(r5)
            r0.setVisible(r5, r5)
            r0.setVisible(r9, r5)
        L_0x0158:
            android.widget.ImageView r0 = r3.f305881d
            if (r0 == 0) goto L_0x017c
            int r4 = r1.f305867C
            r11 = -1
            if (r4 != r11) goto L_0x0162
            goto L_0x016a
        L_0x0162:
            java.lang.String r2 = r2.getString(r4)
            android.graphics.drawable.Drawable r10 = r1.mo144467h(r2)
        L_0x016a:
            r0.setImageDrawable(r10)
            if (r10 != 0) goto L_0x0173
            r0.setVisibility(r7)
            goto L_0x017c
        L_0x0173:
            r0.setVisibility(r5)
            r10.setVisible(r5, r5)
            r10.setVisible(r9, r5)
        L_0x017c:
            int r0 = r1.f305874w
            if (r0 == r8) goto L_0x018d
            if (r0 != r9) goto L_0x0187
            r0 = r6 & 1
            if (r0 == 0) goto L_0x0187
            goto L_0x018d
        L_0x0187:
            android.widget.ImageView r0 = r3.f305882e
            r0.setVisibility(r7)
            goto L_0x01a2
        L_0x018d:
            android.widget.ImageView r0 = r3.f305882e
            r0.setVisibility(r5)
            android.widget.ImageView r0 = r3.f305882e
            android.widget.TextView r2 = r3.f305878a
            java.lang.CharSequence r2 = r2.getText()
            r0.setTag(r2)
            android.widget.ImageView r0 = r3.f305882e
            r0.setOnClickListener(r1)
        L_0x01a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C103571z.mo144460a(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    /* renamed from: b */
    public void mo144461b(Cursor cursor) {
        try {
            super.mo144461b(cursor);
            if (cursor != null) {
                this.f305876y = cursor.getColumnIndex("suggest_text_1");
                this.f305877z = cursor.getColumnIndex("suggest_text_2");
                this.f305865A = cursor.getColumnIndex("suggest_text_2_url");
                this.f305866B = cursor.getColumnIndex("suggest_icon_1");
                this.f305867C = cursor.getColumnIndex("suggest_icon_2");
                this.f305868D = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public CharSequence mo144462d(Cursor cursor) {
        String j;
        String j2;
        if (cursor == null) {
            return null;
        }
        String j3 = m137689j(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (j3 != null) {
            return j3;
        }
        if (this.f305870s.shouldRewriteQueryFromData() && (j2 = m137689j(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return j2;
        }
        if (!this.f305870s.shouldRewriteQueryFromText() || (j = m137689j(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return j;
    }

    /* renamed from: f */
    public View mo144463f(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.f323554q.inflate(this.f323552o, viewGroup, false);
        inflate.setTag(new C103572a(inflate));
        ((ImageView) inflate.findViewById(C0966R.C0970id.cb7)).setImageResource(this.f305873v);
        return inflate;
    }

    /* renamed from: g */
    public Drawable mo144464g(Uri uri) {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f323544g.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View inflate = this.f323554q.inflate(this.f323553p, viewGroup, false);
            if (inflate != null) {
                ((C103572a) inflate.getTag()).f305878a.setText(e.toString());
            }
            return inflate;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View f = mo144463f(this.f323544g, this.f323543f, viewGroup);
            ((C103572a) f.getTag()).f305878a.setText(e.toString());
            return f;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:32|33|34) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:44|45|46|47|48|49) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:37|38|39|40|41|42|43) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0086 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00b1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00bb */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x0081=Splitter:B:30:0x0081, B:41:0x00b1=Splitter:B:41:0x00b1, B:47:0x00bb=Splitter:B:47:0x00bb} */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo144467h(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x00e8
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x00e8
            java.lang.String r1 = "0"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0013
            goto L_0x00e8
        L_0x0013:
            int r1 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            r2.<init>()     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            java.lang.String r3 = "android.resource://"
            r2.append(r3)     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            android.content.Context r3 = r5.f305871t     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            r2.append(r3)     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            java.lang.String r3 = "/"
            r2.append(r3)     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            r2.append(r1)     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            java.lang.String r2 = r2.toString()     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r3 = r5.f305872u     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            if (r3 != 0) goto L_0x0042
            r3 = r0
            goto L_0x0046
        L_0x0042:
            android.graphics.drawable.Drawable r3 = r3.newDrawable()     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
        L_0x0046:
            if (r3 == 0) goto L_0x0049
            return r3
        L_0x0049:
            android.content.Context r3 = r5.f305871t     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            java.lang.Object r4 = p385u2.C111105a.f332697a     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            android.graphics.drawable.Drawable r1 = p385u2.C111105a.C111110c.m151511b(r3, r1)     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            if (r1 == 0) goto L_0x005c
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r3 = r5.f305872u     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            android.graphics.drawable.Drawable$ConstantState r4 = r1.getConstantState()     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
            r3.put(r2, r4)     // Catch:{ NumberFormatException -> 0x005e, NotFoundException -> 0x005d }
        L_0x005c:
            return r1
        L_0x005d:
            return r0
        L_0x005e:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r5.f305872u
            java.lang.Object r1 = r1.get(r6)
            android.graphics.drawable.Drawable$ConstantState r1 = (android.graphics.drawable.Drawable.ConstantState) r1
            if (r1 != 0) goto L_0x006a
            r1 = r0
            goto L_0x006e
        L_0x006a:
            android.graphics.drawable.Drawable r1 = r1.newDrawable()
        L_0x006e:
            if (r1 == 0) goto L_0x0071
            return r1
        L_0x0071:
            android.net.Uri r1 = android.net.Uri.parse(r6)
            java.lang.String r2 = r1.getScheme()     // Catch:{ FileNotFoundException -> 0x00d6 }
            java.lang.String r3 = "android.resource"
            boolean r2 = r3.equals(r2)     // Catch:{ FileNotFoundException -> 0x00d6 }
            if (r2 == 0) goto L_0x009d
            android.graphics.drawable.Drawable r0 = r5.mo144464g(r1)     // Catch:{ NotFoundException -> 0x0086 }
            goto L_0x00dd
        L_0x0086:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x00d6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00d6 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x00d6 }
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x00d6 }
            r3.append(r1)     // Catch:{ FileNotFoundException -> 0x00d6 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x00d6 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00d6 }
            throw r2     // Catch:{ FileNotFoundException -> 0x00d6 }
        L_0x009d:
            android.content.Context r2 = r5.f305871t     // Catch:{ FileNotFoundException -> 0x00d6 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ FileNotFoundException -> 0x00d6 }
            java.io.InputStream r2 = r2.openInputStream(r1)     // Catch:{ FileNotFoundException -> 0x00d6 }
            if (r2 == 0) goto L_0x00bf
            android.graphics.drawable.Drawable r3 = android.graphics.drawable.Drawable.createFromStream(r2, r0)     // Catch:{ all -> 0x00b6 }
            r2.close()     // Catch:{ IOException -> 0x00b1 }
            goto L_0x00b4
        L_0x00b1:
            r1.toString()     // Catch:{ FileNotFoundException -> 0x00d6 }
        L_0x00b4:
            r0 = r3
            goto L_0x00dd
        L_0x00b6:
            r3 = move-exception
            r2.close()     // Catch:{ IOException -> 0x00bb }
            goto L_0x00be
        L_0x00bb:
            r1.toString()     // Catch:{ FileNotFoundException -> 0x00d6 }
        L_0x00be:
            throw r3     // Catch:{ FileNotFoundException -> 0x00d6 }
        L_0x00bf:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x00d6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00d6 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x00d6 }
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x00d6 }
            r3.append(r1)     // Catch:{ FileNotFoundException -> 0x00d6 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x00d6 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00d6 }
            throw r2     // Catch:{ FileNotFoundException -> 0x00d6 }
        L_0x00d6:
            r2 = move-exception
            java.util.Objects.toString(r1)
            r2.getMessage()
        L_0x00dd:
            if (r0 == 0) goto L_0x00e8
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r5.f305872u
            android.graphics.drawable.Drawable$ConstantState r2 = r0.getConstantState()
            r1.put(r6, r2)
        L_0x00e8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C103571z.mo144467h(java.lang.String):android.graphics.drawable.Drawable");
    }

    public boolean hasStableIds() {
        return false;
    }

    /* renamed from: i */
    public Cursor mo144469i(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f323544g.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f323543f;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f323543f;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f305869r.mo144120r((CharSequence) tag);
        }
    }
}
