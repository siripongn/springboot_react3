import React from 'react';
import {Link} from 'react-router-dom';
import {
    Form,
    FormGroup,
    Label,
    Input,
    Button
} from 'reactstrap';

export const AddTest = () => {
    return (
        <Form>
            <FormGroup>
                <Label>FirstName</Label>
                <Input type="text" placeholder="Firstname"></Input>
                <Label>LasttName</Label>
                <Input type="text" placeholder="Lastname"></Input>
                <Label>Email</Label>
                <Input type="email" placeholder="Email"></Input>
                </FormGroup>
            <Button type="submit">Submit</Button>
            <Link to="/" className="btn btn-danger ml-2">Cancel</Link>

        </Form>
    )
}
