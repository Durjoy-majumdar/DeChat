package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C103522c0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.WeakHashMap;
import p1042u.C111055b;
import p433g.C107593a;
import p849e3.C107168a0;
import p849e3.C107207u;
import p990k.C88046c;

public class AppCompatViewInflater {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final Map<String, Constructor<? extends View>> sConstructorMap = new C111055b();
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {16843375};
    private final Object[] mConstructorArgs = new Object[2];

    /* renamed from: androidx.appcompat.app.AppCompatViewInflater$a */
    public static class C79595a implements View.OnClickListener {

        /* renamed from: d */
        public final View f233423d;

        /* renamed from: e */
        public final String f233424e;

        /* renamed from: f */
        public Method f233425f;

        /* renamed from: g */
        public Context f233426g;

        public C79595a(View view, String str) {
            this.f233423d = view;
            this.f233424e = str;
        }

        public void onClick(View view) {
            String str;
            Method method;
            if (this.f233425f == null) {
                for (Context context = this.f233423d.getContext(); context != null; context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f233424e, new Class[]{View.class})) != null) {
                            this.f233425f = method;
                            this.f233426g = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
                int id = this.f233423d.getId();
                if (id == -1) {
                    str = "";
                } else {
                    str = " with id '" + this.f233423d.getContext().getResources().getResourceEntryName(id) + "'";
                }
                throw new IllegalStateException("Could not find method " + this.f233424e + "(View) in a parent or ancestor Context for android:onClick " + "attribute defined on view " + this.f233423d.getClass() + str);
            }
            try {
                this.f233425f.invoke(this.f233426g, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (C107207u.C86421a.m107088a(view)) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new C79595a(view, string));
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) {
        String str3;
        Map<String, Constructor<? extends View>> map = sConstructorMap;
        Constructor<? extends U> constructor = map.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(sConstructorSignature);
                map.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i = 0;
                while (true) {
                    String[] strArr = sClassPrefixList;
                    if (i < strArr.length) {
                        View createViewByPrefix = createViewByPrefix(context, str, strArr[i]);
                        if (createViewByPrefix != null) {
                            return createViewByPrefix;
                        }
                        i++;
                    } else {
                        Object[] objArr2 = this.mConstructorArgs;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View createViewByPrefix2 = createViewByPrefix(context, str, (String) null);
                Object[] objArr3 = this.mConstructorArgs;
                objArr3[0] = null;
                objArr3[1] = null;
                return createViewByPrefix2;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr4 = this.mConstructorArgs;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C107593a.f321898D, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(0, 0) : 0;
        if (z2 && resourceId == 0) {
            resourceId = obtainStyledAttributes.getResourceId(4, 0);
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? (!(context instanceof C88046c) || ((C88046c) context).f254678a != resourceId) ? new C88046c(context, resourceId) : context : context;
    }

    private void verifyNotNull(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    public AppCompatAutoCompleteTextView createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public AppCompatCheckedTextView createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    public AppCompatEditText createEditText(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    public AppCompatImageButton createImageButton(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    public AppCompatImageView createImageView(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    public AppCompatMultiAutoCompleteTextView createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    public AppCompatRadioButton createRadioButton(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public AppCompatRatingBar createRatingBar(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    public AppCompatSeekBar createSeekBar(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    public AppCompatSpinner createSpinner(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = themifyContext(context2, attributeSet, z2, z3);
        }
        if (z4) {
            C103522c0.m137532a(context2);
        }
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 8;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 9;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 10;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 11;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 12;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = createRatingBar(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 1:
                view2 = createCheckedTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 2:
                view2 = createMultiAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 3:
                view2 = createTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 4:
                view2 = createImageButton(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 5:
                view2 = createSeekBar(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 6:
                view2 = createSpinner(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 7:
                view2 = createRadioButton(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 8:
                view2 = createImageView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 9:
                view2 = createAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 10:
                view2 = createCheckBox(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 11:
                view2 = createEditText(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            case 12:
                view2 = createButton(context2, attributeSet);
                verifyNotNull(view2, str);
                break;
            default:
                view2 = createView(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = createViewFromTag(context2, str, attributeSet);
        }
        if (view2 != null) {
            checkOnClickListener(view2, attributeSet);
        }
        return view2;
    }
}
