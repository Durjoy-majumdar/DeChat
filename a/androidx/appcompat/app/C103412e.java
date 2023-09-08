package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: androidx.appcompat.app.e */
public class C103412e extends C103422m {

    /* renamed from: f */
    public final AlertController f305070f = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.e$a */
    public static class C103413a {

        /* renamed from: a */
        public final AlertController.C103396b f305071a;

        /* renamed from: b */
        public final int f305072b;

        public C103413a(Context context) {
            int E = C103412e.m137160E(context, 0);
            this.f305071a = new AlertController.C103396b(new ContextThemeWrapper(context, C103412e.m137160E(context, E)));
            this.f305072b = E;
        }

        /* renamed from: a */
        public C103412e mo143455a() {
            C103412e eVar = new C103412e(this.f305071a.f304976a, this.f305072b);
            AlertController.C103396b bVar = this.f305071a;
            AlertController alertController = eVar.f305070f;
            View view = bVar.f304980e;
            if (view != null) {
                alertController.f304968v = view;
            } else {
                CharSequence charSequence = bVar.f304979d;
                if (charSequence != null) {
                    alertController.f304951e = charSequence;
                    TextView textView = alertController.f304966t;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.f304978c;
                if (drawable != null) {
                    alertController.f304964r = drawable;
                    alertController.f304963q = 0;
                    ImageView imageView = alertController.f304965s;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f304965s.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = bVar.f304981f;
            if (charSequence2 != null) {
                DialogInterface.OnClickListener onClickListener = bVar.f304982g;
                alertController.getClass();
                Message obtainMessage = onClickListener != null ? alertController.f304945D.obtainMessage(-1, onClickListener) : null;
                alertController.f304957k = charSequence2;
                alertController.f304958l = obtainMessage;
                alertController.f304959m = null;
            }
            if (bVar.f304985j != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.f304977b.inflate(alertController.f304942A, (ViewGroup) null);
                int i = alertController.f304943B;
                ListAdapter listAdapter = bVar.f304985j;
                if (listAdapter == null) {
                    listAdapter = new AlertController.C103397d(bVar.f304976a, i, 16908308, (CharSequence[]) null);
                }
                alertController.f304969w = listAdapter;
                alertController.f304970x = -1;
                if (bVar.f304986k != null) {
                    recycleListView.setOnItemClickListener(new C103411d(bVar, alertController));
                }
                alertController.f304952f = recycleListView;
            }
            View view2 = bVar.f304987l;
            if (view2 != null) {
                alertController.f304953g = view2;
                alertController.f304954h = 0;
                alertController.f304955i = false;
            }
            eVar.setCancelable(this.f305071a.f304983h);
            if (this.f305071a.f304983h) {
                eVar.setCanceledOnTouchOutside(true);
            }
            this.f305071a.getClass();
            eVar.setOnCancelListener((DialogInterface.OnCancelListener) null);
            this.f305071a.getClass();
            eVar.setOnDismissListener((DialogInterface.OnDismissListener) null);
            DialogInterface.OnKeyListener onKeyListener = this.f305071a.f304984i;
            if (onKeyListener != null) {
                eVar.setOnKeyListener(onKeyListener);
            }
            return eVar;
        }
    }

    public C103412e(Context context, int i) {
        super(context, m137160E(context, i));
    }

    /* renamed from: E */
    public static int m137160E(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0966R.attr.f2653b7, typedValue, true);
        return typedValue.resourceId;
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        ListAdapter listAdapter;
        View findViewById;
        super.onCreate(bundle);
        AlertController alertController = this.f305070f;
        alertController.f304948b.setContentView(alertController.f304972z == 0 ? alertController.f304971y : alertController.f304971y);
        View findViewById2 = alertController.f304949c.findViewById(C0966R.C0970id.hr5);
        View findViewById3 = findViewById2.findViewById(C0966R.C0970id.kqx);
        View findViewById4 = findViewById2.findViewById(C0966R.C0970id.brb);
        View findViewById5 = findViewById2.findViewById(C0966R.C0970id.anw);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(C0966R.C0970id.bxx);
        View view = alertController.f304953g;
        View view2 = null;
        int i = 0;
        if (view == null) {
            view = alertController.f304954h != 0 ? LayoutInflater.from(alertController.f304947a).inflate(alertController.f304954h, viewGroup, false) : null;
        }
        boolean z2 = view != null;
        if (!z2 || !AlertController.m137123a(view)) {
            alertController.f304949c.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) alertController.f304949c.findViewById(C0966R.C0970id.bxv);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f304955i) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (alertController.f304952f != null) {
                ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams()).f305505a = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(C0966R.C0970id.kqx);
        View findViewById7 = viewGroup.findViewById(C0966R.C0970id.brb);
        View findViewById8 = viewGroup.findViewById(C0966R.C0970id.anw);
        ViewGroup d = alertController.mo143344d(findViewById6, findViewById3);
        ViewGroup d2 = alertController.mo143344d(findViewById7, findViewById4);
        ViewGroup d3 = alertController.mo143344d(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) alertController.f304949c.findViewById(C0966R.C0970id.j3t);
        alertController.f304962p = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.f304962p.setNestedScrollingEnabled(false);
        TextView textView = (TextView) d2.findViewById(16908299);
        alertController.f304967u = textView;
        if (textView != null) {
            textView.setVisibility(8);
            alertController.f304962p.removeView(alertController.f304967u);
            if (alertController.f304952f != null) {
                ViewGroup viewGroup2 = (ViewGroup) alertController.f304962p.getParent();
                int indexOfChild = viewGroup2.indexOfChild(alertController.f304962p);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(alertController.f304952f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                d2.setVisibility(8);
            }
        }
        Button button = (Button) d3.findViewById(16908313);
        alertController.f304956j = button;
        button.setOnClickListener(alertController.f304946E);
        if (!TextUtils.isEmpty(alertController.f304957k) || alertController.f304959m != null) {
            alertController.f304956j.setText(alertController.f304957k);
            Drawable drawable = alertController.f304959m;
            if (drawable != null) {
                int i2 = alertController.f304950d;
                drawable.setBounds(0, 0, i2, i2);
                alertController.f304956j.setCompoundDrawables(alertController.f304959m, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            alertController.f304956j.setVisibility(0);
            z = true;
        } else {
            alertController.f304956j.setVisibility(8);
            z = false;
        }
        Button button2 = (Button) d3.findViewById(16908314);
        alertController.f304960n = button2;
        button2.setOnClickListener(alertController.f304946E);
        alertController.getClass();
        if (TextUtils.isEmpty((CharSequence) null)) {
            alertController.getClass();
            alertController.f304960n.setVisibility(8);
        } else {
            Button button3 = alertController.f304960n;
            alertController.getClass();
            button3.setText((CharSequence) null);
            alertController.getClass();
            alertController.f304960n.setVisibility(0);
            z |= true;
        }
        Button button4 = (Button) d3.findViewById(16908315);
        alertController.f304961o = button4;
        button4.setOnClickListener(alertController.f304946E);
        alertController.getClass();
        if (TextUtils.isEmpty((CharSequence) null)) {
            alertController.getClass();
            alertController.f304961o.setVisibility(8);
        } else {
            Button button5 = alertController.f304961o;
            alertController.getClass();
            button5.setText((CharSequence) null);
            Drawable drawable2 = alertController.f304959m;
            if (drawable2 != null) {
                int i3 = alertController.f304950d;
                drawable2.setBounds(0, 0, i3, i3);
                alertController.f304956j.setCompoundDrawables(alertController.f304959m, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            alertController.f304961o.setVisibility(0);
            z |= true;
        }
        Context context = alertController.f304947a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0966R.attr.f2651b5, typedValue, true);
        if (typedValue.data != 0) {
            if (z) {
                alertController.mo143343b(alertController.f304956j);
            } else if (z) {
                alertController.mo143343b(alertController.f304960n);
            } else if (z) {
                alertController.mo143343b(alertController.f304961o);
            }
        }
        if (!(z)) {
            d3.setVisibility(8);
        }
        if (alertController.f304968v != null) {
            d.addView(alertController.f304968v, 0, new ViewGroup.LayoutParams(-1, -2));
            View findViewById9 = alertController.f304949c.findViewById(C0966R.C0970id.kph);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = findViewById9;
            C117292a.m165358d(view3, aVar.mo10232b(), "androidx/appcompat/app/AlertController", "setupTitle", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById9.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "androidx/appcompat/app/AlertController", "setupTitle", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            alertController.f304965s = (ImageView) alertController.f304949c.findViewById(16908294);
            if (!(!TextUtils.isEmpty(alertController.f304951e)) || !alertController.f304944C) {
                View findViewById10 = alertController.f304949c.findViewById(C0966R.C0970id.kph);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = findViewById10;
                C117292a.m165358d(view4, aVar2.mo10232b(), "androidx/appcompat/app/AlertController", "setupTitle", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById10.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "androidx/appcompat/app/AlertController", "setupTitle", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                alertController.f304965s.setVisibility(8);
                d.setVisibility(8);
            } else {
                TextView textView2 = (TextView) alertController.f304949c.findViewById(C0966R.C0970id.f5777oc);
                alertController.f304966t = textView2;
                textView2.setText(alertController.f304951e);
                int i4 = alertController.f304963q;
                if (i4 != 0) {
                    alertController.f304965s.setImageResource(i4);
                } else {
                    Drawable drawable3 = alertController.f304964r;
                    if (drawable3 != null) {
                        alertController.f304965s.setImageDrawable(drawable3);
                    } else {
                        alertController.f304966t.setPadding(alertController.f304965s.getPaddingLeft(), alertController.f304965s.getPaddingTop(), alertController.f304965s.getPaddingRight(), alertController.f304965s.getPaddingBottom());
                        alertController.f304965s.setVisibility(8);
                    }
                }
            }
        }
        boolean z3 = viewGroup.getVisibility() != 8;
        int i5 = (d == null || d.getVisibility() == 8) ? 0 : 1;
        boolean z4 = d3.getVisibility() != 8;
        if (!z4 && (findViewById = d2.findViewById(C0966R.C0970id.khm)) != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view5 = findViewById;
            C117292a.m165358d(view5, aVar3.mo10232b(), "androidx/appcompat/app/AlertController", "setupView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "androidx/appcompat/app/AlertController", "setupView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (i5 != 0) {
            NestedScrollView nestedScrollView2 = alertController.f304962p;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById11 = alertController.f304952f != null ? d.findViewById(C0966R.C0970id.kny) : null;
            if (findViewById11 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(0);
                View view6 = findViewById11;
                C117292a.m165358d(view6, aVar4.mo10232b(), "androidx/appcompat/app/AlertController", "setupView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById11.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "androidx/appcompat/app/AlertController", "setupView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View findViewById12 = d2.findViewById(C0966R.C0970id.khn);
            if (findViewById12 != null) {
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar5.mo10233c(0);
                View view7 = findViewById12;
                C117292a.m165358d(view7, aVar5.mo10232b(), "androidx/appcompat/app/AlertController", "setupView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById12.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "androidx/appcompat/app/AlertController", "setupView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        ListView listView = alertController.f304952f;
        if (listView instanceof AlertController.RecycleListView) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) listView;
            if (!z4 || i5 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i5 != 0 ? recycleListView.getPaddingTop() : recycleListView.f304973d, recycleListView.getPaddingRight(), z4 ? recycleListView.getPaddingBottom() : recycleListView.f304974e);
            } else {
                recycleListView.getClass();
            }
        }
        if (!z3) {
            View view8 = alertController.f304952f;
            if (view8 == null) {
                view8 = alertController.f304962p;
            }
            if (view8 != null) {
                if (z4) {
                    i = 2;
                }
                int i6 = i5 | i;
                View findViewById13 = alertController.f304949c.findViewById(C0966R.C0970id.j3s);
                View findViewById14 = alertController.f304949c.findViewById(C0966R.C0970id.j3r);
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 23) {
                    WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                    if (i7 >= 23) {
                        C107207u.C107215h.m145245d(view8, i6, 3);
                    }
                    if (findViewById13 != null) {
                        d2.removeView(findViewById13);
                    }
                    if (findViewById14 != null) {
                        d2.removeView(findViewById14);
                    }
                } else {
                    if (findViewById13 != null && (i6 & 1) == 0) {
                        d2.removeView(findViewById13);
                        findViewById13 = null;
                    }
                    if (findViewById14 == null || (i6 & 2) != 0) {
                        view2 = findViewById14;
                    } else {
                        d2.removeView(findViewById14);
                    }
                    if (!(findViewById13 == null && view2 == null)) {
                        ListView listView2 = alertController.f304952f;
                        if (listView2 != null) {
                            listView2.setOnScrollListener(new C103409b(alertController, findViewById13, view2));
                            alertController.f304952f.post(new C103410c(alertController, findViewById13, view2));
                        } else {
                            if (findViewById13 != null) {
                                d2.removeView(findViewById13);
                            }
                            if (view2 != null) {
                                d2.removeView(view2);
                            }
                        }
                    }
                }
            }
        }
        ListView listView3 = alertController.f304952f;
        if (listView3 != null && (listAdapter = alertController.f304969w) != null) {
            listView3.setAdapter(listAdapter);
            int i8 = alertController.f304970x;
            if (i8 > -1) {
                listView3.setItemChecked(i8, true);
                listView3.setSelection(i8);
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f305070f.f304962p;
        if (nestedScrollView != null && nestedScrollView.mo144962d(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f305070f.f304962p;
        if (nestedScrollView != null && nestedScrollView.mo144962d(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f305070f;
        alertController.f304951e = charSequence;
        TextView textView = alertController.f304966t;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
