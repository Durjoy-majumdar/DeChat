package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TabHost;
import java.util.ArrayList;

@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: d */
    public final ArrayList<C112909a> f338000d = new ArrayList<>();

    /* renamed from: e */
    public TabHost.OnTabChangeListener f338001e;

    /* renamed from: f */
    public boolean f338002f;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C112908a();

        /* renamed from: d */
        public String f338003d;

        /* renamed from: androidx.fragment.app.FragmentTabHost$SavedState$a */
        public class C112908a implements Parcelable.Creator<SavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f338003d + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f338003d);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f338003d = parcel.readString();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentTabHost$a */
    public static final class C112909a {
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    /* renamed from: b */
    public final C112919c0 mo165150b(String str, C112919c0 c0Var) {
        if (this.f338000d.size() <= 0) {
            return c0Var;
        }
        this.f338000d.get(0).getClass();
        throw null;
    }

    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        if (this.f338000d.size() <= 0) {
            this.f338002f = true;
            C112919c0 b = mo165150b(currentTabTag, (C112919c0) null);
            if (b != null) {
                b.mo165162d();
                throw null;
            }
            return;
        }
        this.f338000d.get(0).getClass();
        throw null;
    }

    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f338002f = false;
    }

    @Deprecated
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f338003d);
    }

    @Deprecated
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f338003d = getCurrentTabTag();
        return savedState;
    }

    @Deprecated
    public void onTabChanged(String str) {
        C112919c0 b;
        if (this.f338002f && (b = mo165150b(str, (C112919c0) null)) != null) {
            b.mo165162d();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f338001e;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f338001e = onTabChangeListener;
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
