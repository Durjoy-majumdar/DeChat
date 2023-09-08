package com.tencent.p014mm.p136ui.contact;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.BaseAdapter;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.tools.MMGestureGallery;
import com.tencent.p014mm.pluginsdk.model.C96787m0;
import com.tencent.p014mm.sdk.platformtools.ForceGpuUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.ArrayList;
import ke3.C88144b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import p140cw.C7138g;
import qo3.C77407n;

/* renamed from: com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI */
public class ContactRemarkImagePreviewUI extends MMActivity {

    /* renamed from: o */
    public static final /* synthetic */ int f285189o = 0;

    /* renamed from: d */
    public MMGestureGallery f285190d;

    /* renamed from: e */
    public View f285191e;

    /* renamed from: f */
    public String f285192f;

    /* renamed from: g */
    public ArrayList<String> f285193g;

    /* renamed from: h */
    public boolean f285194h;

    /* renamed from: i */
    public int f285195i;

    /* renamed from: j */
    public boolean f285196j = false;

    /* renamed from: n */
    public C97193c f285197n;

    /* renamed from: com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI$a */
    public class C97189a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI$a$a */
        public class C97190a implements C11182m0 {
            public C97190a() {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.mo107142f(0, ContactRemarkImagePreviewUI.this.getString(C0966R.string.iaq));
                C88144b.m109788f("favorite");
                e0Var.mo107142f(1, ContactRemarkImagePreviewUI.this.getString(C0966R.string.f361137hk2));
                ContactRemarkImagePreviewUI contactRemarkImagePreviewUI = ContactRemarkImagePreviewUI.this;
                if (!contactRemarkImagePreviewUI.f285194h) {
                    e0Var.mo107142f(2, contactRemarkImagePreviewUI.getString(C0966R.string.f7944x1));
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI$a$b */
        public class C97191b implements C11184p0 {
            public C97191b() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                int i2;
                int itemId = menuItem.getItemId();
                if (itemId == 0) {
                    ContactRemarkImagePreviewUI contactRemarkImagePreviewUI = ContactRemarkImagePreviewUI.this;
                    ((C7138g) C86312j.m106911c(C7138g.class)).he0(contactRemarkImagePreviewUI.f285193g.get(contactRemarkImagePreviewUI.f285190d.getSelectedItemPosition()), ContactRemarkImagePreviewUI.this);
                } else if (itemId == 1) {
                    ContactRemarkImagePreviewUI contactRemarkImagePreviewUI2 = ContactRemarkImagePreviewUI.this;
                    int i3 = ContactRemarkImagePreviewUI.f285189o;
                    contactRemarkImagePreviewUI2.getClass();
                    DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                    C96787m0.m124252f(doFavoriteEvent, 6, contactRemarkImagePreviewUI2.f285193g.get(contactRemarkImagePreviewUI2.f285190d.getSelectedItemPosition()));
                    DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
                    aVar.f264684i = contactRemarkImagePreviewUI2;
                    aVar.f264688m = 46;
                    doFavoriteEvent.publish();
                } else if (itemId == 2) {
                    ContactRemarkImagePreviewUI contactRemarkImagePreviewUI3 = ContactRemarkImagePreviewUI.this;
                    MMGestureGallery mMGestureGallery = contactRemarkImagePreviewUI3.f285190d;
                    if (mMGestureGallery == null || contactRemarkImagePreviewUI3.f285197n == null) {
                        i2 = -1;
                    } else {
                        contactRemarkImagePreviewUI3.f285196j = true;
                        int selectedItemPosition = mMGestureGallery.getSelectedItemPosition();
                        if (selectedItemPosition >= 0 && selectedItemPosition < contactRemarkImagePreviewUI3.f285190d.getCount()) {
                            ArrayList<String> arrayList = contactRemarkImagePreviewUI3.f285197n.f285202d;
                            if (arrayList != null) {
                                arrayList.remove(selectedItemPosition);
                            }
                            contactRemarkImagePreviewUI3.f285197n.notifyDataSetChanged();
                        }
                        i2 = contactRemarkImagePreviewUI3.f285197n.getCount();
                    }
                    if (i2 == 0) {
                        ContactRemarkImagePreviewUI.this.mo136101H7();
                    }
                }
            }
        }

        public C97189a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C77407n nVar = new C77407n((Context) ContactRemarkImagePreviewUI.this, 1, false);
            nVar.f225771i = new C97190a();
            nVar.f225782p = new C97191b();
            nVar.mo107573q();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI$b */
    public class C97192b implements MenuItem.OnMenuItemClickListener {
        public C97192b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ContactRemarkImagePreviewUI contactRemarkImagePreviewUI = ContactRemarkImagePreviewUI.this;
            int i = ContactRemarkImagePreviewUI.f285189o;
            contactRemarkImagePreviewUI.mo136101H7();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI$c */
    public class C97193c extends BaseAdapter {

        /* renamed from: d */
        public ArrayList<String> f285202d;

        public C97193c() {
        }

        public int getCount() {
            ArrayList<String> arrayList = this.f285202d;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }

        public Object getItem(int i) {
            ArrayList<String> arrayList = this.f285202d;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI$d} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r17, android.view.View r18, android.view.ViewGroup r19) {
            /*
                r16 = this;
                r0 = r16
                r1 = -1
                if (r18 != 0) goto L_0x002d
                com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI r2 = com.tencent.p014mm.p136ui.contact.ContactRemarkImagePreviewUI.this
                r3 = 2131493988(0x7f0c0464, float:1.8611472E38)
                r4 = 0
                android.view.View r2 = android.view.View.inflate(r2, r3, r4)
                com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI$d r3 = new com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI$d
                com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI r5 = com.tencent.p014mm.p136ui.contact.ContactRemarkImagePreviewUI.this
                r3.<init>(r5, r4)
                r4 = 2131306251(0x7f09270b, float:1.8230696E38)
                android.view.View r4 = r2.findViewById(r4)
                com.tencent.mm.ui.base.MultiTouchImageView r4 = (com.tencent.p014mm.p136ui.base.MultiTouchImageView) r4
                r3.f285204a = r4
                android.widget.Gallery$LayoutParams r4 = new android.widget.Gallery$LayoutParams
                r4.<init>(r1, r1)
                r2.setLayoutParams(r4)
                r2.setTag(r3)
                goto L_0x0036
            L_0x002d:
                java.lang.Object r2 = r18.getTag()
                r3 = r2
                com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI$d r3 = (com.tencent.p014mm.p136ui.contact.ContactRemarkImagePreviewUI.C97194d) r3
                r2 = r18
            L_0x0036:
                com.tencent.mm.ui.base.MultiTouchImageView r4 = r3.f285204a
                android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
                r5.<init>(r1, r1)
                r4.setLayoutParams(r5)
                com.tencent.mm.ui.base.MultiTouchImageView r1 = r3.f285204a
                java.util.ArrayList<java.lang.String> r3 = r0.f285202d
                r4 = r17
                java.lang.Object r3 = r3.get(r4)
                java.lang.String r3 = (java.lang.String) r3
                com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI r4 = com.tencent.p014mm.p136ui.contact.ContactRemarkImagePreviewUI.this
                float r4 = kg3.C76577a.m92156g(r4)
                android.graphics.Bitmap r3 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.decodeFile(r3, r4)
                if (r3 == 0) goto L_0x0194
                com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI r4 = com.tencent.p014mm.p136ui.contact.ContactRemarkImagePreviewUI.this
                android.view.View r4 = r4.f285191e
                int r4 = r4.getWidth()
                com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI r5 = com.tencent.p014mm.p136ui.contact.ContactRemarkImagePreviewUI.this
                android.view.View r5 = r5.f285191e
                int r5 = r5.getHeight()
                android.graphics.Matrix r6 = new android.graphics.Matrix
                r6.<init>()
                r6.reset()
                int r7 = r3.getWidth()
                float r7 = (float) r7
                int r8 = r3.getHeight()
                float r8 = (float) r8
                float r7 = r7 / r8
                int r8 = r3.getHeight()
                float r8 = (float) r8
                int r9 = r3.getWidth()
                float r9 = (float) r9
                float r8 = r8 / r9
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "whDiv is "
                r9.append(r10)
                r9.append(r7)
                java.lang.String r10 = " hwDiv is "
                r9.append(r10)
                r9.append(r8)
                java.lang.String r9 = r9.toString()
                java.lang.String r10 = "MicroMsg.ImagePreviewUI"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r10, r9)
                r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                r9 = 480(0x1e0, float:6.73E-43)
                r13 = 0
                r14 = 1073741824(0x40000000, float:2.0)
                r15 = 1065353216(0x3f800000, float:1.0)
                int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
                if (r8 < 0) goto L_0x00ef
                int r8 = r3.getHeight()
                if (r8 < r9) goto L_0x00ef
                int r5 = r3.getWidth()
                float r5 = (float) r5
                float r7 = (float) r4
                float r5 = r5 / r7
                int r8 = r3.getWidth()
                float r8 = (float) r8
                float r8 = r7 / r8
                double r9 = (double) r5
                int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r5 <= 0) goto L_0x00df
                r6.postScale(r8, r8)
                r3.getHeight()
                int r4 = r3.getWidth()
                float r4 = (float) r4
                float r4 = r4 * r8
                float r7 = r7 - r4
                float r7 = r7 / r14
                r6.postTranslate(r7, r13)
                goto L_0x0182
            L_0x00df:
                r6.postScale(r15, r15)
                int r5 = r3.getWidth()
                int r4 = r4 - r5
                int r4 = r4 / 2
                float r4 = (float) r4
                r6.postTranslate(r4, r13)
                goto L_0x0182
            L_0x00ef:
                int r7 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
                if (r7 < 0) goto L_0x013c
                int r7 = r3.getWidth()
                if (r7 < r9) goto L_0x013c
                int r4 = r3.getHeight()
                float r4 = (float) r4
                r7 = 1139802112(0x43f00000, float:480.0)
                float r4 = r4 / r7
                int r8 = r3.getHeight()
                float r8 = (float) r8
                float r7 = r7 / r8
                double r13 = (double) r4
                int r8 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r8 <= 0) goto L_0x0118
                r6.postScale(r4, r7)
                int r5 = r5 - r9
                int r5 = r5 / 2
                float r4 = (float) r5
                r5 = 0
                r6.postTranslate(r5, r4)
                goto L_0x0182
            L_0x0118:
                r6.postScale(r15, r15)
                int r4 = r3.getHeight()
                int r5 = r5 - r4
                int r5 = r5 / 2
                float r4 = (float) r5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r7 = " offsety "
                r5.append(r7)
                r5.append(r4)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r5)
                r5 = 0
                r6.postTranslate(r5, r4)
                goto L_0x0182
            L_0x013c:
                float r4 = (float) r4
                int r7 = r3.getWidth()
                float r7 = (float) r7
                float r7 = r4 / r7
                float r5 = (float) r5
                int r8 = r3.getHeight()
                float r8 = (float) r8
                float r8 = r5 / r8
                int r9 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                if (r9 >= 0) goto L_0x0151
                goto L_0x0152
            L_0x0151:
                r7 = r8
            L_0x0152:
                int r8 = r3.getWidth()
                float r8 = (float) r8
                float r8 = r8 / r4
                int r9 = r3.getHeight()
                float r9 = (float) r9
                float r9 = r9 / r5
                int r10 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
                if (r10 <= 0) goto L_0x0163
                goto L_0x0164
            L_0x0163:
                r8 = r9
            L_0x0164:
                double r8 = (double) r8
                int r10 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
                if (r10 <= 0) goto L_0x016d
                r6.postScale(r7, r7)
                r15 = r7
            L_0x016d:
                int r7 = r3.getWidth()
                float r7 = (float) r7
                float r7 = r7 * r15
                float r4 = r4 - r7
                float r4 = r4 / r14
                int r7 = r3.getHeight()
                float r7 = (float) r7
                float r7 = r7 * r15
                float r5 = r5 - r7
                float r5 = r5 / r14
                r6.postTranslate(r4, r5)
            L_0x0182:
                r1.setImageMatrix(r6)
                int r4 = r3.getWidth()
                int r5 = r3.getHeight()
                r1.f348280o = r4
                r1.f348281p = r5
                r1.setImageBitmap(r3)
            L_0x0194:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.ContactRemarkImagePreviewUI.C97193c.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI$d */
    public class C97194d {

        /* renamed from: a */
        public MultiTouchImageView f285204a;

        public C97194d(ContactRemarkImagePreviewUI contactRemarkImagePreviewUI, C97189a aVar) {
        }
    }

    /* renamed from: H7 */
    public final void mo136101H7() {
        if (this.f285196j) {
            Intent intent = new Intent();
            intent.putExtra("response_delete", true);
            intent.putExtra("remark_image_path", this.f285193g);
            setResult(-1, intent);
        }
        finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7089xx;
    }

    public void initView() {
        this.f285191e = findViewById(C0966R.C0970id.br5);
        this.f285190d = (MMGestureGallery) findViewById(C0966R.C0970id.ehh);
        setMMTitle((int) C0966R.string.gva);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.BW_0));
        setNavigationbarColor(getContext().getResources().getColor(C0966R.color.BW_0));
        this.f285190d.setVerticalFadingEdgeEnabled(false);
        this.f285190d.setHorizontalFadingEdgeEnabled(false);
        ForceGpuUtil.setLayerType(this.f285190d);
        C97193c cVar = new C97193c();
        this.f285197n = cVar;
        cVar.f285202d = this.f285193g;
        this.f285190d.setAdapter(cVar);
        this.f285190d.setSelection(this.f285195i);
        this.f285190d.setOnItemClickListener(new C74602z(this));
        addIconOptionMenu(0, C0966R.raw.actionbar_icon_dark_more, new C97189a());
        setBackBtn(new C97192b());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f285192f = getIntent().getStringExtra("Contact_User");
        this.f285193g = getIntent().getStringArrayListExtra("remark_image_path");
        getIntent().getBooleanExtra("view_temp_remark_image", false);
        this.f285194h = getIntent().getBooleanExtra("view_only", false);
        this.f285195i = getIntent().getIntExtra("selected_item", 0);
        if (Util.isNullOrNil(this.f285192f)) {
            finish();
        } else {
            initView();
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        mo136101H7();
        return true;
    }

    public void onPause() {
        super.onPause();
    }
}
