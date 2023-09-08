package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C60958c;
import k20.C9556a;
import p433g.C107593a;

public class AlertController {

    /* renamed from: A */
    public int f304942A;

    /* renamed from: B */
    public int f304943B;

    /* renamed from: C */
    public boolean f304944C;

    /* renamed from: D */
    public Handler f304945D;

    /* renamed from: E */
    public final View.OnClickListener f304946E = new C103395a();

    /* renamed from: a */
    public final Context f304947a;

    /* renamed from: b */
    public final C103422m f304948b;

    /* renamed from: c */
    public final Window f304949c;

    /* renamed from: d */
    public final int f304950d;

    /* renamed from: e */
    public CharSequence f304951e;

    /* renamed from: f */
    public ListView f304952f;

    /* renamed from: g */
    public View f304953g;

    /* renamed from: h */
    public int f304954h;

    /* renamed from: i */
    public boolean f304955i = false;

    /* renamed from: j */
    public Button f304956j;

    /* renamed from: k */
    public CharSequence f304957k;

    /* renamed from: l */
    public Message f304958l;

    /* renamed from: m */
    public Drawable f304959m;

    /* renamed from: n */
    public Button f304960n;

    /* renamed from: o */
    public Button f304961o;

    /* renamed from: p */
    public NestedScrollView f304962p;

    /* renamed from: q */
    public int f304963q = 0;

    /* renamed from: r */
    public Drawable f304964r;

    /* renamed from: s */
    public ImageView f304965s;

    /* renamed from: t */
    public TextView f304966t;

    /* renamed from: u */
    public TextView f304967u;

    /* renamed from: v */
    public View f304968v;

    /* renamed from: w */
    public ListAdapter f304969w;

    /* renamed from: x */
    public int f304970x = -1;

    /* renamed from: y */
    public int f304971y;

    /* renamed from: z */
    public int f304972z;

    /* renamed from: androidx.appcompat.app.AlertController$c */
    public static final class C67076c extends Handler {

        /* renamed from: a */
        public WeakReference<DialogInterface> f192647a;

        public C67076c(DialogInterface dialogInterface) {
            this.f192647a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f192647a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class RecycleListView extends ListView {

        /* renamed from: d */
        public final int f304973d;

        /* renamed from: e */
        public final int f304974e;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C107593a.f321924x);
            this.f304974e = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f304973d = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    public class C103395a implements View.OnClickListener {
        public C103395a() {
        }

        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            if (view != alertController.f304956j || (message2 = alertController.f304958l) == null) {
                if (view == alertController.f304960n) {
                    alertController.getClass();
                }
                if (view == alertController.f304961o) {
                    alertController.getClass();
                }
                message = null;
            } else {
                message = Message.obtain(message2);
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f304945D.obtainMessage(1, alertController2.f304948b).sendToTarget();
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    public static class C103396b {

        /* renamed from: a */
        public final Context f304976a;

        /* renamed from: b */
        public final LayoutInflater f304977b;

        /* renamed from: c */
        public Drawable f304978c;

        /* renamed from: d */
        public CharSequence f304979d;

        /* renamed from: e */
        public View f304980e;

        /* renamed from: f */
        public CharSequence f304981f;

        /* renamed from: g */
        public DialogInterface.OnClickListener f304982g;

        /* renamed from: h */
        public boolean f304983h = true;

        /* renamed from: i */
        public DialogInterface.OnKeyListener f304984i;

        /* renamed from: j */
        public ListAdapter f304985j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f304986k;

        /* renamed from: l */
        public View f304987l;

        public C103396b(Context context) {
            this.f304976a = context;
            this.f304977b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    public static class C103397d extends ArrayAdapter<CharSequence> {
        public C103397d(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C103422m mVar, Window window) {
        this.f304947a = context;
        this.f304948b = mVar;
        this.f304949c = window;
        this.f304945D = new C67076c(mVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C107593a.f321906f, C0966R.attr.f2652b6, 0);
        this.f304971y = obtainStyledAttributes.getResourceId(0, 0);
        this.f304972z = obtainStyledAttributes.getResourceId(2, 0);
        this.f304942A = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        obtainStyledAttributes.getResourceId(7, 0);
        this.f304943B = obtainStyledAttributes.getResourceId(3, 0);
        this.f304944C = obtainStyledAttributes.getBoolean(6, true);
        this.f304950d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        mVar.mo143460C(1);
    }

    /* renamed from: a */
    public static boolean m137123a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m137123a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m137124c(View view, View view2, View view3) {
        int i = 4;
        if (view2 != null) {
            int i2 = view.canScrollVertically(-1) ? 0 : 4;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i2));
            C117292a.m165358d(view2, aVar.mo10232b(), "androidx/appcompat/app/AlertController", "manageScrollIndicators", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "androidx/appcompat/app/AlertController", "manageScrollIndicators", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i = 0;
            }
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view3, aVar2.mo10232b(), "androidx/appcompat/app/AlertController", "manageScrollIndicators", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "androidx/appcompat/app/AlertController", "manageScrollIndicators", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: b */
    public final void mo143343b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: d */
    public final ViewGroup mo143344d(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
