package INFO6205;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Place1Test {


    @Mock
    Position position;
    List<Position>positions = new ArrayList<>();
    @BeforeEach
    void setUp() {
      positions.add(position);

    }
    @Test
    public void VerifyPlaceObjectIsCreatedWhenListOfPositionIsSupplied(){
        Place place =new Place1(positions);
        assertNotNull(place);
    }


}