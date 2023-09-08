package p853i4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.InflateException;
import androidx.transition.ArcMotion;
import androidx.transition.AutoTransition;
import androidx.transition.ChangeBounds;
import androidx.transition.ChangeClipBounds;
import androidx.transition.ChangeImageTransform;
import androidx.transition.ChangeScroll;
import androidx.transition.ChangeTransform;
import androidx.transition.Explode;
import androidx.transition.Fade;
import androidx.transition.PathMotion;
import androidx.transition.PatternPathMotion;
import androidx.transition.Slide;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import p1042u.C111055b;
import p1050v2.C111331h;

/* renamed from: i4.m */
public class C108351m {

    /* renamed from: b */
    public static final Class<?>[] f324388b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final C111055b<String, Constructor> f324389c = new C111055b<>();

    /* renamed from: a */
    public final Context f324390a;

    public C108351m(Context context) {
        this.f324390a = context;
    }

    /* renamed from: a */
    public final Object mo158844a(AttributeSet attributeSet, Class cls, String str) {
        Object newInstance;
        Class<? extends U> asSubclass;
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        if (attributeValue != null) {
            try {
                C111055b<String, Constructor> bVar = f324389c;
                synchronized (bVar) {
                    Constructor<? extends U> orDefault = bVar.getOrDefault(attributeValue, null);
                    if (orDefault == null && (asSubclass = this.f324390a.getClassLoader().loadClass(attributeValue).asSubclass(cls)) != null) {
                        orDefault = asSubclass.getConstructor(f324388b);
                        orDefault.setAccessible(true);
                        bVar.put(attributeValue, orDefault);
                    }
                    newInstance = orDefault.newInstance(new Object[]{this.f324390a, attributeSet});
                }
                return newInstance;
            } catch (Exception e) {
                throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e);
            }
        } else {
            throw new InflateException(str + " tag must have a 'class' attribute");
        }
    }

    /* renamed from: b */
    public final Transition mo158845b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Transition transition) {
        Transition transition2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Transition transition3 = transition;
        int depth = xmlPullParser.getDepth();
        TransitionSet transitionSet = transition3 instanceof TransitionSet ? (TransitionSet) transition3 : null;
        loop0:
        while (true) {
            transition2 = null;
            while (true) {
                int next = xmlPullParser.next();
                if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                    if (next == 2) {
                        String name = xmlPullParser.getName();
                        if ("fade".equals(name)) {
                            transition2 = new Fade(this.f324390a, attributeSet2);
                        } else if ("changeBounds".equals(name)) {
                            transition2 = new ChangeBounds(this.f324390a, attributeSet2);
                        } else if ("slide".equals(name)) {
                            transition2 = new Slide(this.f324390a, attributeSet2);
                        } else if ("explode".equals(name)) {
                            transition2 = new Explode(this.f324390a, attributeSet2);
                        } else if ("changeImageTransform".equals(name)) {
                            transition2 = new ChangeImageTransform(this.f324390a, attributeSet2);
                        } else if ("changeTransform".equals(name)) {
                            transition2 = new ChangeTransform(this.f324390a, attributeSet2);
                        } else if ("changeClipBounds".equals(name)) {
                            transition2 = new ChangeClipBounds(this.f324390a, attributeSet2);
                        } else if ("autoTransition".equals(name)) {
                            transition2 = new AutoTransition(this.f324390a, attributeSet2);
                        } else if ("changeScroll".equals(name)) {
                            transition2 = new ChangeScroll(this.f324390a, attributeSet2);
                        } else if ("transitionSet".equals(name)) {
                            transition2 = new TransitionSet(this.f324390a, attributeSet2);
                        } else if ("transition".equals(name)) {
                            transition2 = (Transition) mo158844a(attributeSet2, Transition.class, "transition");
                        } else if ("targets".equals(name)) {
                            int depth2 = xmlPullParser.getDepth();
                            while (true) {
                                int next2 = xmlPullParser.next();
                                if ((next2 == 3 && xmlPullParser.getDepth() <= depth2) || next2 == 1) {
                                    break;
                                } else if (next2 == 2) {
                                    if (xmlPullParser.getName().equals("target")) {
                                        TypedArray obtainStyledAttributes = this.f324390a.obtainStyledAttributes(attributeSet2, C108348j.f324375a);
                                        int e = C111331h.m151818e(obtainStyledAttributes, xmlPullParser2, "targetId", 1, 0);
                                        if (e != 0) {
                                            transition3.mo145325b(e);
                                        } else {
                                            int e2 = C111331h.m151818e(obtainStyledAttributes, xmlPullParser2, "excludeId", 2, 0);
                                            if (e2 != 0) {
                                                transition3.mo145337r(e2, true);
                                            } else {
                                                String f = C111331h.m151819f(obtainStyledAttributes, xmlPullParser2, "targetName", 4);
                                                if (f != null) {
                                                    transition3.mo145329e(f);
                                                } else {
                                                    String f2 = C111331h.m151819f(obtainStyledAttributes, xmlPullParser2, "excludeName", 5);
                                                    if (f2 != null) {
                                                        transition3.mo145339t(f2, true);
                                                    } else {
                                                        String f3 = C111331h.m151819f(obtainStyledAttributes, xmlPullParser2, "excludeClass", 3);
                                                        if (f3 != null) {
                                                            try {
                                                                transition3.mo145338s(Class.forName(f3), true);
                                                            } catch (ClassNotFoundException e3) {
                                                                obtainStyledAttributes.recycle();
                                                                throw new RuntimeException("Could not create " + f3, e3);
                                                            }
                                                        } else {
                                                            String f4 = C111331h.m151819f(obtainStyledAttributes, xmlPullParser2, "targetClass", 0);
                                                            if (f4 != null) {
                                                                transition3.mo145328d(Class.forName(f4));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        obtainStyledAttributes.recycle();
                                    } else {
                                        throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                                    }
                                }
                            }
                        } else if ("arcMotion".equals(name)) {
                            if (transition3 != null) {
                                transition3.mo145318L(new ArcMotion(this.f324390a, attributeSet2));
                            } else {
                                throw new RuntimeException("Invalid use of arcMotion element");
                            }
                        } else if ("pathMotion".equals(name)) {
                            if (transition3 != null) {
                                transition3.mo145318L((PathMotion) mo158844a(attributeSet2, PathMotion.class, "pathMotion"));
                            } else {
                                throw new RuntimeException("Invalid use of pathMotion element");
                            }
                        } else if (!"patternPathMotion".equals(name)) {
                            throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                        } else if (transition3 != null) {
                            transition3.mo145318L(new PatternPathMotion(this.f324390a, attributeSet2));
                        } else {
                            throw new RuntimeException("Invalid use of patternPathMotion element");
                        }
                        if (transition2 == null) {
                            continue;
                        } else {
                            if (!xmlPullParser.isEmptyElementTag()) {
                                mo158845b(xmlPullParser2, attributeSet2, transition2);
                            }
                            if (transitionSet != null) {
                                break;
                            } else if (transition3 != null) {
                                throw new InflateException("Could not add transition to another transition.");
                            }
                        }
                    }
                }
            }
            transitionSet.mo145348U(transition2);
        }
        return transition2;
    }
}
