package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.widget.C103733h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.kiss.widget.textview.StaticTextView;
import com.tencent.p014mm.p136ui.base.MMVerticalTextView;
import com.tencent.p014mm.p136ui.widget.MMCollapsibleTextView;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageButton;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import fj3.C20713c;
import java.util.HashMap;
import java.util.Map;
import kg3.C76577a;
import lg3.C88504k;
import p573jk.C76417a;
import pl3.C100823c;
import wq3.C111849j;

/* renamed from: com.tencent.mm.ui.k2 */
public final class C85868k2 {

    /* renamed from: a */
    public static final int[] f250087a = {16843087, 16843088, 16843379};

    /* renamed from: b */
    public static final int[] f250088b = {16843379};

    /* renamed from: c */
    public static final int[] f250089c = {16842904, 16842906, 16842964};

    /* renamed from: d */
    public static final int[] f250090d = {16842904, 16842964};

    /* renamed from: e */
    public static final int[] f250091e = {16842904, 16843015};

    /* renamed from: f */
    public static int f250092f;

    /* renamed from: com.tencent.mm.ui.k2$b */
    public static class C85870b implements LayoutInflater.Factory {

        /* renamed from: A */
        public static final int f250093A = 310672300;

        /* renamed from: B */
        public static final int f250094B = 1524180521;

        /* renamed from: C */
        public static final int f250095C = -1299757303;

        /* renamed from: D */
        public static final int f250096D = -527895810;

        /* renamed from: E */
        public static final int f250097E = -1374364899;

        /* renamed from: F */
        public static final int f250098F = 132421285;

        /* renamed from: G */
        public static final int f250099G = 418111674;

        /* renamed from: H */
        public static final int f250100H = 540561289;

        /* renamed from: I */
        public static final int f250101I = 1079639440;

        /* renamed from: J */
        public static final int f250102J = 2077030397;

        /* renamed from: K */
        public static final int f250103K = 2076872964;

        /* renamed from: L */
        public static final int f250104L = -771693267;

        /* renamed from: M */
        public static final int f250105M = 200122345;

        /* renamed from: N */
        public static final int f250106N = 999067519;

        /* renamed from: P */
        public static final int f250107P = -1489232690;

        /* renamed from: Q */
        public static final int f250108Q = -1259604263;

        /* renamed from: Q0 */
        public static final int f250109Q0 = -455447493;

        /* renamed from: R */
        public static final int f250110R = -1601904316;

        /* renamed from: R0 */
        public static final int f250111R0 = 1215740217;

        /* renamed from: S */
        public static final int f250112S = 1226216429;

        /* renamed from: S0 */
        public static final int f250113S0 = -1142652473;

        /* renamed from: T */
        public static final int f250114T = 960005444;

        /* renamed from: T0 */
        public static final int f250115T0 = -978427796;

        /* renamed from: U */
        public static final int f250116U = 863703231;

        /* renamed from: U0 */
        public static final int f250117U0 = -602460368;

        /* renamed from: V */
        public static final int f250118V = -1568925917;

        /* renamed from: V0 */
        public static final int f250119V0 = -529817397;

        /* renamed from: W */
        public static final int f250120W = -251296369;

        /* renamed from: W0 */
        public static final int f250121W0 = -1880646591;

        /* renamed from: X */
        public static final int f250122X = 687897231;

        /* renamed from: X0 */
        public static final int f250123X0 = -1159437000;

        /* renamed from: Y */
        public static final int f250124Y = -602931483;

        /* renamed from: Z */
        public static final int f250125Z = -1992485345;

        /* renamed from: i */
        public static final Map<String, C85872b<? extends View>> f250126i = new C85871a(32);

        /* renamed from: j */
        public static final int f250127j = -938935918;

        /* renamed from: n */
        public static final int f250128n = 2001146706;

        /* renamed from: o */
        public static final int f250129o = 1666676343;

        /* renamed from: p */
        public static final int f250130p = 1601505219;

        /* renamed from: p0 */
        public static final int f250131p0 = 1262601901;

        /* renamed from: q */
        public static final int f250132q = 776382189;

        /* renamed from: r */
        public static final int f250133r = 1125864064;

        /* renamed from: s */
        public static final int f250134s = -1455429095;

        /* renamed from: t */
        public static final int f250135t = 1690268602;

        /* renamed from: u */
        public static final int f250136u = 913567;

        /* renamed from: v */
        public static final int f250137v = 321475187;

        /* renamed from: w */
        public static final int f250138w = -472572735;

        /* renamed from: x */
        public static final int f250139x = 295445588;

        /* renamed from: x0 */
        public static final int f250140x0 = -307023012;

        /* renamed from: y */
        public static final int f250141y = -720637559;

        /* renamed from: y0 */
        public static final int f250142y0 = 742575657;

        /* renamed from: z */
        public static final int f250143z = -124208923;

        /* renamed from: d */
        public LayoutInflater f250144d;

        /* renamed from: e */
        public C111849j f250145e;

        /* renamed from: f */
        public int f250146f;

        /* renamed from: g */
        public int f250147g;

        /* renamed from: h */
        public C85870b f250148h;

        /* renamed from: com.tencent.mm.ui.k2$b$a */
        public class C85871a extends HashMap<String, C85872b<? extends View>> {
            public C85871a(int i) {
                super(i);
                put("LinearLayout", new k2$b$a$$a());
                put("FrameLayout", new k2$b$a$$n());
                put("RelativeLayout", new k2$b$a$$o());
                put("ListView", new k2$b$a$$p());
                put("View", new k2$b$a$$b());
                put("ViewStub", new k2$b$a$$c());
                put("WebView", new k2$b$a$$d());
                put("ProgressBar", new k2$b$a$$e());
                put("androidx.appcompat.widget.ActionBarOverlayLayout", new k2$b$a$$f());
                put("androidx.appcompat.widget.ContentFrameLayout", new k2$b$a$$g());
                put("androidx.appcompat.widget.ActionBarContainer", new k2$b$a$$h());
                put("androidx.appcompat.widget.Toolbar", new k2$b$a$$i());
                put("com.tencent.mm.ui.widget.imageview.WeImageView", new k2$b$a$$j());
                put("com.tencent.mm.ui.LayoutListenerView", new k2$b$a$$k());
                put("com.tencent.mm.view.recyclerview.WxRecyclerView", new k2$b$a$$l());
                put("com.tencent.mm.pluginsdk.ui.tools.ScrollControlRecyclerView", new k2$b$a$$m());
            }
        }

        /* renamed from: com.tencent.mm.ui.k2$b$b */
        public interface C85872b<T extends View> {
            /* renamed from: a */
            T mo103959a(Context context, AttributeSet attributeSet);
        }

        public C85870b(C85869a aVar) {
        }

        /* renamed from: b */
        public static View m106139b(String str, View view, Context context, AttributeSet attributeSet) {
            int attributeResourceValue;
            int attributeResourceValue2;
            View view2 = view;
            Context context2 = context;
            AttributeSet attributeSet2 = attributeSet;
            int hashCode = str.hashCode();
            if (hashCode != f250127j && hashCode != f250128n && hashCode != f250129o && hashCode != f250130p && hashCode != f250132q && hashCode != f250133r && hashCode != f250140x0 && hashCode != f250142y0 && hashCode != f250134s && hashCode != f250135t && hashCode != f250137v && hashCode != f250136u && hashCode != f250138w && hashCode != f250139x && hashCode != f250141y && hashCode != f250143z && hashCode != f250093A && hashCode != f250094B && hashCode != f250095C && hashCode != f250096D && hashCode != f250097E && hashCode != f250098F && hashCode != f250099G && hashCode != f250100H && hashCode != f250101I && hashCode != f250102J && hashCode != f250103K && hashCode != f250104L && hashCode != f250105M && hashCode != f250106N && hashCode != f250107P && hashCode != f250108Q && hashCode != f250110R && hashCode != f250112S && hashCode != f250114T && hashCode != f250118V && hashCode != f250120W && hashCode != f250122X && hashCode != f250124Y && hashCode != f250125Z && hashCode != f250123X0 && hashCode != f250131p0 && hashCode != f250109Q0 && hashCode != f250111R0 && hashCode != f250113S0 && hashCode != f250116U && hashCode != f250115T0 && hashCode != f250117U0 && hashCode != f250119V0 && hashCode != f250121W0) {
                return view2;
            }
            int i = 3;
            int i2 = 0;
            if (C76417a.m91844a()) {
                int i3 = 2;
                if (view2 instanceof RadioButton) {
                    RadioButton radioButton = (RadioButton) view2;
                    if (attributeSet2 != null) {
                        int attributeResourceValue3 = attributeSet2.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "textColor", -1);
                        if (attributeResourceValue3 > 0) {
                            radioButton.setTextColor(radioButton.getContext().getResources().getColorStateList(attributeResourceValue3));
                        }
                        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, C85868k2.f250091e);
                        int i4 = 0;
                        while (true) {
                            int[] iArr = C85868k2.f250091e;
                            if (i4 >= 2) {
                                break;
                            }
                            int resourceId = obtainStyledAttributes.getResourceId(i4, 0);
                            if (resourceId != 0) {
                                int i5 = iArr[i4];
                                if (i5 == 16842904) {
                                    radioButton.setTextColor(radioButton.getContext().getResources().getColorStateList(resourceId));
                                } else if (i5 == 16843015 && C76417a.m91844a() && resourceId == C0966R.C0969drawable.apl) {
                                    radioButton.setButtonDrawable(C0966R.C0969drawable.apm);
                                }
                            }
                            i4++;
                        }
                    }
                } else if (view2 instanceof Button) {
                    Button button = (Button) view2;
                    if (attributeSet2 != null) {
                        int attributeResourceValue4 = attributeSet2.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "textColor", -1);
                        if (attributeResourceValue4 > 0) {
                            button.setTextColor(button.getContext().getResources().getColorStateList(attributeResourceValue4));
                        }
                        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, C85868k2.f250090d);
                        int i6 = 0;
                        while (true) {
                            int[] iArr2 = C85868k2.f250090d;
                            if (i6 >= i3) {
                                break;
                            }
                            int resourceId2 = obtainStyledAttributes2.getResourceId(i6, i2);
                            if (resourceId2 != 0) {
                                int i7 = iArr2[i6];
                                if (i7 == 16842904) {
                                    button.setTextColor(button.getContext().getResources().getColorStateList(resourceId2));
                                } else if (i7 == 16842964 && C76417a.m91844a()) {
                                    if (resourceId2 == C0966R.C0969drawable.f4653j6) {
                                        button.setBackgroundResource(C0966R.C0969drawable.f4654j7);
                                    } else if (resourceId2 == C0966R.C0969drawable.f4656j8 || resourceId2 == C0966R.C0969drawable.f4650j3) {
                                        button.setBackgroundResource(C0966R.C0969drawable.f4657j9);
                                    } else if (resourceId2 == C0966R.C0969drawable.ag6) {
                                        button.setBackgroundResource(C0966R.C0969drawable.ag7);
                                    } else if (resourceId2 == C0966R.C0969drawable.ag8) {
                                        button.setBackgroundResource(C0966R.C0969drawable.ag9);
                                    }
                                }
                            }
                            i6++;
                            i2 = 0;
                            i3 = 2;
                        }
                    }
                } else if (view2 instanceof TextView) {
                    TextView textView = (TextView) view2;
                    if (attributeSet2 != null) {
                        int attributeResourceValue5 = attributeSet2.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "textColor", -1);
                        if (attributeResourceValue5 > 0) {
                            textView.setTextColor(textView.getContext().getResources().getColorStateList(attributeResourceValue5));
                        }
                        int attributeResourceValue6 = attributeSet2.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "textColorHint", -1);
                        if (attributeResourceValue6 > 0) {
                            textView.setHintTextColor(textView.getContext().getResources().getColor(attributeResourceValue6));
                        }
                        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet2, C85868k2.f250089c);
                        int i8 = 0;
                        while (true) {
                            int[] iArr3 = C85868k2.f250089c;
                            if (i8 >= i) {
                                break;
                            }
                            int resourceId3 = obtainStyledAttributes3.getResourceId(i8, 0);
                            if (resourceId3 != 0) {
                                int i9 = iArr3[i8];
                                if (i9 == 16842904) {
                                    textView.setTextColor(textView.getContext().getResources().getColorStateList(resourceId3));
                                } else if (i9 == 16842906) {
                                    textView.setHintTextColor(textView.getContext().getResources().getColorStateList(resourceId3));
                                } else if (i9 == 16842964 && C76417a.m91844a() && (resourceId3 == C0966R.C0969drawable.f4656j8 || resourceId3 == C0966R.C0969drawable.f4650j3)) {
                                    textView.setBackgroundResource(C0966R.C0969drawable.f4657j9);
                                    i8++;
                                    i = 3;
                                }
                            }
                            i8++;
                            i = 3;
                        }
                    }
                } else if (view2 instanceof EditText) {
                    EditText editText = (EditText) view2;
                    if (attributeSet2 != null) {
                        int attributeResourceValue7 = attributeSet2.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "textColor", -1);
                        if (attributeResourceValue7 > 0) {
                            editText.setTextColor(editText.getContext().getResources().getColor(attributeResourceValue7));
                        }
                        int attributeResourceValue8 = attributeSet2.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "textColorHint", -1);
                        if (attributeResourceValue8 > 0) {
                            editText.setHintTextColor(editText.getContext().getResources().getColor(attributeResourceValue8));
                        }
                        TypedArray obtainStyledAttributes4 = context2.obtainStyledAttributes(attributeSet2, C85868k2.f250089c);
                        int i15 = 0;
                        while (true) {
                            int[] iArr4 = C85868k2.f250089c;
                            if (i15 >= 3) {
                                break;
                            }
                            int resourceId4 = obtainStyledAttributes4.getResourceId(i15, 0);
                            if (resourceId4 != 0) {
                                int i16 = iArr4[i15];
                                if (i16 == 16842904) {
                                    editText.setTextColor(editText.getContext().getResources().getColor(resourceId4));
                                } else if (i16 == 16842906) {
                                    editText.setHintTextColor(editText.getContext().getResources().getColorStateList(resourceId4));
                                }
                            }
                            i15++;
                        }
                    }
                } else if (view2 instanceof MMNeat7extView) {
                    MMNeat7extView mMNeat7extView = (MMNeat7extView) view2;
                    if (attributeSet2 != null) {
                        int attributeResourceValue9 = attributeSet2.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "textColor", -1);
                        if (attributeResourceValue9 > 0) {
                            mMNeat7extView.setTextColor(mMNeat7extView.getContext().getResources().getColor(attributeResourceValue9));
                        }
                        TypedArray obtainStyledAttributes5 = context2.obtainStyledAttributes(attributeSet2, C85868k2.f250089c);
                        int i17 = 0;
                        while (true) {
                            int[] iArr5 = C85868k2.f250089c;
                            if (i17 >= 3) {
                                break;
                            }
                            int resourceId5 = obtainStyledAttributes5.getResourceId(i17, 0);
                            if (resourceId5 != 0 && iArr5[i17] == 16842904) {
                                mMNeat7extView.setTextColor(mMNeat7extView.getContext().getResources().getColor(resourceId5));
                            }
                            i17++;
                        }
                    }
                }
            }
            boolean z = view2 instanceof TextView;
            if (z) {
                TextView textView2 = (TextView) view2;
                float lineSpacingMultiplier = textView2.getLineSpacingMultiplier();
                float lineSpacingExtra = textView2.getLineSpacingExtra();
                if (((double) lineSpacingMultiplier) < 1.1d && lineSpacingExtra == 0.0f) {
                    textView2.setLineSpacing(0.0f, 1.1f);
                }
            } else if (view2 instanceof MMNeat7extView) {
                MMNeat7extView mMNeat7extView2 = (MMNeat7extView) view2;
                float lineSpacingMultiplier2 = mMNeat7extView2.getLineSpacingMultiplier();
                mMNeat7extView2.getLineSpacingExtra();
                if (((double) lineSpacingMultiplier2) < 1.1d) {
                    mMNeat7extView2.mo154993k(0.0f, 1.1f);
                }
            } else if (view2 instanceof StaticTextView) {
                StaticTextView staticTextView = (StaticTextView) view2;
                float lineSpacingMultiplier3 = staticTextView.getLineSpacingMultiplier();
                float lineSpacingExtra2 = staticTextView.getLineSpacingExtra();
                if (((double) lineSpacingMultiplier3) < 1.1d && lineSpacingExtra2 == 0.0f) {
                    staticTextView.mo126801e(0.0f, 1.1f);
                }
            }
            float p = C76577a.m92165p(context);
            if (!((!C85875k4.m106153J(p, C76577a.m92169t(context)) && !C85875k4.m106153J(p, C76577a.m92170u(context))) || hashCode == f250135t || hashCode == f250137v || hashCode == f250104L || hashCode == f250105M || hashCode == f250106N || hashCode == f250138w || hashCode == f250124Y || hashCode == f250125Z || hashCode == f250123X0 || hashCode == f250131p0 || hashCode == f250139x)) {
                p = C76577a.m92168s(context);
            }
            if (hashCode == f250127j || hashCode == f250135t || hashCode == f250137v || hashCode == f250114T || hashCode == f250103K || hashCode == f250120W || hashCode == f250116U) {
                TextView textView3 = (TextView) view2;
                float textSize = (textView3.getTextSize() * p) / C76577a.m92156g(textView3.getContext());
                textView3.setTextSize(1, textSize);
                if (hashCode == f250120W) {
                    C103733h.m138105b(textView3, 1, (int) textSize, 1, 1);
                }
                if (C88504k.m110377c(context.getAssets()).mo122972g()) {
                    TypedArray obtainStyledAttributes6 = context2.obtainStyledAttributes(attributeSet2, C85868k2.f250087a);
                    int i18 = 0;
                    while (true) {
                        int[] iArr6 = C85868k2.f250087a;
                        if (i18 >= 3) {
                            break;
                        }
                        int resourceId6 = obtainStyledAttributes6.getResourceId(i18, 0);
                        if (resourceId6 != 0) {
                            int i19 = iArr6[i18];
                            if (i19 == 16843379) {
                                textView3.setContentDescription(context2.getString(resourceId6));
                            } else if (i19 == 16843088) {
                                textView3.setHint(context2.getString(resourceId6));
                            } else {
                                textView3.setText(context2.getString(resourceId6));
                            }
                        }
                        i18++;
                    }
                    obtainStyledAttributes6.recycle();
                } else {
                    C100823c.f295336a.mo140272a(view2, 1);
                }
            } else if (hashCode == f250128n || hashCode == f250122X) {
                Button button2 = (Button) view2;
                float textSize2 = (button2.getTextSize() * p) / C76577a.m92156g(button2.getContext());
                button2.setTextSize(1, textSize2);
                if (hashCode == f250122X) {
                    C103733h.m138105b(button2, 1, (int) textSize2, 1, 1);
                }
                if (C88504k.m110377c(context.getAssets()).mo122972g()) {
                    TypedArray obtainStyledAttributes7 = context2.obtainStyledAttributes(attributeSet2, C85868k2.f250087a);
                    int i25 = 0;
                    while (true) {
                        int[] iArr7 = C85868k2.f250087a;
                        if (i25 >= 3) {
                            break;
                        }
                        int resourceId7 = obtainStyledAttributes7.getResourceId(i25, 0);
                        if (resourceId7 != 0) {
                            int i26 = iArr7[i25];
                            if (i26 == 16843379) {
                                button2.setContentDescription(context2.getString(resourceId7));
                            } else if (i26 == 16843088) {
                                button2.setHint(context2.getString(resourceId7));
                            } else {
                                button2.setText(context2.getString(resourceId7));
                            }
                        }
                        i25++;
                    }
                    obtainStyledAttributes7.recycle();
                }
            } else if (hashCode == f250129o || hashCode == f250136u || hashCode == f250141y || hashCode == f250143z || hashCode == f250098F || hashCode == f250093A || hashCode == f250094B || hashCode == f250107P) {
                EditText editText2 = (EditText) view2;
                editText2.setTextSize(1, (editText2.getTextSize() * p) / C76577a.m92156g(editText2.getContext()));
                if (C88504k.m110377c(context.getAssets()).mo122972g()) {
                    TypedArray obtainStyledAttributes8 = context2.obtainStyledAttributes(attributeSet2, C85868k2.f250087a);
                    int i27 = 0;
                    while (true) {
                        int[] iArr8 = C85868k2.f250087a;
                        if (i27 >= 3) {
                            break;
                        }
                        int resourceId8 = obtainStyledAttributes8.getResourceId(i27, 0);
                        if (resourceId8 != 0) {
                            int i28 = iArr8[i27];
                            if (i28 == 16843379) {
                                editText2.setContentDescription(context2.getString(resourceId8));
                            } else if (i28 == 16843088) {
                                editText2.setHint(context2.getString(resourceId8));
                            } else {
                                editText2.setText(context2.getString(resourceId8));
                            }
                        }
                        i27++;
                    }
                    obtainStyledAttributes8.recycle();
                } else {
                    C100823c.f295336a.mo140272a(view2, 1);
                }
            } else if (hashCode == f250117U0 || hashCode == f250119V0 || hashCode == f250115T0 || hashCode == f250121W0) {
                EditText editText3 = (EditText) view2;
                C100823c.f295336a.mo140272a(view2, 1);
            } else if (hashCode == f250124Y || hashCode == f250125Z || hashCode == f250131p0) {
                C74974a aVar = (C74974a) view2;
                aVar.setTextSize(1, (aVar.getTextSize() * p) / C76577a.m92156g(aVar.mo104251h()));
                if (C88504k.m110377c(context.getAssets()).mo122972g()) {
                    TypedArray obtainStyledAttributes9 = context2.obtainStyledAttributes(attributeSet2, C85868k2.f250087a);
                    int i29 = 0;
                    while (true) {
                        int[] iArr9 = C85868k2.f250087a;
                        if (i29 >= 3) {
                            break;
                        }
                        int resourceId9 = obtainStyledAttributes9.getResourceId(i29, 0);
                        if (resourceId9 != 0) {
                            int i35 = iArr9[i29];
                            if (i35 == 16843379) {
                                aVar.setContentDescription(context2.getString(resourceId9));
                            } else if (i35 == 16843088) {
                                aVar.setHint(context2.getString(resourceId9));
                            } else {
                                aVar.setText(context2.getString(resourceId9));
                            }
                        }
                        i29++;
                    }
                    obtainStyledAttributes9.recycle();
                } else {
                    Editable text = aVar.getText();
                    if (!TextUtils.isEmpty(text)) {
                        aVar.setText(C85874d.m106143b(text));
                    }
                    CharSequence hint = aVar.getHint();
                    if (!TextUtils.isEmpty(hint)) {
                        aVar.setHint(C85874d.m106143b(hint));
                    }
                    CharSequence contentDescription = aVar.getContentDescription();
                    if (!TextUtils.isEmpty(contentDescription)) {
                        aVar.setContentDescription(C85874d.m106143b(contentDescription));
                    }
                    C100823c.f295336a.mo140272a(view2, 1);
                }
            } else if (hashCode == f250130p) {
                CheckBox checkBox = (CheckBox) view2;
                checkBox.setTextSize(1, (checkBox.getTextSize() * p) / C76577a.m92156g(checkBox.getContext()));
                if (C88504k.m110377c(context.getAssets()).mo122972g()) {
                    TypedArray obtainStyledAttributes10 = context2.obtainStyledAttributes(attributeSet2, C85868k2.f250087a);
                    int i36 = 0;
                    while (true) {
                        int[] iArr10 = C85868k2.f250087a;
                        if (i36 >= 3) {
                            break;
                        }
                        int resourceId10 = obtainStyledAttributes10.getResourceId(i36, 0);
                        if (resourceId10 != 0) {
                            int i37 = iArr10[i36];
                            if (i37 == 16843379) {
                                checkBox.setContentDescription(context2.getString(resourceId10));
                            } else if (i37 == 16843088) {
                                checkBox.setHint(context2.getString(resourceId10));
                            } else {
                                checkBox.setText(context2.getString(resourceId10));
                            }
                        }
                        i36++;
                    }
                    obtainStyledAttributes10.recycle();
                }
            } else if (hashCode == f250133r) {
                ImageView imageView = (ImageView) view2;
                if (C88504k.m110377c(context.getAssets()).mo122972g()) {
                    TypedArray obtainStyledAttributes11 = context2.obtainStyledAttributes(attributeSet2, C85868k2.f250088b);
                    int i38 = 0;
                    while (true) {
                        int[] iArr11 = C85868k2.f250088b;
                        if (i38 >= 1) {
                            break;
                        }
                        int resourceId11 = obtainStyledAttributes11.getResourceId(i38, 0);
                        if (resourceId11 != 0 && iArr11[i38] == 16843379) {
                            imageView.setContentDescription(context2.getString(resourceId11));
                        }
                        i38++;
                    }
                    obtainStyledAttributes11.recycle();
                } else {
                    CharSequence contentDescription2 = imageView.getContentDescription();
                    if (!TextUtils.isEmpty(contentDescription2)) {
                        imageView.setContentDescription(C85874d.m106143b(contentDescription2));
                    }
                }
            } else if (hashCode == f250140x0) {
                if (C76417a.m91844a()) {
                    WeImageView weImageView = (WeImageView) view2;
                    if (attributeSet2 != null && (attributeResourceValue2 = attributeSet2.getAttributeResourceValue("http://schemas.android.com/apk/res-auto", "iconColor", -1)) > 0) {
                        weImageView.setIconColor(weImageView.getContext().getResources().getColor(attributeResourceValue2));
                    }
                }
            } else if (hashCode == f250142y0) {
                if (C76417a.m91844a()) {
                    WeImageButton weImageButton = (WeImageButton) view2;
                    if (attributeSet2 != null && (attributeResourceValue = attributeSet2.getAttributeResourceValue("http://schemas.android.com/apk/res-auto", "btnIconColor", -1)) > 0) {
                        weImageButton.setIconColor(weImageButton.getContext().getResources().getColor(attributeResourceValue));
                    }
                }
            } else if (hashCode == f250138w) {
                MMNeat7extView mMNeat7extView3 = (MMNeat7extView) view2;
                mMNeat7extView3.mo154994l(1, (mMNeat7extView3.getTextSize() * p) / C76577a.m92156g(mMNeat7extView3.getContext()));
                CharSequence a = mMNeat7extView3.mo154968a();
                if (!TextUtils.isEmpty(a)) {
                    mMNeat7extView3.mo104279b(C85874d.m106143b(a));
                }
                CharSequence hint2 = mMNeat7extView3.getHint();
                if (!TextUtils.isEmpty(hint2)) {
                    mMNeat7extView3.setHint((CharSequence) C85874d.m106143b(hint2));
                }
                CharSequence contentDescription3 = mMNeat7extView3.getContentDescription();
                if (!TextUtils.isEmpty(contentDescription3)) {
                    mMNeat7extView3.setContentDescription(C85874d.m106143b(contentDescription3));
                }
                C100823c.f295336a.mo140272a(view2, 1);
            } else if (hashCode == f250118V) {
                MMVerticalTextView mMVerticalTextView = (MMVerticalTextView) view2;
                mMVerticalTextView.setTextSize(mMVerticalTextView.getTextSize() * p);
            } else if (hashCode == f250139x) {
                MMCollapsibleTextView mMCollapsibleTextView = (MMCollapsibleTextView) view2;
                mMCollapsibleTextView.mo104237w(1, (mMCollapsibleTextView.getTextSize() * p) / C76577a.m92156g(mMCollapsibleTextView.getContext()));
            } else {
                if (hashCode == f250110R) {
                    C100823c.f295336a.mo140272a(view2, 1);
                }
                if (z) {
                    TextView textView4 = (TextView) view2;
                    textView4.setTextSize(1, (textView4.getTextSize() * p) / C76577a.m92156g(textView4.getContext()));
                }
            }
            return view2;
        }

        /* renamed from: a */
        public View mo119782a(String str, Context context, AttributeSet attributeSet) {
            C85872b bVar = (C85872b) ((HashMap) f250126i).get(str);
            View a = bVar != null ? bVar.mo103959a(context, attributeSet) : null;
            if (a == null && str.indexOf(".") > 0) {
                a = this.f250144d.createView(str, (String) null, attributeSet);
            }
            if (a == null) {
                a = this.f250144d.createView(str, "android.widget.", attributeSet);
            }
            if (a == null) {
                a = this.f250144d.createView(str, "android.view.", attributeSet);
            }
            if (a != null) {
                a.setTag(C0966R.C0970id.kdq, Integer.valueOf(this.f250146f));
                a.setTag(C0966R.C0970id.mmb, Integer.valueOf(C85868k2.f250092f));
            }
            return a;
        }

        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            C85870b bVar;
            View view = null;
            try {
                C111849j jVar = this.f250145e;
                if (jVar != null) {
                    view = jVar.mo163555b(context, attributeSet, str, this.f250147g);
                }
                if (view == null) {
                    view = mo119782a(str, context, attributeSet);
                    if (view == null && (bVar = this.f250148h) != null) {
                        view = bVar.onCreateView(str, context, attributeSet);
                    }
                    C20713c cVar = C20713c.f58572a;
                    if (view != null) {
                        m106139b(str, view, context, attributeSet);
                        if (view instanceof TextView) {
                            C85874d.m106142a((TextView) view);
                        }
                    } else {
                        Log.m105928w("MicroMsg.MMLayoutInflater", "Inflate view, ClassNotFound " + str);
                    }
                }
                if (view instanceof ViewStub) {
                    ((ViewStub) view).setLayoutInflater(this.f250144d);
                }
                this.f250147g++;
            } catch (ClassNotFoundException e) {
                Log.m105929w("MicroMsg.MMLayoutInflater", "[cpan] class not found. name:%s. Use default Inflate. Exception:%s", str, e.getMessage());
            } catch (InflateException e2) {
                Log.m105929w("MicroMsg.MMLayoutInflater", "[cpan] Inflate failed. name:%s. Use default Inflate. Exception:%s", str, e2.getMessage());
            }
            return view;
        }
    }

    /* renamed from: com.tencent.mm.ui.k2$c */
    public static class C85873c extends LayoutInflater {

        /* renamed from: a */
        public C85870b f250149a;

        public C85873c(LayoutInflater layoutInflater, Context context) {
            super(layoutInflater, context);
        }

        public LayoutInflater cloneInContext(Context context) {
            return new C85873c(this, context);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x006e A[SYNTHETIC, Splitter:B:23:0x006e] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x011f  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0124  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View inflate(int r26, android.view.ViewGroup r27, boolean r28) {
            /*
                r25 = this;
                r1 = r25
                r2 = r26
                r3 = r27
                r4 = r28
                wq3.q$c r0 = wq3.C111855q.f334885a
                r0.getClass()
                wq3.q$b r5 = wq3.C111855q.f334891g
                java.lang.Object r5 = r5.get()
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                r6 = 0
                if (r5 != 0) goto L_0x001a
                r5 = 0
                goto L_0x001e
            L_0x001a:
                boolean r5 = r5.booleanValue()
            L_0x001e:
                r0.getClass()
                boolean r7 = wq3.C111855q.f334890f
                if (r7 == 0) goto L_0x003b
                if (r5 != 0) goto L_0x003b
                wq3.k r0 = r0.mo163608b()
                wq3.g r0 = r0.mo163577e()
                if (r0 == 0) goto L_0x003b
                android.content.Context r7 = r25.getContext()
                android.view.View r0 = r0.mo125149a(r7, r2, r3, r4)
                r7 = r0
                goto L_0x003c
            L_0x003b:
                r7 = 0
            L_0x003c:
                r9 = 2131306584(0x7f092858, float:1.8231371E38)
                r10 = 2131297342(0x7f09043e, float:1.8212626E38)
                java.lang.String r13 = "MicroMsg.MMLayoutInflater"
                r14 = 1
                if (r7 == 0) goto L_0x0085
                android.content.Context r0 = r25.getContext()
                boolean r0 = r0 instanceof com.tencent.p014mm.p136ui.MMFragmentActivity
                if (r0 == 0) goto L_0x0064
                java.lang.Object r0 = r7.getTag(r10)     // Catch:{ all -> 0x005c }
                java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x005c }
                long r15 = r0.longValue()     // Catch:{ all -> 0x005c }
                r17 = r15
                goto L_0x0066
            L_0x005c:
                r0 = move-exception
                java.lang.Object[] r15 = new java.lang.Object[r6]
                java.lang.String r8 = "get time Tag err"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r8, r15)
            L_0x0064:
                r17 = 0
            L_0x0066:
                android.content.Context r0 = r25.getContext()
                boolean r0 = r0 instanceof com.tencent.p014mm.p136ui.MMFragmentActivity
                if (r0 == 0) goto L_0x0081
                java.lang.Object r0 = r7.getTag(r9)     // Catch:{ all -> 0x0079 }
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0079 }
                boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0079 }
                goto L_0x0082
            L_0x0079:
                r0 = move-exception
                java.lang.Object[] r8 = new java.lang.Object[r6]
                java.lang.String r15 = "get creator Tag err"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r15, r8)
            L_0x0081:
                r0 = 0
            L_0x0082:
                r8 = r0
                r15 = 1
                goto L_0x0089
            L_0x0085:
                r8 = 0
                r15 = 0
                r17 = 0
            L_0x0089:
                android.content.Context r0 = r25.getContext()
                wq3.q$c r19 = wq3.C111855q.f334885a
                r19.getClass()
                java.lang.String r11 = "context"
                gy3.C87412m.m108594g(r0, r11)
                if (r5 == 0) goto L_0x009a
                goto L_0x00da
            L_0x009a:
                boolean r12 = r0 instanceof androidx.appcompat.app.AppCompatActivity
                if (r12 == 0) goto L_0x00da
                boolean r12 = wq3.C111855q.f334890f
                if (r12 != 0) goto L_0x00a3
                goto L_0x00da
            L_0x00a3:
                java.lang.Class r12 = r0.getClass()
                java.lang.String r12 = r12.getSimpleName()
                wq3.k r20 = r19.mo163608b()
                wq3.f r9 = r20.mo163574b()
                boolean r9 = r9.mo163580a(r12)
                if (r9 != 0) goto L_0x00ba
                goto L_0x00da
            L_0x00ba:
                java.lang.Class r0 = r0.getClass()
                java.lang.String r0 = r0.getSimpleName()
                wq3.k r9 = r19.mo163608b()
                wq3.f r9 = r9.mo163574b()
                boolean r0 = r9.mo163581b(r0, r2)
                if (r0 != 0) goto L_0x00d1
                goto L_0x00da
            L_0x00d1:
                java.util.Stack<java.lang.Integer> r0 = wq3.C111855q.f334893i
                java.lang.Integer r9 = java.lang.Integer.valueOf(r26)
                r0.push(r9)
            L_0x00da:
                if (r7 != 0) goto L_0x0128
                long r21 = java.lang.System.nanoTime()
                r19.getClass()
                boolean r0 = wq3.C111855q.f334890f
                if (r0 != 0) goto L_0x00e9
                r7 = 0
                goto L_0x00f2
            L_0x00e9:
                wq3.k r0 = r19.mo163608b()
                wq3.j r0 = r0.mo163578f(r2)
                r7 = r0
            L_0x00f2:
                if (r7 == 0) goto L_0x0116
                if (r3 == 0) goto L_0x00ff
                android.content.Context r0 = r25.getContext()     // Catch:{ Exception -> 0x0108 }
                android.view.View r0 = r7.mo163554a(r0, r3, r4)     // Catch:{ Exception -> 0x0108 }
                goto L_0x0117
            L_0x00ff:
                android.content.Context r0 = r25.getContext()     // Catch:{ Exception -> 0x0108 }
                android.view.View r0 = r7.mo163556d(r0)     // Catch:{ Exception -> 0x0108 }
                goto L_0x0117
            L_0x0108:
                r0 = move-exception
                java.lang.Object[] r9 = new java.lang.Object[r14]
                java.lang.String r12 = r7.mo163511c()
                r9[r6] = r12
                java.lang.String r12 = "X2CCreateLayoutView %s"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r12, r9)
            L_0x0116:
                r0 = 0
            L_0x0117:
                long r23 = java.lang.System.nanoTime()
                long r23 = r23 - r21
                if (r0 == 0) goto L_0x0124
                r8 = r7
                r17 = r23
                r9 = 1
                goto L_0x0126
            L_0x0124:
                r9 = r8
                r8 = r7
            L_0x0126:
                r7 = r0
                goto L_0x012a
            L_0x0128:
                r9 = r8
                r8 = 0
            L_0x012a:
                if (r7 != 0) goto L_0x0171
                long r16 = java.lang.System.nanoTime()
                com.tencent.mm.ui.k2$b r0 = r1.f250149a
                if (r0 == 0) goto L_0x0140
                r0.f250146f = r2
                r0.f250147g = r6
                r0.f250145e = r8
                com.tencent.mm.ui.k2$b r0 = r0.f250148h
                if (r0 == 0) goto L_0x0140
                r0.f250146f = r2
            L_0x0140:
                android.view.View r7 = super.inflate(r26, r27, r28)     // Catch:{ Exception -> 0x0145 }
                goto L_0x014e
            L_0x0145:
                r0 = move-exception
                r8 = r0
                java.lang.Object[] r0 = new java.lang.Object[r6]
                java.lang.String r12 = "MMLayoutInflaterWrapper.inflate"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r8, r12, r0)
            L_0x014e:
                if (r7 != 0) goto L_0x016b
                com.tencent.mm.ui.k2$b r0 = r1.f250149a
                if (r0 == 0) goto L_0x016b
                com.tencent.mm.ui.k2$b r0 = r0.f250148h
                if (r0 == 0) goto L_0x016b
                android.view.LayoutInflater r0 = r0.f250144d
                if (r0 == 0) goto L_0x016b
                android.view.View r0 = r0.inflate(r2, r3, r4)     // Catch:{ Exception -> 0x0162 }
                r7 = r0
                goto L_0x016b
            L_0x0162:
                r0 = move-exception
                r4 = r0
                java.lang.Object[] r0 = new java.lang.Object[r6]
                java.lang.String r8 = "MMLayoutInflaterWrapper.originInflate"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r4, r8, r0)
            L_0x016b:
                long r12 = java.lang.System.nanoTime()
                long r17 = r12 - r16
            L_0x0171:
                r12 = r17
                android.content.Context r0 = r25.getContext()
                if (r3 == 0) goto L_0x017b
                r3 = 1
                goto L_0x017c
            L_0x017b:
                r3 = 0
            L_0x017c:
                wq3.q$c r4 = wq3.C111855q.f334885a
                r4.getClass()
                gy3.C87412m.m108594g(r0, r11)
                if (r5 == 0) goto L_0x0188
                goto L_0x0244
            L_0x0188:
                boolean r8 = r0 instanceof androidx.appcompat.app.AppCompatActivity
                if (r8 == 0) goto L_0x0244
                boolean r8 = wq3.C111855q.f334890f
                if (r8 != 0) goto L_0x0192
                goto L_0x0244
            L_0x0192:
                java.lang.Class r8 = r0.getClass()
                java.lang.String r8 = r8.getSimpleName()
                wq3.k r16 = r4.mo163608b()
                wq3.f r6 = r16.mo163574b()
                boolean r6 = r6.mo163580a(r8)
                if (r6 != 0) goto L_0x01aa
                goto L_0x0244
            L_0x01aa:
                java.lang.Class r6 = r0.getClass()
                java.lang.String r6 = r6.getSimpleName()
                wq3.k r4 = r4.mo163608b()
                wq3.f r4 = r4.mo163574b()
                boolean r4 = r4.mo163581b(r6, r2)
                if (r4 != 0) goto L_0x01c2
                goto L_0x0244
            L_0x01c2:
                java.util.Stack<java.lang.Integer> r4 = wq3.C111855q.f334893i
                int r6 = r4.size()
                if (r6 <= 0) goto L_0x0244
                java.lang.Object r6 = r4.pop()
                java.lang.Integer r6 = (java.lang.Integer) r6
                boolean r4 = r4.empty()
                if (r4 == 0) goto L_0x0244
                if (r6 != 0) goto L_0x01d9
                goto L_0x0244
            L_0x01d9:
                int r4 = r6.intValue()
                if (r4 != r2) goto L_0x0244
                te3.f85 r4 = new te3.f85
                r4.<init>()
                r4.f183093d = r2
                r4.f183094e = r3
                java.util.HashMap<java.lang.String, wq3.m> r3 = wq3.C111855q.f334892h
                java.lang.Object r6 = r3.get(r8)
                wq3.m r6 = (wq3.C38263m) r6
                if (r6 == 0) goto L_0x022a
                int r14 = r0.hashCode()
                int r10 = r6.f101033b
                if (r14 == r10) goto L_0x0215
                te3.e85 r6 = new te3.e85
                r6.<init>()
                r6.f182940d = r8
                java.util.LinkedList<te3.f85> r10 = r6.f182941e
                r10.add(r4)
                wq3.m r4 = new wq3.m
                r4.<init>(r6)
                int r0 = r0.hashCode()
                r4.f101033b = r0
                r3.put(r8, r4)
                goto L_0x0244
            L_0x0215:
                te3.e85 r0 = r6.f101032a
                java.util.LinkedList<te3.f85> r0 = r0.f182941e
                int r0 = r0.size()
                r3 = 100
                if (r0 < r3) goto L_0x0222
                goto L_0x0244
            L_0x0222:
                te3.e85 r0 = r6.f101032a
                java.util.LinkedList<te3.f85> r0 = r0.f182941e
                r0.add(r4)
                goto L_0x0244
            L_0x022a:
                te3.e85 r6 = new te3.e85
                r6.<init>()
                r6.f182940d = r8
                java.util.LinkedList<te3.f85> r10 = r6.f182941e
                r10.add(r4)
                wq3.m r4 = new wq3.m
                r4.<init>(r6)
                int r0 = r0.hashCode()
                r4.f101033b = r0
                r3.put(r8, r4)
            L_0x0244:
                if (r7 == 0) goto L_0x02d6
                if (r5 != 0) goto L_0x0257
                r0 = 2131314854(0x7f0948a6, float:1.8248145E38)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r26)
                r7.setTag(r0, r3)
                com.tencent.mm.accessibility.core.provider.AccProviderFactory r0 = com.tencent.p014mm.accessibility.core.provider.AccProviderFactory.INSTANCE
                r0.onInflateRootAsync(r7)
            L_0x0257:
                if (r5 == 0) goto L_0x026e
                java.lang.Long r0 = java.lang.Long.valueOf(r12)
                r2 = 2131297342(0x7f09043e, float:1.8212626E38)
                r7.setTag(r2, r0)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
                r2 = 2131306584(0x7f092858, float:1.8231371E38)
                r7.setTag(r2, r0)
                goto L_0x02d6
            L_0x026e:
                android.content.Context r0 = r25.getContext()
                boolean r0 = r0 instanceof com.tencent.p014mm.p136ui.MMFragmentActivity
                if (r0 == 0) goto L_0x02d6
                r3 = 0
                int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
                if (r0 <= 0) goto L_0x02d6
                r3 = 1
                r0 = r15 ^ 1
                android.content.Context r3 = r25.getContext()
                com.tencent.mm.ui.MMFragmentActivity r3 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r3
                xq3.a r3 = r3.inflateXMLInfo
                android.content.Context r4 = r25.getContext()
                r3.getClass()
                gy3.C87412m.m108594g(r4, r11)
                java.lang.String r5 = "InflateXMLInfo"
                if (r0 != 0) goto L_0x02c0
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Log.isDebug()
                if (r6 == 0) goto L_0x02c0
                android.content.res.Resources r6 = r4.getResources()
                java.lang.String r6 = r6.getResourceEntryName(r2)
                java.lang.Class r4 = r4.getClass()
                java.lang.String r4 = r4.getSimpleName()
                r8 = 3
                java.lang.Object[] r8 = new java.lang.Object[r8]
                r10 = 0
                r8[r10] = r4
                r4 = 1
                r8[r4] = r6
                r4 = 2
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r9)
                r8[r4] = r6
                java.lang.String r4 = "hit cache from async inflate actName:%s resName:%s useViewCreate:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r4, r8)
            L_0x02c0:
                xq3.a$b r4 = new xq3.a$b     // Catch:{ all -> 0x02cd }
                r4.<init>(r2, r12, r0)     // Catch:{ all -> 0x02cd }
                java.util.List<xq3.a$b> r0 = r3.f104643c     // Catch:{ all -> 0x02cd }
                java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x02cd }
                r0.add(r4)     // Catch:{ all -> 0x02cd }
                goto L_0x02d6
            L_0x02cd:
                r0 = move-exception
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = "add item err"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r3, r2)
            L_0x02d6:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C85868k2.C85873c.inflate(int, android.view.ViewGroup, boolean):android.view.View");
        }
    }

    /* renamed from: com.tencent.mm.ui.k2$d */
    public static final class C85874d {
        /* renamed from: a */
        public static void m106142a(TextView textView) {
            CharSequence text = textView.getText();
            if (!TextUtils.isEmpty(text)) {
                textView.setText(m106143b(text));
            }
            CharSequence hint = textView.getHint();
            if (!TextUtils.isEmpty(hint)) {
                textView.setHint(m106143b(hint));
            }
            CharSequence contentDescription = textView.getContentDescription();
            if (!TextUtils.isEmpty(contentDescription)) {
                textView.setContentDescription(m106143b(contentDescription));
            }
        }

        /* renamed from: b */
        public static String m106143b(CharSequence charSequence) {
            if (charSequence == null) {
                return null;
            }
            String charSequence2 = charSequence.toString();
            return TextUtils.isEmpty(charSequence2) ? charSequence2 : WeChatBrands.Wordings.translate(charSequence2);
        }
    }

    /* renamed from: a */
    public static LayoutInflater m106136a(LayoutInflater layoutInflater, Context context) {
        C76577a.m92165p(context);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(context);
        C85870b bVar = new C85870b((C85869a) null);
        bVar.f250144d = cloneInContext;
        cloneInContext.setFactory(bVar);
        C85873c cVar = new C85873c(cloneInContext, cloneInContext.getContext());
        C85870b bVar2 = new C85870b((C85869a) null);
        bVar2.f250144d = cVar;
        bVar2.f250148h = bVar;
        cVar.setFactory(bVar2);
        cVar.f250149a = bVar2;
        return cVar;
    }

    /* renamed from: b */
    public static LayoutInflater m106137b(Context context) {
        C76577a.m92165p(context);
        LayoutInflater cloneInContext = LayoutInflater.from(context).cloneInContext(context);
        C85870b bVar = new C85870b((C85869a) null);
        bVar.f250144d = cloneInContext;
        cloneInContext.setFactory(bVar);
        C85873c cVar = new C85873c(cloneInContext, cloneInContext.getContext());
        C85870b bVar2 = new C85870b((C85869a) null);
        bVar2.f250144d = cVar;
        bVar2.f250148h = bVar;
        cVar.setFactory(bVar2);
        cVar.f250149a = bVar2;
        return cVar;
    }

    /* renamed from: c */
    public static LayoutInflater m106138c(LayoutInflater layoutInflater) {
        C76577a.m92165p(layoutInflater.getContext());
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(layoutInflater.getContext());
        C85870b bVar = new C85870b((C85869a) null);
        bVar.f250144d = cloneInContext;
        cloneInContext.setFactory(bVar);
        C85873c cVar = new C85873c(cloneInContext, cloneInContext.getContext());
        C85870b bVar2 = new C85870b((C85869a) null);
        bVar2.f250144d = cVar;
        bVar2.f250148h = bVar;
        cVar.setFactory(bVar2);
        cVar.f250149a = bVar2;
        return cVar;
    }
}
