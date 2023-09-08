package lo3;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.C0132m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.widget.cedit.edit.C106778a;
import com.tencent.p014mm.p136ui.widget.cedit.edit.CustomTextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jo3.C76430b;
import k20.C60958c;
import k20.C9556a;
import ro3.C110588j;
import xo3.C78967g;

/* renamed from: lo3.a */
public class C109405a {

    /* renamed from: a */
    public PopupWindow f327502a;

    /* renamed from: b */
    public int f327503b;

    /* renamed from: c */
    public int f327504c;

    /* renamed from: d */
    public RecyclerView f327505d;

    /* renamed from: e */
    public C109409d f327506e;

    /* renamed from: f */
    public List<C110588j.C110589b> f327507f;

    /* renamed from: g */
    public ImageView f327508g;

    /* renamed from: h */
    public Context f327509h;

    /* renamed from: i */
    public CustomTextView f327510i;

    /* renamed from: j */
    public View f327511j;

    /* renamed from: k */
    public boolean f327512k = false;

    /* renamed from: l */
    public Menu f327513l;

    /* renamed from: m */
    public Map<Integer, CharSequence> f327514m = new HashMap();

    /* renamed from: n */
    public int[] f327515n = new int[2];

    /* renamed from: o */
    public C106778a.C106798r f327516o = new C109407b();

    /* renamed from: p */
    public Runnable f327517p = new C109408c();

    /* renamed from: lo3.a$a */
    public class C109406a implements C110588j.C110590c {
        public C109406a() {
        }

        /* renamed from: a */
        public void mo14785a(List<C110588j.C110589b> list, int i) {
        }

        /* renamed from: b */
        public void mo14786b(View view, C110588j.C110589b bVar, String str) {
            C109405a aVar = C109405a.this;
            aVar.getClass();
            switch (bVar.f330853b) {
                case 16908319:
                    aVar.f327510i.mo154007g0();
                    break;
                case 16908320:
                    aVar.f327510i.mo97951b0(16908320);
                    break;
                case 16908321:
                    aVar.f327510i.mo97951b0(16908321);
                    break;
                case 16908322:
                    aVar.f327510i.mo97951b0(16908322);
                    break;
            }
            if (((HashMap) aVar.f327514m).containsKey(Integer.valueOf(bVar.f330853b)) && aVar.f327510i.getAdaptText() != null) {
                try {
                    aVar.f327510i.getAdaptText().onTextContextMenuItem(bVar.f330853b);
                } catch (Throwable th) {
                    Log.printErrStackTrace("cmEdit.OperateWindow", th, "adaptText item err %s %s", bVar.f330852a, Integer.valueOf(bVar.f330853b));
                    C76430b.m91852a(11);
                }
                aVar.f327510i.mo154162s0();
            }
            if (aVar.f327510i.getMenuCallback() != null) {
                aVar.f327510i.getMenuCallback().mo14786b(view, bVar, str);
            }
        }
    }

    /* renamed from: lo3.a$b */
    public class C109407b implements C106778a.C106798r {
        public C109407b() {
        }

        /* renamed from: a */
        public void mo154330a(int i, int i2, boolean z, boolean z2) {
            C109405a.this.f327502a.dismiss();
            C109405a aVar = C109405a.this;
            aVar.f327510i.removeCallbacks(aVar.f327517p);
            aVar.f327510i.postDelayed(aVar.f327517p, 100);
        }
    }

    /* renamed from: lo3.a$c */
    public class C109408c implements Runnable {
        public C109408c() {
        }

        public void run() {
            C109405a.this.mo160608a(false);
        }
    }

    /* renamed from: lo3.a$d */
    public class C109409d extends RecyclerView.C16613e<C109410a> {

        /* renamed from: d */
        public List<C110588j.C110589b> f327521d;

        /* renamed from: e */
        public C110588j.C110590c f327522e;

        /* renamed from: lo3.a$d$a */
        public class C109410a extends RecyclerView.C16631z {

            /* renamed from: z */
            public TextView f327524z;

            public C109410a(C109409d dVar, View view) {
                super(view);
                TextView textView = (TextView) view.findViewById(C0966R.C0970id.gsd);
                this.f327524z = textView;
                textView.setTextSize(1, 14.0f);
            }
        }

        public C109409d(List<C110588j.C110589b> list, C110588j.C110590c cVar) {
            this.f327521d = list;
            this.f327522e = cVar;
        }

        public int getItemCount() {
            return this.f327521d.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C109410a aVar = (C109410a) zVar;
            C110588j.C110589b bVar = this.f327521d.get(i);
            aVar.f327524z.setText(bVar.f330852a);
            aVar.f327524z.setTag(bVar);
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.b4n, viewGroup, false);
            C109410a aVar = new C109410a(this, inflate);
            inflate.setOnClickListener(new C109411b(this));
            return aVar;
        }
    }

    public C109405a(CustomTextView customTextView) {
        this.f327510i = customTextView;
        Context context = customTextView.getContext();
        this.f327509h = context;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.b4m, (ViewGroup) null);
        this.f327511j = inflate;
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f327503b = this.f327511j.getMeasuredWidth();
        this.f327504c = this.f327511j.getMeasuredHeight();
        PopupWindow popupWindow = new PopupWindow(this.f327511j, -2, -2, false);
        this.f327502a = popupWindow;
        popupWindow.setClippingEnabled(false);
        this.f327505d = (RecyclerView) this.f327511j.findViewById(C0966R.C0970id.ixh);
        this.f327505d.setLayoutManager(new LinearLayoutManager(this.f327509h, 0, false));
        LinkedList linkedList = new LinkedList();
        linkedList.add(new C110588j.C110589b(this.f327509h.getResources().getString(17039373), 16908319, 12));
        linkedList.add(new C110588j.C110589b(this.f327509h.getResources().getString(17039363), 16908320, 9));
        linkedList.add(new C110588j.C110589b(this.f327509h.getResources().getString(17039361), 16908321, 9));
        linkedList.add(new C110588j.C110589b(this.f327509h.getResources().getString(17039371), 16908322));
        this.f327507f = linkedList;
        C109409d dVar = new C109409d(linkedList, new C109406a());
        this.f327506e = dVar;
        this.f327505d.setAdapter(dVar);
        C0132m mVar = new C0132m(this.f327509h, 0);
        mVar.mo128j(new ColorDrawable(this.f327509h.getResources().getColor(C0966R.color.a0b)));
        this.f327505d.mo17085h0(mVar);
        this.f327508g = (ImageView) this.f327511j.findViewById(C0966R.C0970id.bxt);
        this.f327502a.setAnimationStyle(C0966R.style.f8693rd);
        Log.m105925i("cmEdit.OperateWindow", "new OpWindow @%s", Integer.valueOf(hashCode()));
    }

    /* renamed from: a */
    public final void mo160608a(boolean z) {
        if (z) {
            View contentView = this.f327502a.getContentView();
            contentView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.f327503b = contentView.getMeasuredWidth();
            this.f327504c = contentView.getMeasuredHeight();
        }
        this.f327510i.getLocationInWindow(this.f327515n);
        Layout layout = this.f327510i.getLayout();
        int i = C78967g.m95476i(this.f327509h);
        int a = C74942w4.m89784a(this.f327509h, 10);
        int i2 = i - (a * 2);
        if (this.f327503b >= i2) {
            this.f327503b = i2;
        }
        int selectionStart = this.f327510i.getSelectionStart();
        int selectionEnd = this.f327510i.getSelectionEnd();
        int primaryHorizontal = ((((((int) layout.getPrimaryHorizontal(selectionStart)) + ((int) layout.getPrimaryHorizontal(selectionEnd))) / 2) + this.f327515n[0]) - (this.f327503b / 2)) + this.f327510i.getPaddingLeft();
        if (!(selectionStart == selectionEnd || layout.getLineForOffset(selectionStart) == layout.getLineForOffset(selectionEnd))) {
            primaryHorizontal = (this.f327515n[0] + (this.f327510i.getWidth() / 2)) - (this.f327503b / 2);
        }
        int lineTop = ((((layout.getLineTop(layout.getLineForOffset(selectionStart)) + this.f327515n[1]) - this.f327504c) + this.f327510i.getPaddingTop()) - this.f327510i.getScrollY()) - C74942w4.m89784a(this.f327509h, 5);
        int a2 = (this.f327515n[1] - this.f327504c) - C74942w4.m89784a(this.f327509h, 5);
        int height = ((this.f327515n[1] + this.f327510i.getHeight()) - this.f327504c) - C74942w4.m89784a(this.f327509h, 5);
        int i3 = primaryHorizontal <= a ? a : primaryHorizontal;
        if (lineTop < a2) {
            lineTop = a2;
        }
        if (lineTop <= height) {
            int i4 = this.f327503b;
            if (i3 + i4 > i) {
                i3 = (i - i4) - a;
            }
            ((LinearLayout.LayoutParams) this.f327508g.getLayoutParams()).leftMargin = primaryHorizontal - i3;
            this.f327502a.setElevation(8.0f);
            RecyclerView.LayoutManager layoutManager = this.f327505d.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                C117292a.m165358d(linearLayoutManager2, aVar.mo10232b(), "com/tencent/mm/ui/widget/cedit/menu/OperateWindow", "positionView", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
                linearLayoutManager.scrollToPosition(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(linearLayoutManager2, "com/tencent/mm/ui/widget/cedit/menu/OperateWindow", "positionView", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
            }
            this.f327502a.setWidth(this.f327503b);
            try {
                if (this.f327502a.isShowing()) {
                    PopupWindow popupWindow = this.f327502a;
                    popupWindow.update(i3, lineTop, popupWindow.getWidth(), this.f327502a.getHeight());
                    return;
                }
                this.f327502a.showAtLocation(this.f327510i, 0, i3, lineTop);
            } catch (Exception unused) {
            }
        }
    }
}
