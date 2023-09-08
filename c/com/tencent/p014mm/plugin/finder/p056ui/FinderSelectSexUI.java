package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.SelectPreference;
import ft3.C116895f;
import gy3.C87412m;
import kotlin.Metadata;
import pj3.C47511g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSelectSexUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelectSexUI */
public final class FinderSelectSexUI extends MMPreference {

    /* renamed from: h */
    public static final /* synthetic */ int f346065h = 0;

    /* renamed from: d */
    public final String f346066d = "Finder.FinderSelectSexUI";

    /* renamed from: e */
    public SelectPreference f346067e;

    /* renamed from: f */
    public SelectPreference f346068f;

    /* renamed from: g */
    public SelectPreference f346069g;

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelectSexUI$a */
    public static final class C115443a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderSelectSexUI f346070d;

        public C115443a(FinderSelectSexUI finderSelectSexUI) {
            this.f346070d = finderSelectSexUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            String str;
            FinderSelectSexUI finderSelectSexUI = this.f346070d;
            int i = FinderSelectSexUI.f346065h;
            finderSelectSexUI.getClass();
            Intent intent = new Intent();
            SelectPreference selectPreference = finderSelectSexUI.f346067e;
            if (selectPreference != null) {
                if (selectPreference.f24291M) {
                    str = "male";
                } else {
                    SelectPreference selectPreference2 = finderSelectSexUI.f346068f;
                    if (selectPreference2 == null) {
                        C87412m.m108603p("selectFeMale");
                        throw null;
                    } else if (selectPreference2.f24291M) {
                        str = "female";
                    } else {
                        SelectPreference selectPreference3 = finderSelectSexUI.f346069g;
                        if (selectPreference3 == null) {
                            C87412m.m108603p("selectUnshow");
                            throw null;
                        } else if (!selectPreference3.f24291M) {
                            return true;
                        } else {
                            str = "unshow";
                        }
                    }
                }
                String str2 = finderSelectSexUI.f346066d;
                C116895f.m164891c(str2, "outputSex = " + str);
                intent.putExtra("key_output_sex", str);
                finderSelectSexUI.setResult(-1, intent);
                finderSelectSexUI.finish();
                return true;
            }
            C87412m.m108603p("selectMale");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelectSexUI$b */
    public static final class C115444b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderSelectSexUI f346071d;

        public C115444b(FinderSelectSexUI finderSelectSexUI) {
            this.f346071d = finderSelectSexUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f346071d.finish();
            return false;
        }
    }

    /* renamed from: H7 */
    public final void mo175357H7() {
        SelectPreference selectPreference = this.f346069g;
        if (selectPreference != null) {
            if (!selectPreference.f24291M) {
                SelectPreference selectPreference2 = this.f346068f;
                if (selectPreference2 == null) {
                    C87412m.m108603p("selectFeMale");
                    throw null;
                } else if (!selectPreference2.f24291M) {
                    SelectPreference selectPreference3 = this.f346067e;
                    if (selectPreference3 == null) {
                        C87412m.m108603p("selectMale");
                        throw null;
                    } else if (!selectPreference3.f24291M) {
                        enableOptionMenu(0, false);
                        return;
                    }
                }
            }
            enableOptionMenu(0, true);
            return;
        }
        C87412m.m108603p("selectUnshow");
        throw null;
    }

    public int getFooterResourceId() {
        return C0966R.C0971layout.ap8;
    }

    public int getResourceId() {
        return C0966R.xml.f8898at;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Preference a = getPreferenceScreen().mo72519a("select_male");
        C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.SelectPreference");
        this.f346067e = (SelectPreference) a;
        Preference a2 = getPreferenceScreen().mo72519a("select_female");
        C87412m.m108592e(a2, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.SelectPreference");
        this.f346068f = (SelectPreference) a2;
        Preference a3 = getPreferenceScreen().mo72519a("select_unshow");
        C87412m.m108592e(a3, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.SelectPreference");
        this.f346069g = (SelectPreference) a3;
        String stringExtra = getIntent().getStringExtra("key_input_sex");
        if (stringExtra == null) {
            stringExtra = "unshow";
        }
        String str = this.f346066d;
        C116895f.m164891c(str, "inputSex = " + stringExtra);
        SelectPreference selectPreference = this.f346067e;
        if (selectPreference != null) {
            selectPreference.mo69932y(true);
            SelectPreference selectPreference2 = this.f346068f;
            if (selectPreference2 != null) {
                selectPreference2.mo69932y(true);
                int hashCode = stringExtra.hashCode();
                if (hashCode != -1278174388) {
                    if (hashCode != -840239850) {
                        if (hashCode == 3343885 && stringExtra.equals("male")) {
                            SelectPreference selectPreference3 = this.f346067e;
                            if (selectPreference3 != null) {
                                selectPreference3.f24291M = true;
                                SelectPreference selectPreference4 = this.f346068f;
                                if (selectPreference4 != null) {
                                    selectPreference4.f24291M = false;
                                    SelectPreference selectPreference5 = this.f346069g;
                                    if (selectPreference5 != null) {
                                        selectPreference5.f24291M = false;
                                        addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C115443a(this), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
                                        setBackBtn(new C115444b(this));
                                        mo175357H7();
                                        return;
                                    }
                                    C87412m.m108603p("selectUnshow");
                                    throw null;
                                }
                                C87412m.m108603p("selectFeMale");
                                throw null;
                            }
                            C87412m.m108603p("selectMale");
                            throw null;
                        }
                    } else if (stringExtra.equals("unshow")) {
                        SelectPreference selectPreference6 = this.f346067e;
                        if (selectPreference6 != null) {
                            selectPreference6.f24291M = false;
                            SelectPreference selectPreference7 = this.f346068f;
                            if (selectPreference7 != null) {
                                selectPreference7.f24291M = false;
                                SelectPreference selectPreference8 = this.f346069g;
                                if (selectPreference8 != null) {
                                    selectPreference8.f24291M = true;
                                    addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C115443a(this), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
                                    setBackBtn(new C115444b(this));
                                    mo175357H7();
                                    return;
                                }
                                C87412m.m108603p("selectUnshow");
                                throw null;
                            }
                            C87412m.m108603p("selectFeMale");
                            throw null;
                        }
                        C87412m.m108603p("selectMale");
                        throw null;
                    }
                } else if (stringExtra.equals("female")) {
                    SelectPreference selectPreference9 = this.f346067e;
                    if (selectPreference9 != null) {
                        selectPreference9.f24291M = false;
                        SelectPreference selectPreference10 = this.f346068f;
                        if (selectPreference10 != null) {
                            selectPreference10.f24291M = true;
                            SelectPreference selectPreference11 = this.f346069g;
                            if (selectPreference11 != null) {
                                selectPreference11.f24291M = false;
                                addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C115443a(this), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
                                setBackBtn(new C115444b(this));
                                mo175357H7();
                                return;
                            }
                            C87412m.m108603p("selectUnshow");
                            throw null;
                        }
                        C87412m.m108603p("selectFeMale");
                        throw null;
                    }
                    C87412m.m108603p("selectMale");
                    throw null;
                }
                SelectPreference selectPreference12 = this.f346067e;
                if (selectPreference12 != null) {
                    selectPreference12.f24291M = false;
                    SelectPreference selectPreference13 = this.f346068f;
                    if (selectPreference13 != null) {
                        selectPreference13.f24291M = false;
                        SelectPreference selectPreference14 = this.f346069g;
                        if (selectPreference14 != null) {
                            selectPreference14.f24291M = false;
                            addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C115443a(this), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
                            setBackBtn(new C115444b(this));
                            mo175357H7();
                            return;
                        }
                        C87412m.m108603p("selectUnshow");
                        throw null;
                    }
                    C87412m.m108603p("selectFeMale");
                    throw null;
                }
                C87412m.m108603p("selectMale");
                throw null;
            }
            C87412m.m108603p("selectFeMale");
            throw null;
        }
        C87412m.m108603p("selectMale");
        throw null;
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference != null ? preference.f121285r : null;
        if (str == null) {
            str = "";
        }
        if (C87412m.m108589b(str, "select_male")) {
            SelectPreference selectPreference = this.f346067e;
            if (selectPreference != null) {
                selectPreference.f24291M = true;
                SelectPreference selectPreference2 = this.f346068f;
                if (selectPreference2 != null) {
                    selectPreference2.f24291M = false;
                    SelectPreference selectPreference3 = this.f346069g;
                    if (selectPreference3 != null) {
                        selectPreference3.f24291M = false;
                        if (gVar != null) {
                            gVar.notifyDataSetChanged();
                        }
                    } else {
                        C87412m.m108603p("selectUnshow");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("selectFeMale");
                    throw null;
                }
            } else {
                C87412m.m108603p("selectMale");
                throw null;
            }
        } else if (C87412m.m108589b(str, "select_female")) {
            SelectPreference selectPreference4 = this.f346067e;
            if (selectPreference4 != null) {
                selectPreference4.f24291M = false;
                SelectPreference selectPreference5 = this.f346068f;
                if (selectPreference5 != null) {
                    selectPreference5.f24291M = true;
                    SelectPreference selectPreference6 = this.f346069g;
                    if (selectPreference6 != null) {
                        selectPreference6.f24291M = false;
                    } else {
                        C87412m.m108603p("selectUnshow");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("selectFeMale");
                    throw null;
                }
            } else {
                C87412m.m108603p("selectMale");
                throw null;
            }
        } else {
            SelectPreference selectPreference7 = this.f346067e;
            if (selectPreference7 != null) {
                selectPreference7.f24291M = false;
                SelectPreference selectPreference8 = this.f346068f;
                if (selectPreference8 != null) {
                    selectPreference8.f24291M = false;
                    SelectPreference selectPreference9 = this.f346069g;
                    if (selectPreference9 != null) {
                        selectPreference9.f24291M = true;
                    } else {
                        C87412m.m108603p("selectUnshow");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("selectFeMale");
                    throw null;
                }
            } else {
                C87412m.m108603p("selectMale");
                throw null;
            }
        }
        mo175357H7();
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
        return false;
    }
}
