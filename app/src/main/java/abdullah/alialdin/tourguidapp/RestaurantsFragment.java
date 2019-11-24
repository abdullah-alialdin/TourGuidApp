package abdullah.alialdin.tourguidapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("1886 Restaurant", 4, R.drawable.ic_launcher_foreground));
        places.add(new Place("La Fleur", 4.5f, R.drawable.ic_launcher_foreground));
        places.add(new Place("Victoria Room, Winter Palace", 4.5f, R.drawable.ic_launcher_foreground));
        places.add(new Place("Corniche Restaurant", 4, R.drawable.ic_launcher_foreground));
        places.add(new Place("Bonjour Cafe & Restaurant", 5, R.drawable.ic_launcher_foreground));
        places.add(new Place("Quick Pizza Luxor", 4, R.drawable.ic_launcher_foreground));
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = rootView.findViewById(R.id.root_view);
        listView.setAdapter(adapter);
        return rootView;
    }

}