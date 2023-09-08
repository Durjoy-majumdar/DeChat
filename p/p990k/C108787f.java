package p990k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C103452g;
import androidx.appcompat.widget.C103556p;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p1130l.C109059d;
import p1164y2.C112382a;
import p1164y2.C112383b;
import p433g.C107593a;
import p849e3.C107170b;
import p849e3.C107197h;

/* renamed from: k.f */
public class C108787f extends MenuInflater {

    /* renamed from: e */
    public static final Class<?>[] f325733e;

    /* renamed from: f */
    public static final Class<?>[] f325734f;

    /* renamed from: a */
    public final Object[] f325735a;

    /* renamed from: b */
    public final Object[] f325736b;

    /* renamed from: c */
    public Context f325737c;

    /* renamed from: d */
    public Object f325738d;

    /* renamed from: k.f$a */
    public static class C88047a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: f */
        public static final Class<?>[] f254682f = {MenuItem.class};

        /* renamed from: d */
        public Object f254683d;

        /* renamed from: e */
        public Method f254684e;

        public C88047a(Object obj, String str) {
            this.f254683d = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f254684e = cls.getMethod(str, f254682f);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f254684e.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f254684e.invoke(this.f254683d, new Object[]{menuItem})).booleanValue();
                }
                this.f254684e.invoke(this.f254683d, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: k.f$b */
    public class C108788b {

        /* renamed from: A */
        public CharSequence f325739A;

        /* renamed from: B */
        public CharSequence f325740B;

        /* renamed from: C */
        public ColorStateList f325741C = null;

        /* renamed from: D */
        public PorterDuff.Mode f325742D = null;

        /* renamed from: a */
        public Menu f325744a;

        /* renamed from: b */
        public int f325745b;

        /* renamed from: c */
        public int f325746c;

        /* renamed from: d */
        public int f325747d;

        /* renamed from: e */
        public int f325748e;

        /* renamed from: f */
        public boolean f325749f;

        /* renamed from: g */
        public boolean f325750g;

        /* renamed from: h */
        public boolean f325751h;

        /* renamed from: i */
        public int f325752i;

        /* renamed from: j */
        public int f325753j;

        /* renamed from: k */
        public CharSequence f325754k;

        /* renamed from: l */
        public CharSequence f325755l;

        /* renamed from: m */
        public int f325756m;

        /* renamed from: n */
        public char f325757n;

        /* renamed from: o */
        public int f325758o;

        /* renamed from: p */
        public char f325759p;

        /* renamed from: q */
        public int f325760q;

        /* renamed from: r */
        public int f325761r;

        /* renamed from: s */
        public boolean f325762s;

        /* renamed from: t */
        public boolean f325763t;

        /* renamed from: u */
        public boolean f325764u;

        /* renamed from: v */
        public int f325765v;

        /* renamed from: w */
        public int f325766w;

        /* renamed from: x */
        public String f325767x;

        /* renamed from: y */
        public String f325768y;

        /* renamed from: z */
        public C107170b f325769z;

        public C108788b(Menu menu) {
            this.f325744a = menu;
            this.f325745b = 0;
            this.f325746c = 0;
            this.f325747d = 0;
            this.f325748e = 0;
            this.f325749f = true;
            this.f325750g = true;
        }

        /* renamed from: a */
        public final void mo159836a(MenuItem menuItem) {
            Object obj;
            boolean z = false;
            menuItem.setChecked(this.f325762s).setVisible(this.f325763t).setEnabled(this.f325764u).setCheckable(this.f325761r >= 1).setTitleCondensed(this.f325755l).setIcon(this.f325756m);
            int i = this.f325765v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f325768y != null) {
                if (!C108787f.this.f325737c.isRestricted()) {
                    C108787f fVar = C108787f.this;
                    if (fVar.f325738d == null) {
                        fVar.f325738d = fVar.mo159833a(fVar.f325737c);
                    }
                    menuItem.setOnMenuItemClickListener(new C88047a(fVar.f325738d, this.f325768y));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z2 = menuItem instanceof C103452g;
            if (z2) {
                C103452g gVar = (C103452g) menuItem;
            }
            if (this.f325761r >= 2) {
                if (z2) {
                    ((C103452g) menuItem).mo143641f(true);
                } else if (menuItem instanceof C109059d) {
                    C109059d dVar = (C109059d) menuItem;
                    try {
                        if (dVar.f326625h == null) {
                            dVar.f326625h = ((C112383b) dVar.f326624d).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                        }
                        dVar.f326625h.invoke(dVar.f326624d, new Object[]{Boolean.TRUE});
                    } catch (Exception unused) {
                    }
                }
            }
            String str = this.f325767x;
            if (str != null) {
                Class<?>[] clsArr = C108787f.f325733e;
                C108787f fVar2 = C108787f.this;
                Object[] objArr = fVar2.f325735a;
                try {
                    Constructor<?> constructor = fVar2.f325737c.getClassLoader().loadClass(str).getConstructor(clsArr);
                    constructor.setAccessible(true);
                    obj = constructor.newInstance(objArr);
                } catch (Exception unused2) {
                    obj = null;
                }
                menuItem.setActionView((View) obj);
                z = true;
            }
            int i2 = this.f325766w;
            if (i2 > 0 && !z) {
                menuItem.setActionView(i2);
            }
            C107170b bVar = this.f325769z;
            if (bVar != null && (menuItem instanceof C112383b)) {
                ((C112383b) menuItem).mo143636b(bVar);
            }
            C107197h.m145133b(menuItem, this.f325739A);
            C107197h.m145137f(menuItem, this.f325740B);
            C107197h.m145132a(menuItem, this.f325757n, this.f325758o);
            C107197h.m145136e(menuItem, this.f325759p, this.f325760q);
            PorterDuff.Mode mode = this.f325742D;
            if (mode != null) {
                C107197h.m145135d(menuItem, mode);
            }
            ColorStateList colorStateList = this.f325741C;
            if (colorStateList != null) {
                C107197h.m145134c(menuItem, colorStateList);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f325733e = r0
            f325734f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p990k.C108787f.<clinit>():void");
    }

    public C108787f(Context context) {
        super(context);
        this.f325737c = context;
        Object[] objArr = {context};
        this.f325735a = objArr;
        this.f325736b = objArr;
    }

    /* renamed from: a */
    public final Object mo159833a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? mo159833a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: b */
    public final void mo159834b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        ColorStateList colorStateList;
        Object obj;
        AttributeSet attributeSet2 = attributeSet;
        C108788b bVar = new C108788b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlPullParser xmlPullParser2 = xmlPullParser;
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            XmlPullParser xmlPullParser3 = xmlPullParser;
                            z2 = false;
                            str = null;
                            eventType = xmlPullParser.next();
                        } else if (name2.equals("group")) {
                            bVar.f325745b = 0;
                            bVar.f325746c = 0;
                            bVar.f325747d = 0;
                            bVar.f325748e = 0;
                            bVar.f325749f = true;
                            bVar.f325750g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar.f325751h) {
                                C107170b bVar2 = bVar.f325769z;
                                if (bVar2 == null || !bVar2.mo157613a()) {
                                    bVar.f325751h = true;
                                    bVar.mo159836a(bVar.f325744a.add(bVar.f325745b, bVar.f325752i, bVar.f325753j, bVar.f325754k));
                                } else {
                                    bVar.f325751h = true;
                                    bVar.mo159836a(bVar.f325744a.addSubMenu(bVar.f325745b, bVar.f325752i, bVar.f325753j, bVar.f325754k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            XmlPullParser xmlPullParser4 = xmlPullParser;
                            z = true;
                            eventType = xmlPullParser.next();
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = C108787f.this.f325737c.obtainStyledAttributes(attributeSet2, C107593a.f321920t);
                        bVar.f325745b = obtainStyledAttributes.getResourceId(1, 0);
                        bVar.f325746c = obtainStyledAttributes.getInt(3, 0);
                        bVar.f325747d = obtainStyledAttributes.getInt(4, 0);
                        bVar.f325748e = obtainStyledAttributes.getInt(5, 0);
                        bVar.f325749f = obtainStyledAttributes.getBoolean(2, true);
                        bVar.f325750g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray obtainStyledAttributes2 = C108787f.this.f325737c.obtainStyledAttributes(attributeSet2, C107593a.f321921u);
                            bVar.f325752i = obtainStyledAttributes2.getResourceId(2, 0);
                            bVar.f325753j = (obtainStyledAttributes2.getInt(5, bVar.f325746c) & -65536) | (obtainStyledAttributes2.getInt(6, bVar.f325747d) & 65535);
                            bVar.f325754k = obtainStyledAttributes2.getText(7);
                            bVar.f325755l = obtainStyledAttributes2.getText(8);
                            bVar.f325756m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            bVar.f325757n = string == null ? 0 : string.charAt(0);
                            bVar.f325758o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            bVar.f325759p = string2 == null ? 0 : string2.charAt(0);
                            bVar.f325760q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                bVar.f325761r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                bVar.f325761r = bVar.f325748e;
                            }
                            bVar.f325762s = obtainStyledAttributes2.getBoolean(3, false);
                            bVar.f325763t = obtainStyledAttributes2.getBoolean(4, bVar.f325749f);
                            bVar.f325764u = obtainStyledAttributes2.getBoolean(1, bVar.f325750g);
                            bVar.f325765v = obtainStyledAttributes2.getInt(21, -1);
                            bVar.f325768y = obtainStyledAttributes2.getString(12);
                            bVar.f325766w = obtainStyledAttributes2.getResourceId(13, 0);
                            bVar.f325767x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            if ((string3 != null) && bVar.f325766w == 0 && bVar.f325767x == null) {
                                Class<?>[] clsArr = f325734f;
                                C108787f fVar = C108787f.this;
                                Object[] objArr = fVar.f325736b;
                                try {
                                    Constructor<?> constructor = fVar.f325737c.getClassLoader().loadClass(string3).getConstructor(clsArr);
                                    constructor.setAccessible(true);
                                    obj = constructor.newInstance(objArr);
                                } catch (Exception unused) {
                                    obj = null;
                                }
                                bVar.f325769z = (C107170b) obj;
                            } else {
                                bVar.f325769z = null;
                            }
                            bVar.f325739A = obtainStyledAttributes2.getText(17);
                            bVar.f325740B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                bVar.f325742D = C103556p.m137674d(obtainStyledAttributes2.getInt(19, -1), bVar.f325742D);
                                colorStateList = null;
                            } else {
                                colorStateList = null;
                                bVar.f325742D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                bVar.f325741C = obtainStyledAttributes2.getColorStateList(18);
                            } else {
                                bVar.f325741C = colorStateList;
                            }
                            obtainStyledAttributes2.recycle();
                            bVar.f325751h = false;
                            XmlPullParser xmlPullParser5 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            bVar.f325751h = true;
                            SubMenu addSubMenu = bVar.f325744a.addSubMenu(bVar.f325745b, bVar.f325752i, bVar.f325753j, bVar.f325754k);
                            bVar.mo159836a(addSubMenu.getItem());
                            mo159834b(xmlPullParser, attributeSet2, addSubMenu);
                        } else {
                            XmlPullParser xmlPullParser6 = xmlPullParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser.next();
                    }
                }
                XmlPullParser xmlPullParser7 = xmlPullParser;
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof C112382a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f325737c.getResources().getLayout(i);
            mo159834b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            xmlResourceParser.close();
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
