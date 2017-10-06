package co.edu.uniquindio.android.electiva.practicatoolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by angela on 5/10/17.
 */

public class AdaptadoDePagerFragmet extends FragmentPagerAdapter {

    private ArrayList<String> listaDeTiulos;
    public AdaptadoDePagerFragmet(FragmentManager fm) {
        super(fm);
        listaDeTiulos = new ArrayList<>();
        listaDeTiulos.add("Título 1");
        listaDeTiulos.add("Título 2");
        listaDeTiulos.add("Título 3");
        listaDeTiulos.add("Título 4");
        listaDeTiulos.add("Título 5");
        listaDeTiulos.add("Título 6");
        listaDeTiulos.add("Título 7");
    }
    @Override
    public Fragment getItem(int position) {

        ClonFragment f = null;
        ClonFragment.mostrarMensajeLog("pos: "+position);

        switch (position) {
            case 0:
                f = ClonFragment.newInstance(R.color.android_blue,
                        position+1);
                break;
            case 1:
                f = ClonFragment.newInstance(R.color.android_green,
                        position+1);
                break;
            case 2:
                f = ClonFragment.newInstance(R.color.android_purple,
                        position+1);
                break;
            case 3:
                f = ClonFragment.newInstance(R.color.android_yellow,
                        position+1);
                break;
            case 4:
                f = ClonFragment.newInstance(R.color.android_red,
                        position+1);
                break;
            case 5:
                f = ClonFragment.newInstance(R.color.android_orange,
                        position+1);
                break;
            case 6:
                f = ClonFragment.newInstance(R.color.android_pink,
                        position+1);
                break;
        }
        return f;
    }

    @Override
    public int getCount() {
        return listaDeTiulos.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return listaDeTiulos.get(position);
    }
}
